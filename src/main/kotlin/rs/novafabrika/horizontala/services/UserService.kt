package rs.novafabrika.horizontala.services

import com.querydsl.core.types.Predicate
import rs.novafabrika.horizontala.domain.dao.UserDao
import rs.novafabrika.horizontala.domain.dto.UserDto
import rs.novafabrika.horizontala.domain.dto.UserRegistrationDto
import rs.novafabrika.horizontala.domain.model.User
import rs.novafabrika.horizontala.exceptions.ResourceNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserDao

    @Autowired
    lateinit var passwordEncoder: PasswordEncoder

    fun getUserById(id: Long): UserDto {
        val user = userRepository.findById(id)

        if (!user.isPresent) {
            throw ResourceNotFoundException()
        }

        return UserDto(user.get())
    }

    fun getUserByUsername(username: String): UserDto {
        val user = userRepository.findByUsername(username) ?: throw ResourceNotFoundException()

        return UserDto(user)
    }

    fun deleteUserById(id: Long) {
        return userRepository.deleteById(id)
    }

    fun createUser(userDto: UserRegistrationDto): UserDto {
        val user = User(
            userDto.username,
            passwordEncoder.encode(userDto.password),
            userDto.email,
            userDto.fullName,
            userDto.iconPath,
            userDto.dateOfBirth
        )
        return UserDto(userRepository.save(user))
    }

    fun getUsersByPredicate(predicate: Predicate?): List<UserDto> {
        return userRepository.findAll(predicate).map { UserDto(it) }
    }

    fun updateUser(userDto: UserRegistrationDto, id: Long): UserDto {
        val user = userRepository.findById(id)

        if (!user.isPresent) {
            throw ResourceNotFoundException()
        }

        user.get().email = userDto.email
        user.get().password = passwordEncoder.encode(userDto.password)
        user.get().fullName = userDto.fullName
        user.get().fullName = userDto.iconPath
        user.get().dateOfBirth = userDto.dateOfBirth

        return UserDto(userRepository.save(user.get()))
    }
}
