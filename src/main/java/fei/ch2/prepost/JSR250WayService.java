package fei.ch2.prepost;

import javax.annotation.PostConstruct;

/**
 * Author  知秋
 * Created by kauw on 2016/9/23.
 */
public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("jsr-250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
}
