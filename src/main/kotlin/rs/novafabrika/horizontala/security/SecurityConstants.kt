package rs.novafabrika.horizontala.security

object SecurityConstants {
    const val AUTH_LOGIN_URL = "/api/auth"

    // Signing key for HS512 algorithm
    // You can use the page http://www.allkeysgenerator.com/ to generate all kinds of keys
    const val JWT_SECRET = "aNdRgUkXp2s5v8y/A?D(G+KbPeShVmYq3t6w9z\$C&E)H@McQfTjWnZr4u7x!A%D*"

    // JWT token defaults
    const val TOKEN_HEADER = "Authorization"
    const val TOKEN_PREFIX = "Bearer "
    const val TOKEN_TYPE = "JWT"
    const val TOKEN_ISSUER = "horizontala-secure-api"
    const val TOKEN_AUDIENCE = "horizontala"
}