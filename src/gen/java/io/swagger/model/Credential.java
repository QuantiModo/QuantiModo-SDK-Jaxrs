package io.swagger.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-03T22:24:17.454Z")
public class Credential  {
  
  private Integer connectorId = null;
  private String attrKey = null;
  private String attrValue = null;
  private Date createdAt = null;
  private Date updatedAt = null;

  
  /**
   * connector_id
   **/
  @ApiModelProperty(required = true, value = "connector_id")
  @JsonProperty("connector_id")
  public Integer getConnectorId() {
    return connectorId;
  }
  public void setConnectorId(Integer connectorId) {
    this.connectorId = connectorId;
  }

  
  /**
   * attr_key
   **/
  @ApiModelProperty(value = "attr_key")
  @JsonProperty("attr_key")
  public String getAttrKey() {
    return attrKey;
  }
  public void setAttrKey(String attrKey) {
    this.attrKey = attrKey;
  }

  
  /**
   * attr_value
   **/
  @ApiModelProperty(value = "attr_value")
  @JsonProperty("attr_value")
  public String getAttrValue() {
    return attrValue;
  }
  public void setAttrValue(String attrValue) {
    this.attrValue = attrValue;
  }

  
  /**
   * created_at
   **/
  @ApiModelProperty(value = "created_at")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * updated_at
   **/
  @ApiModelProperty(value = "updated_at")
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credential {\n");
    
    sb.append("  connectorId: ").append(connectorId).append("\n");
    sb.append("  attrKey: ").append(attrKey).append("\n");
    sb.append("  attrValue: ").append(attrValue).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
