package com.alipay.sofa.content.service.impl;

import com.alipay.sofa.content.service.ContentService;
import com.jaelyn.myjar.sendMsg;

/**
 * @author jingling.zhang@ucarinc.com
 * @description TODO
 * @date 2019/4/24 10:22
 **/
public class ContentServiceImpl implements ContentService {
    @Override
    public void contentFunction(String msg) {
        sendMsg sendMsg = new sendMsg();
        sendMsg.send(msg);
    }
}
