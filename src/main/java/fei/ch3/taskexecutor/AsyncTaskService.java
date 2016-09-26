package fei.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Author  知秋
 * Created by kauw on 2016/9/24.
 */
@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务 ： "+i);
    }
    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务B:"+(i+1));
    }
}
