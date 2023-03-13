package shop.mtcoding.conbasic.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class LoginReqDto {
    private String userName;
    private String password;
}
