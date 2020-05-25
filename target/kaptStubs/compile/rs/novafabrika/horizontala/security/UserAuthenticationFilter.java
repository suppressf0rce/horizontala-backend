package rs.novafabrika.horizontala.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0014R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lrs/novafabrika/horizontala/security/UserAuthenticationFilter;", "Lorg/springframework/security/web/authentication/UsernamePasswordAuthenticationFilter;", "authenticationManager", "Lorg/springframework/security/authentication/AuthenticationManager;", "(Lorg/springframework/security/authentication/AuthenticationManager;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "attemptAuthentication", "Lorg/springframework/security/core/Authentication;", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "successfulAuthentication", "", "filterChain", "Ljavax/servlet/FilterChain;", "authentication", "horizontala-backend"})
public final class UserAuthenticationFilter extends org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy gson$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.security.core.Authentication attemptAuthentication(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletResponse response) {
        return null;
    }
    
    @java.lang.Override()
    protected void successfulAuthentication(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull()
    javax.servlet.FilterChain filterChain, @org.jetbrains.annotations.NotNull()
    org.springframework.security.core.Authentication authentication) {
    }
    
    public UserAuthenticationFilter(@org.jetbrains.annotations.NotNull()
    org.springframework.security.authentication.AuthenticationManager authenticationManager) {
        super();
    }
}