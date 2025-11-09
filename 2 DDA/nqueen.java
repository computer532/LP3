public class nqueen {
    static int N = 8;
    static int [] board = new int[N];
    static int totalsolutions = 0;
    public static void main(String[] args) {
        // board[0] = 0;
        solve(0);
        System.out.println("Total Solutions = " + totalsolutions);
    }

    static void solve(int row){
        if (row == N) {
            totalsolutions++;
            print(totalsolutions);
            return;
        }
        for(int col = 0;col<N;col++){
            if (safe(row,col)) {
                board[row] = col;
                solve(row+1);
            }
        }
    }

    static Boolean safe(int row,int col){
        for(int prev = 0;prev<row;prev++){
            if (board[prev] == col) {
                return false;
            }

            if (Math.abs(prev-row) == Math.abs(board[prev]-col)) {
                return false;
            }
          
        }
          return true;
    }

    static void print(int num){
        System.out.println("Solution " + num + ":");
        for(int r = 0;r<N;r++){
            for(int c=0;c<N;c++){
                if (board[r] == c) {
                    System.out.print("Q ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
