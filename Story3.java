package CCAO;
import java.sql.Connection;
import java.util.Scanner;


class Story3 extends Stories {
    Scanner sc = new Scanner(System.in);
    private Player player;
    // Instance Block3
    {
        System.out.println("\nStory 3");
        System.out.println("\n\u001B[38;5;226m" +
        "\n\t████████╗██╗  ██╗███████╗    ████████╗ █████╗ ██╗     ███████╗     ██████╗ ███████╗  " +
        "\n\t╚══██╔══╝██║  ██║██╔════╝    ╚══██╔══╝██╔══██╗██║     ██╔════╝    ██╔═══██╗██╔════╝  " +
        "\n\t   ██║   ███████║█████╗         ██║   ███████║██║     █████╗      ██║   ██║█████╗    " +
        "\n\t   ██║   ██╔══██║██╔══╝         ██║   ██╔══██║██║     ██╔══╝      ██║   ██║██╔══╝    " +
        "\n\t   ██║   ██║  ██║███████╗       ██║   ██║  ██║███████╗███████╗    ╚██████╔╝██║       " +
        "\n\t   ╚═╝   ╚═╝  ╚═╝╚══════╝       ╚═╝   ╚═╝  ╚═╝╚══════╝╚══════╝     ╚═════╝ ╚═╝       " +
        "\n  ████████╗██╗  ██╗███████╗    ███╗   ███╗ ██████╗  ██████╗ ███╗   ██╗██╗     ██╗████████╗    ██╗  ██╗██╗███╗   ██╗ ██████╗ ██████╗  ██████╗ ███╗   ███╗"
        +
        "\n  ╚══██╔══╝██║  ██║██╔════╝    ████╗ ████║██╔═══██╗██╔═══██╗████╗  ██║██║     ██║╚══██╔══╝    ██║ ██╔╝██║████╗  ██║██╔════╝ ██╔══██╗██╔═══██╗████╗ ████║"
        +
        "\n     ██║   ███████║█████╗      ██╔████╔██║██║   ██║██║   ██║██╔██╗ ██║██║     ██║   ██║       █████╔╝ ██║██╔██╗ ██║██║  ███╗██║  ██║██║   ██║██╔████╔██║"
        +
        "\n     ██║   ██╔══██║██╔══╝      ██║╚██╔╝██║██║   ██║██║   ██║██║╚██╗██║██║     ██║   ██║       ██╔═██╗ ██║██║╚██╗██║██║   ██║██║  ██║██║   ██║██║╚██╔╝██║"
        +
        "\n     ██║   ██║  ██║███████╗    ██║ ╚═╝ ██║╚██████╔╝╚██████╔╝██║ ╚████║███████╗██║   ██║       ██║  ██╗██║██║ ╚████║╚██████╔╝██████╔╝╚██████╔╝██║ ╚═╝ ██║"
        +
        "\n     ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚═╝     ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═══╝╚══════╝╚═╝   ╚═╝       ╚═╝  ╚═╝╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚═╝     ╚═╝\u001B[0m");
    }
    
    // Constructor Story1
    Story3 (Player player, Connection conn, DBFunctions db){
        super(player, conn, db);
        Score_Set();
        Commence();
    }
    
    void Score_Set(){
        a=1;
        b=-1;
        a1=-1;
        a2=1;
        b1=1;
        b2=-1;
    }

    void Commence() {
        System.out.println(
            "\n\tIn a faraway land where stars danced in the night sky and flowers sang with the wind, there existed a kingdom bathed in the soft glow of moonlight."
            +
            "\nThis kingdom, ruled by Queen Seraphina, was a place of wonder and enchantment, where magic flowed through every corner.");
            System.out.println("\n\n### Prologue: The Midnight Dream" +
            "\n\tOne fateful night, as the moon cast its silvery rays upon the land, whispers of a hidden realm reached Queen Seraphina's ears."
            +
            "\nIntrigued by the possibility of uncovering new mysteries, she embarked on a journey into the moonlit forest, accompanied only by the gentle melody of the night.");
            // A&B
            System.out.println(
                "\n     \\           |   _)                       \\       " + "\t\t\t\t\t        |"
                + "\t    \\           |   _)                    __ )     " +
                        "\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    _)" + "\t\t\t\t\t        |"
                        + "\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\  _) " +
                        "\n   ___ \\   (     |    |  (   |  |   |       ___ \\     "
                        + "\t\t*# Follow the Moonlit Path #*   |"
                        + "\t  ___ \\   (     |    |  (   |  |   |      |   |  "
                        + "\t*# Traverse the Whispering Woods #*" +
                        "\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\  _)" + "\t\t\t\t\t        |"
                        + "\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _) " +
                        "\n");
        System.out.println(
                "\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ " +
                        "\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  " +
                        "\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] " +
                        "\n\t- The choice sets the stage for the queen's encounter with magical creatures and challenges in the enchanted forest."
                        +
                        "\n\n");

        System.out.print("\t\t\t\t\t\t");
        choice = sc.nextLine();// sc.nextLine();
        if (this.choice.equalsIgnoreCase("Follow the Moonlit Path"))
            this.A = true;
        if (this.choice.equalsIgnoreCase("Traverse the Whispering Woods"))
            this.B = true;
        nextPartA(A);
        nextPartB(B);
    }

    @Override
    void nextPartA(boolean A) {
        while (A) {

            System.out.println("\n\nScore Updated By -->"+a+"\t Latest Score : "+this.Score_Updater(a)+"\n\n");

            System.out.println(
                    "\n* Queen Seraphina chooses to follow the shimmering path illuminated by the moon's gentle touch.");
            System.out.println(
                    "\nQueen Seraphina follows the moonlit path, her heart filled with anticipation as she journeys deeper into the forest's embrace.");
            // A1 & A2
            System.out.println(
                    "\n     \\           |   _)                       \\   _ |    " + "\t\t\t\t\t   |"
                            + "\t     \\           |   _)                       \\    ___ \\     " +
                            "\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    | _) " + "\t\t\t\t\t   |"
                            + "\t    _ \\     __|  __|  |   _ \\   __ \\         _ \\      ) | _) " +
                            "\n   ___ \\   (     |    |  (   |  |   |       ___ \\   |   "
                            + "\t*# Greet the Moonlit Fae #* \t   |"
                            + "\t   ___ \\   (     |    |  (   |  |   |       ___ \\    __/     "
                            + "\t*# Follow the Silver Stream  #*" +
                            "\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _| _)" + "\t\t\t\t\t   |"
                            + "\t _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _____| _) ");

            System.out.println(
                    "\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ " +
                            "\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  " +
                            "\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] " +
                            "\n\t- The choice leads to encounters with mystical beings or discoveries of hidden treasures along the moonlit path."
                            +
                            "\n\n");

            System.out.print("\t\t\t\t\t\t");
            choice = sc.nextLine();
            if (this.choice.equalsIgnoreCase("Greet the Moonlit Fae"))
                this.A1 = true;
            if (this.choice.equalsIgnoreCase("Follow the Silver Stream"))
                this.A2 = true;

            this.A1 = nextPartA1(A1);
            this.A2 = nextPartA2(A2);
            if (this.A1 == false && this.A2 == false)
                G.MainMenu(player, conn, db);
        }
    }

    @Override
    boolean nextPartA1(boolean A1) {
        while (A1) {

            System.out.println("\n\nScore Updated By -->"+a1+"\t Latest Score : "+this.Score_Updater(a1)+"\n\n");

            System.out.println(
                    "\n\n    ______          ___                ___   ___ " +
                            "\n   / ____/___  ____/ (_)___  ____ _   /   | <  / " +
                            "\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / /| | / (_)" +
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ /   " + "\t\t\t Greet the Moonlit Fae" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/_(_)  " +
                            "\n                          /____/                 \n");

            System.out.println(
                    "* The queen extends a warm greeting to the mischievous moonlit fae, hoping to learn more about the hidden realm.");
            this.TheEnd();
            return false;
        }
        return false;
    }

    @Override
    boolean nextPartA2(boolean A2) {
        while (A2) {

            System.out.println("\n\nScore Updated By -->"+a2+"\t Latest Score : "+this.Score_Updater(a2)+"\n\n");
            
            System.out.println(
                    "\n\n    ______          ___                ___   ___    " +
                            "\n   / ____/___  ____/ (_)___  ____ _   /   | |__ \\ _ " +
                            "\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / /| | __/ /(_)" +
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ __/_   " + "\t\t Follow the Silver Stream" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/____(_)  " +
                            "\n                          /____/                   \n");

            System.out.println(
                    "* Entranced by the gentle melody of the silver stream, Queen Seraphina follows its meandering path, curious about where it may lead.");
            this.TheEnd();
            return false;
        }
        return false;
    }

    @Override
    void nextPartB(boolean B) {
        while (B) {

            System.out.println("\n\nScore Updated By -->"+b+"\t Latest Score : "+this.Score_Updater(b)+"\n\n");
            
            System.out.println(
                    "\n* Trusting in the guidance of the ancient trees, the queen ventures deeper into the whispering woods, where secrets are whispered on the breeze.");
            System.out.println(
                    "\nQueen Seraphina ventures deeper into the whispering woods, where ancient trees whisper secrets of forgotten realms.");
            // B1 & B2
            System.out.println(
                    "\n\n\n     \\           |   _)                    __ ) _ |     " + "\t\t\t\t\t   |"
                            + "\t\t    \\           |   _)                    __ ) ___ \\  " +
                            "\n    _ \\     __|  __|  |   _ \\   __ \\       __ \\   | _)  " + "\t\t\t\t\t   |"
                            + "\t\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\    ) | _)" +
                            "\n   ___ \\   (     |    |  (   |  |   |      |   |  |     "
                            + "\t   *# Listen to the Song  \t   |"
                            + "\t\t  ___ \\   (     |    |  (   |  |   |      |   |  __/  "
                            + "\t\t*# Unravel the Riddle of " +
                            "\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _| _)  "
                            + "\t\t of the Nymphs #*\t   |"
                            + "\t\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/ _____| _)"
                            + "\t\t   the Eldertree #*");
            System.out.println(
                    "\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ " +
                            "\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  " +
                            "\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] " +
                            "\n\t- The choice leads to revelations about the hidden realm or challenges that test the queen's wisdom and resolve."
                            +
                            "\n\n");

            System.out.print("\t\t\t\t\t\t");
            choice = sc.nextLine();
            if (this.choice.equalsIgnoreCase("Listen to the Song of the Nymphs"))
                this.B1 = true;
            if (this.choice.equalsIgnoreCase("Unravel the Riddle of the Eldertree"))
                this.B2 = true;

            this.B1 = nextPartB1(B1);
            this.B2 = nextPartB2(B2);
            if (this.B1 == false && this.B2 == false)
                G.MainMenu(player, conn, db);
        }
    }


    @Override
    boolean nextPartB1(boolean B1) {
        while (B1) {

            System.out.println("\n\nScore Updated By -->"+b1+"\t Latest Score : "+this.Score_Updater(b1)+"\n\n");
            
            System.out.println(
                    "\n\n    ______          ___                ____ ___" +
                            "\n   / ____/___  ____/ (_)___  ____ _   / __ <  /" +
                            "\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / __  / / " +
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / /  "
                            + "\t\t\t Listen to the Song of the Nymphs" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/_/   " +
                            "\n                          /____/               ");
            System.out.println(
                    "* Enchanted by the ethereal melody of the nymphs, the queen pauses to listen, hoping to uncover clues about the hidden realm.");
            this.TheEnd();
            return false;
        }
        return false;
    }

    @Override
    boolean nextPartB2(boolean B2) {
        while (B2) {

            System.out.println("\n\nScore Updated By -->"+b2+"\t Latest Score : "+this.Score_Updater(b2)+"\n\n");
            
            System.out.println(
                    "\n\n    ______          ___                ____ ___    " +
                            "\n   / ____/___  ____/ (_)___  ____ _   / __ )__ \\ _ " +
                            "\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / __  |_/ /(_)" +
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / __/_   "
                            + "\t\t\t Unravel the Riddle of the Eldertree" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/____(_)  " +
                            "\n                          /____/                   ");
            System.out.println(
                    "* Intrigued by the wisdom of the ancient Eldertree, Queen Seraphina endeavors to solve its riddles, seeking guidance on her quest.");
            this.TheEnd();
            return false;
        }
        return false;
    }
}
