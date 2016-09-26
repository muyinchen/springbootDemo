package fei.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author  知秋
 * Created by kauw on 2016/9/24.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService=context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+
                "系统下的命令列表命令为："+ listService.showListcmd());
        context.close();
    }
}
