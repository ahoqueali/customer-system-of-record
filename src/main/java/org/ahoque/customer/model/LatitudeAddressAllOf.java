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
 * LatitudeAddressAllOf
 */

@JsonTypeName("LatitudeAddress_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-02T07:15:10.777765+01:00[Europe/London]")
public class LatitudeAddressAllOf {

  @JsonProperty("LatitudeAddress")
  private String latitudeAddress;

  public LatitudeAddressAllOf latitudeAddress(String latitudeAddress) {
    this.latitudeAddress = latitudeAddress;
    return this;
  }

  /**
   * Get latitudeAddress
   * @return latitudeAddress
  */
  
  @Schema(name = "LatitudeAddress", example = "some latitude address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLatitudeAddress() {
    return latitudeAddress;
  }

  public void setLatitudeAddress(String latitudeAddress) {
    this.latitudeAddress = latitudeAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LatitudeAddressAllOf latitudeAddressAllOf = (LatitudeAddressAllOf) o;
    return Objects.equals(this.latitudeAddress, latitudeAddressAllOf.latitudeAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitudeAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatitudeAddressAllOf {\n");
    sb.append("    latitudeAddress: ").append(toIndentedString(latitudeAddress)).append("\n");
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

