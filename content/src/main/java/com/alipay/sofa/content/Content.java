package com.alipay.sofa.content;

import com.jaelyn.myjar.sendMsg;

/**
 * @author jingling.zhang@ucarinc.com
 * @description TODO
 * @date 2019/4/24 11:24
 **/
public class Content {
    public void contentFunction(String msg) {
        sendMsg sendMsg = new sendMsg();
        sendMsg.send(msg);
    }
}
