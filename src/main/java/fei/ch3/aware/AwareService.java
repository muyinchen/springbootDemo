package fei.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * Author  知秋
 * Created by kauw on 2016/9/24.
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;
    @Override
    public void setBeanName(String name) {
        this.beanName=name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader=resourceLoader;
    }
    public void outputResult(){

        System.out.println("Bean的名称为： "+beanName);
        Resource resource=
                loader.getResource("classpath:fei/ch3/aware/test.txt");
        try {
            System.out.println("ResourceLoader加载文档内容为： "+ IOUtils.toString(resource.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
