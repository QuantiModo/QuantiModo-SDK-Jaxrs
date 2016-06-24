package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-06-24T22:10:56.138Z")
public class TrackingReminder   {
  
  private Integer id = null;
  private String clientId = null;
  private Integer userId = null;
  private Integer variableId = null;
  private Float defaultValue = null;
  private String reminderStartTime = null;
  private String reminderEndTime = null;
  private String reminderSound = null;
  private Integer reminderFrequency = null;
  private Boolean popUp = null;
  private Boolean sms = null;
  private Boolean email = null;
  private Boolean notificationBar = null;
  private Date lastReminded = null;
  private Date lastTracked = null;
  private String firstDailyReminderTime = null;
  private String secondDailyReminderTime = null;
  private String thirdDailyReminderTime = null;
  private String startTrackingDate = null;
  private String stopTrackingDate = null;
  private Date updatedAt = null;
  private String variableName = null;
  private String variableCategoryName = null;
  private String abbreviatedUnitName = null;


  public enum CombinationOperationEnum {
    MEAN("MEAN"),
    SUM("SUM");

    private String value;

    CombinationOperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CombinationOperationEnum combinationOperation = null;

  /**
   * id
   **/
  public TrackingReminder id(Integer id) {
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
   * clientId
   **/
  public TrackingReminder clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  
  @ApiModelProperty(value = "clientId")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   * ID of User
   **/
  public TrackingReminder userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "ID of User")
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * Id for the variable to be tracked
   **/
  public TrackingReminder variableId(Integer variableId) {
    this.variableId = variableId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Id for the variable to be tracked")
  @JsonProperty("variableId")
  public Integer getVariableId() {
    return variableId;
  }
  public void setVariableId(Integer variableId) {
    this.variableId = variableId;
  }

  /**
   * Default value to use for the measurement when tracking
   **/
  public TrackingReminder defaultValue(Float defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  
  @ApiModelProperty(value = "Default value to use for the measurement when tracking")
  @JsonProperty("defaultValue")
  public Float getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(Float defaultValue) {
    this.defaultValue = defaultValue;
  }

  /**
   * Earliest time of day at which reminders should appear in UTC HH:MM:SS format
   **/
  public TrackingReminder reminderStartTime(String reminderStartTime) {
    this.reminderStartTime = reminderStartTime;
    return this;
  }

  
  @ApiModelProperty(value = "Earliest time of day at which reminders should appear in UTC HH:MM:SS format")
  @JsonProperty("reminderStartTime")
  public String getReminderStartTime() {
    return reminderStartTime;
  }
  public void setReminderStartTime(String reminderStartTime) {
    this.reminderStartTime = reminderStartTime;
  }

  /**
   * Latest time of day at which reminders should appear in UTC HH:MM:SS format
   **/
  public TrackingReminder reminderEndTime(String reminderEndTime) {
    this.reminderEndTime = reminderEndTime;
    return this;
  }

  
  @ApiModelProperty(value = "Latest time of day at which reminders should appear in UTC HH:MM:SS format")
  @JsonProperty("reminderEndTime")
  public String getReminderEndTime() {
    return reminderEndTime;
  }
  public void setReminderEndTime(String reminderEndTime) {
    this.reminderEndTime = reminderEndTime;
  }

  /**
   * String identifier for the sound to accompany the reminder
   **/
  public TrackingReminder reminderSound(String reminderSound) {
    this.reminderSound = reminderSound;
    return this;
  }

  
  @ApiModelProperty(value = "String identifier for the sound to accompany the reminder")
  @JsonProperty("reminderSound")
  public String getReminderSound() {
    return reminderSound;
  }
  public void setReminderSound(String reminderSound) {
    this.reminderSound = reminderSound;
  }

  /**
   * Number of seconds between one reminder and the next
   **/
  public TrackingReminder reminderFrequency(Integer reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
    return this;
  }

  
  @ApiModelProperty(value = "Number of seconds between one reminder and the next")
  @JsonProperty("reminderFrequency")
  public Integer getReminderFrequency() {
    return reminderFrequency;
  }
  public void setReminderFrequency(Integer reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
  }

  /**
   * True if the reminders should appear as a popup notification
   **/
  public TrackingReminder popUp(Boolean popUp) {
    this.popUp = popUp;
    return this;
  }

  
  @ApiModelProperty(value = "True if the reminders should appear as a popup notification")
  @JsonProperty("popUp")
  public Boolean getPopUp() {
    return popUp;
  }
  public void setPopUp(Boolean popUp) {
    this.popUp = popUp;
  }

  /**
   * True if the reminders should be delivered via SMS
   **/
  public TrackingReminder sms(Boolean sms) {
    this.sms = sms;
    return this;
  }

  
  @ApiModelProperty(value = "True if the reminders should be delivered via SMS")
  @JsonProperty("sms")
  public Boolean getSms() {
    return sms;
  }
  public void setSms(Boolean sms) {
    this.sms = sms;
  }

  /**
   * True if the reminders should be delivered via email
   **/
  public TrackingReminder email(Boolean email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "True if the reminders should be delivered via email")
  @JsonProperty("email")
  public Boolean getEmail() {
    return email;
  }
  public void setEmail(Boolean email) {
    this.email = email;
  }

  /**
   * True if the reminders should appear in the notification bar
   **/
  public TrackingReminder notificationBar(Boolean notificationBar) {
    this.notificationBar = notificationBar;
    return this;
  }

  
  @ApiModelProperty(value = "True if the reminders should appear in the notification bar")
  @JsonProperty("notificationBar")
  public Boolean getNotificationBar() {
    return notificationBar;
  }
  public void setNotificationBar(Boolean notificationBar) {
    this.notificationBar = notificationBar;
  }

  /**
   * ISO 8601 timestamp for the last time a reminder was sent
   **/
  public TrackingReminder lastReminded(Date lastReminded) {
    this.lastReminded = lastReminded;
    return this;
  }

  
  @ApiModelProperty(value = "ISO 8601 timestamp for the last time a reminder was sent")
  @JsonProperty("lastReminded")
  public Date getLastReminded() {
    return lastReminded;
  }
  public void setLastReminded(Date lastReminded) {
    this.lastReminded = lastReminded;
  }

  /**
   * ISO 8601 timestamp for the last time a measurement was received for this user and variable
   **/
  public TrackingReminder lastTracked(Date lastTracked) {
    this.lastTracked = lastTracked;
    return this;
  }

  
  @ApiModelProperty(value = "ISO 8601 timestamp for the last time a measurement was received for this user and variable")
  @JsonProperty("lastTracked")
  public Date getLastTracked() {
    return lastTracked;
  }
  public void setLastTracked(Date lastTracked) {
    this.lastTracked = lastTracked;
  }

  /**
   * Specific first time of day that the user should be reminded to track in UTC HH:MM:SS format
   **/
  public TrackingReminder firstDailyReminderTime(String firstDailyReminderTime) {
    this.firstDailyReminderTime = firstDailyReminderTime;
    return this;
  }

  
  @ApiModelProperty(value = "Specific first time of day that the user should be reminded to track in UTC HH:MM:SS format")
  @JsonProperty("firstDailyReminderTime")
  public String getFirstDailyReminderTime() {
    return firstDailyReminderTime;
  }
  public void setFirstDailyReminderTime(String firstDailyReminderTime) {
    this.firstDailyReminderTime = firstDailyReminderTime;
  }

  /**
   * Specific second time of day that the user should be reminded to track in UTC HH:MM:SS format
   **/
  public TrackingReminder secondDailyReminderTime(String secondDailyReminderTime) {
    this.secondDailyReminderTime = secondDailyReminderTime;
    return this;
  }

  
  @ApiModelProperty(value = "Specific second time of day that the user should be reminded to track in UTC HH:MM:SS format")
  @JsonProperty("secondDailyReminderTime")
  public String getSecondDailyReminderTime() {
    return secondDailyReminderTime;
  }
  public void setSecondDailyReminderTime(String secondDailyReminderTime) {
    this.secondDailyReminderTime = secondDailyReminderTime;
  }

  /**
   * Specific third time of day that the user should be reminded to track in UTC HH:MM:SS format
   **/
  public TrackingReminder thirdDailyReminderTime(String thirdDailyReminderTime) {
    this.thirdDailyReminderTime = thirdDailyReminderTime;
    return this;
  }

  
  @ApiModelProperty(value = "Specific third time of day that the user should be reminded to track in UTC HH:MM:SS format")
  @JsonProperty("thirdDailyReminderTime")
  public String getThirdDailyReminderTime() {
    return thirdDailyReminderTime;
  }
  public void setThirdDailyReminderTime(String thirdDailyReminderTime) {
    this.thirdDailyReminderTime = thirdDailyReminderTime;
  }

  /**
   * Earliest date on which the user should be reminded to track in YYYY-MM-DD format
   **/
  public TrackingReminder startTrackingDate(String startTrackingDate) {
    this.startTrackingDate = startTrackingDate;
    return this;
  }

  
  @ApiModelProperty(value = "Earliest date on which the user should be reminded to track in YYYY-MM-DD format")
  @JsonProperty("startTrackingDate")
  public String getStartTrackingDate() {
    return startTrackingDate;
  }
  public void setStartTrackingDate(String startTrackingDate) {
    this.startTrackingDate = startTrackingDate;
  }

  /**
   * Latest date on which the user should be reminded to track in YYYY-MM-DD format
   **/
  public TrackingReminder stopTrackingDate(String stopTrackingDate) {
    this.stopTrackingDate = stopTrackingDate;
    return this;
  }

  
  @ApiModelProperty(value = "Latest date on which the user should be reminded to track in YYYY-MM-DD format")
  @JsonProperty("stopTrackingDate")
  public String getStopTrackingDate() {
    return stopTrackingDate;
  }
  public void setStopTrackingDate(String stopTrackingDate) {
    this.stopTrackingDate = stopTrackingDate;
  }

  /**
   * When the record in the database was last updated. Use ISO 8601 datetime format. Time zone should be UTC and not local.
   **/
  public TrackingReminder updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(value = "When the record in the database was last updated. Use ISO 8601 datetime format. Time zone should be UTC and not local.")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Name of the variable to be used when sending measurements
   **/
  public TrackingReminder variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the variable to be used when sending measurements")
  @JsonProperty("variableName")
  public String getVariableName() {
    return variableName;
  }
  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  /**
   * Name of the variable category to be used when sending measurements
   **/
  public TrackingReminder variableCategoryName(String variableCategoryName) {
    this.variableCategoryName = variableCategoryName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the variable category to be used when sending measurements")
  @JsonProperty("variableCategoryName")
  public String getVariableCategoryName() {
    return variableCategoryName;
  }
  public void setVariableCategoryName(String variableCategoryName) {
    this.variableCategoryName = variableCategoryName;
  }

  /**
   * Abbreviated name of the unit to be used when sending measurements
   **/
  public TrackingReminder abbreviatedUnitName(String abbreviatedUnitName) {
    this.abbreviatedUnitName = abbreviatedUnitName;
    return this;
  }

  
  @ApiModelProperty(value = "Abbreviated name of the unit to be used when sending measurements")
  @JsonProperty("abbreviatedUnitName")
  public String getAbbreviatedUnitName() {
    return abbreviatedUnitName;
  }
  public void setAbbreviatedUnitName(String abbreviatedUnitName) {
    this.abbreviatedUnitName = abbreviatedUnitName;
  }

  /**
   * The way multiple measurements are aggregated over time
   **/
  public TrackingReminder combinationOperation(CombinationOperationEnum combinationOperation) {
    this.combinationOperation = combinationOperation;
    return this;
  }

  
  @ApiModelProperty(value = "The way multiple measurements are aggregated over time")
  @JsonProperty("combinationOperation")
  public CombinationOperationEnum getCombinationOperation() {
    return combinationOperation;
  }
  public void setCombinationOperation(CombinationOperationEnum combinationOperation) {
    this.combinationOperation = combinationOperation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingReminder trackingReminder = (TrackingReminder) o;
    return Objects.equals(id, trackingReminder.id) &&
        Objects.equals(clientId, trackingReminder.clientId) &&
        Objects.equals(userId, trackingReminder.userId) &&
        Objects.equals(variableId, trackingReminder.variableId) &&
        Objects.equals(defaultValue, trackingReminder.defaultValue) &&
        Objects.equals(reminderStartTime, trackingReminder.reminderStartTime) &&
        Objects.equals(reminderEndTime, trackingReminder.reminderEndTime) &&
        Objects.equals(reminderSound, trackingReminder.reminderSound) &&
        Objects.equals(reminderFrequency, trackingReminder.reminderFrequency) &&
        Objects.equals(popUp, trackingReminder.popUp) &&
        Objects.equals(sms, trackingReminder.sms) &&
        Objects.equals(email, trackingReminder.email) &&
        Objects.equals(notificationBar, trackingReminder.notificationBar) &&
        Objects.equals(lastReminded, trackingReminder.lastReminded) &&
        Objects.equals(lastTracked, trackingReminder.lastTracked) &&
        Objects.equals(firstDailyReminderTime, trackingReminder.firstDailyReminderTime) &&
        Objects.equals(secondDailyReminderTime, trackingReminder.secondDailyReminderTime) &&
        Objects.equals(thirdDailyReminderTime, trackingReminder.thirdDailyReminderTime) &&
        Objects.equals(startTrackingDate, trackingReminder.startTrackingDate) &&
        Objects.equals(stopTrackingDate, trackingReminder.stopTrackingDate) &&
        Objects.equals(updatedAt, trackingReminder.updatedAt) &&
        Objects.equals(variableName, trackingReminder.variableName) &&
        Objects.equals(variableCategoryName, trackingReminder.variableCategoryName) &&
        Objects.equals(abbreviatedUnitName, trackingReminder.abbreviatedUnitName) &&
        Objects.equals(combinationOperation, trackingReminder.combinationOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, userId, variableId, defaultValue, reminderStartTime, reminderEndTime, reminderSound, reminderFrequency, popUp, sms, email, notificationBar, lastReminded, lastTracked, firstDailyReminderTime, secondDailyReminderTime, thirdDailyReminderTime, startTrackingDate, stopTrackingDate, updatedAt, variableName, variableCategoryName, abbreviatedUnitName, combinationOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingReminder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    reminderStartTime: ").append(toIndentedString(reminderStartTime)).append("\n");
    sb.append("    reminderEndTime: ").append(toIndentedString(reminderEndTime)).append("\n");
    sb.append("    reminderSound: ").append(toIndentedString(reminderSound)).append("\n");
    sb.append("    reminderFrequency: ").append(toIndentedString(reminderFrequency)).append("\n");
    sb.append("    popUp: ").append(toIndentedString(popUp)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    notificationBar: ").append(toIndentedString(notificationBar)).append("\n");
    sb.append("    lastReminded: ").append(toIndentedString(lastReminded)).append("\n");
    sb.append("    lastTracked: ").append(toIndentedString(lastTracked)).append("\n");
    sb.append("    firstDailyReminderTime: ").append(toIndentedString(firstDailyReminderTime)).append("\n");
    sb.append("    secondDailyReminderTime: ").append(toIndentedString(secondDailyReminderTime)).append("\n");
    sb.append("    thirdDailyReminderTime: ").append(toIndentedString(thirdDailyReminderTime)).append("\n");
    sb.append("    startTrackingDate: ").append(toIndentedString(startTrackingDate)).append("\n");
    sb.append("    stopTrackingDate: ").append(toIndentedString(stopTrackingDate)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    variableCategoryName: ").append(toIndentedString(variableCategoryName)).append("\n");
    sb.append("    abbreviatedUnitName: ").append(toIndentedString(abbreviatedUnitName)).append("\n");
    sb.append("    combinationOperation: ").append(toIndentedString(combinationOperation)).append("\n");
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

