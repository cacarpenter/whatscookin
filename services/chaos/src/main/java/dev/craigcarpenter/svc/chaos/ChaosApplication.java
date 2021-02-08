package dev.craigcarpenter.svc.chaos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ChaosApplication {

  public static void main(String[] args) {
    ///
    // SpringApplication.run(ChaosApplication.class, args);
    // is the same as
    // new SpringApplication(ChaosApplication.class).run(args);
    //

    SpringApplication app = new SpringApplication(ChaosApplication.class);
    app.setApplicationStartup(new FlightRecorderApplicationStartup());
    app.run(args);
  }
}
