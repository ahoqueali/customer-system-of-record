package org.ahoque.customer.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* AnyOfReadCustomersDataCustomerItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = Person.class, name = "Person"),
  @JsonSubTypes.Type(value = Organisation.class, name = "Organisation")
})
public interface AnyOfReadCustomersDataCustomerItems {

}
