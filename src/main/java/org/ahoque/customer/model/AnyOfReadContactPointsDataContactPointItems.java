package org.ahoque.customer.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* AnyOfReadContactPointsDataContactPointItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = ElectronicAddress.class, name = "ElectronicAddress"),
  @JsonSubTypes.Type(value = PostalAddress.class, name = "PostalAddress"),
  @JsonSubTypes.Type(value = PhoneAddress.class, name = "PhoneAddress"),
  @JsonSubTypes.Type(value = SocialAddress.class, name = "SocialAddress")
})
public interface AnyOfReadContactPointsDataContactPointItems {

}
