public class nqueen{
      public static void main(String args[]){
        int n=2;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              board[i][j]='.';
            }
        }
        nqueenm(board,0);

    }
    public static void nqueenm(char board[][],int rows){
        if(board.length==rows){
         printboard(board);
         return;
        }
        //column loop--
        for(int j=0;j<board.length;j++){
            board[rows][j]='Q';
            nqueenm(board,rows+1);
            board[rows][j]='.';
        }
        
    }
    public static void printboard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}