package shop.mtcoding.conbasic.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import shop.mtcoding.conbasic.filter.UserFilter;

import javax.servlet.annotation.WebFilter;
@Configuration
public class FilterConfig {
    @Autowired
    private UserFilter userFilter;

    @Bean
    public FilterRegistrationBean<UserFilter> loggingFilter() {
        FilterRegistrationBean<UserFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(userFilter);
        registrationBean.addUrlPatterns("/login/*");

        return registrationBean;
    }
}
