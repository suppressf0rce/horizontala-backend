package rs.novafabrika.horizontala.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lrs/novafabrika/horizontala/security/ApiUserPrincipal;", "Lorg/springframework/security/core/userdetails/UserDetails;", "user", "Lrs/novafabrika/horizontala/domain/model/User;", "(Lrs/novafabrika/horizontala/domain/model/User;)V", "getAuthorities", "", "Lorg/springframework/security/core/GrantedAuthority;", "getPassword", "", "getUsername", "isAccountNonExpired", "", "isAccountNonLocked", "isCredentialsNonExpired", "isEnabled", "horizontala-backend"})
public final class ApiUserPrincipal implements org.springframework.security.core.userdetails.UserDetails {
    private final rs.novafabrika.horizontala.domain.model.User user = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getUsername() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isCredentialsNonExpired() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getPassword() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isAccountNonExpired() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isAccountNonLocked() {
        return false;
    }
    
    public ApiUserPrincipal(@org.jetbrains.annotations.NotNull()
    rs.novafabrika.horizontala.domain.model.User user) {
        super();
    }
}