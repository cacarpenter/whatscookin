package dev.craigcarpenter.svc.chaos.svc.impl;

import dev.craigcarpenter.svc.chaos.svc.ChaosProperties;
import dev.craigcarpenter.svc.chaos.svc.ChaosService;
import org.springframework.stereotype.Service;

@Service
public class ChaosServiceImpl implements ChaosService {

  private final ChaosProperties props;

  public ChaosServiceImpl(ChaosProperties props) throws InterruptedException {
    this.props = props;
    System.out.println(props.getSleepTime().toMillis());
    Thread.sleep(props.getSleepTime().toMillis());
  }

  @Override
  public String go() throws InterruptedException {
    return "ChaosServiceImpl says Hi! @#$!#@#";
  }
}
