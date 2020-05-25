package rs.novafabrika.horizontala.domain.dto

import rs.novafabrika.horizontala.domain.model.User
import java.util.*

class UserDto() {

    constructor(user: User) : this() {
        username = user.username
        email = user.email
        id = user.id
        createdAt = user.createdAt
        updatedAt = user.updatedAt
        fullName = user.fullName
        dateOfBirth = user.dateOfBirth
    }

    lateinit var username: String
    lateinit var email: String
    lateinit var fullName: String

    lateinit var createdAt: Date
    lateinit var updatedAt: Date

    var dateOfBirth: Date? = null

    var id: Long = 0
}