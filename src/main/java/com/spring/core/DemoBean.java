package com.spring.core;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.DispatcherServlet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Nageswar on 6/23/2018.
 */
@Component

@Controller
public class DemoBean extends DispatcherServlet {
    @PostConstruct
    public  void customInit(){
        System.out.println("Custom initialization");
    }
    @PreDestroy
    public void customDestroy(){
        System.out.println("custom destruction");
    }
}
