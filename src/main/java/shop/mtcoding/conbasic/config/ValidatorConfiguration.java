package shop.mtcoding.conbasic.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import shop.mtcoding.conbasic.validator.UserValidator;

@Configuration
public class ValidatorConfiguration {

    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
        validator.setValidationMessageSource(messageSource());
        return validator;
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages/validation");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public UserValidator userValidator() {
        return new UserValidator();
    }
}
