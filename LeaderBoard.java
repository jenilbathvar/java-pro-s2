package CCAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeaderBoard {

    public void displayLeaderBoard(Connection conn, String table_name) {
        Statement statement;
        ResultSet rs = null;

        PriorityQueue<User> pq = new PriorityQueue<>(new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return Integer.compare(u2.getUserScore(), u1.getUserScore());
            }
        });

        try {
            String query = String.format("select user_name, user_score from %s", table_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                String userName = rs.getString("user_name");
                int userScore = rs.getInt("user_score");
                pq.add(new User(userName, userScore));
            }

            System.out.println("Leaderboard:");
            System.out.println("Rank\tUser Name\tScore");
            int rank = 1;
            while (!pq.isEmpty()) {
                User user = pq.poll();
                System.out.printf("%d\t%s\t\t%d\n", rank++, user.getUserName(), user.getUserScore());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Inner class represent a User
    class User {
        private String userName;
        private int userScore;

        public User(String userName, int userScore) {
            this.userName = userName;
            this.userScore = userScore;
        }

        public String getUserName() {
            return userName;
        }

        public int getUserScore() {
            return userScore;
        }
    }
}