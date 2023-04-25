package com.spring.scheduler.controller;
import com.spring.scheduler.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class SchedulerController
{
    @Autowired
    SchedulerService service;

    @GetMapping("/time-A")
    public String displayA()
    {
       return service.getTimeA();
    }

    @GetMapping("/time-B")
    public String displayB()
    {
        return service.getTimeB();
    }
}
