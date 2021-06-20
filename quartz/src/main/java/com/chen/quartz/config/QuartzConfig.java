/*
package com.chen.quartz.config;

import org.quartz.Scheduler;
import org.quartz.ee.servlet.QuartzInitializerListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.io.IOException;

@Configuration
public class QuartzConfig {
    @Autowired
    private JobFactory jobFactory;

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() throws IOException {
        SchedulerFactoryBean factory = new SchedulerFactoryBean();
        factory.setAutoStartup(true);
        factory.setJobFactory(jobFactory);
        return factory;
    }


    */
/*
     * quartz初始化监听器
     *//*

    @Bean
    public QuartzInitializerListener executorListener() {
        return new QuartzInitializerListener();
    }

    */
/*
     * 通过SchedulerFactoryBean获取Scheduler的实例
     *//*

    @Bean
    public Scheduler scheduler() throws IOException {
        return schedulerFactoryBean().getScheduler();
    }
}
*/
