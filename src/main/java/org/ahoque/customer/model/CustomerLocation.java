package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import org.ahoque.customer.model.CustomerLocationLocation;
import org.ahoque.customer.model.LocationRoleTypeValues;
import org.ahoque.customer.model.LocationTypeValues;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CustomerLocation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-02T07:15:10.777765+01:00[Europe/London]")
public class CustomerLocation {

  @JsonProperty("CustomerLocationid")
  private UUID customerLocationid;

  @JsonProperty("LocationRole")
  private LocationRoleTypeValues locationRole;

  @JsonProperty("LocationType")
  private LocationTypeValues locationType;

  @JsonProperty("Location")
  private CustomerLocationLocation location;

  public CustomerLocation customerLocationid(UUID customerLocationid) {
    this.customerLocationid = customerLocationid;
    return this;
  }

  /**
   * Get customerLocationid
   * @return customerLocationid
  */
  @Valid @Size(min = 36, max = 36) 
  @Schema(name = "CustomerLocationid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public UUID getCustomerLocationid() {
    return customerLocationid;
  }

  public void setCustomerLocationid(UUID customerLocationid) {
    this.customerLocationid = customerLocationid;
  }

  public CustomerLocation locationRole(LocationRoleTypeValues locationRole) {
    this.locationRole = locationRole;
    return this;
  }

  /**
   * Get locationRole
   * @return locationRole
  */
  @Valid 
  @Schema(name = "LocationRole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public LocationRoleTypeValues getLocationRole() {
    return locationRole;
  }

  public void setLocationRole(LocationRoleTypeValues locationRole) {
    this.locationRole = locationRole;
  }

  public CustomerLocation locationType(LocationTypeValues locationType) {
    this.locationType = locationType;
    return this;
  }

  /**
   * Get locationType
   * @return locationType
  */
  @Valid 
  @Schema(name = "LocationType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public LocationTypeValues getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationTypeValues locationType) {
    this.locationType = locationType;
  }

  public CustomerLocation location(CustomerLocationLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @Valid 
  @Schema(name = "Location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CustomerLocationLocation getLocation() {
    return location;
  }

  public void setLocation(CustomerLocationLocation location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerLocation customerLocation = (CustomerLocation) o;
    return Objects.equals(this.customerLocationid, customerLocation.customerLocationid) &&
        Objects.equals(this.locationRole, customerLocation.locationRole) &&
        Objects.equals(this.locationType, customerLocation.locationType) &&
        Objects.equals(this.location, customerLocation.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerLocationid, locationRole, locationType, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerLocation {\n");
    sb.append("    customerLocationid: ").append(toIndentedString(customerLocationid)).append("\n");
    sb.append("    locationRole: ").append(toIndentedString(locationRole)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

