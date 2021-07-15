package com.piyush.SpirngBasic.contextAware;

import com.piyush.SpirngBasic.events.CustomEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppContextAwareComponent implements ApplicationContextAware, BeanNameAware {

    ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

        doSomethingRelatedToAppContext();
    }

    public void doSomethingRelatedToAppContext(){
      log.debug( applicationContext.getApplicationName());
      applicationContext.publishEvent(new CustomEvent("Some custom Event "));
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name : "+s);
    }
}
