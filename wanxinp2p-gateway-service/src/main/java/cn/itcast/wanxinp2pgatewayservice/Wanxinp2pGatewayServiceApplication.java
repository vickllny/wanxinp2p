package cn.itcast.wanxinp2pgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class Wanxinp2pGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Wanxinp2pGatewayServiceApplication.class, args);
    }

}
