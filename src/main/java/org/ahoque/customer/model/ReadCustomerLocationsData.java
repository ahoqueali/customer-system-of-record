package org.ahoque.customer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ReadCustomerLocationsData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class ReadCustomerLocationsData   {
  @JsonProperty("CustomerLocation")
  @Valid
  private List<CustomerLocation> customerLocation = null;

  public ReadCustomerLocationsData customerLocation(List<CustomerLocation> customerLocation) {
    this.customerLocation = customerLocation;
    return this;
  }

  public ReadCustomerLocationsData addCustomerLocationItem(CustomerLocation customerLocationItem) {
    if (this.customerLocation == null) {
      this.customerLocation = new ArrayList<CustomerLocation>();
    }
    this.customerLocation.add(customerLocationItem);
    return this;
  }

  /**
   * Get customerLocation
   * @return customerLocation
   **/
  @Schema(description = "")
      @Valid
    public List<CustomerLocation> getCustomerLocation() {
    return customerLocation;
  }

  public void setCustomerLocation(List<CustomerLocation> customerLocation) {
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
