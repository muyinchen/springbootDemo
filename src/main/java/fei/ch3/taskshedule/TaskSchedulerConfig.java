package fei.ch3.taskshedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Author  知秋
 * Created by kauw on 2016/9/24.
 */
@Configuration
@ComponentScan("fei.ch3.taskshedule")
@EnableScheduling
public class TaskSchedulerConfig {
}
