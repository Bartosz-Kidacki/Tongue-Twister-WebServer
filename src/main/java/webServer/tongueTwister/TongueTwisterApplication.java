package webServer.tongueTwister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "webServer.tongueTwister.Repository")
@SpringBootApplication
public class TongueTwisterApplication extends SpringBootServletInitializer {
   public static void main(String[] args) {
      SpringApplication.run(TongueTwisterApplication.class, args);
   }
}