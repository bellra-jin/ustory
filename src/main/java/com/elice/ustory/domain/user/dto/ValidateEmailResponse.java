package com.elice.ustory.domain.user.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ValidateEmailResponse {
    String fromMail;
    String toMail;
    String title;
    String authCode;
}