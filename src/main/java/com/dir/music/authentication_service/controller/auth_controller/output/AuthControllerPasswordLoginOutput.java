package com.dir.music.authentication_service.controller.auth_controller.output;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthControllerPasswordLoginOutput {
    private String accessToken;
    private String refreshToken;
}
