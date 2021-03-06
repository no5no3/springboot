package net.no5no3.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	ApplicationContext ctx;
	@Test
	public void contextLoads() {
		assertThat((VocabularyController)ctx.getBean("vocabularyController"));
//		RestTemplate restTemplate = new RestTemplate();
//		System.out.println(restTemplate.getForObject("http://localhost:8081/h/vo/0?size=20",String.class));
//		restTemplate.execute(, HttpMethod.GET, request -> System.out.println(request.toString()), new ResponseExtractor<String>() {
//			@Override
//			public String extractData(ClientHttpResponse response) throws IOException {
//				byte[] res = new byte[Integer.valueOf(response.getHeaders().get("ContentLength").get(0))];
//				response.getBody().read(res);
//				System.out.println(String.valueOf(res));
//				return String.valueOf(res);
//			}
//		});
	}

}
