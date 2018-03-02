package net.no5no3.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.IOException;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringbootApplication.class, args);
//		ClassLoader loader = ClassLoader.getSystemClassLoader();
//		System.out.println(loader);
//		System.out.println(loader.getParent());
//		System.out.println(loader.getParent().getParent());
//		Integer.class.getConstructors();
//		ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
//		Resource[] resources = resourcePatternResolver.getResources("file:///D:/intellijProject/AnnotationsSample/**/*.java");
//		for (Resource r : resources) {
//		}
//		System.out.println(DateFormat.getDateTimeInstance().format(new Date()));
//		System.out.println(DateFormat.getDateTimeInstance(DateFormat.DEFAULT,DateFormat.DEFAULT,Locale.US).format(new Date()));

//		ExpressionParser parser = new SpelExpressionParser();
//		System.out.println(parser.parseExpression("null?:'k'").getValue());

//		List<String> test = Arrays.asList("tony","tony2","tony3");
//		Collections.sort(test, String::compareToIgnoreCase);
//		test.stream().filter(s -> s.length() <5).forEach(a->{
//            SpringApplication.run(SpringbootApplication.class, args);
//		});
	}
}
