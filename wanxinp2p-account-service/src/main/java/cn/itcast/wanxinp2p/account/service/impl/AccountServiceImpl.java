package cn.itcast.wanxinp2p.account.service.impl;

import cn.itcast.wanxinp2p.account.service.AccountService;
import cn.itcast.wanxinp2pcommon.domain.RestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public RestResponse getSMSCode(String mobile) {
        //TODO
        // 发起远程请求调用 短信微服务 发送短信   RestTemplate
        // restTemplate.getForObject("http://localhost:56085/sailing/generate?effectiveTime=300&name=sms",)
        // http://localhost:56085/sailing/generate?effectiveTime=300&name=sms
        // {"mobile":"13566668888"}

        return null;
    }
}
