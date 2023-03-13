package shop.mtcoding.conbasic.validator;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import shop.mtcoding.conbasic.dto.LoginReqDto;

public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return LoginReqDto.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        LoginReqDto loginReqDto = (LoginReqDto) target;
        String userName = loginReqDto.getUserName();
        String password = loginReqDto.getPassword();

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required");

        if (userName == null || userName.length() < 4 || userName.length() > 10){
            errors.rejectValue("userName", "userNameInvalidLength", new String[]{"4", "10"}, null);
        }
        if(password == null || password.length() < 4 || password.length() > 10) {
            errors.rejectValue("password", "passwordInvalidLength", new String[]{"4", "10"}, null);
        }
    }
}
