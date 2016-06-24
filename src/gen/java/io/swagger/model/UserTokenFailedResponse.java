package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class UserTokenFailedResponse   {
  
  private Integer code = null;
  private String message = null;
  private Boolean success = null;

  /**
   * Status code
   **/
  public UserTokenFailedResponse code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Status code")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Message
   **/
  public UserTokenFailedResponse message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Message")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  public UserTokenFailedResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTokenFailedResponse userTokenFailedResponse = (UserTokenFailedResponse) o;
    return Objects.equals(code, userTokenFailedResponse.code) &&
        Objects.equals(message, userTokenFailedResponse.message) &&
        Objects.equals(success, userTokenFailedResponse.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTokenFailedResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

