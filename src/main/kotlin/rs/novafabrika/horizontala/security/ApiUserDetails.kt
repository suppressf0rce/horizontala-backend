package rs.novafabrika.horizontala.security

import rs.novafabrika.horizontala.domain.dao.UserDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class ApiUserDetails : UserDetailsService {

    @Autowired
    lateinit var userDao: UserDao

    override fun loadUserByUsername(username: String?): UserDetails {
        if (username == null)
            throw IllegalArgumentException("Username can't be null")

        val user = userDao.findByUsername(username) ?: throw  UsernameNotFoundException(username)

        return ApiUserPrincipal(user)
    }
}