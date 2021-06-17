package com.netease.wwordy.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author liuwangwang@corp.netease.com
 * @date 2021/6/15
 */
public class UseCallable{
    public static void main(String[]args)throws Exception{
        System.out.println(2);
        FutureTask<Integer> futureTask=new FutureTask<Integer>(new Task());
        System.out.println(3);
        new Thread(futureTask).start();
        System.out.println(4);
        int result=futureTask.get();
        System.out.println(5);
        System.out.println(result);
        System.out.println(6);
    }
    static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            Thread.sleep(2000);
            return 1;
        }
    }
}
