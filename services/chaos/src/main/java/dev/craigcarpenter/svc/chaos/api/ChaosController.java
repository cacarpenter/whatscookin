package dev.craigcarpenter.svc.chaos.api;

import dev.craigcarpenter.svc.chaos.svc.ChaosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChaosController {

  private final ChaosService chaosService;

  public ChaosController(ChaosService cs) {
    this.chaosService = cs;
  }

  @GetMapping("/")
  public String hello() throws InterruptedException {
    return this.chaosService.go();
  }
}
