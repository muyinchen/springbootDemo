package fei.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author  知秋
 * Created by kauw on 2016/9/22.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingleService s1=context.getBean(DemoSingleService.class);
        DemoSingleService s2=context.getBean(DemoSingleService.class);

        DemoprototypeService p1=context.getBean(DemoprototypeService.class);
        DemoprototypeService p2=context.getBean(DemoprototypeService.class);
        System.out.println("s1与s2是否相等："+s1.equals(s2));
        System.out.println("p1与p2是否相等："+p1.equals(p2));
        context.close();
    }


}
