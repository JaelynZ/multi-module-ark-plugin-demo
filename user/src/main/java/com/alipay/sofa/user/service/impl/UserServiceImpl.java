package com.alipay.sofa.user.service.impl;

import com.alipay.sofa.user.service.UserService;
import com.jaelyn.myjar.sendMsg;

/**
 * @author jingling.zhang@ucarinc.com
 * @description TODO
 * @date 2019/4/23 18:24
 **/
public class UserServiceImpl implements UserService {
    @Override
    public void userFunction(String msg) {
        sendMsg sendMsg = new sendMsg();
        sendMsg.send(msg);
    }
}
