package CCAO;

public class Player {

    String User_name;
    String User_pass;
    int Score;
    
    public Player(String user_name, String user_pass, int score) {
        User_name = user_name;
        User_pass = user_pass;
        Score = score;
    }

    int Score_Update(int updation, Player player){
        player.Score += updation;
        
        return player.Score;
    }
}
