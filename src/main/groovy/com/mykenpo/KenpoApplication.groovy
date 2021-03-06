package com.mykenpo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
class KenpoApplication {

    static void main(String[] args) {
        SpringApplication.run(KenpoApplication.class, args)
    }

//    @Bean
//    ServletRegistrationBean h2servletRegistration(){
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet())
//        registrationBean.addUrlMappings("/console/*")
//        return registrationBean
//    }
}
