package fei.ch2.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * Author  知秋
 * Created by kauw on 2016/9/23.
 */
public class DemoEvent extends ApplicationEvent  implements Serializable{


    private static final long serialVersionUID = -7423816102807319803L;
    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
