package rs.novafabrika.horizontala.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0017J\b\u0010\u0011\u001a\u00020\u0012H\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lrs/novafabrika/horizontala/security/SecurityConfiguration;", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityConfigurerAdapter;", "()V", "userDetailsService", "Lrs/novafabrika/horizontala/security/ApiUserDetails;", "getUserDetailsService", "()Lrs/novafabrika/horizontala/security/ApiUserDetails;", "setUserDetailsService", "(Lrs/novafabrika/horizontala/security/ApiUserDetails;)V", "configure", "", "auth", "Lorg/springframework/security/config/annotation/authentication/builders/AuthenticationManagerBuilder;", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "corsConfigurationSource", "Lorg/springframework/web/cors/CorsConfigurationSource;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "horizontala-backend"})
@org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity(securedEnabled = true)
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity()
public class SecurityConfiguration extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter {
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public rs.novafabrika.horizontala.security.ApiUserDetails userDetailsService;
    
    @org.jetbrains.annotations.NotNull()
    public rs.novafabrika.horizontala.security.ApiUserDetails getUserDetailsService() {
        return null;
    }
    
    public void setUserDetailsService(@org.jetbrains.annotations.NotNull()
    rs.novafabrika.horizontala.security.ApiUserDetails p0) {
    }
    
    @java.lang.Override()
    protected void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    }
    
    @java.lang.Override()
    public void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.web.cors.CorsConfigurationSource corsConfigurationSource() {
        return null;
    }
    
    public SecurityConfiguration() {
        super();
    }
}