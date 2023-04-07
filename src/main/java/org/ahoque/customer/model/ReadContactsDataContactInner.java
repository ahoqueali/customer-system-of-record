package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import org.ahoque.customer.model.ElectronicAddress;
import org.ahoque.customer.model.PhoneAddress;
import org.ahoque.customer.model.PostalAddress;
import org.ahoque.customer.model.SocialAddress;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReadContactsDataContactInner
 */

@JsonTypeName("ReadContacts_Data_Contact_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T18:21:05.499518+01:00[Europe/London]")
public class ReadContactsDataContactInner {

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

  private String electronicAddress;

  private String line1;

  private String line2;

  private String line3;

  private String line4;

  private String phoneAddress;

  private String socialAddress;

  /**
   * Default constructor
   * @deprecated Use {@link ReadContactsDataContactInner#ReadContactsDataContactInner(ContactTypeEnum)}
   */
  @Deprecated
  public ReadContactsDataContactInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReadContactsDataContactInner(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }

  public ReadContactsDataContactInner contactId(UUID contactId) {
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

  public ReadContactsDataContactInner contactType(ContactTypeEnum contactType) {
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

  public ReadContactsDataContactInner electronicAddress(String electronicAddress) {
    this.electronicAddress = electronicAddress;
    return this;
  }

  /**
   * Get electronicAddress
   * @return electronicAddress
  */
  
  @Schema(name = "ElectronicAddress", example = "ross.poldark@gmail.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ElectronicAddress")
  public String getElectronicAddress() {
    return electronicAddress;
  }

  public void setElectronicAddress(String electronicAddress) {
    this.electronicAddress = electronicAddress;
  }

  public ReadContactsDataContactInner line1(String line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * Get line1
   * @return line1
  */
  
  @Schema(name = "Line1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Line1")
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public ReadContactsDataContactInner line2(String line2) {
    this.line2 = line2;
    return this;
  }

  /**
   * Get line2
   * @return line2
  */
  
  @Schema(name = "Line2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Line2")
  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public ReadContactsDataContactInner line3(String line3) {
    this.line3 = line3;
    return this;
  }

  /**
   * Get line3
   * @return line3
  */
  
  @Schema(name = "Line3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Line3")
  public String getLine3() {
    return line3;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
  }

  public ReadContactsDataContactInner line4(String line4) {
    this.line4 = line4;
    return this;
  }

  /**
   * Get line4
   * @return line4
  */
  
  @Schema(name = "Line4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Line4")
  public String getLine4() {
    return line4;
  }

  public void setLine4(String line4) {
    this.line4 = line4;
  }

  public ReadContactsDataContactInner phoneAddress(String phoneAddress) {
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

  public ReadContactsDataContactInner socialAddress(String socialAddress) {
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
    ReadContactsDataContactInner readContactsDataContactInner = (ReadContactsDataContactInner) o;
    return Objects.equals(this.contactId, readContactsDataContactInner.contactId) &&
        Objects.equals(this.contactType, readContactsDataContactInner.contactType) &&
        Objects.equals(this.electronicAddress, readContactsDataContactInner.electronicAddress) &&
        Objects.equals(this.line1, readContactsDataContactInner.line1) &&
        Objects.equals(this.line2, readContactsDataContactInner.line2) &&
        Objects.equals(this.line3, readContactsDataContactInner.line3) &&
        Objects.equals(this.line4, readContactsDataContactInner.line4) &&
        Objects.equals(this.phoneAddress, readContactsDataContactInner.phoneAddress) &&
        Objects.equals(this.socialAddress, readContactsDataContactInner.socialAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, contactType, electronicAddress, line1, line2, line3, line4, phoneAddress, socialAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadContactsDataContactInner {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    electronicAddress: ").append(toIndentedString(electronicAddress)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    line4: ").append(toIndentedString(line4)).append("\n");
    sb.append("    phoneAddress: ").append(toIndentedString(phoneAddress)).append("\n");
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

