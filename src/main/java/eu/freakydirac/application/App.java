package eu.freakydirac.application;


import com.mongodb.MongoClient;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;


public class App {
    public static void main(String[] args) {
        try {
            MongoClient mongo = new MongoClient("localhost", 27017);
            MongoOperations mongoOps = new MongoTemplate(mongo, "test");
            User user = new User("User firstname", "user lastname");
            mongoOps.insert(user, "pippo");
            mongo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

