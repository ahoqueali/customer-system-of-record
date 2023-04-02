```bash
openapi-generator generate -i spec.yaml -g spring -o .
```

```java

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "CustomerType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Person.class, name = "PERSON"),
        @JsonSubTypes.Type(value = Organisation.class, name = "ORGANISATION")
})

```