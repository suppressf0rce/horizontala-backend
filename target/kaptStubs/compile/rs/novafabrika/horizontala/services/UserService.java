package rs.novafabrika.horizontala.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lrs/novafabrika/horizontala/services/UserService;", "", "()V", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "getPasswordEncoder", "()Lorg/springframework/security/crypto/password/PasswordEncoder;", "setPasswordEncoder", "(Lorg/springframework/security/crypto/password/PasswordEncoder;)V", "userRepository", "Lrs/novafabrika/horizontala/domain/dao/UserDao;", "getUserRepository", "()Lrs/novafabrika/horizontala/domain/dao/UserDao;", "setUserRepository", "(Lrs/novafabrika/horizontala/domain/dao/UserDao;)V", "createUser", "Lrs/novafabrika/horizontala/domain/dto/UserDto;", "userDto", "Lrs/novafabrika/horizontala/domain/dto/UserRegistrationDto;", "deleteUserById", "", "id", "", "getUserById", "getUserByUsername", "username", "", "getUsersByPredicate", "", "predicate", "Lcom/querydsl/core/types/Predicate;", "updateUser", "horizontala-backend"})
@org.springframework.stereotype.Service()
public class UserService {
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public rs.novafabrika.horizontala.domain.dao.UserDao userRepository;
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder;
    
    @org.jetbrains.annotations.NotNull()
    public rs.novafabrika.horizontala.domain.dao.UserDao getUserRepository() {
        return null;
    }
    
    public void setUserRepository(@org.jetbrains.annotations.NotNull()
    rs.novafabrika.horizontala.domain.dao.UserDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.crypto.password.PasswordEncoder getPasswordEncoder() {
        return null;
    }
    
    public void setPasswordEncoder(@org.jetbrains.annotations.NotNull()
    org.springframework.security.crypto.password.PasswordEncoder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public rs.novafabrika.horizontala.domain.dto.UserDto getUserById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public rs.novafabrika.horizontala.domain.dto.UserDto getUserByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    public void deleteUserById(long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public rs.novafabrika.horizontala.domain.dto.UserDto createUser(@org.jetbrains.annotations.NotNull()
    rs.novafabrika.horizontala.domain.dto.UserRegistrationDto userDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<rs.novafabrika.horizontala.domain.dto.UserDto> getUsersByPredicate(@org.jetbrains.annotations.Nullable()
    com.querydsl.core.types.Predicate predicate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public rs.novafabrika.horizontala.domain.dto.UserDto updateUser(@org.jetbrains.annotations.NotNull()
    rs.novafabrika.horizontala.domain.dto.UserRegistrationDto userDto, long id) {
        return null;
    }
    
    public UserService() {
        super();
    }
}