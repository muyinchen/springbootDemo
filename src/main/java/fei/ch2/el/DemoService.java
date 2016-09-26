package fei.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Author  知秋
 * Created by kauw on 2016/9/22.
 */
@Service
public class DemoService {
    @Value("其他类属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnther(String anther) {
        this.another = anther;
    }

}
