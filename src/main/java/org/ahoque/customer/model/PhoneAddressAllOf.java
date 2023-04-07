package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PhoneAddressAllOf
 */

@JsonTypeName("PhoneAddress_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T18:21:05.499518+01:00[Europe/London]")
public class PhoneAddressAllOf {

  private String phoneAddress;

  public PhoneAddressAllOf phoneAddress(String phoneAddress) {
    this.phoneAddress = phoneAddress;
    return this;
  }

  /**
   * Get phoneAddress
   * @return phoneAddress
  */
  
  @Schema(name = "PhoneAddress", example = "0694234332434", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PhoneAddress")
  public String getPhoneAddress() {
    return phoneAddress;
  }

  public void setPhoneAddress(String phoneAddress) {
    this.phoneAddress = phoneAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneAddressAllOf phoneAddressAllOf = (PhoneAddressAllOf) o;
    return Objects.equals(this.phoneAddress, phoneAddressAllOf.phoneAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneAddressAllOf {\n");
    sb.append("    phoneAddress: ").append(toIndentedString(phoneAddress)).append("\n");
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

