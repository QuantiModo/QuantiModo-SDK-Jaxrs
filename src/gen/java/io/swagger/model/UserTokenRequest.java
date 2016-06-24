package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.UserTokenRequestInnerUserField;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class UserTokenRequest   {
  
  private UserTokenRequestInnerUserField user = null;
  private String organizationAccessToken = null;

  /**
   **/
  public UserTokenRequest user(UserTokenRequestInnerUserField user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user")
  public UserTokenRequestInnerUserField getUser() {
    return user;
  }
  public void setUser(UserTokenRequestInnerUserField user) {
    this.user = user;
  }

  /**
   * Organization Access token
   **/
  public UserTokenRequest organizationAccessToken(String organizationAccessToken) {
    this.organizationAccessToken = organizationAccessToken;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Organization Access token")
  @JsonProperty("organizationAccessToken")
  public String getOrganizationAccessToken() {
    return organizationAccessToken;
  }
  public void setOrganizationAccessToken(String organizationAccessToken) {
    this.organizationAccessToken = organizationAccessToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTokenRequest userTokenRequest = (UserTokenRequest) o;
    return Objects.equals(user, userTokenRequest.user) &&
        Objects.equals(organizationAccessToken, userTokenRequest.organizationAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, organizationAccessToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTokenRequest {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    organizationAccessToken: ").append(toIndentedString(organizationAccessToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

