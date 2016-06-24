package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class Vote   {
  
  private Integer id = null;
  private String clientId = null;
  private Integer userId = null;
  private Integer causeId = null;
  private Integer effectId = null;
  private Integer value = null;
  private Date createdAt = null;
  private Date updatedAt = null;

  /**
   * id
   **/
  public Vote id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "id")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * client_id
   **/
  public Vote clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "client_id")
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   * ID of User
   **/
  public Vote userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ID of User")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * ID of the predictor variable
   **/
  public Vote causeId(Integer causeId) {
    this.causeId = causeId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ID of the predictor variable")
  @JsonProperty("cause_id")
  public Integer getCauseId() {
    return causeId;
  }
  public void setCauseId(Integer causeId) {
    this.causeId = causeId;
  }

  /**
   * ID of effect variable
   **/
  public Vote effectId(Integer effectId) {
    this.effectId = effectId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ID of effect variable")
  @JsonProperty("effect_id")
  public Integer getEffectId() {
    return effectId;
  }
  public void setEffectId(Integer effectId) {
    this.effectId = effectId;
  }

  /**
   * Value of Vote
   **/
  public Vote value(Integer value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Value of Vote")
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }

  /**
   * When the record was first created. Use ISO 8601 datetime format
   **/
  public Vote createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "When the record was first created. Use ISO 8601 datetime format")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * When the record in the database was last updated. Use ISO 8601 datetime format
   **/
  public Vote updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(value = "When the record in the database was last updated. Use ISO 8601 datetime format")
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vote vote = (Vote) o;
    return Objects.equals(id, vote.id) &&
        Objects.equals(clientId, vote.clientId) &&
        Objects.equals(userId, vote.userId) &&
        Objects.equals(causeId, vote.causeId) &&
        Objects.equals(effectId, vote.effectId) &&
        Objects.equals(value, vote.value) &&
        Objects.equals(createdAt, vote.createdAt) &&
        Objects.equals(updatedAt, vote.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, userId, causeId, effectId, value, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vote {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    causeId: ").append(toIndentedString(causeId)).append("\n");
    sb.append("    effectId: ").append(toIndentedString(effectId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

