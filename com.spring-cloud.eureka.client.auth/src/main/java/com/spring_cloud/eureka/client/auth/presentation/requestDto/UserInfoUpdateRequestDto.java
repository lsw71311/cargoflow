package com.spring_cloud.eureka.client.auth.presentation.requestDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserInfoUpdateRequestDto {

    @NotBlank
    @Size(min = 8, max = 15, message = "비밀번호는 최소 8자 이상, 15자 이하여야 합니다.")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]*$", //최소 8자 이상, 15자 이하이며 알파벳 대소문자(a~z, A~Z), 숫자(0~9), 특수문자
            message = "비밀번호는 대문자, 소문자, 숫자, 특수문자를 포함해야 합니다.")
    private String password;
}
