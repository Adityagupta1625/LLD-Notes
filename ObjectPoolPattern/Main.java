package ObjectPoolPattern;

public class Main {

    public static void main(String[] args) {

        DBConnectionPoolManager dbConnectionPoolManager = DBConnectionPoolManager.getInstance();

        DBConnection dbConnection1 = dbConnectionPoolManager.getConnection();

        DBConnection dbConnection2 = dbConnectionPoolManager.getConnection();

        DBConnection dbConnection3 = dbConnectionPoolManager.getConnection();

        DBConnection dbConnection4 = dbConnectionPoolManager.getConnection();

        dbConnectionPoolManager.releaseConnection(dbConnection1);

        DBConnection dbConnection5 = dbConnectionPoolManager.getConnection();

        DBConnection dbConnection6 = dbConnectionPoolManager.getConnection();

        dbConnectionPoolManager.releaseConnection(dbConnection2);

    }
}
