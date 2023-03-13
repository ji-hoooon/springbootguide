package shop.mtcoding.conbasic.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpResponse;

//어노테이션을 적으면 컨트롤러가 된다
//: 8가지의 어노테이션 컴포넌트 스캔의 대상
@RestController
//Data를 응답하는 컨트롤러
public class HttpMethodController {

    //URI : 엔드 포인트
    // 도메인 주소 뒤에 붙는다.
    @GetMapping("/req/get")
    public String methodGet(){
        //데이터 자체를 응답한다.
        return "<h1> get 요청 </h1>";
    }
    @PostMapping("/req/post")
    //HttpServletResponse response을 적으면 자동으로 주입
    public String methodPost(HttpServletResponse response){
        //제어가 안된다. -> 프레임워크이기 때문에
//        response.setContentType(HttpHeaders.CONTENT_TYPE);
        //데이터 자체를 응답한다.
        return "<h1> post 요청 </h1>";
    }

    @PutMapping("/req/put")
    //HttpServletResponse response을 적으면 자동으로 주입
    public String methodPut(HttpServletResponse response){
        //제어가 안된다. -> 프레임워크이기 때문에
//        response.setContentType(HttpHeaders.CONTENT_TYPE);
        //데이터 자체를 응답한다.
        return "<h1> put 요청 </h1>";
    }
    @DeleteMapping("/req/delete")
    //HttpServletResponse response을 적으면 자동으로 주입
    public String methodDelete(HttpServletResponse response){
        //제어가 안된다. -> 프레임워크이기 때문에
        response.setContentType("text/html");
        //데이터 자체를 응답한다.
        return "<h1> delete 요청 </h1>";
    }
}
