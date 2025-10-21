package cn.itcast.wanxinp2papi.account;

import cn.itcast.wanxinp2pcommon.domain.RestResponse;

public interface AccountAPI {
    /**
     * 获取手机验证码
     * @param mobile 手机号
     * @return
     */
    RestResponse getSMSCode(String mobile);
}
