package com.spring.scheduler.service;

import com.spring.scheduler.SchedulerApplication;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@EnableScheduling
public class SchedulerService
{

    @Scheduled(fixedRate = 2000L)
    public String getTimeA()
    {
        String time = String.valueOf(new Date());
        System.out.println(time);
        return "<h1>Logger Time..!!</h1>"+time;
    }

    @Scheduled(cron = "*/1 * * * * *")
    public String getTimeB()
    {
        String time = String.valueOf(new Date());
        System.out.println(time);
        return "<h1>Logger Time..!!</h1>"+time;
    }
}
