# SoR for Personalised Customer Banking Experience

#Data Model
[BIAN Model v9](https://bian.org/servicelandscape-9-0/views/view_38585.html)

#How to Guide

* How to generate domain code using openapi spec
Install open api and run below command
```bash
openapi-generator generate -i spec.yaml --model-package org.ahoque.customer.model --api-package org.ahoque.customer.controller -g spring -o .
```

* How to create table schema
```bash
openapi-generator generate -g mysql-schema -o out -i spec.yaml --additional-properties=identifierNamingConvention=snake_case
```

* How to setup cockroach db and create database
```bash
brew install cockroachdb/tap/cockroach
brew services restart cockroachdb/tap/cockroach
mvn clean install -DskipTests liquibase:update
```

* How to lauch cockroach client
```bash
 cockroach sql --insecure 
```

* How to launch cockroach dashboard
```bash 
open http://localhost:26256
```