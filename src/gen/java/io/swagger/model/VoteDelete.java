package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class VoteDelete   {
  
  private String cause = null;
  private String effect = null;

  /**
   * Cause variable name for the correlation to which the vote pertains
   **/
  public VoteDelete cause(String cause) {
    this.cause = cause;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Cause variable name for the correlation to which the vote pertains")
  @JsonProperty("cause")
  public String getCause() {
    return cause;
  }
  public void setCause(String cause) {
    this.cause = cause;
  }

  /**
   * Effect variable name for the correlation to which the vote pertains
   **/
  public VoteDelete effect(String effect) {
    this.effect = effect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Effect variable name for the correlation to which the vote pertains")
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }
  public void setEffect(String effect) {
    this.effect = effect;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoteDelete voteDelete = (VoteDelete) o;
    return Objects.equals(cause, voteDelete.cause) &&
        Objects.equals(effect, voteDelete.effect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, effect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoteDelete {\n");
    
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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

