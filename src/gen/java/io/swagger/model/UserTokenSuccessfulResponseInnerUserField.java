package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class UserTokenSuccessfulResponseInnerUserField   {
  
  private Integer id = null;
  private String accessToken = null;

  /**
   * WordPress user ID
   **/
  public UserTokenSuccessfulResponseInnerUserField id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "WordPress user ID")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * User token
   **/
  public UserTokenSuccessfulResponseInnerUserField accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User token")
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTokenSuccessfulResponseInnerUserField userTokenSuccessfulResponseInnerUserField = (UserTokenSuccessfulResponseInnerUserField) o;
    return Objects.equals(id, userTokenSuccessfulResponseInnerUserField.id) &&
        Objects.equals(accessToken, userTokenSuccessfulResponseInnerUserField.accessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accessToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTokenSuccessfulResponseInnerUserField {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
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

