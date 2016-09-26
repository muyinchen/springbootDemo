package fei.ch1.javaconfig;

/**
 * Created by Auser on 2016/9/21.
 */
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
