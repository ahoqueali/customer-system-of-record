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
 * ElectronicAddressAllOf
 */

@JsonTypeName("ElectronicAddress_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T18:21:05.499518+01:00[Europe/London]")
public class ElectronicAddressAllOf {

  private String electronicAddress;

  public ElectronicAddressAllOf electronicAddress(String electronicAddress) {
    this.electronicAddress = electronicAddress;
    return this;
  }

  /**
   * Get electronicAddress
   * @return electronicAddress
  */
  
  @Schema(name = "ElectronicAddress", example = "ross.poldark@gmail.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ElectronicAddress")
  public String getElectronicAddress() {
    return electronicAddress;
  }

  public void setElectronicAddress(String electronicAddress) {
    this.electronicAddress = electronicAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElectronicAddressAllOf electronicAddressAllOf = (ElectronicAddressAllOf) o;
    return Objects.equals(this.electronicAddress, electronicAddressAllOf.electronicAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(electronicAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectronicAddressAllOf {\n");
    sb.append("    electronicAddress: ").append(toIndentedString(electronicAddress)).append("\n");
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

