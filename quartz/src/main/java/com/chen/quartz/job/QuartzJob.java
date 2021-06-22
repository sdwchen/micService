package com.chen.quartz.job;

import com.chen.quartz.service.FeignService;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

// 防止任务并发执行 @DisallowConcurrentExecution
@DisallowConcurrentExecution
public class QuartzJob extends QuartzJobBean {
    @Autowired
    private FeignService feignService;
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobKey key = jobExecutionContext.getJobDetail().getKey();
        JobDataMap dataMap = jobExecutionContext.getJobDetail().getJobDataMap();
            System.out.println("key:" + key.getGroup());
            System.out.println(feignService.findAllAdmin());
            System.out.println("key:" + key + "   " + "value:" + dataMap);
            // 可以再这里调用第三方接口，管理其他应用的定时任务
    }
}
