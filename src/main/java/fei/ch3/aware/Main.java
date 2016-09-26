package fei.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author  知秋
 * Created by kauw on 2016/9/24.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService=context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }
}
