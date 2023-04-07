package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.ahoque.customer.model.CustomerLocation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReadCustomerLocationsData
 */

@JsonTypeName("ReadCustomerLocations_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T18:21:05.499518+01:00[Europe/London]")
public class ReadCustomerLocationsData {

  @Valid
  private List<@Valid CustomerLocation> customerLocation;

  public ReadCustomerLocationsData customerLocation(List<@Valid CustomerLocation> customerLocation) {
    this.customerLocation = customerLocation;
    return this;
  }

  public ReadCustomerLocationsData addCustomerLocationItem(CustomerLocation customerLocationItem) {
    if (this.customerLocation == null) {
      this.customerLocation = new ArrayList<>();
    }
    this.customerLocation.add(customerLocationItem);
    return this;
  }

  /**
   * Get customerLocation
   * @return customerLocation
  */
  @Valid 
  @Schema(name = "CustomerLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CustomerLocation")
  public List<@Valid CustomerLocation> getCustomerLocation() {
    return customerLocation;
  }

  public void setCustomerLocation(List<@Valid CustomerLocation> customerLocation) {
    this.customerLocation = customerLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadCustomerLocationsData readCustomerLocationsData = (ReadCustomerLocationsData) o;
    return Objects.equals(this.customerLocation, readCustomerLocationsData.customerLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadCustomerLocationsData {\n");
    sb.append("    customerLocation: ").append(toIndentedString(customerLocation)).append("\n");
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

