package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.ahoque.customer.model.ReadCustomersDataCustomerInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReadCustomersData
 */

@JsonTypeName("ReadCustomers_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T18:21:05.499518+01:00[Europe/London]")
public class ReadCustomersData {

  @Valid
  private List<@Valid ReadCustomersDataCustomerInner> customer;

  public ReadCustomersData customer(List<@Valid ReadCustomersDataCustomerInner> customer) {
    this.customer = customer;
    return this;
  }

  public ReadCustomersData addCustomerItem(ReadCustomersDataCustomerInner customerItem) {
    if (this.customer == null) {
      this.customer = new ArrayList<>();
    }
    this.customer.add(customerItem);
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @Valid 
  @Schema(name = "Customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Customer")
  public List<@Valid ReadCustomersDataCustomerInner> getCustomer() {
    return customer;
  }

  public void setCustomer(List<@Valid ReadCustomersDataCustomerInner> customer) {
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

