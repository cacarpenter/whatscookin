package dev.craigcarpenter.svc.chaos.svc;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.Duration;

@ConfigurationProperties("chaos")
@ConstructorBinding
public class ChaosProperties {
  private final Duration sleepTime;

  public ChaosProperties(@DefaultValue("0") Duration sleepTime) {
    this.sleepTime = sleepTime;
  }

  public Duration getSleepTime() {
    return sleepTime;
  }
}
