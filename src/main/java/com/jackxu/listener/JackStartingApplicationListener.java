package com.jackxu.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;


// 这个监听器对ApplicationStartingEvent感兴趣
// 也就是如果spring源码启动的时候，有广播器发布了ApplicationStartingEvent事件，才会回调下面的代码
public class JackStartingApplicationListener implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("Jack的JackStartingApplicationListener ....");
    }

}