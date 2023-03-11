package org.ahoque.customer.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* AnyOfReadRolesDataRoleItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = AggrementInvolvement.class, name = "AggrementInvolvement"),
  @JsonSubTypes.Type(value = CustomerRelationshipInvolvement.class, name = "CustomerRelationshipInvolvement")
})
public interface AnyOfReadRolesDataRoleItems {

}
