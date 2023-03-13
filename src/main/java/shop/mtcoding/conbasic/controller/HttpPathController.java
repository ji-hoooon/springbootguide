package shop.mtcoding.conbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpPathController { //new 됨
    /**
    * 쿼리스트링, PathVariable
     * SELECT * FROM user WHERE email = 'ssar@nate.com';
     */
    @GetMapping("/data/path/v1/{id}")
    public String pathV1(@PathVariable int id){
        return "받은 값: "+id;
    }
}
