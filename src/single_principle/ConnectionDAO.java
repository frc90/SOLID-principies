package single_principle;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDAO {
    private Connection connection;
    private String url;
    private String user;
    private String dbms;
    private String dbName;
    private String server;
    private String port;

    public ConnectionDAO(
//            Connection connection, String url, String user, String dbms, String dbName, String server, String port
    ) {
//        this.connection = connection;
//        this.url = url;
//        this.user = user;
//        this.dbms = dbms;
//        this.dbName = dbName;
//        this.server = server;
//        this.port = port;
    }

    public Connection createConnection(){
        // Create connection and return it
        // based on the given properties
        return connection;
    }
}
