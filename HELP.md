#How to Guide

* How to generate domain code using openapi spec
Install open api and run below command
```bash
openapi-generator generate -i csor-spec.yaml -g spring -o .
```

* How to create table schema
```bash
openapi-generator generate -g mysql-schema -o out -i csor-spec.yaml --additional-properties=identifierNamingConvention=snake_case
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