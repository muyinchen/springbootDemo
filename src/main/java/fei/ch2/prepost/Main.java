package fei.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author  知秋
 * Created by kauw on 2016/9/23.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService=context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService=context.getBean(JSR250WayService.class);
        context.close();
    }
}
