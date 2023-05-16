package com.dir.music.authentication_service.service.auth_service.input;

import com.dir.music.authentication_service.service.foundation.IServiceInput;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthServicePasswordLoginInput implements IServiceInput {
    private String username;
    private String password;
}
