package fei.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author  知秋
 * Created by kauw on 2016/9/23.
 */
public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();
        DemoBean demoBean=context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}
