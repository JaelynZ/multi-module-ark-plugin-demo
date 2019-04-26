package com.alipay.sofa.multimodulearkproject.controller;

import com.alipay.sofa.activity.Activity;
import com.alipay.sofa.content.Content;
import com.alipay.sofa.social.Social;
import com.alipay.sofa.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping("/test")
    public void test() {
        System.out.println("测试");
        User user = new User();
        Social social = new Social();
        Content content = new Content();
        Activity activity = new Activity();
        user.userFunction("我是用户服务");
        social.socialFunction("我是社交服务");
        content.contentFunction("我是内容服务");
        activity.activityFunction("我是活动服务");
    }


}