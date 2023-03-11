package org.ahoque.customer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReadCustomersData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class ReadCustomersData   {
  @JsonProperty("Customer")
  @Valid
  private List<AnyOfReadCustomersDataCustomerItems> customer = null;

  public ReadCustomersData customer(List<AnyOfReadCustomersDataCustomerItems> customer) {
    this.customer = customer;
    return this;
  }

  public ReadCustomersData addCustomerItem(AnyOfReadCustomersDataCustomerItems customerItem) {
    if (this.customer == null) {
      this.customer = new ArrayList<AnyOfReadCustomersDataCustomerItems>();
    }
    this.customer.add(customerItem);
    return this;
  }

  /**
   * Get customer
   * @return customer
   **/
  @Schema(description = "")
  
    public List<AnyOfReadCustomersDataCustomerItems> getCustomer() {
    return customer;
  }

  public void setCustomer(List<AnyOfReadCustomersDataCustomerItems> customer) {
    this.customer = customer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadCustomersData readCustomersData = (ReadCustomersData) o;
    return Objects.equals(this.customer, readCustomersData.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadCustomersData {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
