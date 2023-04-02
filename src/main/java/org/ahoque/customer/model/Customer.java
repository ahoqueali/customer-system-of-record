package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import org.ahoque.customer.model.Organisation;
import org.ahoque.customer.model.Person;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Customer
 */

@JsonIgnoreProperties(
  value = "CustomerType", // ignore manually set CustomerType, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the CustomerType to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "CustomerType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Organisation.class, name = "Organisation"),
  @JsonSubTypes.Type(value = Person.class, name = "Person")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-02T07:15:10.777765+01:00[Europe/London]")
@Entity
public class Customer {

  @JsonProperty("CustomerId")
  private UUID customerId;

  /**
   * Gets or Sets customerType
   */
  public enum CustomerTypeEnum {
    PERSON("PERSON"),
    
    ORGANISATION("ORGANISATION");

    private String value;

    CustomerTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomerTypeEnum fromValue(String value) {
      for (CustomerTypeEnum b : CustomerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("CustomerType")
  private CustomerTypeEnum customerType;

  public Customer customerId(UUID customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  @Valid @Size(min = 36, max = 36) 
  @Schema(name = "CustomerId", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public UUID getCustomerId() {
    return customerId;
  }

  public void setCustomerId(UUID customerId) {
    this.customerId = customerId;
  }

  public Customer customerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
    return this;
  }

  /**
   * Get customerType
   * @return customerType
  */
  @NotNull 
  @Schema(name = "CustomerType", example = "string", requiredMode = Schema.RequiredMode.REQUIRED)
  public CustomerTypeEnum getCustomerType() {
    return customerType;
  }

  public void setCustomerType(CustomerTypeEnum customerType) {
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

