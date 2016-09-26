package fei.ch1.aop;

import java.lang.annotation.*;

/**
 * fei
 * Created by Auser on 2016/9/21.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
