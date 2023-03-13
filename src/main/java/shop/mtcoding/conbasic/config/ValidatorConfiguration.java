package shop.mtcoding.conbasic.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import shop.mtcoding.conbasic.validator.UserValidator;

import javax.validation.MessageInterpolator;
import javax.validation.Validation;

@Configuration
public class ValidatorConfiguration {

    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
        validator.setValidationMessageSource(messageSource());
//        validator.setMessageInterpolator(messageInterpolator());
        return validator;
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setBasename("messages/validation");
        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
//        @Bean
//        public MessageInterpolator messageInterpolator() {
//            return Validation.byDefaultProvider().configure()
//                    .getDefaultMessageInterpolator();
//        }


    @Bean
    public UserValidator userValidator() {
        return new UserValidator();
    }
}
