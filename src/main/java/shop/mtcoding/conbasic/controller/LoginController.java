package shop.mtcoding.conbasic.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.conbasic.dto.LoginReqDto;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.http.HttpResponse;

@RestController
public class LoginController {
    @PostMapping("/login")
    public String login(@RequestBody @Valid LoginReqDto loginReqDto, BindingResult bindingResult){
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        if(bindingResult.hasErrors()){

        }
        return loginReqDto.toString();
    }
}
