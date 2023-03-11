package org.ahoque.customer.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfCustomerLocationLocation
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = LocationPostalAddress.class, name = "LocationPostalAddress"),
  @JsonSubTypes.Type(value = GeolocationAddress.class, name = "GeolocationAddress"),
  @JsonSubTypes.Type(value = LatitudeAddress.class, name = "LatitudeAddress"),
  @JsonSubTypes.Type(value = LongitudeAddress.class, name = "LongitudeAddress"),
  @JsonSubTypes.Type(value = LocationElectronicAddress.class, name = "LocationElectronicAddress")
})
public interface OneOfCustomerLocationLocation {

}
