package com.elice.ustory.global.exception.model;

import com.elice.ustory.global.exception.ErrorCode;

public class NotFoundException extends CustomException {
    public NotFoundException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }

    public NotFoundException(String message) {
        super(message, ErrorCode.NOT_FOUND_EXCEPTION);
    }
}
