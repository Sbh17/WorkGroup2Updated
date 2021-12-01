import java.util.Scanner;

public class Exercise7 {
    public static void printBoard(char[]arr){
        int cnt = 0;
        char[][] board = new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                if (cnt == arr.length)
                    break;
                board[i][j]=arr[cnt];
                cnt++;
            }
        }
        for(int i=0;i<3;i++){
            System.out.print("[");
            for(int j=0;j<3;j++){
                if(j<=1)
                    System.out.print(board[i][j]+",");
                else
                    System.out.print(board[i][j]);
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public static boolean isAvailable(char [] chars , int index){
        return chars[index] != 'x' && chars[index] != 'O';
    }

    public static int getPositionFromUser(char [] board , char variable){
        Scanner scanner = new Scanner(System.in);
        int position;
        do{
            System.out.println("Please enter your chosen position");
            position = scanner.nextInt();
            if (position < 1 || position > 9){
                System.out.println("Not a position");
                continue;
            }
            if (isAvailable(board, position -1)){
                return position -1;
            }
            else {
                System.out.println("The position you choose is unavailable");
            }
        }while (true);
    }
    public static char checkWinner(char[] xOBoard) {
        if(((xOBoard[0] == xOBoard[1] && xOBoard[0] == xOBoard[2]) || (xOBoard[0] == xOBoard[3] && xOBoard[0] == xOBoard[6]) || (xOBoard[0] == xOBoard[4] && xOBoard[0] == xOBoard[8])) && xOBoard[0] != '-')
            return xOBoard[0];
        else if ((xOBoard[1] == xOBoard[4] && xOBoard[1] == xOBoard[7]) && xOBoard[1] != '-')
            return xOBoard[1];
        else if ((xOBoard[2] == xOBoard[5] && xOBoard[2] == xOBoard[8]) || (xOBoard[2] == xOBoard[4] && xOBoard[2] == xOBoard[6]))
            return xOBoard[2];
        else if(xOBoard[3] == xOBoard[4] && xOBoard[3] == xOBoard[5])
            return xOBoard[3];
        else if(xOBoard[6] == xOBoard[7] && xOBoard[6] == xOBoard[8])
            return xOBoard[6];

        return '-';
    }
    public static boolean placeVariablesOnBoard(char[] xOBoard ,int position ,char player){
        xOBoard[position] = player;
        printBoard(xOBoard);
        if(checkWinner(xOBoard) == player){
            System.out.println("The Player "+ player + " has won");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        char [] board = {'-', '-', '-' , '-', '-' , '-', '-' , '-', '-'};
        printBoard(board);
        System.out.println();
        boolean theWinner = false;
        char player = 'X';
        do {
            int position = getPositionFromUser(board, player);
            theWinner = placeVariablesOnBoard(board, position, player);

            if(player == 'X'){
                player = 'O';
            } else {
                player = 'X';
            }
        }
        while (!theWinner);
    }
}
