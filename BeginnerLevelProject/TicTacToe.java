package BeginnerLevelProject;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Game Structure
        System.out.println();
        System.out.println("========================================");
        System.out.println("     Welcome to my Tic Tac Toe Game");
        System.out.println("========================================");
        System.out.println();

        char[][] GameBoard = new char[3][3];

        // assigning empty values to GameBoard
        for(char i=0;i<3;i++){
            for(char j=0;j<3;j++){
                GameBoard[i][j]=' ';
            }
        }

        char player='X';
        boolean gameOver=false;

        while(!gameOver){

            // Printing Board
            System.out.println("-------------");
            for(int i=0;i<3;i++){
                System.out.print("| ");
                for(int j=0;j<3;j++){
                    System.out.print(GameBoard[i][j]+" | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
            System.out.println();

            // taking input
            System.out.println("Player "+player+" enters their move in row and column: ");
            int r=sc.nextInt();
            int c=sc.nextInt();

            // check move
            if(GameBoard[r][c]==' '){
                GameBoard[r][c]=player;
            }
            else{
                System.out.println("Cell is already taken! Try again");
            }

            System.out.println();
            
            // check win
            if(checkWin(GameBoard,player)==true){
                System.out.println("**************************************************");
                System.out.println("Hurrraaayyyyy !!! Player "+player+" Wins the game!");
                System.out.println("**************************************************");
                gameOver=true;
            }
            else if(isDrawn(GameBoard)==true){
                System.out.println("****************************");
                System.out.println("       Match is Draw!");
                System.out.println("****************************");
            }
            else{
                if(GameBoard[r][c]=='X'){
                    player='O';
                }
                else{
                    player='X';
                }
            }
        }  
    }
    public static boolean checkWin(char[][] arr,char player){
        for(int i=0;i<3;i++){
            if(arr[0][i]==player && arr[1][i]==player && arr[2][i]==player){return true;}
            if(arr[i][0]==player && arr[i][1]==player && arr[i][2]==player){return true;}
        }
        if(arr[0][0]==player && arr[1][1]==player && arr[2][2]==player){return true;}
        if(arr[0][2]==player && arr[1][1]==player && arr[2][0]==player){return true;}
        return false;
    }

    public static boolean isDrawn(char[][] arr){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]==' '){return false;}
            }
        }
        return true;
    }
}