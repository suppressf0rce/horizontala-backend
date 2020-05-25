package rs.novafabrika.horizontala.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lrs/novafabrika/horizontala/exceptions/ResourceNotFoundException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "horizontala-backend"})
@org.springframework.web.bind.annotation.ResponseStatus(code = org.springframework.http.HttpStatus.NOT_FOUND, reason = "Resource not found")
public final class ResourceNotFoundException extends java.lang.RuntimeException {
    
    public ResourceNotFoundException() {
        super();
    }
}