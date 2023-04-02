package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.ahoque.customer.model.ReadContactPointsDataContactPointInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReadContactPointsData
 */

@JsonTypeName("ReadContactPoints_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-02T07:15:10.777765+01:00[Europe/London]")
public class ReadContactPointsData {

  @JsonProperty("ContactPoint")
  @Valid
  private List<ReadContactPointsDataContactPointInner> contactPoint = null;

  public ReadContactPointsData contactPoint(List<ReadContactPointsDataContactPointInner> contactPoint) {
    this.contactPoint = contactPoint;
    return this;
  }

  public ReadContactPointsData addContactPointItem(ReadContactPointsDataContactPointInner contactPointItem) {
    if (this.contactPoint == null) {
      this.contactPoint = new ArrayList<>();
    }
    this.contactPoint.add(contactPointItem);
    return this;
  }

  /**
   * Get contactPoint
   * @return contactPoint
  */
  @Valid 
  @Schema(name = "ContactPoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<ReadContactPointsDataContactPointInner> getContactPoint() {
    return contactPoint;
  }

  public void setContactPoint(List<ReadContactPointsDataContactPointInner> contactPoint) {
    this.contactPoint = contactPoint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadContactPointsData readContactPointsData = (ReadContactPointsData) o;
    return Objects.equals(this.contactPoint, readContactPointsData.contactPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactPoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadContactPointsData {\n");
    sb.append("    contactPoint: ").append(toIndentedString(contactPoint)).append("\n");
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

