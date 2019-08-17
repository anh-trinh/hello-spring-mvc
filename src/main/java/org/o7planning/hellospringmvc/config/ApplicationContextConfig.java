package org.o7planning.hellospringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//Class ApplicationContextConfig được sử dụng để khai báo các Spring BEAN. 
//Nó được chú thích bởi @Configuration.

//@ComponentScan("org.o7planning.hellospringmvc.*")
//Nói với Spring tìm kiếm các Spring BEAN khác, 
//và các Controller trong các package "con trực tiếp" 
//của package org.o7planning.hellospringmvc.
@Configuration
@ComponentScan("org.o7planning.hellospringmvc.*")
public class ApplicationContextConfig {

	@Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
