package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ElectronicAddress
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-02T07:15:10.777765+01:00[Europe/London]")
public class ElectronicAddress {

  @JsonProperty("ContactId")
  private UUID contactId;

  /**
   * Gets or Sets contactType
   */
  public enum ContactTypeEnum {
    ELECTRONIC_ADDRESS("ELECTRONIC_ADDRESS"),
    
    POSTAL_ADDRESS("POSTAL_ADDRESS"),
    
    PHONE_ADDRESS("PHONE_ADDRESS"),
    
    SOCIAL_ADDRESS("SOCIAL_ADDRESS");

    private String value;

    ContactTypeEnum(String value) {
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
    public static ContactTypeEnum fromValue(String value) {
      for (ContactTypeEnum b : ContactTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("ContactType")
  private ContactTypeEnum contactType;

  @JsonProperty("ElectronicAddress")
  private String electronicAddress;

  public ElectronicAddress contactId(UUID contactId) {
    this.contactId = contactId;
    return this;
  }

  /**
   * Get contactId
   * @return contactId
  */
  @Valid @Size(min = 36, max = 36) 
  @Schema(name = "ContactId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public UUID getContactId() {
    return contactId;
  }

  public void setContactId(UUID contactId) {
    this.contactId = contactId;
  }

  public ElectronicAddress contactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
    return this;
  }

  /**
   * Get contactType
   * @return contactType
  */
  @NotNull 
  @Schema(name = "ContactType", requiredMode = Schema.RequiredMode.REQUIRED)
  public ContactTypeEnum getContactType() {
    return contactType;
  }

  public void setContactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }

  public ElectronicAddress electronicAddress(String electronicAddress) {
    this.electronicAddress = electronicAddress;
    return this;
  }

  /**
   * Get electronicAddress
   * @return electronicAddress
  */
  
  @Schema(name = "ElectronicAddress", example = "ross.poldark@gmail.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ElectronicAddress electronicAddress = (ElectronicAddress) o;
    return Objects.equals(this.contactId, electronicAddress.contactId) &&
        Objects.equals(this.contactType, electronicAddress.contactType) &&
        Objects.equals(this.electronicAddress, electronicAddress.electronicAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, contactType, electronicAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectronicAddress {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
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

