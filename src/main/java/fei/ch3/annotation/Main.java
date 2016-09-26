package fei.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author  知秋
 * Created by kauw on 2016/9/25.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService=context.getBean(DemoService.class);
        demoService.outputReult();
        context.close();
    }
}
