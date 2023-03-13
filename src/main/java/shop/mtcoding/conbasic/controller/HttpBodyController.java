package shop.mtcoding.conbasic.controller;

import org.springframework.web.bind.annotation.*;
import shop.mtcoding.conbasic.dto.BoardReqDto;

@RestController
public class HttpBodyController {
    /**
     *    host = localhost:8080
     *    endpoint = /data/body/v1
     *    method = post
     *    QueryString = title (String)
     *    Body - x-www-form-urlencoded = title (String)
     */
    @PostMapping("/data/body/v1")
    public String bodyV1 (@RequestParam("title") String title){
        return "받은 값 : "+title;
    }
    @PostMapping("/data/body/v2")
    public String bodyV2 (@RequestParam("title") String title){
        return "받은 값 : "+title;
    }
    @PostMapping("/data/body/v3")
    public String bodyV3 (@RequestBody BoardReqDto boardReqDto) {
        //버퍼 발동
        //Jackson만 발동안하면 됨 -> 오브젝트면 발동
        return "받은 값 : "+boardReqDto.getTitle()+", "+boardReqDto.getContent();
        //파싱을 못하고 읽기만함
    }
    //ReqeustBody를 붙이면 파싱 전략이 바뀜 -> 버퍼로 읽는다. -> req.getParameter() 안함 -> req.getReader()

}
