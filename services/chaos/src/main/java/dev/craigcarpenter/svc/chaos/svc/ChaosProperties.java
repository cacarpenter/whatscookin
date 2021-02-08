package dev.craigcarpenter.svc.chaos.svc;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.boot.convert.DurationUnit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

@ConfigurationProperties("chaos")
@ConstructorBinding
public class ChaosProperties {
  private final Duration sleepTime;

  public ChaosProperties(@DefaultValue("0") @DurationUnit(ChronoUnit.SECONDS) Duration sleepTime) {
    this.sleepTime = sleepTime;
  }

  public Duration getSleepTime() {
    return sleepTime;
  }
}
