package fei.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Auser on 2016/9/21.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解拦截的add操作")
    public void add(){}
}



