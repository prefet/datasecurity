package fr.monext.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import fr.monext.model.DataResponse;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-07T07:53:25.576Z")

public class DataResponse   {
  @JsonProperty("codeRetour")
  private Integer codeRetour = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("exitInfo")
  @Valid
  private List<DataResponse> exitInfo = null;

  @JsonProperty("pid")
  private String pid = null;

  @JsonProperty("data")
  @Valid
  private List<DataResponse> data = null;

  @JsonProperty("type")
  private String type = null;

  public DataResponse codeRetour(Integer codeRetour) {
    this.codeRetour = codeRetour;
    return this;
  }

  /**
   * Get codeRetour
   * @return codeRetour
  **/
  @ApiModelProperty(value = "")


  public Integer getCodeRetour() {
    return codeRetour;
  }

  public void setCodeRetour(Integer codeRetour) {
    this.codeRetour = codeRetour;
  }

  public DataResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DataResponse exitInfo(List<DataResponse> exitInfo) {
    this.exitInfo = exitInfo;
    return this;
  }

  public DataResponse addExitInfoItem(DataResponse exitInfoItem) {
    if (this.exitInfo == null) {
      this.exitInfo = new ArrayList<DataResponse>();
    }
    this.exitInfo.add(exitInfoItem);
    return this;
  }

  /**
   * Get exitInfo
   * @return exitInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DataResponse> getExitInfo() {
    return exitInfo;
  }

  public void setExitInfo(List<DataResponse> exitInfo) {
    this.exitInfo = exitInfo;
  }

  public DataResponse pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
  **/
  @ApiModelProperty(value = "")


  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public DataResponse data(List<DataResponse> data) {
    this.data = data;
    return this;
  }

  public DataResponse addDataItem(DataResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<DataResponse>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DataResponse> getData() {
    return data;
  }

  public void setData(List<DataResponse> data) {
    this.data = data;
  }

  public DataResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataResponse dataResponse = (DataResponse) o;
    return Objects.equals(this.codeRetour, dataResponse.codeRetour) &&
        Objects.equals(this.message, dataResponse.message) &&
        Objects.equals(this.exitInfo, dataResponse.exitInfo) &&
        Objects.equals(this.pid, dataResponse.pid) &&
        Objects.equals(this.data, dataResponse.data) &&
        Objects.equals(this.type, dataResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeRetour, message, exitInfo, pid, data, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataResponse {\n");
    
    sb.append("    codeRetour: ").append(toIndentedString(codeRetour)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    exitInfo: ").append(toIndentedString(exitInfo)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

