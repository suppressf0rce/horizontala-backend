package rs.novafabrika.horizontala.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u00a8\u0006\u0010"}, d2 = {"Lrs/novafabrika/horizontala/security/UserAuthorizationFilter;", "Lorg/springframework/security/web/authentication/www/BasicAuthenticationFilter;", "authenticationManager", "Lorg/springframework/security/authentication/AuthenticationManager;", "(Lorg/springframework/security/authentication/AuthenticationManager;)V", "doFilterInternal", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "filterChain", "Ljavax/servlet/FilterChain;", "getAuthentication", "Lorg/springframework/security/authentication/UsernamePasswordAuthenticationToken;", "Companion", "horizontala-backend"})
public final class UserAuthorizationFilter extends org.springframework.security.web.authentication.www.BasicAuthenticationFilter {
    private static final org.slf4j.Logger log = null;
    public static final rs.novafabrika.horizontala.security.UserAuthorizationFilter.Companion Companion = null;
    
    @java.lang.Override()
    protected void doFilterInternal(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull()
    javax.servlet.FilterChain filterChain) throws java.io.IOException, javax.servlet.ServletException {
    }
    
    private final org.springframework.security.authentication.UsernamePasswordAuthenticationToken getAuthentication(javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    public UserAuthorizationFilter(@org.jetbrains.annotations.NotNull()
    org.springframework.security.authentication.AuthenticationManager authenticationManager) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lrs/novafabrika/horizontala/security/UserAuthorizationFilter$Companion;", "", "()V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "horizontala-backend"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}