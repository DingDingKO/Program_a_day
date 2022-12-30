package Day71_Java_Practice_9;

public class AvailableCapturesforRook {
    public int numRookCaptures(char[][] board) {
        int rookRow = 0;
        int rookColumn = 0;
        boolean found = false;
        int count = 0;

        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[0].length; column++){
                if(board[row][column] == 'R'){
                    rookRow = row;
                    rookColumn = column;
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }

        for(int i = rookRow; i < board.length; i++){
            if(board[i][rookColumn] == 'p'){
                count++;
                break;
            }
            else if (board[i][rookColumn] == 'B'){
                break;
            }
        }

        for(int i = rookRow; i >= 0; i--){
            if(board[i][rookColumn] == 'p'){
                count++;
                break;
            }
            else if (board[i][rookColumn] == 'B'){
                break;
            }
        }

        for(int i = rookColumn; i >= 0; i--){
            if(board[rookRow][i] == 'p'){
                count++;
                break;
            }
            else if (board[rookRow][i] == 'B'){
                break;
            }
        }

        for(int i = rookColumn; i < board[0].length; i++){
            if(board[rookRow][i] == 'p'){
                count++;
                break;
            }
            else if (board[rookRow][i] == 'B'){
                break;
            }
        }


        return count;


    }
}
