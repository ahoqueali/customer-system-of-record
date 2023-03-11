package org.ahoque.customer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.LocationRoleTypeValues;
import io.swagger.model.LocationTypeValues;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerLocation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T20:44:13.669625822Z[GMT]")


public class CustomerLocation   {
  @JsonProperty("CustomerLocationid")
  private UUID customerLocationid = null;

  @JsonProperty("LocationRole")
  private LocationRoleTypeValues locationRole = null;

  @JsonProperty("LocationType")
  private LocationTypeValues locationType = null;

  @JsonProperty("Location")
  private OneOfCustomerLocationLocation location = null;

  public CustomerLocation customerLocationid(UUID customerLocationid) {
    this.customerLocationid = customerLocationid;
    return this;
  }

  /**
   * Get customerLocationid
   * @return customerLocationid
   **/
  @Schema(description = "")
  
    @Valid
  @Size(min=36,max=36)   public UUID getCustomerLocationid() {
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
   **/
  @Schema(description = "")
  
    @Valid
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
   **/
  @Schema(description = "")
  
    @Valid
    public LocationTypeValues getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationTypeValues locationType) {
    this.locationType = locationType;
  }

  public CustomerLocation location(OneOfCustomerLocationLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   **/
  @Schema(description = "")
  
    public OneOfCustomerLocationLocation getLocation() {
    return location;
  }

  public void setLocation(OneOfCustomerLocationLocation location) {
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
