package com.ashokit.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggersInfo {

	/*
	 * @Bean public Docket getdata() { return new
	 * Docket(DocumentationType.SWAGGER_2).select()
	 * .apis(RequestHandlerSelectors.basePackage("com.ashokit.controller")).paths(
	 * PathSelectors.any()).build(); }
	 */
	private static final String TITLE = "Flight API";
	private static final String DESCRIPTION = "Descripcion API Flight";
	private static final String BASE_PACKAGE = "com.ashokit.controller";
	private static final String VERSION = "v1";

	@Bean
	public Docket swagger() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
				.build().forCodeGeneration(true)
				.apiInfo(new ApiInfoBuilder().title(TITLE).description(DESCRIPTION).version(VERSION).build());
	}
}
