package CCAO;
import java.sql.Connection;
import java.util.Scanner;


class Story1 extends Stories {
    Scanner sc = new Scanner(System.in);
        private Player player;

    // Instance Block
    {
        // System.out.println("Monarch vs. Predator:Duel of Dominance");
        System.out.println(
                "\n\u001B[38;5;196m    ...     ..      ..                                                                                 \u001B[0m|   _            .x+=:.           "
                        +
                        "\n\u001B[38;5;196m  x*8888x.:*8888: -\"888:                                                                  .uef^\"       \u001B[0m|  u            z`    ^%        "
                        +
                        "\n\u001B[38;5;196m X   48888X `8888H  8888          u.      u.    u.                  .u    .             :d88E          \u001B[0m| 88Nu.   u.       .   <k         "
                        +
                        "\n\u001B[38;5;196mX8x.  8888X  8888X  !888>   ...ue888b   x@88k u@88c.       u      .d88B :@8c        .   `888E          \u001B[0m|'88888.o888c    .@8Ned8\"        "
                        +
                        "\n\u001B[38;5;196mX8888 X8888  88888   \"*8%-  888R Y888r ^\"8888\"\"8888\"    us888u.  =\"8888f8888r  .udR88N   888E .z8k     \u001B[0m| ^8888  8888  .@^%8888\"   "
                        +
                        "\n\u001B[38;5;196m'*888!X8888> X8888  xH8>    888R I888>   8888  888R  .@88 \"8888\"   4888>'88\"  <888'888k  888E~?888L    \u001B[0m|  8888  8888 x88:  `)8b.      "
                        +
                        "\n\u001B[38;5;196m  `?8 `8888  X888X X888>    888R I888>   8888  888R  9888  9888    4888> '    9888 'Y\"   888E  888E    \u001B[0m|  8888  8888 8888N=*8888        "
                        +
                        "\n\u001B[38;5;196m  -^  '888\"  X888  8888>    888R I888>   8888  888R  9888  9888    4888>      9888       888E  888E    \u001B[0m|  8888  8888  %8\"    R88       "
                        +
                        "\n\u001B[38;5;196m   dx '88~x. !88~  8888>   u8888cJ888    8888  888R  9888  9888   .d888L .+   9888       888E  888E    \u001B[0m| .8888b.888P   @8Wou 9%     .    "
                        +
                        "\n\u001B[38;5;196m .8888Xf.888x:!    X888X.:  \"*888*P\"    \"*88*\" 8888\" 9888  9888   ^\"8888*\"    ?8888u../  888E  888E    \u001B[0m|  ^Y8888*\"\"  .888888P`  "
                        +
                        "\n\u001B[38;5;196m:\"\"888\":~\"888\"     `888*\"     'Y\"         \"\"   'Y\"   \"888*\"\"888\"     \"Y\"       \"8888P'  m888N= 888>    \u001B[0m|     `Y\"      ` "
                        +
                        "\n\u001B[38;5;196m    \"~'    \"~        \"\"                               ^Y\"   ^Y'                  \"P'     `Y\"   888     \u001B[0m|                           "
                        +
                        "\n\u001B[38;5;196m                                                                                              J88\"     \u001B[0m|                                  "
                        +
                        "\n\u001B[38;5;196m                                                                                              @%       \u001B[0m|                                  "
                        +
                        "\n\u001B[38;5;196m                                                                                            :\"         \u001B[0m\u001B[0m|                                  ");
        System.out.print(
                "\n\t\u001B[38;5;21m    ....      ..                                ..                        s                                    \u001B[0m"
                        +
                        "\n\t\u001B[38;5;21m  +^\"\"888h. ~\"888h                            dF                         :8                                    \u001B[0m"
                        +
                        "\n\t\u001B[38;5;21m 8X.  ?8888X  8888f     .u    .              '88bu.                     .88           u.      .u    .          \u001B[0m"
                        + "\t\t.s5SSSs.                                                           " +
                        "\n\t\u001B[38;5;21m'888x  8888X  8888~   .d88B :@8c       .u    '*88888bu         u       :888ooo  ...ue888b   .d88B :@8c     .   \u001B[0m"
                        + "\t\t      SS. .s    s.  .s5SSSs.  .s            .s5SSSs.  .s5SSSs.     " +
                        "\n\t\u001B[38;5;21m'88888 8888X   \"88x: =\"8888f8888r   ud8888.    ^\"*8888N     us888u.  -*8888888  888R Y888r =\"8888f8888r   d8c  \u001B[0m"
                        + "\t\tsS    S%S       SS.       SS.                     SS.              " +
                        "\n\t\u001B[38;5;21m `8888 8888X  X88x.    4888>'88\"  :888'8888.  beWE \"888L .@88 \"8888\"   8888     888R I888>   4888>'88\"  ^*888% \u001B[0m"
                        + "\t\tSS    S%S sS    S%S sS    `:; sS            sS    S%S sS           " +
                        "\n\t\u001B[38;5;21m   `*` 8888X '88888X   4888> '    d888 '88%\"  888E  888E 9888  9888    8888     888R I888>   4888> '      \"8   \u001B[0m"
                        + "\t\tSS    S%S SS    S%S SSSs.     SS            SS    S%S SSSs.        " +
                        "\n\t\u001B[38;5;21m  ~`...8888X  \"88888   4888>      8888.+\"     888E  888E 9888  9888    8888     888R I888>   4888>             \u001B[0m"
                        + "\t\tSS    S%S SS    S%S SS        SS            SS    S%S SS           " +
                        "\n\t\u001B[38;5;21m   x8888888X.   `%8\"  .d888L .+   8888L       888E  888F 9888  9888   .8888Lu= u8888cJ888   .d888L .+      .   \u001B[0m"
                        + "\t\tSS    `:; SS    `:; SS        SS            SS    `:; SS           " +
                        "\n\t\u001B[38;5;21m  '%\"*8888888h.   \"   ^\"8888*\"    '8888c. .+ .888N..888  9888  9888   ^%888*    \"*888*P\"    ^\"8888*\"     .@8c  \u001B[0m"
                        + "\t\tSS    ;,. SS    ;,. SS    ;,. SS    ;,.     SS    ;,. SS           " +
                        "\n\t\u001B[38;5;21m  ~    888888888!`       \"Y\"       \"88888%    `\"888*\"\"   \"888*\"\"888\"    'Y\"       'Y\"          \"Y\"      '%888\" \u001B[0m"
                        + "\t\t;;;;;;;:' `:;;;;;:' `:;;;;;:' `:;;;;;:'     `:;;;;;:' :;           " +
                        "\n\t\u001B[38;5;21m       X888^\"\"\"                      \"YP'        \"\"       ^Y\"   ^Y'                                       ^*   \u001B[0m\u001B[0m"
                        +
                        "\n\t\u001B[38;5;21m       `88f                                                                                                    \u001B[0m"
                        +
                        "\n\t\u001B[38;5;21m        88                                                                                                     \u001B[0m"
                        +
                        "\n\t\u001B[38;5;21m        \"\"                                                                                                     \u001B[0m");
        System.out.print(
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t .s5SSSs.                                                                            \u001B[0m"
                        +
                        "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       SS. .s5SSSs.  .s5ssSs.  s.  .s    s.  .s5SSSs.  .s    s.  .s5SSSs.  .s5SSSs.  "
                        +
                        "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t SS    S%S sS    S%S sS SS S%S S%S sSs.  S%S sS    S%S sSs.  S%S sS    `:; sS    `:; "
                        +
                        "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t SS    S%S SS    S%S SS :; S%S S%S SS `S.S%S SSSs. S%S SS `S.S%S SS        SSSs.     "
                        +
                        "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t SS    S%S SS    S%S SS    S%S S%S SS  `sS%S SS    S%S SS  `sS%S SS        SS        "
                        +
                        "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t SS    `:; SS    `:; SS    `:; `:; SS    `:; SS    `:; SS    `:; SS        SS        \""
                        +
                        "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t SS    ;,. SS    ;,. SS    ;,. ;,. SS    ;,. SS    ;,. SS    ;,. SS    ;,. SS    ;,. \""
                        +
                        "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ;;;;;;;:' `:;;;;;:' :;    ;:' ;:' :;    ;:' :;    ;:' :;    ;:' `:;;;;;:' `:;;;;;:' \n\n\n");
    }

    // Constructor Story1
    Story1 (Player player, Connection conn, DBFunctions db){
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
                "\n╔═╗" + "\t\t\t\t\t\t\t\t\u001B[38;5;196m ╔═╗┬ ┬┬─┐┌─┐┬  ┬┬ ┬┌─┐\u001B[0m" +
                        "\n║ ║" + "\t\t\t\t\t\t\t\t\u001B[38;5;196m ╠═╣│ │├┬┘├┤ │  ││ │└─┐\u001B[0m"
                        + "\t\t\t\t\t\t\u001B[38;5;21m  ╔═╗┌┐ ┌─┐┬┌┬┐┬┌─┐┌┐┌\u001B[0m" +
                        "\n╚═╝" + "nce upon a time, in a mystical realm, a courageous king named"
                        + "\u001B[38;5;196m ╩ ╩└─┘┴└─└─┘┴─┘┴└─┘└─┘\u001B[0m" +
                        " ruled over a vast kingdom." +
                        "\t\t\u001B[38;5;21m  ║ ║├┴┐└─┐│ │││├─┤│││\u001B[0m"
                        + "\nThe land was known for its lush forests, towering mountains, and hidden caves. Within this kingdom lurked a legendary tiger named "
                        +
                        "\u001B[38;5;21m╚═╝└─┘└─┘┴─┴┘┴┴ ┴┘└┘\u001B[0m" +
                        ", \nwhose majestic black fur was said to absorb the moonlight.");
        System.out.println(
                "\n╔═╗" +
                        "\n║ ║" +
                        "\n╚═╝" +
                        "ne fateful day, news spread that Obsidian had been spotted near the outskirts of the kingdom, causing unrest among the people. \nKing Aurelius, known for his valor, decided to confront the mighty tiger and ensure the safety of his realm.");
        System.out.println(
                "\n╦ ╦" +
                        "\n╠═╣" +
                        "\n╩ ╩"
                        + "ere, the tale takes a unique turn. The destiny of the kingdom lies in the hands of the one making choices. \nThe king, demonstrating his strategic prowess, must decide the next steps in this gripping encounter.");
        System.out.println(
                "\u001B[38;5;46m" +
                        "\n╔╗╔╗╔╗  ╔╗ ╔╗     ╔╗ ╔╗           " +
                        "\n║║║║║║  ║║ ║║     ║║ ║║           " +
                        "\n║║║║║║╔╗║║ ║║     ║╚═╝║╔══╗    ╔═╗" +
                        "\n║║║╚╝║╠╣║║ ║║     ║╔═╗║║╔╗║    ╚═╝" +
                        "\n║╚╝  ║║║║╚╗║╚╗    ║║ ║║║║═╣    ╔═╗" +
                        "\n╚════╝╚╝╚═╝╚═╝    ╚╝ ╚╝╚══╝    ╚═╝\u001B[0m\n");
        // A&B
        System.out.println(
                "\n     \\           |   _)                       \\       " + "\t\t\t\t\t\t   |"
                        + "\t\t    \\           |   _)                    __ )     " +
                        "\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    _)" + "\t\t\t\t\t\t   |"
                        + "\t\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\  _) " +
                        "\n   ___ \\   (     |    |  (   |  |   |       ___ \\     "
                        + "\t\t*# Approach the Tiger Directly #*  |"
                        + "\t\t  ___ \\   (     |    |  (   |  |   |      |   |    " + "\t\t*# Invoke Ancient Magic #*"
                        +
                        "\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\  _)" + "\t\t\t\t\t\t   |"
                        + "\t\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _) " +
                        "\n");

        System.out.print("\t\t\t\t\t\t");
        choice = sc.nextLine();// sc.nextLine();
        if (this.choice.equalsIgnoreCase("Approach the Tiger Directly"))
            this.A = true;
        if (this.choice.equalsIgnoreCase("Invoke Ancient Magic"))
            this.B = true;
        nextPartA(A);
        nextPartB(B);
    }



@Override
    void nextPartA(boolean A) {
        while (A) {

            System.out.println("\n\nScore Updated By -->"+a+"\t Latest Score : "+this.Score_Updater(a)+"\n\n");

            System.out.println("\n* The king boldly strides forward to confront Obsidian face-to-face.");
            System.out.println(
                    "\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ " +
                            "\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  " +
                            "\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] " +
                            "\n\t- If the king chooses to approach directly, it sets the stage for a direct confrontation, potentially impacting the initial dynamics between him and Obsidian."
                            +
                            "\n\n");

            // A1 & A2
            System.out.println(
                    "\n     \\           |   _)                       \\   _ |    " + "\t\t\t\t\t   |"
                            + "\t\t     \\           |   _)                       \\    ___ \\     " +
                            "\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    | _) " + "\t\t\t\t\t   |"
                            + "\t\t    _ \\     __|  __|  |   _ \\   __ \\         _ \\      ) | _) " +
                            "\n   ___ \\   (     |    |  (   |  |   |       ___ \\   |    "
                            + "\t\t*# Brute Force #* \t   |"
                            + "\t\t   ___ \\   (     |    |  (   |  |   |       ___ \\    __/     "
                            + "\t\t*# Precision Strikes #*" +
                            "\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _| _)" + "\t\t\t\t\t   |"
                            + "\t\t _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _____| _) ");

            System.out.println(
                    "\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ " +
                            "\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  " +
                            "\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] " +
                            "\n\t- The choice between brute force and precision strikes determines the style of the battle, influencing the overall outcome."
                            +
                            "\n\n");

            System.out.print("\t\t\t\t\t\t");
            choice = sc.nextLine();
            if (this.choice.equalsIgnoreCase("Brute Force"))
                this.A1 = true;
            if (this.choice.equalsIgnoreCase("Precision Strikes"))
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
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ /   " + "\t\t\t Brute Force" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/_(_)  " +
                            "\n                          /____/                 \n");

            System.out.println(
                    "The king delivers a powerful blow that disarms Obsidian. Recognizing the king's valor, the tiger concedes, bowing before Aurelius. United through respect,"
                            +
                            "\nthe king and Obsidian forge an unprecedented alliance, creating a kingdom where humans and mystical creatures coexist in harmony.");
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
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ __/_   " + "\t\t Precision Strikes" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/____(_)  " +
                            "\n                          /____/                   \n");

            System.out.println(
                    "With calculated precision, the king incapacitates Obsidian, leaving the mighty tiger humbled. Realizing the king's mercy, Obsidian chooses to serve as a guardian for the kingdom. The duo becomes legendary,"
                            +
                            "\ntheir tale told for generations as a symbol of diplomacy and strategic prowess.");
            this.TheEnd();
            return false;
        }
        return false;
    }

    @Override
    public void nextPartB(boolean B) {
        while (B) {

            System.out.println("\n\nScore Updated By -->"+b+"\t Latest Score : "+this.Score_Updater(b)+"\n\n");
            
            System.out.println(
                    "\nThe king, aware of ancient enchantments within the kingdom, taps into mystical powers. He invokes spells to either pacify the tiger or enhance his own abilities for the impending confrontation.");
            // B1 & B2
            System.out.println(
                    "\n\n\n     \\           |   _)                    __ ) _ |     " + "\t\t\t\t\t   |"
                            + "\t\t    \\           |   _)                    __ ) ___ \\  " +
                            "\n    _ \\     __|  __|  |   _ \\   __ \\       __ \\   | _)  " + "\t\t\t\t\t   |"
                            + "\t\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\    ) | _)" +
                            "\n   ___ \\   (     |    |  (   |  |   |      |   |  |     "
                            + "\t\t*# Harmony Magic #* \t   |"
                            + "\t\t  ___ \\   (     |    |  (   |  |   |      |   |  __/  "
                            + "\t\t*# Destruction Magic #*" +
                            "\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _| _)  " + "\t\t\t\t\t   |"
                            + "\t\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/ _____| _)");
            System.out.println(
                    "\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ " +
                            "\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  " +
                            "\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] " +
                            "\n\t- The choice between harmony and destruction magic sets the tone for the magical influence on Obsidian and affects the kingdom's fate."
                            +
                            "\n\n");

            System.out.print("\t\t\t\t\t\t");
            choice = sc.nextLine();
            if (this.choice.equalsIgnoreCase("Harmony Magic"))
                this.B1 = true;
            if (this.choice.equalsIgnoreCase("Destruction Magic"))
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
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / /  " + "\t\t\t Harmony Magic" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/_/   " +
                            "\n                          /____/               ");
            System.out.println(
                    "The king delivers a powerful blow that disarms Obsidian. Recognizing the king's valor, the tiger concedes, bowing before Aurelius. United through respect,"
                            +
                            "\nthe king and Obsidian forge an unprecedented alliance, creating a kingdom where humans and mystical creatures coexist in harmony.");
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
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / __/_   " + "\t\t\t Destruction Magic" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/____(_)  " +
                            "\n                          /____/                   ");
            System.out.println(
                    "With calculated precision, the king incapacitates Obsidian, leaving the mighty tiger humbled. Realizing the king's mercy, Obsidian chooses to serve as a guardian for the kingdom. The duo becomes legendary,"
                            +
                            "\ntheir tale told for generations as a symbol of diplomacy and strategic prowess.");
            this.TheEnd();
            return false;
        }
        return false;
    }
}