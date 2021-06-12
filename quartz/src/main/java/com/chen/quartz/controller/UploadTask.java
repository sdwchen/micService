package com.chen.quartz.controller;



import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 描述：
 *
 * @author caojing
 * @create 2018-12-25-11:38
 */
@Component
@DisallowConcurrentExecution
public class UploadTask extends QuartzJobBean {
    @Autowired
    private QuartzJobController jobController;
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(new Date() + "任务开始------------------------------------");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new Date() + "任务结束------------------------------------");
    }
}


