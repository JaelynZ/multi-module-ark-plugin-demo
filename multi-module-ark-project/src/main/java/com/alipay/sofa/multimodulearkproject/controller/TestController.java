/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.alipay.sofa.multimodulearkproject.controller;


import com.alipay.sofa.activity.Activity;
import com.alipay.sofa.activity.service.ActivityService;
import com.alipay.sofa.content.Content;
import com.alipay.sofa.content.service.ContentService;
import com.alipay.sofa.social.Social;
import com.alipay.sofa.social.service.SocialService;
import com.alipay.sofa.user.User;
import com.alipay.sofa.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    /*@Resource
    private UserService userService;*/
    /*@Resource
    private SocialService socialService;
    @Resource
    private ContentService contentService;
    @Resource
    private ActivityService activityService;*/

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

        /*userService.userFunction("我是用户服务");
        socialService.socialFunction("我是社交服务");
        contentService.contentFunction("我是内容服务");
        activityService.activityFunction("我是活动服务");*/
    }


}