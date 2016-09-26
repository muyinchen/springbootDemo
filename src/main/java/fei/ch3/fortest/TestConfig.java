package fei.ch3.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Author  知秋
 * Created by kauw on 2016/9/27.
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("from development profile");
    }
    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("from production profile");
    }
}
