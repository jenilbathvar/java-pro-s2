package CCAO;
import java.sql.Connection;
import java.util.Scanner;


class Story2 extends Stories {
    Scanner sc = new Scanner(System.in);
    private Player player;
    // Instance Block2
    {
        System.out.println("\nStory 2\u001B[38;5;129m" +
                "\n\tsdSS_SSSSSSbs   .S_SSSs    S.        sSSs          sSSs_sSSs      sSSs        sdSS_SSSSSSbs   .S    S.     sSSs     "
                +
                "\n\tYSSS~S%SSSSSP  .SS~SSSSS   SS.      d%%SP         d%%SP~YS%%b    d%%SP        YSSS~S%SSSSSP  .SS    SS.   d%%SP     "
                +
                "\n\t     S%S       S%S   SSSS  S%S     d%S'          d%S'     `S%b  d%S'               S%S       S%S    S%S  d%S'       "
                +
                "\n\t     S%S       S%S    S%S  S%S     S%S           S%S       S%S  S%S                S%S       S%S    S%S  S%S        "
                +
                "\n\t     S&S       S%S SSSS%S  S&S     S&S           S&S       S&S  S&S                S&S       S%S SSSS%S  S&S        "
                +
                "\n\t     S&S       S&S  SSS%S  S&S     S&S_Ss        S&S       S&S  S&S_Ss             S&S       S&S  SSS&S  S&S_Ss     "
                +
                "\n\t     S&S       S&S    S&S  S&S     S&S~SP        S&S       S&S  S&S~SP             S&S       S&S    S&S  S&S~SP     "
                +
                "\n\t     S&S       S&S    S&S  S&S     S&S           S&S       S&S  S&S                S&S       S&S    S&S  S&S        "
                +
                "\n\t     S*S       S*S    S&S  S*b     S*b           S*b       d*S  S*b                S*S       S*S    S*S  S*b        "
                +
                "\n\t     S*S       S*S    S*S  S*S.    S*S.          S*S.     .S*S  S*S                S*S       S*S    S*S  S*S.       "
                +
                "\n\t     S*S       S*S    S*S   SSSbs   SSSbs         SSSbs_sdSSS   S*S                S*S       S*S    S*S   SSSbs     "
                +
                "\n\t     S*S       SSS    S*S    YSSP    YSSP          YSSP~YSSY    S*S                S*S       SSS    S*S    YSSP     "
                +
                "\n\t     SP               SP                                        SP                 SP               SP              "
                +
                "\n\t     Y                Y                                         Y                  Y                Y               \n"
                +
                "\n     sSSs   .S_sSSs      sSSs   .S    S.    .S_SSSs     .S_sSSs    sdSS_SSSSSSbs    sSSs   .S_sSSs            sSSs   .S   .S_sSSs     .S    S.     sSSs   .S_sSSs    "
                +
                "\n    d%%SP  .SS~YS%%b    d%%SP  .SS    SS.  .SS~SSSSS   .SS~YS%%b   YSSS~S%SSSSSP   d%%SP  .SS~YS%%b          d%%SP  .SS  .SS~YS%%b   .SS    SS.   d%%SP  .SS~YS%%b   "
                +
                "\n   d%S'    S%S   `S%b  d%S'    S%S    S%S  S%S   SSSS  S%S   `S%b       S%S       d%S'    S%S   `S%b        d%S'    S%S  S%S   `S%b  S%S    S%S  d%S'    S%S   `S%b  "
                +
                "\n   S%S     S%S    S%S  S%S     S%S    S%S  S%S    S%S  S%S    S%S       S%S       S%S     S%S    S%S        S%S     S%S  S%S    S%S  S%S    S%S  S%S     S%S    S%S  "
                +
                "\n   S&S     S%S    S&S  S&S     S%S SSSS%S  S%S SSSS%S  S%S    S&S       S&S       S&S     S%S    S&S        S&S     S&S  S%S    d*S  S%S SSSS%S  S&S     S%S    d*S  "
                +
                "\n   S&S_Ss  S&S    S&S  S&S     S&S  SSS&S  S&S  SSS%S  S&S    S&S       S&S       S&S_Ss  S&S    S&S        S&S     S&S  S&S   .S*S  S&S  SSS&S  S&S_Ss  S&S   .S*S  "
                +
                "\n   S&S~SP  S&S    S&S  S&S     S&S    S&S  S&S    S&S  S&S    S&S       S&S       S&S~SP  S&S    S&S        S&S     S&S  S&S_sdSSS   S&S    S&S  S&S~SP  S&S_sdSSS   "
                +
                "\n   S&S     S&S    S&S  S&S     S&S    S&S  S&S    S&S  S&S    S&S       S&S       S&S     S&S    S&S        S&S     S&S  S&S~YSSY    S&S    S&S  S&S     S&S~YSY%b   "
                +
                "\n   S*b     S*S    S*S  S*b     S*S    S*S  S*S    S&S  S*S    S*S       S*S       S*b     S*S    d*S        S*b     S*S  S*S         S*S    S*S  S*b     S*S   `S%b  "
                +
                "\n   S*S.    S*S    S*S  S*S.    S*S    S*S  S*S    S*S  S*S    S*S       S*S       S*S.    S*S   .S*S        S*S.    S*S  S*S         S*S    S*S  S*S.    S*S    S%S  "
                +
                "\n    SSSbs  S*S    S*S   SSSbs  S*S    S*S  S*S    S*S  S*S    S*S       S*S        SSSbs  S*S_sdSSS          SSSbs  S*S  S*S         S*S    S*S   SSSbs  S*S    S&S  "
                +
                "\n     YSSP  S*S    SSS    YSSP  SSS    S*S  SSS    S*S  S*S    SSS       S*S         YSSP  SSS~YSSY            YSSP  S*S  S*S         SSS    S*S    YSSP  S*S    SSS  "
                +
                "\n           SP                         SP          SP   SP               SP                                          SP   SP                 SP           SP          "
                +
                "\n           Y                          Y           Y    Y                Y                                           Y    Y                  Y            Y           \u001B[0m");
    }

    // Constructor Story1
    Story2 (Player player, Connection conn, DBFunctions db){
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
                "\n\n\tIn the mystical realm of Eldoria, a land adorned with emerald forests and shimmering lakes, King Alaric ruled with wisdom and benevolence.\n"
                        +
                        "\n╦ ╦" +
                        "\n╠═╣" +
                        "\n╩ ╩"
                        + "owever, a mysterious cipher, said to hold the key to ancient powers, began to emerge, casting a veil of uncertainty over the kingdom.");
        System.out.println("\n\n### Prologue: The Whispers of the Cipher" +
                "\n\tWhispers of the enchanted cipher reached King Alaric's ears. It was said that those who unraveled its secrets could command the very fabric of magic itself."
                +
                "\nEager to ensure the safety of his kingdom, the king embarked on a quest to find the source of the cryptic messages.\n");
        // A&B
        System.out.println(
                "\n     \\           |   _)                       \\       " + "\t\t\t\t\t\t        |"
                        + "\t    \\           |   _)                    __ )     " +
                        "\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    _)" + "\t\t\t\t\t\t        |"
                        + "\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\  _) " +
                        "\n   ___ \\   (     |    |  (   |  |   |       ___ \\     "
                        + "\t\t*# Journey into the Forgotten Woods #*  |"
                        + "\t  ___ \\   (     |    |  (   |  |   |      |   |  " + "\t\t*# Consult the Oracle #*" +
                        "\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\  _)" + "\t\t\t\t\t\t        |"
                        + "\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _) " +
                        "\n");
        System.out.println(
                "\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ " +
                        "\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  " +
                        "\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] " +
                        "\n\t- The choice influences the initial challenges and allies the king encounters in his quest."
                        +
                        "\n\n");
        System.out.print("\t\t\t\t\t\t");
        choice = sc.nextLine();// sc.nextLine();
        if (this.choice.equalsIgnoreCase("Journey into the Forgotten Woods"))
            this.A = true;
        if (this.choice.equalsIgnoreCase("Consult the Oracle"))
            this.B = true;
        nextPartA(A);
        nextPartB(B);
    }

    @Override
    void nextPartA(boolean A) {
        while (A) {

            System.out.println("\n\nScore Updated By -->"+a+"\t Latest Score : "+this.Score_Updater(a)+"\n\n");

            System.out.println(
                    "\n* King Alaric decides to explore the mystical, uncharted woods rumored to be the origin of the cipher.");
            System.out.println(
                    "\n\n* King Alaric ventures into the heart of the forgotten woods, where ancient spirits and magical creatures dwell.");
            // A1 & A2
            System.out.println(
                    "\n     \\           |   _)                       \\   _ |    " + "\t\t\t\t\t   |"
                            + "\t     \\           |   _)                       \\    ___ \\     " +
                            "\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    | _) " + "\t\t\t\t\t   |"
                            + "\t    _ \\     __|  __|  |   _ \\   __ \\         _ \\      ) | _) " +
                            "\n   ___ \\   (     |    |  (   |  |   |       ___ \\   |   "
                            + "\t*# Follow the Luminescent  \t   |"
                            + "\t   ___ \\   (     |    |  (   |  |   |       ___ \\    __/     "
                            + "\t*# Listen to the Whispering  " +
                            "\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _| _)"
                            + "\t\t Butterflies \t#*\t   |"
                            + "\t _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _____| _) " + "\t\t Trees #*");

            System.out.println(
                    "\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ " +
                            "\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  " +
                            "\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] " +
                            "\n\t- The choice determines the nature of the challenges in the woods and the knowledge gained about the cipher."
                            +
                            "\n\n");

            System.out.print("\t\t\t\t\t\t");
            choice = sc.nextLine();
            if (this.choice.equalsIgnoreCase("Follow the Luminescent Butterflies"))
                this.A1 = true;
            if (this.choice.equalsIgnoreCase("Listen to the Whispering Trees"))
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
                    "\n\n\n    ______          ___                ___   ___ " +
                            "\n   / ____/___  ____/ (_)___  ____ _   /   | <  / " +
                            "\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / /| | / (_)" +
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ /   "
                            + "\t\t\t Follow the Luminescent Butterflies" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/_(_)  " +
                            "\n                          /____/                 \n");

            System.out.println(
                    "Following the butterflies, King Alaric discovers a hidden glade where the cipher reveals itself in a burst of ethereal light."
                            +
                            "\nThe butterflies, enchanted protectors of the cipher, pledge their allegiance to the king, granting him their magical guidance.");
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
                    "\n\n\n    ______          ___                ___   ___    " +
                            "\n   / ____/___  ____/ (_)___  ____ _   /   | |__ \\ _ " +
                            "\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / /| | __/ /(_)" +
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ __/_   " + "\t\t Whispers of the Trees" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/____(_)  " +
                            "\n                          /____/                   \n");

            System.out.println(
                    "Listening to the whispering trees, the king gains profound knowledge about the cipher's history." +
                            "The ancient trees, grateful for his respect, imbue Alaric with their wisdom, becoming allies in his quest.");
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
                    "\n* Seeking guidance, the king visits the ancient oracle, hoping to unravel the secrets through divine wisdom.");
            System.out.println("\n* King Alaric seeks counsel from the oracle, a wise and mysterious seer.");
            // B1 & B2
            System.out.println(
                    "\n\n\n     \\           |   _)                    __ ) _ |     " + "\t\t\t\t\t   |"
                            + "\t\t    \\           |   _)                    __ ) ___ \\  " +
                            "\n    _ \\     __|  __|  |   _ \\   __ \\       __ \\   | _)  " + "\t\t\t\t\t   |"
                            + "\t\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\    ) | _)" +
                            "\n   ___ \\   (     |    |  (   |  |   |      |   |  |     "
                            + "\t   *# Seek a Vision in  \t   |"
                            + "\t\t  ___ \\   (     |    |  (   |  |   |      |   |  __/  "
                            + "\t\t*# Interpret the Oracle's " +
                            "\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _| _)  "
                            + "\t\t the Sacred Pool #*\t   |"
                            + "\t\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/ _____| _)" + "\t\t   Dream #*");
            System.out.println(
                    "\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ " +
                            "\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  " +
                            "\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] " +
                            "\n\t- " +
                            "\n\n");

            System.out.print("\t\t\t\t\t\t");
            choice = sc.nextLine();
            if (this.choice.equalsIgnoreCase("Seek a Vision in the Sacred Pool"))
                this.B1 = true;
            if (this.choice.equalsIgnoreCase("Interpret the Oracle's Dream"))
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
                    "\n\n\n    ______          ___                ____ ___" +
                            "\n   / ____/___  ____/ (_)___  ____ _   / __ <  /" +
                            "\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / __  / / " +
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / /  " + "\t\t\t Vision of the Pool" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/_/   " +
                            "\n                          /____/               ");
            System.out.println(
                    "Gazing into the sacred pool, King Alaric sees a vision of the cipher guarded by mystical beings." +
                            "\nThe oracle's blessing grants him insight, and a guardian spirit emerges to aid him on his quest.");
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
                    "\n\n\n    ______          ___                ____ ___    " +
                            "\n   / ____/___  ____/ (_)___  ____ _   / __ )__ \\ _ " +
                            "\n  / __/ / __ \\/ __  / / __ \\/ __ `/  / __  |_/ /(_)" +
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / __/_   " + "\t\t\t Dreamweaver's Insight" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/____(_)  " +
                            "\n                          /____/                   ");
            System.out.println(
                    "Interpreting the oracle's dream, the king deciphers clues leading him to a hidden temple." +
                            "\nThe dream unveils a guardian creature that pledges allegiance to Alaric, becoming a powerful ally.");
            this.TheEnd();
            return false;
        }
        return false;
    }
}