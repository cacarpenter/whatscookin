package dev.craigcarpenter.whatscookin.recipe.svc.impl;

import dev.craigcarpenter.whatscookin.recipe.svc.FileStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;

import java.io.InputStream;

@Repository("local")
@ConditionalOnProperty(
    prefix = "recipe",
    name = "filestore",
    havingValue = "local",
    matchIfMissing = true)
public class FileStoreLocalFSImpl implements FileStore {
  private static final Logger log = LoggerFactory.getLogger(FileStoreLocalFSImpl.class);

  @Override
  public long saveFile(String name, InputStream inputStream) {
    log.info("TODO Save File {} locally", name);
    return 0;
  }
}
