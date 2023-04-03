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
 * SocialAddress
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T15:51:45.519635+01:00[Europe/London]")
public class SocialAddress {

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

  private String socialAddress;

  /**
   * Default constructor
   * @deprecated Use {@link SocialAddress#SocialAddress(ContactTypeEnum)}
   */
  @Deprecated
  public SocialAddress() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SocialAddress(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }

  public SocialAddress contactId(UUID contactId) {
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

  public SocialAddress contactType(ContactTypeEnum contactType) {
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

  public SocialAddress socialAddress(String socialAddress) {
    this.socialAddress = socialAddress;
    return this;
  }

  /**
   * Get socialAddress
   * @return socialAddress
  */
  
  @Schema(name = "SocialAddress", example = "@rosspoldark", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SocialAddress")
  public String getSocialAddress() {
    return socialAddress;
  }

  public void setSocialAddress(String socialAddress) {
    this.socialAddress = socialAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialAddress socialAddress = (SocialAddress) o;
    return Objects.equals(this.contactId, socialAddress.contactId) &&
        Objects.equals(this.contactType, socialAddress.contactType) &&
        Objects.equals(this.socialAddress, socialAddress.socialAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, contactType, socialAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialAddress {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    socialAddress: ").append(toIndentedString(socialAddress)).append("\n");
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
