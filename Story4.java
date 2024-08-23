package CCAO;
import java.sql.Connection;
import java.util.Scanner;


class Story4 extends Stories {
    Scanner sc = new Scanner(System.in);
private Player player;
    // Instance Block4
    {
        System.out.println("\nStory 4");
        System.out.println("\n\u001B[38;5;21m" +
                "\n                         class Story2 extends Stories{\r\n" + //
                                        "\tScanner sc=new Scanner(System.in);\r\n" + //
                                        "//Instance Block2\r\n" + //
                                        "\t\t{\r\n" + //
                                        "\t\tSystem.out.println(\"\\n" + //
                                        "Story 2\\u001B[38;5;129m\"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\tsdSS_SSSSSSbs   .S_SSSs    S.        sSSs          sSSs_sSSs      sSSs        sdSS_SSSSSSbs   .S    S.     sSSs     \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\tYSSS~S%SSSSSP  .SS~SSSSS   SS.      d%%SP         d%%SP~YS%%b    d%%SP        YSSS~S%SSSSSP  .SS    SS.   d%%SP     \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\t     S%S       S%S   SSSS  S%S     d%S'          d%S'     `S%b  d%S'               S%S       S%S    S%S  d%S'       \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\t     S%S       S%S    S%S  S%S     S%S           S%S       S%S  S%S                S%S       S%S    S%S  S%S        \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\t     S&S       S%S SSSS%S  S&S     S&S           S&S       S&S  S&S                S&S       S%S SSSS%S  S&S        \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\t     S&S       S&S  SSS%S  S&S     S&S_Ss        S&S       S&S  S&S_Ss             S&S       S&S  SSS&S  S&S_Ss     \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\t     S&S       S&S    S&S  S&S     S&S~SP        S&S       S&S  S&S~SP             S&S       S&S    S&S  S&S~SP     \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\t     S&S       S&S    S&S  S&S     S&S           S&S       S&S  S&S                S&S       S&S    S&S  S&S        \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\t     S*S       S*S    S&S  S*b     S*b           S*b       d*S  S*b                S*S       S*S    S*S  S*b        \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\t     S*S       S*S    S*S  S*S.    S*S.          S*S.     .S*S  S*S                S*S       S*S    S*S  S*S.       \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\t     S*S       S*S    S*S   SSSbs   SSSbs         SSSbs_sdSSS   S*S                S*S       S*S    S*S   SSSbs     \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\t     S*S       SSS    S*S    YSSP    YSSP          YSSP~YSSY    S*S                S*S       SSS    S*S    YSSP     \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\t     SP               SP                                        SP                 SP               SP              \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "\\t     Y                Y                                         Y                  Y                Y               \\n" + //
                                        "\"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "     sSSs   .S_sSSs      sSSs   .S    S.    .S_SSSs     .S_sSSs    sdSS_SSSSSSbs    sSSs   .S_sSSs            sSSs   .S   .S_sSSs     .S    S.     sSSs   .S_sSSs    \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "    d%%SP  .SS~YS%%b    d%%SP  .SS    SS.  .SS~SSSSS   .SS~YS%%b   YSSS~S%SSSSSP   d%%SP  .SS~YS%%b          d%%SP  .SS  .SS~YS%%b   .SS    SS.   d%%SP  .SS~YS%%b   \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "   d%S'    S%S   `S%b  d%S'    S%S    S%S  S%S   SSSS  S%S   `S%b       S%S       d%S'    S%S   `S%b        d%S'    S%S  S%S   `S%b  S%S    S%S  d%S'    S%S   `S%b  \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "   S%S     S%S    S%S  S%S     S%S    S%S  S%S    S%S  S%S    S%S       S%S       S%S     S%S    S%S        S%S     S%S  S%S    S%S  S%S    S%S  S%S     S%S    S%S  \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "   S&S     S%S    S&S  S&S     S%S SSSS%S  S%S SSSS%S  S%S    S&S       S&S       S&S     S%S    S&S        S&S     S&S  S%S    d*S  S%S SSSS%S  S&S     S%S    d*S  \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "   S&S_Ss  S&S    S&S  S&S     S&S  SSS&S  S&S  SSS%S  S&S    S&S       S&S       S&S_Ss  S&S    S&S        S&S     S&S  S&S   .S*S  S&S  SSS&S  S&S_Ss  S&S   .S*S  \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "   S&S~SP  S&S    S&S  S&S     S&S    S&S  S&S    S&S  S&S    S&S       S&S       S&S~SP  S&S    S&S        S&S     S&S  S&S_sdSSS   S&S    S&S  S&S~SP  S&S_sdSSS   \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "   S&S     S&S    S&S  S&S     S&S    S&S  S&S    S&S  S&S    S&S       S&S       S&S     S&S    S&S        S&S     S&S  S&S~YSSY    S&S    S&S  S&S     S&S~YSY%b   \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "   S*b     S*S    S*S  S*b     S*S    S*S  S*S    S&S  S*S    S*S       S*S       S*b     S*S    d*S        S*b     S*S  S*S         S*S    S*S  S*b     S*S   `S%b  \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "   S*S.    S*S    S*S  S*S.    S*S    S*S  S*S    S*S  S*S    S*S       S*S       S*S.    S*S   .S*S        S*S.    S*S  S*S         S*S    S*S  S*S.    S*S    S%S  \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "    SSSbs  S*S    S*S   SSSbs  S*S    S*S  S*S    S*S  S*S    S*S       S*S        SSSbs  S*S_sdSSS          SSSbs  S*S  S*S         S*S    S*S   SSSbs  S*S    S&S  \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "     YSSP  S*S    SSS    YSSP  SSS    S*S  SSS    S*S  S*S    SSS       S*S         YSSP  SSS~YSSY            YSSP  S*S  S*S         SSS    S*S    YSSP  S*S    SSS  \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "           SP                         SP          SP   SP               SP                                          SP   SP                 SP           SP          \"+\r\n" + //
                                        "\t\t\"\\n" + //
                                        "           Y                          Y           Y    Y                Y                                           Y    Y                  Y            Y           \\u001B[0m\"\r\n" + //
                                        "\t\t);\r\n" + //
                                        "\t\t}\r\n" + //
                                        "\t\t\r\n" + //
                                        "//Constructor Story2\r\n" + //
                                        "\t\tStory2(){\r\n" + //
                                        "\t\t\tSystem.out.println(\"\\n" + //
                                        "\\n" + //
                                        "\\tIn the mystical realm of Eldoria, a land adorned with emerald forests and shimmering lakes, King Alaric ruled with wisdom and benevolence.\\n" + //
                                        "\"+\r\n" + //
                                        "\t\t\t\"\\n" + //
                                        "╦ ╦\"+\r\n" + //
                                        "\t\t\t\"\\n" + //
                                        "╠═╣\"+\r\n" + //
                                        "\t\t\t\"\\n" + //
                                        "╩ ╩\"+\"owever, a mysterious cipher, said to hold the key to ancient powers, began to emerge, casting a veil of uncertainty over the kingdom.\");\r\n" + //
                                        "\t\t\tSystem.out.println(\"\\n" + //
                                        "\\n" + //
                                        "### Prologue: The Whispers of the Cipher\"+\r\n" + //
                                        "\t\t\t\"\\n" + //
                                        "\\tWhispers of the enchanted cipher reached King Alaric's ears. It was said that those who unraveled its secrets could command the very fabric of magic itself.\"+\r\n" + //
                                        "\t\t\t\"\\n" + //
                                        "Eager to ensure the safety of his kingdom, the king embarked on a quest to find the source of the cryptic messages.\\n" + //
                                        "\");\r\n" + //
                                        "\t\t\t//A&B\r\n" + //
                                        "\t\t\tSystem.out.println(\r\n" + //
                                        "\t\t\t\"\\n" + //
                                        "     \\\\           |   _)                       \\\\       \"+\"\\t\\t\\t\\t\\t\\t        |\"+\"\\t    \\\\           |   _)                    __ )     \"+\r\n" + //
                                        "\t\t\t\"\\n" + //
                                        "    _ \\\\     __|  __|  |   _ \\\\   __ \\\\         _ \\\\    _)\"+\"\\t\\t\\t\\t\\t\\t        |\"+\"\\t   _ \\\\     __|  __|  |   _ \\\\   __ \\\\       __ \\\\  _) \"+\r\n" + //
                                        "\t\t\t\"\\n" + //
                                        "   ___ \\\\   (     |    |  (   |  |   |       ___ \\\\     \"+\"\\t\\t*# Journey into the Forgotten Woods #*  |\"+\"\\t  ___ \\\\   (     |    |  (   |  |   |      |   |  \"+\"\\t\\t*# Consult the Oracle #*\"+\r\n" + //
                                        "\t\t\t\"\\n" + //
                                        " _/    _\\\\ \\\\___| \\\\__| _| \\\\___/  _|  _|     _/    _\\\\  _)\"+\"\\t\\t\\t\\t\\t\\t        |\"+\"\\t_/    _\\\\ \\\\___| \\\\__| _| \\\\___/  _|  _|     ____/  _) \"+\r\n" + //
                                        "\t\t\t\"\\n" + //
                                        "\"\r\n" + //
                                        "\t\t\t );\r\n" + //
                                        "\t\t\tSystem.out.println(\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        " \\\\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "--X-- |    |  | |\\\\ | [__  |___ |  | |  | |___ |\\\\ | |    |___ [__  \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        " / \\\\  |___ |__| | \\\\| ___] |___ |_\\\\| |__| |___ | \\\\| |___ |___ ___] \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "\\t- The choice influences the initial challenges and allies the king encounters in his quest.\"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "\\n" + //
                                        "\"); \r\n" + //
                                        "\t\t\tSystem.out.print(\"\\t\\t\\t\\t\\t\\t\");\r\n" + //
                                        "\t\t\tchoice = sc.nextLine();//sc.nextLine();\r\n" + //
                                        "\t\t\t\tif (this.choice.equalsIgnoreCase(\"Journey into the Forgotten Woods\"))\r\n" + //
                                        "\t\t\t\t\tthis.A=true;\r\n" + //
                                        "\t\t\t\tif (this.choice.equalsIgnoreCase(\"Consult the Oracle\"))\r\n" + //
                                        "\t\t\t\t\tthis.B=true;\r\n" + //
                                        "\t\t\tnextPartA(A);\r\n" + //
                                        "\t\t\tnextPartB(B);\r\n" + //
                                        "\t\t}\r\n" + //
                                        "\t\t\r\n" + //
                                        "\t\tvoid nextPartA(boolean A){\r\n" + //
                                        "\t\t\twhile(A){\r\n" + //
                                        "\t\t\t\tSystem.out.println(\"\\n" + //
                                        "* King Alaric decides to explore the mystical, uncharted woods rumored to be the origin of the cipher.\");\r\n" + //
                                        "\t\t\t\tSystem.out.println(\"\\n" + //
                                        "\\n" + //
                                        "* King Alaric ventures into the heart of the forgotten woods, where ancient spirits and magical creatures dwell.\");\r\n" + //
                                        "\t\t\t\t//A1 & A2\r\n" + //
                                        "\t\t\t\tSystem.out.println(\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "     \\\\           |   _)                       \\\\   _ |    \"+\"\\t\\t\\t\\t\\t   |\"+\"\\t     \\\\           |   _)                       \\\\    ___ \\\\     \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "    _ \\\\     __|  __|  |   _ \\\\   __ \\\\         _ \\\\    | _) \"+\"\\t\\t\\t\\t\\t   |\"+\"\\t    _ \\\\     __|  __|  |   _ \\\\   __ \\\\         _ \\\\      ) | _) \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "   ___ \\\\   (     |    |  (   |  |   |       ___ \\\\   |   \"+\"\\t*# Follow the Luminescent  \\t   |\"+\"\\t   ___ \\\\   (     |    |  (   |  |   |       ___ \\\\    __/     \"+\"\\t*# Listen to the Whispering  \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        " _/    _\\\\ \\\\___| \\\\__| _| \\\\___/  _|  _|     _/    _\\\\ _| _)\"+\"\\t\\t Butterflies \\t#*\\t   |\"+\"\\t _/    _\\\\ \\\\___| \\\\__| _| \\\\___/  _|  _|     _/    _\\\\ _____| _) \"+\"\\t\\t Trees #*\"\r\n" + //
                                        "\t\t\t\t);\r\n" + //
                                        "\t\t\t\t\r\n" + //
                                        "\t\t\t\tSystem.out.println(\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        " \\\\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "--X-- |    |  | |\\\\ | [__  |___ |  | |  | |___ |\\\\ | |    |___ [__  \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        " / \\\\  |___ |__| | \\\\| ___] |___ |_\\\\| |__| |___ | \\\\| |___ |___ ___] \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "\\t- The choice determines the nature of the challenges in the woods and the knowledge gained about the cipher.\"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "\\n" + //
                                        "\"\r\n" + //
                                        "\t\t\t\t);\r\n" + //
                                        "\t\t\t\t\r\n" + //
                                        "\t\t\t\tSystem.out.print(\"\\t\\t\\t\\t\\t\\t\");\r\n" + //
                                        "\t\t\t\tchoice=sc.nextLine();\r\n" + //
                                        "\t\t\t\tif (this.choice.equalsIgnoreCase(\"Follow the Luminescent Butterflies\"))\r\n" + //
                                        "\t\t\t\t\tthis.A1=true;\r\n" + //
                                        "\t\t\t\tif (this.choice.equalsIgnoreCase(\"Listen to the Whispering Trees\"))\r\n" + //
                                        "\t\t\t\t\tthis.A2=true;\r\n" + //
                                        "\t\t\t\t\r\n" + //
                                        "\t\t\t\tthis.A1=nextPartA1(A1);\r\n" + //
                                        "\t\t\t\tthis.A2=nextPartA2(A2);\r\n" + //
                                        "\t\t\t\tif(this.A1==false &&this.A2==false)\r\n" + //
                                        "\t\t\t\t\tG.MainMenu();\r\n" + //
                                        "\t\t\t}\r\n" + //
                                        "\t\t}\r\n" + //
                                        "\t\t\tboolean nextPartA1(boolean A1){\r\n" + //
                                        "\t\t\t\twhile(A1){\r\n" + //
                                        "\t\t\t\t\t\r\n" + //
                                        "\t\t\t\t\tSystem.out.println(\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "\\n" + //
                                        "\\n" + //
                                        "    ______          ___                ___   ___ \"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "   / ____/___  ____/ (_)___  ____ _   /   | <  / \"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "  / __/ / __ \\\\/ __  / / __ \\\\/ __ `/  / /| | / (_)\"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        " / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ /   \"+\"\\t\\t\\t Follow the Luminescent Butterflies\"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "/_____/_/ /_/\\\\__,_/_/_/ /_/\\\\__, /  /_/  |_/_(_)  \"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "                          /____/                 \\n" + //
                                        "\"\r\n" + //
                                        "\t\t\t\t\t);\r\n" + //
                                        "\t\t\t\t\t\r\n" + //
                                        "\t\t\t\t\tSystem.out.println(\"Following the butterflies, King Alaric discovers a hidden glade where the cipher reveals itself in a burst of ethereal light.\"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "The butterflies, enchanted protectors of the cipher, pledge their allegiance to the king, granting him their magical guidance.\"\r\n" + //
                                        "\t\t\t\t\t);\r\n" + //
                                        "\t\t\t\t\tthis.TheEnd();\r\n" + //
                                        "\t\t\t\t\treturn false;\r\n" + //
                                        "\t\t\t\t}\t\t\t\r\n" + //
                                        "\t\t\t\treturn false;\r\n" + //
                                        "\t\t\t}\r\n" + //
                                        "\t\t\tboolean nextPartA2(boolean A2){\r\n" + //
                                        "\t\t\t\twhile(A2){\r\n" + //
                                        "\t\t\t\t\tSystem.out.println(\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "\\n" + //
                                        "\\n" + //
                                        "    ______          ___                ___   ___    \"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "   / ____/___  ____/ (_)___  ____ _   /   | |__ \\\\ _ \"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "  / __/ / __ \\\\/ __  / / __ \\\\/ __ `/  / /| | __/ /(_)\"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        " / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ __/_   \"+\"\\t\\t Whispers of the Trees\"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "/_____/_/ /_/\\\\__,_/_/_/ /_/\\\\__, /  /_/  |_/____(_)  \"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "                          /____/                   \\n" + //
                                        "\"\r\n" + //
                                        "\t\t\t\t\t);\r\n" + //
                                        "\t\t\t\t\t\r\n" + //
                                        "\t\t\t\t\tSystem.out.println(\"Listening to the whispering trees, the king gains profound knowledge about the cipher's history.\"+\r\n" + //
                                        "\t\t\t\t\t\"The ancient trees, grateful for his respect, imbue Alaric with their wisdom, becoming allies in his quest.\"\r\n" + //
                                        "\t\t\t\t\t);\r\n" + //
                                        "\t\t\t\t\tthis.TheEnd();\r\n" + //
                                        "\t\t\t\t\treturn false;\r\n" + //
                                        "\t\t\t\t}\r\n" + //
                                        "\t\t\t\treturn false;\r\n" + //
                                        "\t\t\t}\r\n" + //
                                        "\t\t\t\r\n" + //
                                        "\t\tvoid nextPartB(boolean B){\r\n" + //
                                        "\t\t\twhile(B){\r\n" + //
                                        "\t\t\t\tSystem.out.println(\"\\n" + //
                                        "* Seeking guidance, the king visits the ancient oracle, hoping to unravel the secrets through divine wisdom.\");\r\n" + //
                                        "\t\t\t\tSystem.out.println(\"\\n" + //
                                        "* King Alaric seeks counsel from the oracle, a wise and mysterious seer.\");\r\n" + //
                                        "\t\t\t\t//B1 & B2\r\n" + //
                                        "\t\t\t\tSystem.out.println(\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "\\n" + //
                                        "\\n" + //
                                        "     \\\\           |   _)                    __ ) _ |     \"+\"\\t\\t\\t\\t\\t   |\"+\"\\t\\t    \\\\           |   _)                    __ ) ___ \\\\  \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "    _ \\\\     __|  __|  |   _ \\\\   __ \\\\       __ \\\\   | _)  \"+\"\\t\\t\\t\\t\\t   |\"+\"\\t\\t   _ \\\\     __|  __|  |   _ \\\\   __ \\\\       __ \\\\    ) | _)\"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "   ___ \\\\   (     |    |  (   |  |   |      |   |  |     \"+\"\\t   *# Seek a Vision in  \\t   |\"+\"\\t\\t  ___ \\\\   (     |    |  (   |  |   |      |   |  __/  \"+\"\\t\\t*# Interpret the Oracle's \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        " _/    _\\\\ \\\\___| \\\\__| _| \\\\___/  _|  _|     ____/  _| _)  \"+\"\\t\\t the Sacred Pool #*\\t   |\"+\"\\t\\t_/    _\\\\ \\\\___| \\\\__| _| \\\\___/  _|  _|     ____/ _____| _)\"+\"\\t\\t   Dream #*\"\r\n" + //
                                        "\t\t\t\t);\r\n" + //
                                        "\t\t\t\tSystem.out.println(\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        " \\\\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "--X-- |    |  | |\\\\ | [__  |___ |  | |  | |___ |\\\\ | |    |___ [__  \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        " / \\\\  |___ |__| | \\\\| ___] |___ |_\\\\| |__| |___ | \\\\| |___ |___ ___] \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "\\t- \"+\r\n" + //
                                        "\t\t\t\t\"\\n" + //
                                        "\\n" + //
                                        "\"\r\n" + //
                                        "\t\t\t\t);\r\n" + //
                                        "\t\t\t\t\r\n" + //
                                        "\t\t\t\tSystem.out.print(\"\\t\\t\\t\\t\\t\\t\");\r\n" + //
                                        "\t\t\t\tchoice=sc.nextLine();\r\n" + //
                                        "\t\t\t\tif (this.choice.equalsIgnoreCase(\"Seek a Vision in the Sacred Pool\"))\r\n" + //
                                        "\t\t\t\t\tthis.B1=true;\r\n" + //
                                        "\t\t\t\tif (this.choice.equalsIgnoreCase(\"Interpret the Oracle's Dream\"))\r\n" + //
                                        "\t\t\t\t\tthis.B2=true;\r\n" + //
                                        "\t\t\t\t\r\n" + //
                                        "\t\t\t\tthis.B1=nextPartB1(B1);\r\n" + //
                                        "\t\t\t\tthis.B2=nextPartB2(B2);\r\n" + //
                                        "\t\t\t\tif(this.B1==false &&this.B2==false)\r\n" + //
                                        "\t\t\t\t\tG.MainMenu();\r\n" + //
                                        "\t\t\t}\r\n" + //
                                        "\t\t}\r\n" + //
                                        "\t\t\tboolean nextPartB1(boolean B1){\r\n" + //
                                        "\t\t\t\twhile(B1){\r\n" + //
                                        "\t\t\t\t\tSystem.out.println(\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "\\n" + //
                                        "\\n" + //
                                        "    ______          ___                ____ ___\"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "   / ____/___  ____/ (_)___  ____ _   / __ <  /\"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "  / __/ / __ \\\\/ __  / / __ \\\\/ __ `/  / __  / / \"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        " / /___/ / / / /_/ / / / / / /_/ /  / /_/ / /  \"+\"\\t\\t\\t Vision of the Pool\"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "/_____/_/ /_/\\\\__,_/_/_/ /_/\\\\__, /  /_____/_/   \"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "                          /____/               \"\r\n" + //
                                        "\t\t\t\t\t);\r\n" + //
                                        "\t\t\t\t\tSystem.out.println(\"Gazing into the sacred pool, King Alaric sees a vision of the cipher guarded by mystical beings.\"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "The oracle's blessing grants him insight, and a guardian spirit emerges to aid him on his quest.\");\r\n" + //
                                        "\t\t\t\t\tthis.TheEnd();\r\n" + //
                                        "\t\t\t\t\treturn false;\r\n" + //
                                        "\t\t\t\t}\t\t\t\r\n" + //
                                        "\t\t\t\treturn false;\r\n" + //
                                        "\t\t\t}\r\n" + //
                                        "\t\t\tboolean nextPartB2(boolean B2){\r\n" + //
                                        "\t\t\t\twhile(B2){\r\n" + //
                                        "\t\t\t\t\tSystem.out.println(\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "\\n" + //
                                        "\\n" + //
                                        "    ______          ___                ____ ___    \"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "   / ____/___  ____/ (_)___  ____ _   / __ )__ \\\\ _ \"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "  / __/ / __ \\\\/ __  / / __ \\\\/ __ `/  / __  |_/ /(_)\"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        " / /___/ / / / /_/ / / / / / /_/ /  / /_/ / __/_   \"+\"\\t\\t\\t Dreamweaver's Insight\"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "/_____/_/ /_/\\\\__,_/_/_/ /_/\\\\__, /  /_____/____(_)  \"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "                          /____/                   \"\r\n" + //
                                        "\t\t\t\t\t);\r\n" + //
                                        "\t\t\t\t\tSystem.out.println(\"Interpreting the oracle's dream, the king deciphers clues leading him to a hidden temple.\"+\r\n" + //
                                        "\t\t\t\t\t\"\\n" + //
                                        "The dream unveils a guardian creature that pledges allegiance to Alaric, becoming a powerful ally.\");\r\n" + //
                                        "\t\t\t\t\tthis.TheEnd();\r\n" + //
                                        "\t\t\t\t\treturn false;\r\n" + //
                                        "\t\t\t\t}\r\n" + //
                                        "\t\t\t\treturn false;\t\r\n" + //
                                        "\t\t\t}\r\n" + //
                                        "}               ;                                                                                      ;                                                            "
                +
                "\n                                        ED.                                                                             :      ED.                                                          "
                +
                "\n                               ,;       E#Wi                                                                           t#,     E#Wi                          .        .        ,;           "
                +
                "\n           .    .            f#i        E###G.       t           .Gt t                                  i             ;##W.    E###G.                       ;W       ;W      f#i            "
                +
                "\n  GEEEEEEELDi   Dt         .E#t         E#fD#W;      Ej         j#W: Ej GEEEEEEEL         ..           LE            :#L:WE    E#fD#W;     f.     ;WE.     f#E      f#E    .E#t  f.     ;WE."
                +
                "\n  ,;;L#K;;.E#i  E#i       i#W,          E#t t##L     E#,      ;K#f   E#,,;;L#K;;.        ;W,          L#E           .KG  ,#D   E#t t##L    E#,   i#G     .E#f     .E#f    i#W,   E#,   i#G  "
                +
                "\n     t#E   E#t  E#t      L#D.           E#t  .E#K,   E#t    .G#D.    E#t   t#E          j##,         G#W.           EE    ;#f  E#t  .E#K,  E#t  f#f     iWW;     iWW;    L#D.    E#t  f#f   "
                +
                "\n     t#E   E#t  E#t    :K#Wfff;         E#t    j##f  E#t   j#K;      E#t   t#E         G###,        D#K.           f#.     t#i E#t    j##f E#t G#i     L##Lffi  L##Lffi:K#Wfff;  E#t G#i    "
                +
                "\n     t#E   E########f. i##WLLLLt        E#t    :E#K: E#t ,K#f   ,GD; E#t   t#E       :E####,       E#K.            :#G     GK  E#t    :E#K:E#jEW,     tLLG##L  tLLG##L i##WLLLLt E#jEW,     "
                +
                "\n     t#E   E#j..K#j...  .E#L            E#t   t##L   E#t  j#Wi   E#t E#t   t#E      ;W#DG##,     .E#E.              ;#L   LW.  E#t   t##L  E##E.        ,W#i     ,W#i   .E#L     E##E.      "
                +
                "\n     t#E   E#t  E#t       f#E:          E#t .D#W;    E#t   .G#D: E#t E#t   t#E     j###DW##,    .K#E                 t#f f#:   E#t .D#W;   E#G         j#E.     j#E.      f#E:   E#G        "
                +
                "\n     t#E   E#t  E#t        ,WW;         E#tiW#G.     E#t     ,K#fK#t E#t   t#E    G##i,,G##,   .K#D                   f#D#;    E#tiW#G.    E#t       .D#j     .D#j         ,WW;  E#t        "
                +
                "\n     t#E   f#t  f#t         .D#;        E#K##i       E#t       j###t E#t   t#E  :K#K:   L##,  .W#G                     G#t     E#K##i      E#t      ,WK,     ,WK,           .D#; E#t        "
                +
                "\n      fE    ii   ii           tt        E##D.        E#t        .G#t E#t    fE ;##D.    L##, :W##########Wt             t      E##D.       EE.      EG.      EG.              tt EE.        "
                +
                "\n       :                                E#t          ,;.          ;; ,;.     : ,,,      .,,  :,,,,,,,,,,,,,.                   E#t         t        ,        ,                   t          "
                +
                "\n                                        L:                                                                                     L:                                                           \u001B[0m");
    }

    // Constructor Story1
    Story4 (Player player, Connection conn, DBFunctions db){
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
                "\n\tIn a bustling metropolis where skyscrapers kissed the clouds and neon lights painted the streets, there lived a young innovator named Maya."
                        +
                        "\nArmed with her laptop and boundless creativity, Maya navigated the digital landscape of the city, seeking to leave her mark on the world.");
        System.out.println("\n\n### Prologue: The Virtual Frontier" +
                "\n\tAmidst the sea of pixels and algorithms, rumors of a hidden digital realm captured Maya's imagination. Determined to uncover its secrets,"
                +
                "\nshe embarked on a journey through cyberspace, her fingers dancing across the keyboard in anticipation of the adventure that lay ahead.\n");
        // A&B
        System.out.println(
                "\n     \\           |   _)                       \\       " + "\t\t\t\t\t        |"
                        + "\t    \\           |   _)                    __ )     " +
                        "\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    _)" + "\t\t\t\t\t        |"
                        + "\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\  _) " +
                        "\n   ___ \\   (     |    |  (   |  |   |       ___ \\     "
                        + "\t   *# Dive into the Virtual Matrix #*   |"
                        + "\t  ___ \\   (     |    |  (   |  |   |      |   |  " + "\t*# Hack the Data Mainframe #*" +
                        "\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\  _)" + "\t\t\t\t\t        |"
                        + "\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _) " +
                        "\n");
        System.out.println(
                "\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ " +
                        "\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  " +
                        "\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] " +
                        "\n\t- The choice sets the stage for Maya's encounters with virtual challenges and allies in her quest for discovery."
                        +
                        "\n\n");

        System.out.print("\t\t\t\t\t\t : ");
        choice = sc.nextLine();// sc.nextLine();
        if (this.choice.equalsIgnoreCase("Dive into the Virtual Matrix"))
            this.A = true;
        if (this.choice.equalsIgnoreCase("Hack the Data Mainframe"))
            this.B = true;
        nextPartA(A);
        nextPartB(B);
    }

    @Override
    void nextPartA(boolean A) {
        while (A) {
            
            System.out.println("\n\nScore Updated By -->"+a+"\t Latest Score : "+this.Score_Updater(a)+"\n\n");

            System.out.println(
                    "\nMaya chooses to immerse herself in the virtual world, exploring its vast landscapes and encountering digital entities along the way.");
            System.out.println(
                    "\nMaya delves deep into the virtual matrix, her senses heightened by the endless possibilities of the digital realm.");
            // A1 & A2
            System.out.println(
                    "\n     \\           |   _)                       \\   _ |    " + "\t\t\t\t\t   |"
                            + "\t     \\           |   _)                       \\    ___ \\     " +
                            "\n    _ \\     __|  __|  |   _ \\   __ \\         _ \\    | _) " + "\t\t\t\t\t   |"
                            + "\t    _ \\     __|  __|  |   _ \\   __ \\         _ \\      ) | _) " +
                            "\n   ___ \\   (     |    |  (   |  |   |       ___ \\   |   "
                            + "\t*# Befriend the AI Companion #* \t   |"
                            + "\t   ___ \\   (     |    |  (   |  |   |       ___ \\    __/     "
                            + "\t*# Navigate the Cyber Labyrinth  #*" +
                            "\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _| _)" + "\t\t\t\t\t   |"
                            + "\t _/    _\\ \\___| \\__| _| \\___/  _|  _|     _/    _\\ _____| _) ");

            System.out.println(
                    "\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ " +
                            "\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  " +
                            "\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] " +
                            "\n\t- The choice leads to alliances with digital entities or tests of Maya's skills in the virtual domain."
                            +
                            "\n\n");

            System.out.print("\t\t\t\t\t\t : ");
            choice = sc.nextLine();
            if (this.choice.equalsIgnoreCase("Befriend the AI Companion"))
                this.A1 = true;
            if (this.choice.equalsIgnoreCase("Navigate the Cyber Labyrinth"))
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
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ /   " + "\t\t\t Befriend the AI Companion" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/_(_)  " +
                            "\n                          /____/                 \n");

            System.out.println(
                    "* Maya encounters a friendly AI companion, who offers guidance and assistance on her journey through the virtual matrix.");
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
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / ___ |/ __/_   " + "\t\t Follow the Silver Stream" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_/  |_/____(_)  " +
                            "\n                          /____/                   \n");

            System.out.println(
                    "* Maya braves the twists and turns of the cyber labyrinth, relying on her intuition and problem-solving skills to navigate its complex pathways.");
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
                    "\n*Using her coding prowess, Maya hacks into the data mainframe, seeking clues that may lead her to the hidden digital realm.");
            System.out.println(
                    "\nMaya infiltrates the data mainframe, her fingers dancing across the keyboard as she deciphers its digital defenses.");
            // B1 & B2
            System.out.println(
                    "\n\n\n     \\           |   _)                    __ ) _ |     " + "\t\t\t\t\t   |"
                            + "\t\t    \\           |   _)                    __ ) ___ \\  " +
                            "\n    _ \\     __|  __|  |   _ \\   __ \\       __ \\   | _)  " + "\t\t\t\t\t   |"
                            + "\t\t   _ \\     __|  __|  |   _ \\   __ \\       __ \\    ) | _)" +
                            "\n   ___ \\   (     |    |  (   |  |   |      |   |  |     "
                            + "\t   *# Decrypt the Firewall Code    | "
                            + "\t\t  ___ \\   (     |    |  (   |  |   |      |   |  __/  "
                            + "\t\t*# Manipulate the Digital " +
                            "\n _/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/  _| _)  " + "\t\t\t\t\t   |"
                            + "\t\t_/    _\\ \\___| \\__| _| \\___/  _|  _|     ____/ _____| _)"
                            + "\t\t   Security Protocols #*");
            System.out.println(
                    "\n \\ /  ____ ____ _  _ ____ ____ ____ _  _ ____ _  _ ____ ____ ____ " +
                            "\n--X-- |    |  | |\\ | [__  |___ |  | |  | |___ |\\ | |    |___ [__  " +
                            "\n / \\  |___ |__| | \\| ___] |___ |_\\| |__| |___ | \\| |___ |___ ___] " +
                            "\n\t- The choice leads to breakthroughs in Maya's investigation or encounters with digital adversaries seeking to thwart her progress."
                            +
                            "\n\n");

            System.out.print("\t\t\t\t\t\t : ");
            choice = sc.nextLine();
            if (this.choice.equalsIgnoreCase("Decrypt the Firewall Code"))
                this.B1 = true;
            if (this.choice.equalsIgnoreCase("Manipulate the Digital Security Protocols"))
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
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / /  " + "\t\t\t Decrypt the Firewall Code" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/_/   " +
                            "\n                          /____/               ");
            System.out.println(
                    "* Maya focuses her efforts on decrypting the firewall code, using her coding expertise to bypass the mainframe's defenses.");
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
                            "\n / /___/ / / / /_/ / / / / / /_/ /  / /_/ / __/_   "
                            + "\t\t\t Manipulate the Digital  Security Protocols" +
                            "\n/_____/_/ /_/\\__,_/_/_/ /_/\\__, /  /_____/____(_)  " +
                            "\n                          /____/                   ");
            System.out.println(
                    "* Maya employs her social engineering skills to manipulate the digital security protocols, tricking the mainframe into revealing its secrets.");
            this.TheEnd();
            return false;
        }
        return false;
    }
}