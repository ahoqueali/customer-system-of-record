package org.ahoque.customer.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import org.ahoque.customer.model.GeolocationAddress;
import org.ahoque.customer.model.LatitudeAddress;
import org.ahoque.customer.model.LocationElectronicAddress;
import org.ahoque.customer.model.LocationPostalAddress;
import org.ahoque.customer.model.LongitudeAddress;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-07T18:21:05.499518+01:00[Europe/London]")
public interface CustomerLocationLocation {
}
