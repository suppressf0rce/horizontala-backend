package rs.novafabrika.horizontala.controlers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\u0012\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0017J\u001c\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lrs/novafabrika/horizontala/controlers/UserController;", "", "()V", "userService", "Lrs/novafabrika/horizontala/services/UserService;", "getUserService", "()Lrs/novafabrika/horizontala/services/UserService;", "setUserService", "(Lrs/novafabrika/horizontala/services/UserService;)V", "createUser", "Lrs/novafabrika/horizontala/domain/dto/UserDto;", "userDto", "Lrs/novafabrika/horizontala/domain/dto/UserRegistrationDto;", "deleteUserById", "", "id", "", "getAuthenticatedUserInfo", "auth", "Lorg/springframework/security/core/Authentication;", "getUserById", "getUsersByPredicate", "", "predicate", "Lcom/querydsl/core/types/Predicate;", "updateUser", "horizontala-backend"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/user"})
@org.springframework.web.bind.annotation.RestController()
public class UserController {
    @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    public rs.novafabrika.horizontala.services.UserService userService;
    
    @org.jetbrains.annotations.NotNull()
    public rs.novafabrika.horizontala.services.UserService getUserService() {
        return null;
    }
    
    public void setUserService(@org.jetbrains.annotations.NotNull()
    rs.novafabrika.horizontala.services.UserService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping()
    public rs.novafabrika.horizontala.domain.dto.UserDto getAuthenticatedUserInfo(@org.jetbrains.annotations.NotNull()
    org.springframework.security.core.Authentication auth) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    public rs.novafabrika.horizontala.domain.dto.UserDto getUserById(@org.springframework.web.bind.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/findAll"})
    public java.util.List<rs.novafabrika.horizontala.domain.dto.UserDto> getUsersByPredicate(@org.jetbrains.annotations.Nullable()
    @org.springframework.data.querydsl.binding.QuerydslPredicate(root = rs.novafabrika.horizontala.domain.model.User.class, bindings = rs.novafabrika.horizontala.domain.dao.UserDao.class)
    com.querydsl.core.types.Predicate predicate) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{id}"})
    public void deleteUserById(@org.springframework.web.bind.annotation.PathVariable()
    long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping()
    public rs.novafabrika.horizontala.domain.dto.UserDto createUser(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    rs.novafabrika.horizontala.domain.dto.UserRegistrationDto userDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PutMapping(value = {"/{id}"})
    public rs.novafabrika.horizontala.domain.dto.UserDto updateUser(@org.springframework.web.bind.annotation.PathVariable()
    long id, @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    rs.novafabrika.horizontala.domain.dto.UserRegistrationDto userDto) {
        return null;
    }
    
    public UserController() {
        super();
    }
}