package com.company;

/**
 * Created by shaun on 01/05/17.
 */
public class Diagram {
    public String drawDiagram(int errors){
        String hangmanDiagram = "";
        switch (errors){
            case 0: hangmanDiagram = "    _________\n" +
                    "    |         |\n" +
                    "    |         \n" +
                    "    |        \n" +
                    "    |        \n" +
                    "    |\n" +
                    "    |";
                break;
            case 1:
                hangmanDiagram = "    _________\n" +
                        "    |         |\n" +
                        "    |         0\n" +
                        "    |        \n" +
                        "    |        \n" +
                        "    |\n" +
                        "    |";
                break;
            case 2:
                hangmanDiagram = "    _________\n" +
                        "    |         |\n" +
                        "    |         0\n" +
                        "    |         |\n" +
                        "    |        \n" +
                        "    |\n" +
                        "    |";
                break;
            case 3:
                hangmanDiagram = "    _________\n" +
                        "    |         |\n" +
                        "    |         0\n" +
                        "    |        /|\n" +
                        "    |        \n" +
                        "    |\n" +
                        "    |";
                break;
            case 4:
                hangmanDiagram = "    _________\n" +
                        "    |         |\n" +
                        "    |         0\n" +
                        "    |        /|\\\n" +
                        "    |        \n" +
                        "    |\n" +
                        "    |";
                break;
            case 5:
                hangmanDiagram = "    _________\n" +
                        "    |         |\n" +
                        "    |         0\n" +
                        "    |        /|\\\n" +
                        "    |        / \n" +
                        "    |\n" +
                        "    |";
                break;
            case 6:
                hangmanDiagram = "    _________\n" +
                        "    |         |\n" +
                        "    |         0\n" +
                        "    |        /|\\\n" +
                        "    |        / \\\n" +
                        "    |\n" +
                        "    |";
                break;

        }
        return hangmanDiagram;
    }
}
