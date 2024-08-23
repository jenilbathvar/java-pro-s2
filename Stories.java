package CCAO;

import java.sql.Connection;

abstract class Stories extends G {// so that this keyword can be used like this.choice
    String choice;
    boolean A, B, A1, A2, B1, B2;
    int a,b,a1,a2,b1,b2;
    protected Player player;
    protected Connection conn;
    protected DBFunctions db;

    public Stories(Player player, Connection conn, DBFunctions db){
        this.player = player;
        this.conn = conn;
        this.db = db;
    }


    int Score_Updater(int S){

        int Score_current = db.get_Score(conn, "user_db", player.User_name);
        int Score_updated = Score_current + S;
        
        System.out.println();
        System.out.println("curr "+Score_current+" Up "+Score_updated+" S "+S);
        System.out.println();

        db.Update_Score(conn, "user_db", player.User_name, Score_updated);
        return Score_updated;
    }

    abstract void Score_Set();

    abstract void Commence();

    abstract void nextPartA(boolean A);

    abstract boolean nextPartA1(boolean A1);

    abstract boolean nextPartA2(boolean A2);

    abstract void nextPartB(boolean B);

    abstract boolean nextPartB1(boolean B1);

    abstract boolean nextPartB2(boolean B2);

    void TheEnd() {
        System.out.println("\n" +
                "\n\t\t\t\t\t\t\t\t\u001B[38;5;196m  ::::::::::: :::    ::: ::::::::::          :::::::::: ::::    ::: ::::::::: "
                +
                "\n\t\t\t\t\t\t\t\t\u001B[38;5;160m     :+:     :+:    :+: :+:                 :+:        :+:+:   :+: :+:    :+: "
                +
                "\n\t\t\t\t\t\t\t\t\u001B[38;5;197m    +:+     +:+    +:+ +:+                 +:+        :+:+:+  +:+ +:+    +:+  "
                +
                "\n\t\t\t\t\t\t\t\t\u001B[38;5;161m   +#+     +#++:++#++ +#++:++#            +#++:++#   +#+ +:+ +#+ +#+    +:+   "
                +
                "\n\t\t\t\t\t\t\t\t\u001B[38;5;198m  +#+     +#+    +#+ +#+                 +#+        +#+  +#+#+# +#+    +#+    "
                +
                "\n\t\t\t\t\t\t\t\t\u001B[38;5;162m #+#     #+#    #+# #+#                 #+#        #+#   #+#+# #+#    #+#     "
                +
                "\n\t\t\t\t\t\t\t\t\u001B[38;5;199m###     ###    ### ##########          ########## ###    #### #########       "
                +
                "\n\t\t\t\t\t\t\t\t\u001B[38;5;200m______________________________________________________________________________\u001B[0m");
    }
}