
How to deploy Spring Boot application to external web application server.

1. Set the packaging from jar to war in the pom.xml

<packaging>war</packaging>


2. Change dependencies
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-tomcat</artifactId>
    <scope>provided</scope>
</dependency>


3. Change Application class to inherit SpringBootServletInitializer, and override configure method.

@SpringBootApplication
public class CourseApiDataApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CourseApiDataApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CourseApiDataApplication.class, args);
	}
}

