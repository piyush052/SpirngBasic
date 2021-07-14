package com.piyush.SpirngBasic.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EventSubscriber implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        log.debug(event.toString());
    }
}
