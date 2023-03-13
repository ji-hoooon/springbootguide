package shop.mtcoding.conbasic.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingRequestWrapper;
import shop.mtcoding.conbasic.dto.LoginReqDto;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
@Component
public class UserFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // LoginReqDto 객체 가져오기
        LoginReqDto loginReqDto = null;

        //JSON문자열을 객체로 역직렬화하는 과정
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            loginReqDto = objectMapper.readValue(httpRequest.getInputStream(), LoginReqDto.class);
        } catch (Exception e) {
            System.out.println("에러 발생");
            e.printStackTrace();

        }
        String userName = loginReqDto.getUserName();

        System.out.println("userName = " + userName);
        if(!isCheck(userName)){
            httpResponse.setStatus(HttpStatus.FORBIDDEN.value());
            httpResponse.setContentType(MediaType.APPLICATION_JSON_VALUE);
            httpResponse.getWriter().write("{\"error\": \"This user is blocked.\"}");
            return;
        }

        httpRequest.setAttribute("loginReqDto", loginReqDto);
        System.out.println("loginReqDto = " + loginReqDto);
        chain.doFilter(request,response);
    }
    private boolean isCheck(String userName){
        if(userName.equals("asdf")){
            return false;
        }
        return true;
    }

}
