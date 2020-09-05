package tictactoe;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int whichPlayer = 0;
        int checkX = 0;
        int checkO = 0;
        boolean gameOngoing = true;

        System.out.println("---------");
        char[][] twoDimArray = new char[3][3];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                twoDimArray[i][j] = ' ';
                System.out.print(twoDimArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------");

        // game loop
        do {
            System.out.print("Enter the coordinates: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x == 1 && y == 1 && whichPlayer % 2 == 0 && twoDimArray[2][0] == ' ') {
                twoDimArray[2][0] = 'X';
                whichPlayer++;
                for (int i = 0; i < twoDimArray.length; i++) {
                    for (int j = 0; j < twoDimArray.length; j++) {
                        System.out.print(twoDimArray[i][j] + " ");
                    }
                    System.out.println();
                }
            } else if (x == 1 && y == 1 && whichPlayer % 2 != 0 && twoDimArray[2][0] == ' ') {
                twoDimArray[2][0] = 'O';
                whichPlayer++;
                for (int i = 0; i < twoDimArray.length; i++) {
                    for (int j = 0; j < twoDimArray.length; j++) {
                        System.out.print(twoDimArray[i][j] + " ");
                    }
                    System.out.println();
                }
            }


                    if (x == 1 && y == 2 && whichPlayer % 2 == 0 && twoDimArray[1][0] == ' ') {
                        twoDimArray[1][0] = 'X';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else if (x == 1 && y == 2 && whichPlayer % 2 != 0 && twoDimArray[1][0] == ' ') {
                        twoDimArray[1][0] = 'O';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }


                    if (x == 1 && y == 3 && whichPlayer % 2 == 0 && twoDimArray[0][0] == ' ') {
                        twoDimArray[0][0] = 'X';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else if (x == 1 && y == 3 && whichPlayer % 2 != 0 && twoDimArray[0][0] == ' ') {
                        twoDimArray[0][0] = 'O';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }


                    if (x == 2 && y == 1 && whichPlayer % 2 == 0 && twoDimArray[2][1] == ' ') {
                        twoDimArray[2][1] = 'X';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else if (x == 2 && y == 1 && whichPlayer % 2 != 0 && twoDimArray[2][1] == ' ') {
                        twoDimArray[2][1] = 'O';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }


                    if (x == 2 && y == 2 && whichPlayer % 2 == 0 && twoDimArray[1][1] == ' ') {
                        twoDimArray[1][1] = 'X';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else if (x == 2 && y == 2 && whichPlayer % 2 != 0 && twoDimArray[1][1] == ' ') {
                        twoDimArray[1][1] = 'O';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }


                    if (x == 2 && y == 3 && whichPlayer % 2 == 0 && twoDimArray[0][1] == ' ') {
                        twoDimArray[0][1] = 'X';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else if (x == 2 && y == 3 && whichPlayer % 2 != 0 && twoDimArray[0][1] == ' ') {
                        twoDimArray[0][1] = 'O';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }


                    if (x == 3 && y == 1 && whichPlayer % 2 == 0 && twoDimArray[2][2] == ' ') {
                        twoDimArray[2][2] = 'X';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else if (x == 3 && y == 1 && whichPlayer % 2 != 0 && twoDimArray[2][2] == ' ') {
                        twoDimArray[2][2] = 'O';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }

                    if (x == 3 && y == 2 && whichPlayer % 2 == 0 && twoDimArray[1][2] == ' ') {
                        twoDimArray[1][2] = 'X';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else if (x == 3 && y == 2 && whichPlayer % 2 != 0 && twoDimArray[1][2] == ' ') {
                        twoDimArray[1][2] = 'O';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }


                    if (x == 3 && y == 3 && whichPlayer % 2 == 0 && twoDimArray[0][2] == ' ') {
                        twoDimArray[0][2] = 'X';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else if (x == 3 && y == 3 && whichPlayer % 2 != 0 && twoDimArray[0][2] == ' ') {
                        twoDimArray[0][2] = 'O';
                        whichPlayer++;
                        for (int i = 0; i < twoDimArray.length; i++) {
                            for (int j = 0; j < twoDimArray.length; j++) {
                                System.out.print(twoDimArray[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                    //vertical check X
                    if (twoDimArray[2][0] == 'X' && twoDimArray[1][0] == 'X' && twoDimArray[0][0] == 'X') {
                        checkX++;
                    }
                    if (twoDimArray[2][1] == 'X' && twoDimArray[1][1] == 'X' && twoDimArray[0][1] == 'X') {
                        checkX++;
                    }
                    if (twoDimArray[2][2] == 'X' && twoDimArray[1][2] == 'X' && twoDimArray[0][2] == 'X') {
                        checkX++;
                    }
                    // diagonal check X
                    if (twoDimArray[0][0] == 'X' && twoDimArray[1][1] == 'X' && twoDimArray[2][2] == 'X') {
                        checkX++;
                    }
                    if (twoDimArray[0][2] == 'X' && twoDimArray[1][1] == 'X' && twoDimArray[2][0] == 'X') {
                        checkX++;
                    }
                    //vertical check O
                    if (twoDimArray[2][0] == 'O' && twoDimArray[1][0] == 'O' && twoDimArray[0][0] == 'O') {
                        checkO++;
                    }
                    if (twoDimArray[2][1] == 'O' && twoDimArray[1][1] == 'O' && twoDimArray[0][1] == 'O') {
                        checkO++;
                    }
                    if (twoDimArray[2][2] == 'O' && twoDimArray[1][2] == 'O' && twoDimArray[0][2] == 'O') {
                        checkO++;
                    }
                    // diagonal check O
                    if (twoDimArray[0][0] == 'O' && twoDimArray[1][1] == 'O' && twoDimArray[2][2] == 'O') {
                        checkO++;
                    }
                    if (twoDimArray[0][2] == 'O' && twoDimArray[1][1] == 'O' && twoDimArray[2][0] == 'O') {
                        checkO++;
                    }

                    // horizontal check X
                    if (twoDimArray[0][0] == 'X' && twoDimArray[0][1] == 'X' && twoDimArray[0][2] == 'X') {
                        checkX++;
                    }
                    if (twoDimArray[1][0] == 'X' && twoDimArray[1][1] == 'X' && twoDimArray[1][2] == 'X') {
                        checkX++;
                    }
                    if (twoDimArray[2][0] == 'X' && twoDimArray[2][1] == 'X' && twoDimArray[2][2] == 'X') {
                        checkX++;
                    }

                    // horizontal check O
                    if (twoDimArray[0][0] == 'O' && twoDimArray[0][1] == 'O' && twoDimArray[0][2] == 'O') {
                        checkO++;
                    }
                    if (twoDimArray[1][0] == 'O' && twoDimArray[1][1] == 'O' && twoDimArray[1][2] == 'O') {
                        checkO++;
                    }
                    if (twoDimArray[2][0] == 'O' && twoDimArray[2][1] == 'O' && twoDimArray[2][2] == 'O') {
                        checkO++;
                    }

                    if (checkX > checkO) {
                        System.out.println("X wins");
                        gameOngoing = false;
                    } else if (checkX == 0 && checkO == 0 && whichPlayer == 9) {
                        System.out.println("Draw");
                        gameOngoing = false;
                    } else if (checkX < checkO) {
                        System.out.println("O wins");
                        gameOngoing = false;
                    }

                System.out.println("Draw");
                } while (gameOngoing) ;

    }
}
