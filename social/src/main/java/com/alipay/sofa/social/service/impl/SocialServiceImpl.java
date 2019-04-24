package com.alipay.sofa.social.service.impl;

import com.alipay.sofa.social.service.SocialService;
import com.jaelyn.myjar.sendMsg;

/**
 * @author jingling.zhang@ucarinc.com
 * @description TODO
 * @date 2019/4/24 10:15
 **/
public class SocialServiceImpl implements SocialService {
    @Override
    public void socialFunction(String msg) {
        sendMsg sendMsg = new sendMsg();
        sendMsg.send(msg);
    }
}
