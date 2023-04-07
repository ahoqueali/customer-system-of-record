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
import org.ahoque.customer.model.Role;
import org.ahoque.customer.model.RoleType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CustomerRelationshipInvolvement
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T18:21:05.499518+01:00[Europe/London]")
public class CustomerRelationshipInvolvement extends Role {

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

  /**
   * Default constructor
   * @deprecated Use {@link CustomerRelationshipInvolvement#CustomerRelationshipInvolvement(RoleType)}
   */
  @Deprecated
  public CustomerRelationshipInvolvement() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomerRelationshipInvolvement(RoleType roleType) {
    super(roleType);
  }

  public CustomerRelationshipInvolvement customerRelationshipInvolvementType(CustomerRelationshipInvolvementTypeEnum customerRelationshipInvolvementType) {
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

  public CustomerRelationshipInvolvement roleId(UUID roleId) {
    super.setRoleId(roleId);
    return this;
  }

  public CustomerRelationshipInvolvement roleType(RoleType roleType) {
    super.setRoleType(roleType);
    return this;
  }

  public CustomerRelationshipInvolvement roleName(String roleName) {
    super.setRoleName(roleName);
    return this;
  }

  public CustomerRelationshipInvolvement relationshipId(UUID relationshipId) {
    super.setRelationshipId(relationshipId);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRelationshipInvolvement customerRelationshipInvolvement = (CustomerRelationshipInvolvement) o;
    return Objects.equals(this.customerRelationshipInvolvementType, customerRelationshipInvolvement.customerRelationshipInvolvementType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerRelationshipInvolvementType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerRelationshipInvolvement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

