package fr.monext.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import fr.monext.model.TokenRequest;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TokenRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-07T07:53:25.576Z")

public class TokenRequest   {
  @JsonProperty("prestation")
  private String prestation = null;

  @JsonProperty("client")
  private String client = null;

  @JsonProperty("passphrase")
  private String passphrase = null;

  @JsonProperty("format")
  private String format = null;

  @JsonProperty("token")
  @Valid
  private List<TokenRequest> token = null;

  public TokenRequest prestation(String prestation) {
    this.prestation = prestation;
    return this;
  }

  /**
   * Get prestation
   * @return prestation
  **/
  @ApiModelProperty(value = "")


  public String getPrestation() {
    return prestation;
  }

  public void setPrestation(String prestation) {
    this.prestation = prestation;
  }

  public TokenRequest client(String client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(value = "")


  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public TokenRequest passphrase(String passphrase) {
    this.passphrase = passphrase;
    return this;
  }

  /**
   * Get passphrase
   * @return passphrase
  **/
  @ApiModelProperty(value = "")


  public String getPassphrase() {
    return passphrase;
  }

  public void setPassphrase(String passphrase) {
    this.passphrase = passphrase;
  }

  public TokenRequest format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")


  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public TokenRequest token(List<TokenRequest> token) {
    this.token = token;
    return this;
  }

  public TokenRequest addTokenItem(TokenRequest tokenItem) {
    if (this.token == null) {
      this.token = new ArrayList<TokenRequest>();
    }
    this.token.add(tokenItem);
    return this;
  }

  /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TokenRequest> getToken() {
    return token;
  }

  public void setToken(List<TokenRequest> token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenRequest tokenRequest = (TokenRequest) o;
    return Objects.equals(this.prestation, tokenRequest.prestation) &&
        Objects.equals(this.client, tokenRequest.client) &&
        Objects.equals(this.passphrase, tokenRequest.passphrase) &&
        Objects.equals(this.format, tokenRequest.format) &&
        Objects.equals(this.token, tokenRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prestation, client, passphrase, format, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenRequest {\n");
    
    sb.append("    prestation: ").append(toIndentedString(prestation)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

