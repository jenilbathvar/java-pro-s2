package CCAO;

public class temp {
    public static void main(String[] args) {
        System.out.println("main");
        Abc1 A = new abc2();

        A.Hell();
        A.hey();

        abc2.Yopp();
        System.out.println("▩▦▥▨▬▮▭▯▣▤▧◀▶◁▷▲△△▰▱◄►◍◎◉▼▽◌●◙◉◯◬■■◩□◻¹²³⁴⁵⁶⁷⁸⁰⁹₀₁₂₃₄₅₆₇₈₉ⅠⅡⅢⅣⅤⅥⅦⅧⅨⅩⅪⅫⅰⅱⅲⅳⅴⅵⅶⅷⅸⅹⅺⅻↈↇↁↂ∎");

    }
}

abstract class Abc1 {
    void hey() {
        System.out.println("hey");
    }

    abstract void Hell();
}

class abc2 extends Abc1 {
    @Override
    void Hell() {
        System.out.println("HELL");
    }

    static void Yopp() {
        System.out.println("YOOOO");
    }
}



/*
 * package CCAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LeaderBoard {

    public static class User {
        String userName;
        int userScore;

        public User(String userName, int userScore) {
            this.userName = userName;
            this.userScore = userScore;
        }
    }

    public void displayLeaderBoard(Connection conn, String tableName) {
        List<User> users = fetchUsers(conn, tableName);
        if (users != null) {
            Collections.sort(users, new Comparator<User>() {
                @Override
                public int compare(User u1, User u2) {
                    return Integer.compare(u2.userScore, u1.userScore);
                }
            });

            System.out.println("Leaderboard:");
            System.out.println("Rank\tUser Name\tScore");
            for (int i = 0; i < users.size(); i++) {
                User user = users.get(i);
                System.out.println((i + 1) + "\t" + user.userName + "\t\t" + user.userScore);
            }
        } else {
            System.out.println("Failed to fetch user data.");
        }
    }

    private List<User> fetchUsers(Connection conn, String tableName) {
        List<User> users = new ArrayList<>();
        Statement statement;
        ResultSet rs = null;

        try {
            String query = String.format("SELECT user_name, user_score FROM %s", tableName);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String userName = rs.getString("user_name");
                int userScore = rs.getInt("user_score");
                users.add(new User(userName, userScore));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return users;
    }
}
 */



/*
package CCAO;

import java.sql.Connection;

class G {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("");
        G.Welcome();

        DBFunctions db = new DBFunctions();
        Connection conn = db.connect_to_db("CCAODB", "postgres", "CCAO1234");

        G.getin(conn, db);
    }

    static void getin(Connection conn, DBFunctions db) {
        System.out.println("[1]Log In [2]Sign Up [3]View Leaderboard");
        int in1 = sc.nextInt();

        if (in1 == 1) {
            G.LogIn(conn, db);
        } else if (in1 == 2) {
            G.SignUp(conn, db);
        } else if (in1 == 3) {
            G.viewLeaderBoard(conn);
        } else {
            System.out.println("enter from provided choices only :{");
        }
    }

    public static void LogIn(Connection conn, DBFunctions db) {
        sc.nextLine();
        System.out.print("UserName :-");
        String U_name = sc.nextLine();
        System.out.println("");

        System.out.print("Password :-");
        String U_pass = sc.nextLine();
        System.out.println("");

        if (db.search_User(conn, "user_db", U_name, U_pass)) {
            int score = db.get_Score(conn, "user_db", U_name);
            Player player = new Player(U_name, U_pass, score);
            db.search_User(conn, "user_db", U_name, U_pass);
            G.MainMenu(player, conn, db);
        } else {
            System.out.println("log in failed");
            G.getin(conn, db);
        }
    }

    public static void SignUp(Connection conn, DBFunctions db) {/* ... //}

static void Welcome() {/* ... //}

static void MainMenu(Player player, Connection conn, DBFunctions db) {/* ... //}

static void viewLeaderBoard(Connection conn) {
    LeaderBoard lb = new LeaderBoard();
    lb.displayLeaderBoard(conn, "user_db");
}
}
  */


















  
  // public void update_name(Connection conn, String table_name, String old_name,
    // String new_name) {
    // Statement statement;
    // try {
    // String query = String.format("update %s set name='%s' where name='%s'",
    // table_name, new_name, old_name);
    // statement = conn.createStatement();
    // statement.executeUpdate(query);
    // System.out.println("Data Updated");
    // } catch (Exception e) {
    // System.out.println(e);
    // }
    // }

    // public void createTable(Connection conn, String table_name){
    // Statement statement;
    // try{
    // String query="create table "+table_name+"(empid SERIAL,name
    // varchar(200),address varchar(200),primary key(empid));";
    // statement=conn.createStatement();
    // statement.executeUpdate(query);
    // System.out.println("Table Created");
    // }catch (Exception e){
    // System.out.println(e);
    // }
    // }

    // public void search_by_id(Connection conn, String table_name, int id) {
    // Statement statement;
    // ResultSet rs = null;
    // try {
    // String query = String.format("select * from %s where empid= %s", table_name,
    // id);
    // statement = conn.createStatement();
    // rs = statement.executeQuery(query);
    // while (rs.next()) {
    // System.out.print(rs.getString("empid") + " ");
    // System.out.print(rs.getString("name") + " ");
    // System.out.println(rs.getString("address"));
    // }
    // } catch (Exception e) {
    // System.out.println(e);
    // }
    // }

    // public void delete_row_by_name(Connection conn, String table_name, String
    // name) {
    // Statement statement;
    // try {
    // String query = String.format("delete from %s where name='%s'", table_name,
    // name);
    // statement = conn.createStatement();
    // statement.executeUpdate(query);
    // System.out.println("Data Deleted");
    // } catch (Exception e) {
    // System.out.println(e);
    // }
    // }

    // public void delete_row_by_id(Connection conn, String table_name, int id) {
    // Statement statement;
    // try {
    // String query = String.format("delete from %s where empid= %s", table_name,
    // id);
    // statement = conn.createStatement();
    // statement.executeUpdate(query);
    // System.out.println("Data Deleted");
    // } catch (Exception e) {
    // System.out.println(e);
    // }
    // }

    // public void delete_table(Connection conn, String table_name) {
    // Statement statement;
    // try {
    // String query = String.format("drop table %s", table_name);
    // statement = conn.createStatement();
    // statement.executeUpdate(query);
    // System.out.println("Table Deleted");
    // } catch (Exception e) {
    // System.out.println(e);
    // }
    // }