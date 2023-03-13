package shop.mtcoding.conbasic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.conbasic.dto.LoginReqDto;
import shop.mtcoding.conbasic.validator.UserValidator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private MessageSource messageSource;
    @Autowired
    private UserValidator userValidator;

    @PostMapping("/login")
    public String login(@RequestBody @Validated LoginReqDto loginReqDto, BindingResult bindingResult, HttpServletRequest httpServletRequest) {
        System.out.println("loginReqDto = " + loginReqDto);
        userValidator.validate(loginReqDto, bindingResult);

        if (bindingResult.hasErrors()) {
            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError error : errors) {
                String fieldName = error.getField();
                String errorMessage = error.getDefaultMessage();
                if (fieldName.equals("userName")) {
                    errorMessage = messageSource.getMessage(error, LocaleContextHolder.getLocale());
                    return errorMessage;
                } else if (fieldName.equals("password")) {
                    errorMessage = messageSource.getMessage(error, LocaleContextHolder.getLocale());
                    return errorMessage;
                } else {

                }
            }
        }

        return loginReqDto.toString();
    }
}
