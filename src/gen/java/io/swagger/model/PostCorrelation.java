package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class PostCorrelation   {
  
  private String cause = null;
  private String effect = null;
  private Double correlation = null;
  private Integer vote = null;

  /**
   * Cause variable name
   **/
  public PostCorrelation cause(String cause) {
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
  public PostCorrelation effect(String effect) {
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
   * Correlation value
   **/
  public PostCorrelation correlation(Double correlation) {
    this.correlation = correlation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Correlation value")
  @JsonProperty("correlation")
  public Double getCorrelation() {
    return correlation;
  }
  public void setCorrelation(Double correlation) {
    this.correlation = correlation;
  }

  /**
   * Vote: 0 or 1
   **/
  public PostCorrelation vote(Integer vote) {
    this.vote = vote;
    return this;
  }

  
  @ApiModelProperty(value = "Vote: 0 or 1")
  @JsonProperty("vote")
  public Integer getVote() {
    return vote;
  }
  public void setVote(Integer vote) {
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
    PostCorrelation postCorrelation = (PostCorrelation) o;
    return Objects.equals(cause, postCorrelation.cause) &&
        Objects.equals(effect, postCorrelation.effect) &&
        Objects.equals(correlation, postCorrelation.correlation) &&
        Objects.equals(vote, postCorrelation.vote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, effect, correlation, vote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCorrelation {\n");
    
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    correlation: ").append(toIndentedString(correlation)).append("\n");
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

