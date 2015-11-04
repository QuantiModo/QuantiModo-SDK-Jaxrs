package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CredentialsApiService;
import io.swagger.api.factories.CredentialsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse2009;
import io.swagger.model.InlineResponse20010;
import io.swagger.model.Credential;
import io.swagger.model.InlineResponse2002;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/api/v2/credentials")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/credentials", description = "the credentials API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class CredentialsApi  {

   private final CredentialsApiService delegate = CredentialsApiServiceFactory.getCredentialsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all Credentials", notes = "Get all Credentials", response = InlineResponse2009.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2009.class) })

    public Response credentialsGet(@ApiParam(value = "connector_id") @QueryParam("connector_id") Boolean connectorId,
    @ApiParam(value = "attr_key") @QueryParam("attr_key") String attrKey,
    @ApiParam(value = "attr_value") @QueryParam("attr_value") String attrValue,
    @ApiParam(value = "created_at") @QueryParam("created_at") String createdAt,
    @ApiParam(value = "updated_at") @QueryParam("updated_at") String updatedAt,
    @ApiParam(value = "limit") @QueryParam("limit") Integer limit,
    @ApiParam(value = "offset") @QueryParam("offset") Integer offset,
    @ApiParam(value = "sort") @QueryParam("sort") String sort)
    throws NotFoundException {
        return delegate.credentialsGet(connectorId,attrKey,attrValue,createdAt,updatedAt,limit,offset,sort);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Store Credential", notes = "Store Credential", response = InlineResponse20010.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20010.class) })

    public Response credentialsPost(@ApiParam(value = "Credential that should be stored" ) Credential body)
    throws NotFoundException {
        return delegate.credentialsPost(body);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Credential", notes = "Get Credential", response = InlineResponse20010.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse20010.class) })

    public Response credentialsIdGet(@ApiParam(value = "connector id",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "attrKey",required=true) @QueryParam("attrKey") String attrKey)
    throws NotFoundException {
        return delegate.credentialsIdGet(id,attrKey);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Credential", notes = "Update Credential", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response credentialsIdPut(@ApiParam(value = "connector id",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "attrKey",required=true) @QueryParam("attrKey") String attrKey,
    @ApiParam(value = "Credential that should be updated" ) Credential body)
    throws NotFoundException {
        return delegate.credentialsIdPut(id,attrKey,body);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Credential", notes = "Delete Credential", response = InlineResponse2002.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse2002.class) })

    public Response credentialsIdDelete(@ApiParam(value = "connector id",required=true) @PathParam("id") Integer id,
    @ApiParam(value = "attrKey",required=true) @QueryParam("attrKey") String attrKey)
    throws NotFoundException {
        return delegate.credentialsIdDelete(id,attrKey);
    }
}

