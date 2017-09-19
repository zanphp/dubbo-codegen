package io.swagger.codegen.lite;

import java.io.File;
import java.util.List;

public interface Generator {
    Generator opts(ClientOptInput opts);

    List<File> generate();
}