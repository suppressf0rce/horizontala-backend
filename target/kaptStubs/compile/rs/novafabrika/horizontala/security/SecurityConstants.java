package rs.novafabrika.horizontala.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lrs/novafabrika/horizontala/security/SecurityConstants;", "", "()V", "AUTH_LOGIN_URL", "", "JWT_SECRET", "TOKEN_AUDIENCE", "TOKEN_HEADER", "TOKEN_ISSUER", "TOKEN_PREFIX", "TOKEN_TYPE", "horizontala-backend"})
public final class SecurityConstants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTH_LOGIN_URL = "/api/auth";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String JWT_SECRET = "aNdRgUkXp2s5v8y/A?D(G+KbPeShVmYq3t6w9z$C&E)H@McQfTjWnZr4u7x!A%D*";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_HEADER = "Authorization";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_PREFIX = "Bearer ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_TYPE = "JWT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_ISSUER = "invoice-secure-api";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_AUDIENCE = "invoice";
    public static final rs.novafabrika.horizontala.security.SecurityConstants INSTANCE = null;
    
    private SecurityConstants() {
        super();
    }
}