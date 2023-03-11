# Customer System of Record
This repository contains a WIP of a customer system of record.  

## BIAN Data Model
The domain model borrows ideas from the BIAN.
[Domain Model v9.0](https://bian.org/servicelandscape-9-0/views/view_38585.html)

## API Swagger Spec
The WIP swagger spec for the APIs can be viewed by clicking on the link..
[View Swagger](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/ahoqueali/customer-system-of-record/master/open-api/customer-system-of-record.yml)

## How to run the service

**Install, Setup and configure database**
1. Download cockroach
```shell
curl https://binaries.cockroachdb.com/cockroach-v20.2.8.darwin-10.9-amd64.tgz | tar -xJ
```

```shell
cp -i cockroach-v20.2.8.darwin-10.9-amd64/cockroach /usr/local/bin/
```

2. [Start cockroach db](https://www.cockroachlabs.com/docs/stable/start-a-local-cluster.html)

```shell
cockroach start \
--insecure \
--store=node1 \
--listen-addr=localhost:26257 \
--http-addr=localhost:9080 \
--join=localhost:26257,localhost:26258,localhost:26259 \
--background

```

3. Init db

```shell
cockroach init --insecure --host=localhost:26257

```

see startup details

```shell
grep 'node starting' node1/logs/cockroach.log -A 11

```
expected ouput

```shell
CockroachDB node starting at 
build:               CCL v22.1.2 @ 2022-06-22 00:00:00 (go1.17) (go1.12.6)
webui:               http://localhost:8080
sql:                 postgresql://root@localhost:26257?sslmode=disable
RPC client flags:    cockroach <client cmd> --host=localhost:26257 --insecure
logs:                /Users/<username>/node1/logs
temp dir:            /Users/<username>/node1/cockroach-temp242232154
external I/O path:   /Users/<username>/node1/extern
store[0]:            path=/Users/<username>/node1
status:              initialized new cluster
clusterID:           8a681a16-9623-4fc1-a537-77e9255daafd
nodeID:              1
```
4. Create SoR tables by running liquibase script
```shell
./gradlew update
```
test db
```shell
cockroach sql --insecure
```
check table creation
```shell
select * from customer;
```

```shell

  id | first_name
-----+-------------
(0 rows)

Time: 49ms total (execution 47ms / network 2ms)

```

5. Add demo data
```shell
insert into customer(customer_id,first_name) values ('6828f970-73b7-47a1-ae92-bf4d27bafa1c', 'aHoque');

```

6. Start service
**TODO**


## References:
* [Cockroach DB](https://www.cockroachlabs.com/docs/stable/create-table.html#create-a-table-with-a-foreign-key-constraint
  )