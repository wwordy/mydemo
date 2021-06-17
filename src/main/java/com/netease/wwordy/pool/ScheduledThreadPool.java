package com.netease.wwordy.pool;

import javax.annotation.PostConstruct;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/6/15
 */
public class ScheduledThreadPool {
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
    public static void main(String[] args) throws InterruptedException {
        ScheduledThreadPool scheduledThreadPool = new ScheduledThreadPool();
        scheduledThreadPool.p();
    }
@PostConstruct
    public void p(){
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            try {
                System.out.println("print.............");
            } catch (Exception e) {
                System.out.println("Exception..........");
            }
        }, 1L, 2 * 1L, TimeUnit.SECONDS);
    }
}
