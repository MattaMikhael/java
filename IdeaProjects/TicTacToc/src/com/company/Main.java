package com.company;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String[][] XO = {{"1", "2", "3"},
                         {"4", "5", "6"},
                         {"7","8", "9"}};
        for(int i=1;i<=10;i++) {
            System.out.println("    ______________________");
            System.out.println("    |   " + XO[0][0] + "  |   " + XO[0][1] + "  |   " + XO[0][2] + "  |");
            System.out.println("    ----------------------");
            System.out.println("    |   " + XO[1][0] + "  |   " + XO[1][1] + "  |   " + XO[1][2] + "  |");
            System.out.println("    ----------------------");
            System.out.println("    |   " + XO[2][0] + "  |   " + XO[2][1] + "  |   " + XO[2][2] + "  |");
            System.out.println("    ----------------------");
            System.out.println("_______________________________________");
            if (i>4) {
                if ((XO[0][0] == "X" && XO[0][1] == "X" && XO[0][2] == "X") || (XO[1][0] == "X" && XO[1][1] == "X" && XO[1][2] == "X") ||
                        (XO[2][0] == "X" && XO[2][1] == "X" && XO[2][2] == "X") || (XO[0][0] == "X" && XO[1][0] == "X" && XO[2][0] == "X") ||
                        (XO[0][1] == "X" && XO[1][1] == "X" && XO[2][1] == "X") || (XO[0][2] == "X" && XO[1][2] == "X" && XO[2][2] == "X") ||
                        (XO[0][0] == "X" && XO[1][1] == "X" && XO[2][2] == "X") || (XO[0][2] == "X" && XO[1][1] == "X" && XO[2][0] == "X")) {
                    System.out.println("Congratulations!");
                    System.out.println("Player X is winner!");
                    System.exit(0);
                }
                if ((XO[0][0] == "O" && XO[0][1] == "O" && XO[0][2] == "O") || (XO[1][0] == "O" && XO[1][1] == "O" && XO[1][2] == "O") ||
                        (XO[2][0] == "O" && XO[2][1] == "O" && XO[2][2] == "O") || (XO[0][0] == "O" && XO[1][0] == "O" && XO[2][0] == "O") ||
                        (XO[0][1] == "O" && XO[1][1] == "O" && XO[2][1] == "O") || (XO[0][2] == "O" && XO[1][2] == "O" && XO[2][2] == "O") ||
                        (XO[0][0] == "O" && XO[1][1] == "O" && XO[2][2] == "O") || (XO[0][2] == "O" && XO[1][1] == "O" && XO[2][0] == "O")) {
                    System.out.println("Congratulations!");
                    System.out.println("Player O is winner!");
                    System.exit(0);
                }
            }
            if(i==10){
                System.out.println("Unfortunately!");
                System.out.println("No player won!");
                System.exit(0);
            }
            else {
                Loop: while (true){
                    if (i % 2 == 1) {
                        System.out.println("Player X Please enter number from above");
                        int X = input.nextInt();
                        switch (X) {
                            case 1:
                                if (XO[0][0] == "1") {
                                    XO[0][0] = "X";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 2:
                                if (XO[0][1] == "2") {
                                    XO[0][1] = "X";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 3:
                                if (XO[0][2] == "3") {
                                    XO[0][2] = "X";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 4:
                                if (XO[1][0] == "4") {
                                    XO[1][0] = "X";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 5:
                                if (XO[1][1] == "5") {
                                    XO[1][1] = "X";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 6:
                                if (XO[1][2] == "6") {
                                    XO[1][2] = "X";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 7:
                                if (XO[2][0] == "7") {
                                    XO[2][0] = "X";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 8:
                                if (XO[2][1] == "8") {
                                    XO[2][1] = "X";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 9:
                                if (XO[2][2] == "9") {
                                    XO[2][2] = "X";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            default:
                                System.out.println("Please enter valid number");
                        }
                    } else {
                        System.out.println("Player O Please enter number from above");
                        int X = input.nextInt();
                        switch (X) {
                            case 1:
                                if (XO[0][0] == "1") {
                                    XO[0][0] = "O";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 2:
                                if (XO[0][1] == "2") {
                                    XO[0][1] = "O";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 3:
                                if (XO[0][2] == "3") {
                                    XO[0][2] = "O";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 4:
                                if (XO[1][0] == "4") {
                                    XO[1][0] = "O";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 5:
                                if (XO[1][1] == "5") {
                                    XO[1][1] = "O";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 6:
                                if (XO[1][2] == "6") {
                                    XO[1][2] = "O";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 7:
                                if (XO[2][0] == "7") {
                                    XO[2][0] = "O";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 8:
                                if (XO[2][1] == "8") {
                                    XO[2][1] = "O";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            case 9:
                                if (XO[2][2] == "9") {
                                    XO[2][2] = "O";
                                    break Loop;
                                } else {
                                    System.out.println("This number is already in use!");
                                    continue Loop;
                                }
                            default:
                                System.out.println("Please enter valid number");
                        }
                    }
                }
            }

        }
    }
}