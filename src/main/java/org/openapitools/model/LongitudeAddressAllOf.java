package org.openapitools.model;

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
 * LongitudeAddressAllOf
 */

@JsonTypeName("LongitudeAddress_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T15:51:45.519635+01:00[Europe/London]")
public class LongitudeAddressAllOf {

  private String longitudeAddress;

  public LongitudeAddressAllOf longitudeAddress(String longitudeAddress) {
    this.longitudeAddress = longitudeAddress;
    return this;
  }

  /**
   * Get longitudeAddress
   * @return longitudeAddress
  */
  
  @Schema(name = "LongitudeAddress", example = "some longitude address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LongitudeAddress")
  public String getLongitudeAddress() {
    return longitudeAddress;
  }

  public void setLongitudeAddress(String longitudeAddress) {
    this.longitudeAddress = longitudeAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongitudeAddressAllOf longitudeAddressAllOf = (LongitudeAddressAllOf) o;
    return Objects.equals(this.longitudeAddress, longitudeAddressAllOf.longitudeAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longitudeAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongitudeAddressAllOf {\n");
    sb.append("    longitudeAddress: ").append(toIndentedString(longitudeAddress)).append("\n");
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

