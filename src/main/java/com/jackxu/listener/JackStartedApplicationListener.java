package com.jackxu.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

// 这个监听器对ApplicationStartedEvent感兴趣
// 也就是如果spring源码启动的时候，有广播器发布了ApplicationStartedEvent事件，才会回调下面的代码
public class JackStartedApplicationListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("Jack的JackStartedApplicationListener ....");
    }

}