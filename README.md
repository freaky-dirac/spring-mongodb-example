# Spring 4 mongoDB connection  - Starter Kit

Silly application inserting a document to mongo db collection.

## Dependencies manager
maven 3.2.5

## how to build
```bash
$ cd <project_path>
$ mvn clean package
```

## How to run
```
$ cd <project_path>
$ java -jar target/lib/spring-mongodb-0.1.0.jar
```

### Run MongoDB Server
```
$ mongod
```

### Run MongoDB Client
```
$ mongo
```

### Database setup
Using command line mongo client.

#### database usage
```
> use test
```

#### collection creation (for test application)
```
> db.createCollection("pippo")
```

### Verify insertions
```
> db.pippo.find()
```


