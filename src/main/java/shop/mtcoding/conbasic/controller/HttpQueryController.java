package shop.mtcoding.conbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpQueryController {
    @GetMapping("/data/query/v1")
    //키워드를 함께 전달하지 않으면 에러 발생
    //이름이 달라도 된다 - 쿼리스트링에서 해당 키를 가져오기 때문에
    //: required = true가 기본값
    public String queryV1(@RequestParam("keyword") String k){
        return "받은 값 :"+k;
    }
    @GetMapping("/data/query/v2")
    //키워드를 함께 전달하지 않으면 에러 발생
    //이름이 달라도 된다 - 쿼리스트링에서 해당 키를 가져오기 때문에
    public String queryV2(@RequestParam(value = "keyword", required = false) String k){
        return "받은 값 :"+k;
    }

    @GetMapping("/data/query/v3")
    //키워드를 함께 전달하지 않으면 에러 발생
    //이름이 달라도 된다 - 쿼리스트링에서 해당 키를 가져오기 때문에
    public String queryV3(@RequestParam(value = "keyword", required = false, defaultValue = "cos") String k){
        return "받은 값 :"+k;
    }

    @GetMapping("/data/query/v4")
    //키워드를 함께 전달하지 않으면 에러 발생
    //이름이 달라도 된다 - 쿼리스트링에서 해당 키를 가져오기 때문에
    public String queryV4(@RequestParam(defaultValue = "cos") String k){
        return "받은 값 :"+k;
    }
    //디폴트 값을 지정하고 싶을때만 @RequestParam 어노테이션을 사용한다
    //: 스트링 타입만 가능
    //디폴트 값을 지정하지 않고 Null을 허용할때는 사용하지 않아도 된다.
    @GetMapping("/data/query/v5")
    //키워드를 함께 전달하지 않으면 에러 발생
    //이름이 달라도 된다 - 쿼리스트링에서 해당 키를 가져오기 때문에
    public String queryV5(String k, String t){
        return "받은 값 :"+k+", "+t;
    }
}
