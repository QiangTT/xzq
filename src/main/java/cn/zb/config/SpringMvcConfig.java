package cn.zb.config;

import cn.zb.interceptor.MyInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@ComponentScan(value = "cn.zb.controller")
@EnableWebMvc //<mvc:annotation-driven>
public class SpringMvcConfig extends WebMvcConfigurerAdapter {
    //HttpMessage转换器
    /*@Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new FastJsonHttpMessageConverter());
    }
*/
    //视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        /*InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        registry.viewResolver(resolver);*/
        registry.jsp("/pages", ".jsp");
    }

    //拦截器
 @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/**").excludePathPatterns("/**/*.jsp");
    }

    //视图访问控制
   /* @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/showLogin")
                .setViewName("login");
        registry.addViewController("/abc")
                .setViewName("abc");
    }*/

    //静态资源访问处理
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/");

    }
}
