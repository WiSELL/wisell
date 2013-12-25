/*
 * Coders4Africa Senegal copyright2013
 */

package wisell.data.repo.impl;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.net.UnknownHostException;
import org.mongodb.morphia.AdvancedDatastore;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author papesdiop
 */
class DBParams {

    private final Mongo mongo;
    private DB db;
    private Datastore ds;
    private AdvancedDatastore ads;
    private final Morphia morphia = new Morphia();
    private static final DBParams instance = new DBParams();
    
    private final String DB_NAME = System.getProperty("WISELL_USER", "wisell");
    private final String USER = System.getProperty("WISELL_USER", "wisell_db_user");
    private final String PASSWORD = System.getProperty("WISELL_PASSWORD", "wisell_db_password");

    public static DBParams getInstance() {
        return instance;
    }

    public DBParams() {
        try {
           //Root User:     admin
            //Root Password: 4in5TekbxtzV
            //Database Name: wisell
            //Connection URL: mongodb://$OPENSHIFT_MONGODB_DB_HOST:$OPENSHIFT_MONGODB_DB_PORT/
            
            String host = System.getenv("OPENSHIFT_MONGODB_DB_HOST");
            String sport = System.getenv("OPENSHIFT_MONGODB_DB_PORT");
            String dbName = System.getenv("OPENSHIFT_APP_NAME");
            if(dbName == null)
                dbName = "wisell";
            String user = System.getenv("OPENSHIFT_MONGODB_DB_USERNAME");
            String password = System.getenv("OPENSHIFT_MONGODB_DB_PASSWORD");
            mongo = new MongoClient(new MongoClientURI("mongodb://"+host+":"+sport));
            //mongo = new MongoClient(new MongoClientURI("mongodb://" + System.getProperty("OPENSHIFT_MONGODB_DB_HOST", "localhost") + ":" + System.getProperty("OPENSHIFT_MONGODB_DB_PORT","27017")));
            //mongo = new MongoClient(new MongoClientURI(System.getProperty("MONGO_URI", "mongodb://localhost:27017")));
            //db = mongo.getDB(DB_NAME);
            db = mongo.getDB(dbName);
            db.authenticate(user, password.toCharArray());
            ds = morphia.createDatastore(mongo, db.getName());
            ads = (AdvancedDatastore) ds;
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public AdvancedDatastore getAds() {
        return ads;
    }

    public DB getDb() {
        return db;
    }

    public Datastore getDs() {
        return ds;
    }

    public Mongo getMongo() {
        return mongo;
    }

    public Morphia getMorphia() {
        return morphia;
    }

    public void setDb(final DB db) {
        this.db = db;
    }

    public void setDs(final Datastore ds) {
        this.ds = ds;
    }

    public void setAds(final AdvancedDatastore ads) {
        this.ads = ads;
    }
}
