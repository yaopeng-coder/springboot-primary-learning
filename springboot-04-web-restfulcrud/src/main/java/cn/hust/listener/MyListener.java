package cn.hust.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("应用开始");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("应用销毁");
    }
}
