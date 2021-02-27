package dev.craigcarpenter.whatscookin.recipe.svc;

import java.io.InputStream;

public interface FileStore {
    long saveFile(String name, InputStream inputStream);
}
