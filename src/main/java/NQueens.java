import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        solveNQueens(4);
    }

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> list = new ArrayList<>();
        func(0, board, list, n);
        return list;
    }

    private static void func(int col, char[][] board, List<List<String>> list, int n){
        if(col == n){
            list.add(construct(board));
            return;
        }
        for(int row=0;row<n;row++){
            if(checkQueen(row, col, board)){
                board[row][col] = 'Q';
                func(col+1, board, list, n);
                board[row][col] = '.';
            }
        }
    }

    private static List<String> construct(char[][] board){
        List<String> res = new LinkedList<>();
        for(int i=0;i<board.length;i++){
            res.add(new String(board[i]));
        }
        return res;
    }

    private static boolean checkQueen(int row, int col, char[][] board){
        int dupRow = row;
        int dupCol = col;
        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = dupRow;
        col = dupCol;
        while(col >= 0){
            if(board[row][col] == 'Q') return false;
            col--;
        }
        row = dupRow;
        col = dupCol;
        while(row < board.length && col >= 0){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true;
    }
}
