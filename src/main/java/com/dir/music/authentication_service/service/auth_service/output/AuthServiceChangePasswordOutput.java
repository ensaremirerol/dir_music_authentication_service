package com.dir.music.authentication_service.service.auth_service.output;

import com.dir.music.authentication_service.service.foundation.IServiceOutput;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthServiceChangePasswordOutput implements IServiceOutput {
    private boolean success;
    private String message;
}
