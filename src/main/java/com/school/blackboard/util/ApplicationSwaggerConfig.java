package com.school.blackboard.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@ComponentScan(basePackages="com.school.blackboard.controller")
public class ApplicationSwaggerConfig {

   @Bean
   public Docket customDocket(){
      return new Docket(DocumentationType.SWAGGER_2)
    		  .select()
              .apis(RequestHandlerSelectors.any())
              .paths(PathSelectors.any())
              .build()
              .apiInfo(getApiInfo());
   }

   private ApiInfo getApiInfo() {
	   return new ApiInfo(
		"BlackBoard backend REST Api Documentation",
		"This is REST API documentation of the Univeristy BlackBoard backend Api",
		"1.0",
		"BlackBoard backend terms of service",
		new Contact(
				"Harish, Karthik",
				"https://github.com/karthikreddy521/BlackboardApp",
				"harish@gmail.com"),
		"Apache 2.0",
		"http://www.apache.org/licenses/LICENSE-2.0");
   }


}
