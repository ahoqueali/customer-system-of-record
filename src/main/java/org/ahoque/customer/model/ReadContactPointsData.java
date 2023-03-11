package org.ahoque.customer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ReadContactPointsData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class ReadContactPointsData   {
  @JsonProperty("ContactPoint")
  @Valid
  private List<AnyOfReadContactPointsDataContactPointItems> contactPoint = null;

  public ReadContactPointsData contactPoint(List<AnyOfReadContactPointsDataContactPointItems> contactPoint) {
    this.contactPoint = contactPoint;
    return this;
  }

  public ReadContactPointsData addContactPointItem(AnyOfReadContactPointsDataContactPointItems contactPointItem) {
    if (this.contactPoint == null) {
      this.contactPoint = new ArrayList<AnyOfReadContactPointsDataContactPointItems>();
    }
    this.contactPoint.add(contactPointItem);
    return this;
  }

  /**
   * Get contactPoint
   * @return contactPoint
   **/
  @Schema(description = "")
  
    public List<AnyOfReadContactPointsDataContactPointItems> getContactPoint() {
    return contactPoint;
  }

  public void setContactPoint(List<AnyOfReadContactPointsDataContactPointItems> contactPoint) {
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
