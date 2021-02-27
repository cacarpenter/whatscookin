package dev.craigcarpenter.whatscookin.recipe.svc.impl;

import dev.craigcarpenter.whatscookin.recipe.svc.FileStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;

import java.io.InputStream;

@Repository("gcs")
@ConditionalOnProperty(prefix = "filestore", name = "gcs", havingValue = "gcs")
public class FileStoreGCSImpl implements FileStore {
  private static final Logger log = LoggerFactory.getLogger(FileStoreGCSImpl.class);

  //     private static Storage storage = null;

  @Override
  public long saveFile(String name, InputStream inputStream) {
    log.info("TODO Save File to GCloud Storage Bucket");
    return 0;
  }
}
