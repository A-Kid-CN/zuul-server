package cn.backurl.zuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author: akid
 * @create: 2019-11-06 21:16
 **/
@RestController
public class HiController {



    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHi(String name) {
        System.out.println("hhhh");
        return "哈哈哈哈";
    }
}
