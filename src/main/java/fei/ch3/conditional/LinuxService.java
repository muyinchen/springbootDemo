package fei.ch3.conditional;

/**
 * Author  知秋
 * Created by kauw on 2016/9/24.
 */
public class LinuxService implements ListService{
    @Override
    public String showListcmd() {
        return "ls";
    }
}
