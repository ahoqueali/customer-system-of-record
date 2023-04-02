package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.ahoque.customer.model.WriteCustomerDataCustomer;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReadCustomerData
 */

@JsonTypeName("ReadCustomer_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-02T07:15:10.777765+01:00[Europe/London]")
public class ReadCustomerData {

  @JsonProperty("Customer")
  private WriteCustomerDataCustomer customer;

  public ReadCustomerData customer(WriteCustomerDataCustomer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @Valid 
  @Schema(name = "Customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public WriteCustomerDataCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(WriteCustomerDataCustomer customer) {
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
    ReadCustomerData readCustomerData = (ReadCustomerData) o;
    return Objects.equals(this.customer, readCustomerData.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadCustomerData {\n");
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

