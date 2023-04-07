package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Customer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T18:21:05.499518+01:00[Europe/London]")
public class Customer {

  private UUID customerId;

  private String customerType;

  /**
   * Default constructor
   * @deprecated Use {@link Customer#Customer(String)}
   */
  @Deprecated
  public Customer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Customer(String customerType) {
    this.customerType = customerType;
  }

  public Customer customerId(UUID customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  @Valid 
  @Schema(name = "CustomerId", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CustomerId")
  public UUID getCustomerId() {
    return customerId;
  }

  public void setCustomerId(UUID customerId) {
    this.customerId = customerId;
  }

  public Customer customerType(String customerType) {
    this.customerType = customerType;
    return this;
  }

  /**
   * Get customerType
   * @return customerType
  */
  @NotNull 
  @Schema(name = "CustomerType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CustomerType")
  public String getCustomerType() {
    return customerType;
  }

  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerId, customer.customerId) &&
        Objects.equals(this.customerType, customer.customerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, customerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
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

