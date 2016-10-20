//GROUP-11
//Yuanliang Qu
//Shlok Dixit
//Yanya Feng
//Deepansh Parab
import javax.swing.*;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.concurrent.Exchanger;

public class TicTacToe extends Exception {
    public static int num = 0;
    public static int ROWS = 0, COLS = 0; // number of rows and columns
    public static int rules = 0;
    public static int counter = 1;
    public static int h = 0;
    public static String[][] board = new String[999][999];
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {//Start of main()
        do {
            num = players();//player number
            ROWS = boardsize();// board size
            COLS = ROWS;
            for (int x = 0; x < ROWS; x++) {//Initialize array
                for (int y = 0; y <= COLS; y++) {
                    board[y][x] = " ";
                }
            }
            rules = rule();           //win sequence count
            judgement(rules, num, ROWS);
        } while (judgement(rules, num, ROWS) != 1);//judgement(rules,num,ROWS)
        
        printBoard();//print the empty board
        int[] s = new int[1];
        //check whether player win or not
        do {
            for (int o = 1; o <= num; o++) {
                s = getLocation(o);
                board[s[0] - 1][s[1] - 1] = symbol(o);
                if (win(s[0] - 1, s[1] - 1, symbol(o)) == 1) {
                    System.out.print("Player " + o + " win!");
                    h = 1;
                    break;
                }
                printBoard();
            }
        } while (h != 1);
    }
    
    public static int players() {//number of players
        System.out.print("The number of players you want : ");
        int num = in.nextInt();  // array index starts at 0 instead of 1
        return num;
    }
    
    public static int boardsize() {//size of board
        System.out.print("How many columns and rows do you want? : ");
        int boardsize = in.nextInt();
        return boardsize;
    }
    
    public static int rule() {//size of board
        System.out.print("What is the win sequence count? : ");
        int rules = in.nextInt();
        return rules;
    }
    
    public static void printBoard() {//print the board
        System.out.print("   ");// print orders of col on the first row
        for (int col = 0; col < COLS; col++) {
            if (col < 8)
                System.out.print(" " + (col + 1) + "  ");
            else if (col <= 99 && col >= 8)
                System.out.print(" " + (col + 1) + " ");
            else
                System.out.print((col + 1) + " ");
        }
        
        System.out.println();//first row end
        
        for (int row = 0; row < ROWS; row++) {//start from the second row: print row orders,space,-,+ and |
            if (row <= 8) {//the orders of row
                System.out.print("  " + (row + 1));
            } else if (row > 8 && row < 99) {
                System.out.print(" " + (row + 1));
            } else
                System.out.print(row + 1);
            
            for (int col = 0; col < ROWS - 1; ++col) {//the board of every column on one row
                System.out.print(" " + board[row][col] + " |");
            }
            System.out.print(" " + board[row][COLS - 1] + " ");
            System.out.println();//end this row(has order)
            System.out.print("   ");
            for (int col = 0; col < ROWS - 1; ++col) {//the board of every column on the '---' row
                System.out.print("---+");
            }
            System.out.print("---");
            System.out.println();//end this row(no order)
        }
    }
    
    //Arraylist to save and store progress of the game in savedata.txt
    public static ArrayList al = new ArrayList();
    
    //getLocation() retrives the input from the players and stores the data in savedata.txt
    //Begin of getLocation()
    
    
    public static int[] getLocation(int player) {
        int[] tmp = new int[2];
        System.out.print("Press -1 to Quit and -9 to save/reload game: ");
        System.out.print("It is player " + player + "'s turn ! ");
        al.add(player);//saving player state in savedata.txt
        System.out.println();
        System.out.print("Which row do you want to put? : ");
        
        int r = in.nextInt();
        //saving player input of row in savedata.txt
        al.add(r);
        //if -1 is entered the GAME QUITS
        if (r == -1) {
            System.out.println("GAME OVER");
            System.exit(0);
        }
        //reload function
        else if (r == -9) {
            reload();
        }
        System.out.print("Which column do you want to put? : ");
        int s = in.nextInt();
        //saving player input of column in savedata.txt
        al.add(s);
        //if -1 is entered the GAME QUITS
        if (s == -1) {
            System.out.println("GAME OVER");
            System.exit(0);
        }
        //reload function
        else if (r == -9) {
            reload();
        }
        
        //Creation of file savedata.txt
        File filename = new File("saveddata.txt");
        //Exception handling while inputting and saving data
        try {
            FileWriter fw = new FileWriter(filename);
            Writer output = new BufferedWriter(fw);
            int sz = al.size();
            for (int i = 0; i < sz; i++) {
                output.write(al.get(i).toString() + "\n");
            }
            output.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cannot create file");
            e.printStackTrace();
        }
        
        tmp[0] = r;
        tmp[1] = s;
        return tmp;
    }
    //end of getLocation()
    
    //To reload game
    public static void reload() {
        File filename = new File("saveddata.txt");
        String line;
        System.out.println("Game reload in progress...");
        try {
            BufferedReader input = new BufferedReader(new FileReader(filename));
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {
                al.add(line);
            }
            input.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        int sz = al.size();
        for (int i = 0; i < sz; i++) {
            System.out.println(al.get(i).toString());
        }
    }
    
    //Begin of judgement()
    public static int judgement(int winnumber, int player, int sizeofboard) {
        if (winnumber > sizeofboard || winnumber < 3) {
            System.out.println("enter error!Please enter again!");
            return -1;
        } else if (player * (winnumber - 1) + 1 > sizeofboard * sizeofboard) {
            System.out.println("enter error!Please enter again!");
            return -1;
        } else return 1;
    }
    // End of judgement()
    
    public static String symbol(int player) {//symbol of players
        switch (player) { // only for the a board
            case 1:
                return "O";
            case 2:
                return "X";
            case 3:
                return "A";
            case 4:
                return "B";
            case 5:
                return "C";
            case 6:
                return "D";
            case 7:
                return "E";
            case 8:
                return "F";
            case 9:
                return "G";
            case 10:
                return "H";
            case 11:
                return "I";
            case 12:
                return "J";
            case 13:
                return "K";
            case 14:
                return "L";
            case 15:
                return "M";
            case 16:
                return "N";
            case 17:
                return "P";
            case 18:
                return "Q";
            case 19:
                return "R";
            case 20:
                return "S";
            case 21:
                return "T";
            case 22:
                return "U";
            case 23:
                return "V";
            case 24:
                return "W";
            case 25:
                return "Y";
            case 26:
                return "Z";
                
        }
        return null;
    }
    
    public static int win(int ROW, int COL, String symbol) {
        //col win
        int deltarow = 0;
        int deltacol = 0;
        if (board[ROW][COL + 1] == symbol) {
            counter++;
            deltarow = 0;
            deltacol = 1;
            next(ROW, COL + 1, deltarow, deltacol, counter, symbol);
        }
        if (COL >= 1)
            if (board[ROW][COL - 1] == symbol) {
                counter++;
                deltarow = 0;
                deltacol = -1;
                next(ROW, COL - 1, deltarow, deltacol, counter, symbol);
            }
        if (counter == rules)
            return 1;
        
        counter = 1;
        deltarow = 0;
        deltacol = 0;
        if (board[ROW + 1][COL] == symbol && ROW >= 0 && COL >= 0) {
            counter++;
            deltarow = 1;
            deltacol = 0;
            next(ROW + 1, COL, deltarow, deltacol, counter, symbol);
        }
        if (ROW >= 1)
            if (board[ROW - 1][COL] == symbol && ROW >= 1 && COL >= 0) {
                counter++;
                deltarow = -1;
                deltacol = 0;
                next(ROW - 1, COL, deltarow, deltacol, counter, symbol);
            }
        if (counter == rules)
            return 1;
        
        counter = 1;
        deltarow = 0;
        deltacol = 0;
        if (board[ROW + 1][COL + 1] == symbol && ROW >= 0 && COL >= 0) {
            counter++;
            deltarow = 1;
            deltacol = 1;
            next(ROW + 1, COL + 1, deltarow, deltacol, counter, symbol);
        }
        if (ROW >= 1 && COL >= 1)
            if (board[ROW - 1][COL - 1] == symbol) {
                counter++;
                deltarow = -1;
                deltacol = -1;
                next(ROW - 1, COL - 1, deltarow, deltacol, counter, symbol);
            }
        if (counter == rules)
            return 1;
        
        counter = 1;
        deltarow = 0;
        deltacol = 0;
        if (ROW >= 1)
            if (board[ROW - 1][COL + 1] == symbol && COL >= 0) {
                counter++;
                deltarow = -1;
                deltacol = 1;
                next(ROW - 1, COL + 1, deltarow, deltacol, counter, symbol);
            }
        if (COL >= 1)
            if (board[ROW + 1][COL - 1] == symbol && ROW >= 0 && COL >= 1) {
                counter++;
                deltarow = 1;
                deltacol = -1;
                next(ROW + 1, COL - 1, deltarow, deltacol, counter, symbol);
            }
        if (counter == rules)
            return 1;
        
        return 0;
        
    }
    
    public static void next(int ROW, int COL, int deltarow, int deltacol, int count, String symbol) {
        if (ROW + deltarow >= 0 && COL + deltacol >= 0)
            if (board[ROW][COL] == board[ROW + deltarow][COL + deltacol]) {
                counter++;
                ROW = ROW + deltarow;
                COL = COL + deltacol;
                next(ROW, COL, deltarow, deltacol, counter, symbol);
            }
    }
}
