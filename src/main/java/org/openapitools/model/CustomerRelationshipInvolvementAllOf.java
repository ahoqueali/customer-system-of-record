package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CustomerRelationshipInvolvementAllOf
 */

@JsonTypeName("CustomerRelationshipInvolvement_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T15:51:45.519635+01:00[Europe/London]")
public class CustomerRelationshipInvolvementAllOf {

  /**
   * Gets or Sets customerRelationshipInvolvementType
   */
  public enum CustomerRelationshipInvolvementTypeEnum {
    CUSTOMER_EMPLOYEE("CUSTOMER_EMPLOYEE"),
    
    SUPPLIER_BANK_EMPLOYER("SUPPLIER_BANK_EMPLOYER"),
    
    RELATIONSHIP_MANAGER("RELATIONSHIP_MANAGER");

    private String value;

    CustomerRelationshipInvolvementTypeEnum(String value) {
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
    public static CustomerRelationshipInvolvementTypeEnum fromValue(String value) {
      for (CustomerRelationshipInvolvementTypeEnum b : CustomerRelationshipInvolvementTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CustomerRelationshipInvolvementTypeEnum customerRelationshipInvolvementType;

  public CustomerRelationshipInvolvementAllOf customerRelationshipInvolvementType(CustomerRelationshipInvolvementTypeEnum customerRelationshipInvolvementType) {
    this.customerRelationshipInvolvementType = customerRelationshipInvolvementType;
    return this;
  }

  /**
   * Get customerRelationshipInvolvementType
   * @return customerRelationshipInvolvementType
  */
  
  @Schema(name = "CustomerRelationshipInvolvementType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CustomerRelationshipInvolvementType")
  public CustomerRelationshipInvolvementTypeEnum getCustomerRelationshipInvolvementType() {
    return customerRelationshipInvolvementType;
  }

  public void setCustomerRelationshipInvolvementType(CustomerRelationshipInvolvementTypeEnum customerRelationshipInvolvementType) {
    this.customerRelationshipInvolvementType = customerRelationshipInvolvementType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRelationshipInvolvementAllOf customerRelationshipInvolvementAllOf = (CustomerRelationshipInvolvementAllOf) o;
    return Objects.equals(this.customerRelationshipInvolvementType, customerRelationshipInvolvementAllOf.customerRelationshipInvolvementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerRelationshipInvolvementType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerRelationshipInvolvementAllOf {\n");
    sb.append("    customerRelationshipInvolvementType: ").append(toIndentedString(customerRelationshipInvolvementType)).append("\n");
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

