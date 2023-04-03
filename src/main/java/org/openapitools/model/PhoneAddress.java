package org.openapitools.model;

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
 * PhoneAddress
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T15:51:45.519635+01:00[Europe/London]")
public class PhoneAddress {

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

  private ContactTypeEnum contactType;

  private String phoneAddress;

  /**
   * Default constructor
   * @deprecated Use {@link PhoneAddress#PhoneAddress(ContactTypeEnum)}
   */
  @Deprecated
  public PhoneAddress() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PhoneAddress(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }

  public PhoneAddress contactId(UUID contactId) {
    this.contactId = contactId;
    return this;
  }

  /**
   * Get contactId
   * @return contactId
  */
  @Valid @Size(min = 36, max = 36) 
  @Schema(name = "ContactId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContactId")
  public UUID getContactId() {
    return contactId;
  }

  public void setContactId(UUID contactId) {
    this.contactId = contactId;
  }

  public PhoneAddress contactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
    return this;
  }

  /**
   * Get contactType
   * @return contactType
  */
  @NotNull 
  @Schema(name = "ContactType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ContactType")
  public ContactTypeEnum getContactType() {
    return contactType;
  }

  public void setContactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }

  public PhoneAddress phoneAddress(String phoneAddress) {
    this.phoneAddress = phoneAddress;
    return this;
  }

  /**
   * Get phoneAddress
   * @return phoneAddress
  */
  
  @Schema(name = "PhoneAddress", example = "0694234332434", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PhoneAddress")
  public String getPhoneAddress() {
    return phoneAddress;
  }

  public void setPhoneAddress(String phoneAddress) {
    this.phoneAddress = phoneAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneAddress phoneAddress = (PhoneAddress) o;
    return Objects.equals(this.contactId, phoneAddress.contactId) &&
        Objects.equals(this.contactType, phoneAddress.contactType) &&
        Objects.equals(this.phoneAddress, phoneAddress.phoneAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, contactType, phoneAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneAddress {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    phoneAddress: ").append(toIndentedString(phoneAddress)).append("\n");
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

