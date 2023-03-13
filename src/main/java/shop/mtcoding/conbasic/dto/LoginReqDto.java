package shop.mtcoding.conbasic.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class LoginReqDto {
    @NotBlank(message = "사용자 이름은 필수 입력값입니다.")
    private String userName;
    @NotBlank(message = "비밀번호는 필수 입력값입니다.")
    private String password;
}
