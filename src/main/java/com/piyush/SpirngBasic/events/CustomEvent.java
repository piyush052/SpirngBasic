package com.piyush.SpirngBasic.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Slf4j
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
        log.debug(source.toString());
    }

    @Override
    public String toString() {
        return "Custom Event ";
    }
}
