package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String LOGIN = "postgres";
    private static final String PASSWORD = "bahtah";

    public static Connection jdbcConnect() {
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return connect;
    }
}
