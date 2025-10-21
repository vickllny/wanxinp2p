package cn.itcast.wanxinp2p.consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commer")
public class ConsumerController {

    @GetMapping("/hello")
    public  String  hello(){
        return "hello";
    }

}
