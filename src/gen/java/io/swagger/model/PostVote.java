package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class PostVote   {
  
  private String cause = null;
  private String effect = null;
  private Boolean vote = null;

  /**
   * Cause variable name
   **/
  public PostVote cause(String cause) {
    this.cause = cause;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Cause variable name")
  @JsonProperty("cause")
  public String getCause() {
    return cause;
  }
  public void setCause(String cause) {
    this.cause = cause;
  }

  /**
   * Effect variable name
   **/
  public PostVote effect(String effect) {
    this.effect = effect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Effect variable name")
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }
  public void setEffect(String effect) {
    this.effect = effect;
  }

  /**
   * Vote: 0 (for implausible) or 1 (for plausible)
   **/
  public PostVote vote(Boolean vote) {
    this.vote = vote;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Vote: 0 (for implausible) or 1 (for plausible)")
  @JsonProperty("vote")
  public Boolean getVote() {
    return vote;
  }
  public void setVote(Boolean vote) {
    this.vote = vote;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostVote postVote = (PostVote) o;
    return Objects.equals(cause, postVote.cause) &&
        Objects.equals(effect, postVote.effect) &&
        Objects.equals(vote, postVote.vote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, effect, vote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostVote {\n");
    
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    vote: ").append(toIndentedString(vote)).append("\n");
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

