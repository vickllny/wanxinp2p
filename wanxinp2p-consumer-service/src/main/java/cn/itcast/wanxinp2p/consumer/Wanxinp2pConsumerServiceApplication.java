package cn.itcast.wanxinp2p.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"cn.itcast.wanxinp2p.consumer.agen"})
public class Wanxinp2pConsumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Wanxinp2pConsumerServiceApplication.class, args);
    }

}
