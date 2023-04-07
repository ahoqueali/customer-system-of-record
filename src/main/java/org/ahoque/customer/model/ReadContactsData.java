package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.ahoque.customer.model.ReadContactsDataContactInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReadContactsData
 */

@JsonTypeName("ReadContacts_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T18:21:05.499518+01:00[Europe/London]")
public class ReadContactsData {

  @Valid
  private List<@Valid ReadContactsDataContactInner> contact;

  public ReadContactsData contact(List<@Valid ReadContactsDataContactInner> contact) {
    this.contact = contact;
    return this;
  }

  public ReadContactsData addContactItem(ReadContactsDataContactInner contactItem) {
    if (this.contact == null) {
      this.contact = new ArrayList<>();
    }
    this.contact.add(contactItem);
    return this;
  }

  /**
   * Get contact
   * @return contact
  */
  @Valid 
  @Schema(name = "Contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Contact")
  public List<@Valid ReadContactsDataContactInner> getContact() {
    return contact;
  }

  public void setContact(List<@Valid ReadContactsDataContactInner> contact) {
    this.contact = contact;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadContactsData readContactsData = (ReadContactsData) o;
    return Objects.equals(this.contact, readContactsData.contact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadContactsData {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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

