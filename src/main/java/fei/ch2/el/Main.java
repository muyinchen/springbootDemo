package fei.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author  知秋
 * Created by kauw on 2016/9/22.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService=context.getBean(ElConfig.class);
        resourceService.outputResource();
        context.close();
    }

}
