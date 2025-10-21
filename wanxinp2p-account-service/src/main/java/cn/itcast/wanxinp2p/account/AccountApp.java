package cn.itcast.wanxinp2p.account;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages ={"cn.itcast.wanxinp2p.account"})
@EnableDiscoveryClient
@EnableApolloConfig
public class AccountApp {
	public static void main(String[] args) {
		SpringApplication.run(AccountApp.class, args);
	}
}