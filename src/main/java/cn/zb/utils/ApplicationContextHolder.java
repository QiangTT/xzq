package cn.zb.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextHolder implements ApplicationContextAware {
    private static ApplicationContext app;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        app =applicationContext;
        //System.out.println("**************");
        //System.out.println("app=="+app);
    }
    public static ApplicationContext getApplicationContextr(){
        return app;
    }

    public static Object getBean(String beanName){
        return app.getBean(beanName);
    }

    public static <T> T getBean(Class<T> clazz){
        return  app.getBean(clazz);
    }

    public static  <T> T getBean(String beanName,Class<T> clazz ){
        return  app.getBean(beanName,clazz);
    }

}
