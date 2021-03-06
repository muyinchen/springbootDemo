package fei.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Author  知秋
 * Created by kauw on 2016/9/23.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent event) {
        String msg=event.getMsg();
        System.out.println("我(bean-demoListener)接受到了bean-demoPublisher发布的消息:"
                + msg);
    }
}
