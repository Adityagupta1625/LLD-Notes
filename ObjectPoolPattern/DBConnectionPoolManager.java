package ObjectPoolPattern;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {

    private List<DBConnection> freeConnections = new ArrayList<DBConnection>();

    private List<DBConnection> usedConnections = new ArrayList<DBConnection>();

    public static DBConnectionPoolManager instance = null;

    private static int maxConnections = 4;

    public DBConnectionPoolManager() {
        for (int i = 0; i < 2; i++) {
            DBConnection dbConnection = new DBConnection();
            freeConnections.add(dbConnection);
        }
    }

    public static DBConnectionPoolManager getInstance() {
        if (instance == null) {
            instance = new DBConnectionPoolManager();
        }
        return instance;
    }

    public DBConnection getConnection() {

        if (freeConnections.isEmpty() && usedConnections.size() < maxConnections) {
            DBConnection dbConnection = new DBConnection();
            freeConnections.add(dbConnection);
        } else if (freeConnections.isEmpty() && usedConnections.size() >= maxConnections) {
            System.out.println("No more connections available");
            return null;
        }

        DBConnection dbConnection = freeConnections.remove(freeConnections.size() - 1);
        usedConnections.add(dbConnection);
        return dbConnection;
    }

    public void releaseConnection(DBConnection dbConnection) {
        if (dbConnection != null) {
            usedConnections.remove(dbConnection);
            freeConnections.add(dbConnection);
        }
    }
}
