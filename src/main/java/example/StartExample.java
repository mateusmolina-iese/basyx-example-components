package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(scanBasePackages = { "org.eclipse.digitaltwin.basyx", "example" }, exclude = { MongoAutoConfiguration.class, MongoDataAutoConfiguration.class })
public class StartExample {

	public static void main(String[] args) {
		SpringApplication.run(StartExample.class, args);
	}
}
