package CCAO;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBFunctions {
    public Connection connect_to_db(String dbname, String user, String pass) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
            if (conn != null) {
                System.out.println("Connection Established");
            } else {
                System.out.println("Connection Failed");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

       /*   public Connection connect_to_db(String dbname, String user, String pass) {
            Connection conn = null;
            try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
                if (conn != null) {
                    System.out.println("Connection Established");
                } else {
                    System.out.println("Connection Failed");
                }
            } catch (ClassNotFoundException e) {
                System.out.println("PostgreSQL JDBC Driver not found.");
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("Connection Failed! Check output console");
                e.printStackTrace();
            }
            return conn;
        }  */


    public boolean insert_user(Connection conn, String table_name, String user_name, String user_password,
            int user_score) {
        Statement statement;
        try {
            String query = String.format("insert into %s(user_name, user_password, user_score) values('%s','%s',%s);",table_name, user_name, user_password, user_score);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row Inserted");
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public void read_data(Connection conn, String table_name) {
        Statement statement;
        ResultSet rs = null;

        try {
            String query = String.format("select * from %s", table_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                System.out.print(rs.getInt("user_id") + " ");
                System.out.print(rs.getString("user_name") + " ");
                System.out.print(rs.getString("user_password") + " ");
                System.out.println(rs.getInt("user_score") + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean search_User(Connection conn, String table_name, String User_name, String User_password) {
        Statement statement;
        ResultSet rs = null;
        String query = String.format("select * from %s where user_name='%s' AND user_password = '%s' ", table_name,
                User_name, User_password);
        try {
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            if (rs.next()) {
                // while (rs.next()) {
                //     System.out.print(rs.getInt("user_id") + " ");
                //     System.out.print(rs.getString("user_name") + " ");
                //     System.out.print(rs.getString("user_password") + " ");
                //     System.out.println(rs.getInt("user_score") + " ");
                // }
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public int get_Score(Connection conn, String table_name, String User_name) {
        Statement statement;
        ResultSet rs = null;
        
        try {
            String query = String.format("select user_score from %s where user_name = '%s' ", table_name, User_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                return rs.getInt("user_score");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }



    public void Update_Score(Connection conn, String table_name, String User_name, int Score) {
        Statement statement;
        try {
            String query = String.format("update %s set user_score='%s' where user_name='%s'", table_name, Score, User_name);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Score Updated");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}