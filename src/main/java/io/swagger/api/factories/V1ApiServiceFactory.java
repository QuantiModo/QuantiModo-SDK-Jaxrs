package io.swagger.api.factories;

import io.swagger.api.V1ApiService;
import io.swagger.api.impl.V1ApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class V1ApiServiceFactory {
    private final static V1ApiService service = new V1ApiServiceImpl();

    public static V1ApiService getV1Api() {
        return service;
    }
}
