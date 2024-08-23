package CCAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

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
		System.out.println("[1]Log In [2]Sign Up [3]View Leaderboard ");
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

	static void viewLeaderBoard(Connection conn) {
		LeaderBoard lb = new LeaderBoard();
		lb.displayLeaderBoard(conn, "user_db");
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

	public static void SignUp(Connection conn, DBFunctions db) {

		sc.nextLine();
		System.out.print("UserName :-");
		String U_name = sc.nextLine();
		System.out.println("");

		System.out.print("Password :-");
		String U_pass = sc.nextLine();
		System.out.println("");

		if (db.insert_user(conn, "user_db", U_name, U_pass, 0)) {
			G.LogIn(conn, db);
		} else {
			System.out.println("Sign Up failed");
			G.getin(conn, db);
		}
	}

	static void Welcome() {
		System.out.println(
				"\u001B[38;5;89m__/\\\\\\______________/\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\____________________/\\\\\\\\\\\\\\\\\\_______/\\\\\\\\\\_______/\\\\\\\\____________/\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_        \u001B[0m"
						+
						"\n\u001B[38;5;90m _\\/\\\\\\_____________\\/\\\\\\_\\/\\\\\\///////////__\\/\\\\\\_________________/\\\\\\////////______/\\\\\\///\\\\\\____\\/\\\\\\\\\\\\________/\\\\\\\\\\\\_\\/\\\\\\///////////__       \u001B[0m"
						+
						"\n\u001B[38;5;91m  _\\/\\\\\\_____________\\/\\\\\\_\\/\\\\\\_____________\\/\\\\\\_______________/\\\\\\/_____________/\\\\\\/__\\///\\\\\\__\\/\\\\\\//\\\\\\____/\\\\\\//\\\\\\_\\/\\\\\\_____________      \u001B[0m"
						+
						"\n\u001B[38;5;92m   _\\//\\\\\\____/\\\\\\____/\\\\\\__\\/\\\\\\\\\\\\\\\\\\\\\\_____\\/\\\\\\______________/\\\\\\______________/\\\\\\______\\//\\\\\\_\\/\\\\\\\\///\\\\\\/\\\\\\/_\\/\\\\\\_\\/\\\\\\\\\\\\\\\\\\\\\\_____     \u001B[0m"
						+
						"\n\u001B[38;5;93m    __\\//\\\\\\__/\\\\\\\\\\__/\\\\\\___\\/\\\\\\///////______\\/\\\\\\_____________\\/\\\\\\_____________\\/\\\\\\_______\\/\\\\\\_\\/\\\\\\__\\///\\\\\\/___\\/\\\\\\_\\/\\\\\\///////______    \u001B[0m"
						+
						"\n\u001B[38;5;99m     ___\\//\\\\\\/\\\\\\/\\\\\\/\\\\\\____\\/\\\\\\_____________\\/\\\\\\_____________\\//\\\\\\____________\\//\\\\\\______/\\\\\\__\\/\\\\\\____\\///_____\\/\\\\\\_\\/\\\\\\_____________   \u001B[0m"
						+
						"\n\u001B[38;5;98m      ____\\//\\\\\\\\\\\\//\\\\\\\\\\_____\\/\\\\\\_____________\\/\\\\\\______________\\///\\\\\\___________\\///\\\\\\__/\\\\\\____\\/\\\\\\_____________\\/\\\\\\_\\/\\\\\\_____________  \u001B[0m"
						+
						"\n\u001B[38;5;97m       _____\\//\\\\\\__\\//\\\\\\______\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\____\\////\\\\\\\\\\\\\\\\\\____\\///\\\\\\\\\\/_____\\/\\\\\\_____________\\/\\\\\\_\\/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_ \u001B[0m"
						+
						"\n\u001B[38;5;96m        ______\\///____\\///_______\\///////////////__\\///////////////________\\/////////_______\\/////_______\\///______________\\///__\\///////////////__\u001B[0m");
		System.out.println(
				"\n\u001B[38;5;82m @@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@@@@    @@@@@@   @@@  @@@  @@@@@@@   @@@  @@@  @@@   @@@@@@@@     \u001B[0m"
						+
						"\n\u001B[38;5;76m@@@@@@@@  @@@@@@@@  @@@@@@@@@@@  @@@@@@@@@@@  @@@@@@@@  @@@@ @@@  @@@@@@@@  @@@  @@@@ @@@  @@@@@@@@@     \u001B[0m"
						+
						"\n\u001B[38;5;83m!@@       @@!  @@@  @@! @@! @@!  @@! @@! @@!  @@!  @@@  @@!@!@@@  @@!  @@@  @@!  @@!@!@@@  !@@           \u001B[0m"
						+
						"\n\u001B[38;5;77m!@!       !@!  @!@  !@! !@! !@!  !@! !@! !@!  !@!  @!@  !@!!@!@!  !@!  @!@  !@!  !@!!@!@!  !@!           \u001B[0m"
						+
						"\n\u001B[38;5;84m!@!       @!@  !@!  @!! !!@ @!@  @!! !!@ @!@  @!@!@!@!  @!@ !!@!  @!@  !@!  !!@  @!@ !!@!  !@! @!@!@     \u001B[0m"
						+
						"\n\u001B[38;5;85m!!!       !@!  !!!  !@!   ! !@!  !@!   ! !@!  !!!@!!!!  !@!  !!!  !@!  !!!  !!!  !@!  !!!  !!! !!@!!     \u001B[0m"
						+
						"\n\u001B[38;5;86m:!!       !!:  !!!  !!:     !!:  !!:     !!:  !!:  !!!  !!:  !!!  !!:  !!!  !!:  !!:  !!!  :!!   !!:     \u001B[0m"
						+
						"\n\u001B[38;5;80m:!:       :!:  !:!  :!:     :!:  :!:     :!:  :!:  !:!  :!:  !:!  :!:  !:!  :!:  :!:  !:!  :!:   !::     \u001B[0m"
						+
						"\n\u001B[38;5;87m ::: :::  ::::: ::  :::     ::   :::     ::   ::   :::   ::   ::   :::: ::   ::   ::   ::   ::: ::::     \u001B[0m"
						+
						"\n\u001B[38;5;81m :: :: :   : :  :    :      :     :      :     :   : :  ::    :   :: :  :   :    ::    :    :: :: :      \u001B[0m");

		System.out.println(
				"\n\u001B[38;5;50m			 	@@@@@@@ @@@  @@@ @@@@@@@@\u001B[0m" +
						"\n\u001B[38;5;49m			 	  @@!   @@!  @@@ @@!     \u001B[0m" +
						"\n\u001B[38;5;48m			 	  @!!   @!@!@!@! @!!!:!  \u001B[0m" +
						"\n\u001B[38;5;47m			 	  !!:   !!:  !!! !!:     \u001B[0m" +
						"\n\u001B[38;5;46m				   :     :   : : : :: :::\u001B[0m");
		System.out.println(
				"\n\u001B[38;5;82m @@@@@@@   @@@@@@   @@@  @@@  @@@  @@@   @@@@@@    @@@@@@   		\u001B[0m" + "" +
						"\n\u001B[38;5;76m@@@@@@@@  @@@@@@@@  @@@@ @@@  @@@  @@@  @@@@@@@@  @@@@@@@   		\u001B[0m"
						+ "" +
						"\n\u001B[38;5;83m!@@       @@!  @@@  @@!@!@@@  @@!  @@@  @@!  @@@  !@@       @!@	\u001B[0m"
						+ "\u001B[38;5;52m      db                            db       .M\"\"\"bgd   .g8\"\"\"bgd `7MMF'`7MMF'\u001B[0m"
						+
						"\n\u001B[38;5;77m!@!       !@!  @!@  !@!!@!@!  !@!  @!@  !@!  @!@  !@!       !@!	\u001B[0m"
						+ "\u001B[38;5;53m     ;MM:                          ;MM:     ,MI    \"Y .dP'     `M   MM    MM  \u001B[0m"
						+
						"\n\u001B[38;5;84m!@!       @!@!@!@!  @!@ !!@!  @!@  !@!  @!@!@!@!  !!@@!!    !:!	\u001B[0m"
						+ "\u001B[38;5;54m    ,V^MM.    `7MMpMMMb.          ,V^MM.    `MMb.     dM'       `   MM    MM  \u001B[0m"
						+
						"\n\u001B[38;5;85m!!!       !!!@!!!!  !@!  !!!  !@!  !!!  !!!@!!!!   !!@!!!       \u001B[0m"
						+ "\u001B[38;5;55m   ,M  `MM      MM    MM         ,M  `MM      `YMMNq. MM            MM    MM  \u001B[0m"
						+
						"\n\u001B[38;5;86m:!!       !!:  !!!  !!:  !!!  :!:  !!:  !!:  !!!       !:!  :!:	\u001B[0m"
						+ "\u001B[38;5;56m   AbmmmqMA     MM    MM         AbmmmqMA   .     `MM MM.           MM    MM  \u001B[0m"
						+
						"\n\u001B[38;5;80m:!:       :!:  !:!  :!:  !:!   ::!!:!   :!:  !:!      !:!   :::	\u001B[0m"
						+ "\u001B[38;5;57m  A'     VML    MM    MM        A'     VML  Mb     dM `Mb.     ,'   MM    MM  \u001B[0m"
						+
						"\n\u001B[38;5;87m ::: :::  ::   :::   ::   ::    ::::    ::   :::  :::: ::   :::	\u001B[0m"
						+ "\u001B[38;5;63m.AMA.   .AMMA..JMML  JMML.    .AMA.   .AMMA.P\"Ybmmd\"    `\"bmmmd'  .JMML..JMML.\u001B[0m"
						+
						"\n\u001B[38;5;81m :: :: :   :   : :  ::    :      :       :   : :  :: : :    		\u001B[0m"
						+ "" +
						"\n");
		System.out.println(
				"\n\t\t\t\t\t\t\t\t\u001B[38;5;196m                         ,,                                               \u001B[0m"
						+
						"\n\t\t\t\t\t\t\t\t\u001B[38;5;196m       .g8\"\"8q.        `7MM                                               \u001B[0m"
						+
						"\n\t\t\t\t\t\t\t\t\u001B[38;5;160m     .dP'    `YM.        MM                                               \u001B[0m"
						+
						"\n\t\t\t\t\t\t\t\t\u001B[38;5;197m     dM'      `MM   ,M\"\"bMM `7M'   `MF',pP\"Ybd ,pP\"Ybd  .gP\"Ya `7M'   `MF'\u001B[0m"
						+
						"\n\t\t\t\t\t\t\t\t\u001B[38;5;161m     MM        MM ,AP    MM   VA   ,V  8I   `\" 8I   `\" ,M'   Yb  VA   ,V  \u001B[0m"
						+
						"\n\t\t\t\t\t\t\t\t\u001B[38;5;198m     MM.      ,MP 8MI    MM    VA ,V   `YMMMa. `YMMMa. 8M\"\"\"\"\"\"   VA ,V   \u001B[0m"
						+
						"\n\t\t\t\t\t\t\t\t\u001B[38;5;162m     `Mb.    ,dP' `Mb    MM     VVV    L.   I8 L.   I8 YM.    ,    VVV    \u001B[0m"
						+
						"\n\t\t\t\t\t\t\t\t\u001B[38;5;199m       `\"bmmd\"'    `Wbmd\"MML.   ,V     M9mmmP' M9mmmP'  `Mbmmd'    ,V     \u001B[0m"
						+
						"\n\t\t\t\t\t\t\t\t\u001B[38;5;200m                               ,V                                 ,V      \u001B[0m"
						+
						"\n\t\t\t\t\t\t\t\t\u001B[38;5;201m                            OOb\"                               OOb\"       \u001B[0m");
		System.out.println(
				"\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t" + "\u001B[38;5;230mBy:"
						+ "\t   '||'                   ||  '||     '||''|.   '||''|.   \u001B[0m" +
						"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u001B[38;5;229m    ||    ....  .. ...   ...   ||      ||   ||   ||   ||  \u001B[0m"
						+
						"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u001B[38;5;228m    ||  .|...||  ||  ||   ||   ||      ||    ||  ||'''|.  \u001B[0m"
						+
						"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u001B[38;5;227m    ||  ||       ||  ||   ||   ||      ||    ||  ||    || \u001B[0m"
						+
						"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u001B[38;5;226m|| .|'   '|...' .||. ||. .||. .||.    .||...|'  .||...|'  \u001B[0m"
						+
						"\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u001B[38;5;226m '''                                                      \u001B[0m");
	}

	static void MainMenu(Player player, Connection conn, DBFunctions db) {
		boolean T = true;
		Scanner sc = new Scanner(System.in);
		while (true){
			System.out.println("\u001B[38;5;196m" +
					"\n+============================================================================================================================================================================+"
					+
					"\n|          .         .                                                                                  .         .                                                          |"
					+
					"\n|         ,8.       ,8.                   .8.           8888  8888 b.             8                    ,8.       ,8.          8 8888888888   b.             8 8 8888      88 |"
					+
					"\n|        ,888.     ,888.                 .888.          8888  8888 888o.          8                   ,888.     ,888.         8 8888         888o.          8 8 8888      88 |"
					+
					"\n|       .`8888.   .`8888.               :88888.         8888  8888 Y88888o.       8                  .`8888.   .`8888.        8 8888         Y88888o.       8 8 8888      88 |"
					+
					"\n|      ,8.`8888. ,8.`8888.             . `88888.        8888  8888 .`Y888888o.    8                 ,8.`8888. ,8.`8888.       8 8888         .`Y888888o.    8 8 8888      88 |"
					+
					"\n|     ,8'8.`8888,8^8.`8888.           .8. `88888.       8888  8888 8o. `Y888888o. 8                ,8'8.`8888,8^8.`8888.      8 888888888888 8o. `Y888888o. 8 8 8888      88 |"
					+
					"\n|    ,8' `8.`8888' `8.`8888.         .8`8. `88888.      8888  8888 8`Y8o. `Y88888o8               ,8' `8.`8888' `8.`8888.     8 8888         8`Y8o. `Y88888o8 8 8888      88 |"
					+
					"\n|   ,8'   `8.`88'   `8.`8888.       .8' `8. `88888.     8888  8888 8   `Y8o. `Y8888              ,8'   `8.`88'   `8.`8888.    8 8888         8   `Y8o. `Y8888 8 8888      88 |"
					+
					"\n|  ,8'     `8.`'     `8.`8888.     .8'   `8. `88888.    8888  8888 8      `Y8o. `Y8             ,8'     `8.`'     `8.`8888.   8 8888         8      `Y8o. `Y8 ` 8888     ,8P |"
					+
					"\n| ,8'       `8        `8.`8888.   .888888888. `88888.   8888  8888 8         `Y8o.`            ,8'       `8        `8.`8888.  8 8888         8         `Y8o.`   8888   ,d8P  |"
					+
					"\n|,8'         `         `8.`8888. .8'       `8. `88888.  8888  8888 8            `Yo           ,8'         `         `8.`8888. 8 888888888888 8            `Yo    `Y88888P'   |"
					+
					"\n+============================================================================================================================================================================+\u001B[0m");
			System.out.println(
					"\t\t\t\t\t\t_____________________________________________________________________________");
			System.out.println("\n\t\t\t\t\t\tStory 1");
			System.out.println("\t\t\t\t\t\t*Monarch vs. Predator:Duel of Dominance*" + "\t A Bravery Tale");
			System.out.println(
					"\t\t\t\t\t\t_____________________________________________________________________________");
			System.out.println("\n\t\t\t\t\t\tStory 2");
			System.out.println("\t\t\t\t\t\t*Tale of the Enchanted Cipher*" + "\t\t\t A Friction Fantasy");
			System.out.println(
					"\t\t\t\t\t\t_____________________________________________________________________________");
			System.out.println("\n\t\t\t\t\t\tStory 3");
			System.out.println("\t\t\t\t\t\t*The Tale of the Moonlit Kingdom*" + "\t\t A Fairytale ");
			System.out.println(
					"\t\t\t\t\t\t_____________________________________________________________________________");
			System.out.println("\n\t\t\t\t\t\tStory 4");
			System.out.println("\t\t\t\t\t\t*The Digital Odyssey*" + "\t\t\t\t A Science Friction Adventure");
			System.out.println(
					"\t\t\t\t\t\t_____________________________________________________________________________");
			System.out.println("\t\t\t\t\t\t5 For Exit.");
			System.out.print("\n\t\t\t\t\t\t");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					Stories S1 = new Story1(player, conn, db);
					break;
				case 2:
					Stories S2 = new Story2(player, conn, db);
					break;
				case 3:
					Stories S3 = new Story3(player, conn, db);
					break;
				case 4:
					Stories S4 = new Story4(player, conn, db);
					break;
				case 5:
					System.out.println("Exiting the program...");
					System.exit(0);
					return;
				default:
					System.out.println("Default");
					break;
			}
		}
	}
}