package rs.novafabrika.horizontala.domain.dto

import java.util.*
import kotlin.properties.Delegates

class UserRegistrationDto() {

    lateinit var username: String
    lateinit var password: String
    lateinit var email: String
    lateinit var fullName: String
    var companyId by Delegates.notNull<Long>()

    var dateOfBirth: Date? = null
}