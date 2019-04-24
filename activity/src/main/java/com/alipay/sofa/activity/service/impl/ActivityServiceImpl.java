package com.alipay.sofa.activity.service.impl;

import com.alipay.sofa.activity.service.ActivityService;
import com.jaelyn.myjar.sendMsg;

/**
 * @author jingling.zhang@ucarinc.com
 * @description TODO
 * @date 2019/4/24 10:28
 **/
public class ActivityServiceImpl implements ActivityService {
    @Override
    public void activityFunction(String msg) {
        sendMsg sendMsg = new sendMsg();
        sendMsg.send(msg);
    }
}
