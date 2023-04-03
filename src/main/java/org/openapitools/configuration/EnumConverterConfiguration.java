package org.openapitools.configuration;

import org.openapitools.model.LocationRoleTypeValues;
import org.openapitools.model.LocationTypeValues;
import org.openapitools.model.RoleType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.locationRoleTypeValuesConverter")
    Converter<String, LocationRoleTypeValues> locationRoleTypeValuesConverter() {
        return new Converter<String, LocationRoleTypeValues>() {
            @Override
            public LocationRoleTypeValues convert(String source) {
                return LocationRoleTypeValues.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.locationTypeValuesConverter")
    Converter<String, LocationTypeValues> locationTypeValuesConverter() {
        return new Converter<String, LocationTypeValues>() {
            @Override
            public LocationTypeValues convert(String source) {
                return LocationTypeValues.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.roleTypeConverter")
    Converter<String, RoleType> roleTypeConverter() {
        return new Converter<String, RoleType>() {
            @Override
            public RoleType convert(String source) {
                return RoleType.fromValue(source);
            }
        };
    }

}
