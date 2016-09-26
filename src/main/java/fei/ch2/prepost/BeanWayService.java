package fei.ch2.prepost;

/**
 * Author  知秋
 * Created by kauw on 2016/9/23.
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }
    public BeanWayService(){
        super();
        System.out.println("初始化构造函数—BeanWayService");
    }
    public void destroy(){
        System.out.println("@Bean-destory-method");
    }
}
