package com.example.forex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableSwagger2
public class ForexServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexServiceApplication.class, args);
	}
//	
//	@Bean
//    public Docket api() { 
//        return new Docket(DocumentationType.SWAGGER_2)
//          .select()
//          .apis(RequestHandlerSelectors.any())
////          .apis(RequestHandlerSelectors.basePackage("com.example.forex"))
//          .paths(PathSelectors.ant("/currency-exchange/**/*"))
////          .paths(PathSelectors.any())
//          .build()
//          .apiInfo(serviceInfo())
//          .useDefaultResponseMessages(false)                                   
//		  .globalResponseMessage(RequestMethod.GET, responseCode())
//          ;
//    }
//	
//	private ApiInfo serviceInfo() {
//		return new ApiInfoBuilder()
//				.contact(new Contact("Binay", "", "binay.bittucool@gmail.com"))
//				.description("Get exchange rates")
//				.version("v1.0")
//				.title("Forex Service")
//				.licenseUrl("http://localhost:8000/swagger-ui.html")
//				.termsOfServiceUrl("Only for learning purpose")
//				.build();
//	}
//	
//	private List<ResponseMessage> responseCode() {
//		return new ArrayList<ResponseMessage>(Arrays.asList(
//			new ResponseMessageBuilder()
//			 .code(500)
//			 .message("500 message")
//			 .responseModel(new ModelRef("error"))
//			 .build(),
//			new ResponseMessageBuilder()
//			 .code(403)
//			 .message("Forbidden!")
//			 .build()));
//	}
}
