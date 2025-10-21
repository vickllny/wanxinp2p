package cn.itcast.wanxinp2p.account.service;

import cn.itcast.wanxinp2pcommon.domain.RestResponse;

public interface AccountService{
    /**
     * 获取手机验证码
     * @param mobile 手机号
     * @return
     */
    RestResponse getSMSCode(String mobile);
}
