package io.swagger.api.factories;

import io.swagger.api.V2ApiService;
import io.swagger.api.impl.V2ApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class V2ApiServiceFactory {
    private final static V2ApiService service = new V2ApiServiceImpl();

    public static V2ApiService getV2Api() {
        return service;
    }
}
