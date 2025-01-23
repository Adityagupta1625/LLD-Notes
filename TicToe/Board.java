package TicToe;

public class Board {

    private String[][] board;

    public Board() {
        this.board = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.board[i][j] = ".";
            }
        }
    }

    public String[][] getBoard() {
        return board;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setPosition(int row, int col, String piece) {
        this.board[row][col] = piece;
    }

    public String getPosition(int row, int col) {
        return this.board[row][col];
    }

    public Boolean checkWinner(String piece) {
        Boolean isWinner = false;

        for (int i = 0; i < 3; i++) {
            if (this.board[i][0].equals(piece) && this.board[i][1].equals(piece) && this.board[i][2].equals(piece)) {
                isWinner = true;
                break;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (this.board[0][i].equals(piece) && this.board[1][i].equals(piece) && this.board[2][i].equals(piece)) {
                isWinner = true;
                break;
            }
        }

        if (this.board[0][0].equals(piece) && this.board[1][1].equals(piece) && this.board[2][2].equals(piece)) {
            isWinner = true;
        }

        if (this.board[0][2].equals(piece) && this.board[1][1].equals(piece) && this.board[2][0].equals(piece)) {
            isWinner = true;
        }

        return isWinner;
    }

    public void clearBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.board[i][j] = ".";
            }
        }
    }
}
