package fei.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * Author  知秋
 * Created by kauw on 2016/9/25.
 */
@Service
public class DemoService {
    public void outputReult(){
        System.out.println("从组合注解配置照样获得bean");
    }
}
