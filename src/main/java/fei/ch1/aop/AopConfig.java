package fei.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Auser on 2016/9/21.
 */
@Configuration
@ComponentScan("fei.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
