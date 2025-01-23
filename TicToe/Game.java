package TicToe;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        PlayingPiece pieceX = new PlayingPieceX();
        PlayingPiece pieceO = new PlayingPieceO();

        Player player1 = new Player("Player 1", pieceX);
        Player player2 = new Player("Player 2", pieceO);

        Board board = new Board();

        Queue<Player> queue = new LinkedList<Player>();
        queue.add(player1);
        queue.add(player2);

        Scanner sc = new Scanner(System.in);

        while (true) {
            Player player = queue.poll();
            board.printBoard();

            System.out.println("Enter q to quit or press enter to continue");
            String input = sc.nextLine();
            if (input.equals("q")) {
                System.out.println("Game Over");
                System.out.println(player.getName() + "Score: " + player.getScore());
                System.out.println(player2.getName() + "Score: " + player2.getScore());
                break;
            }

            System.out.println("Player " + player.getName() + " turn");
            System.out.println("Enter row: ");
            int row = sc.nextInt();

            System.out.println("Enter col: ");
            int col = sc.nextInt();

            if (board.getPosition(row, col) == ".") {
                board.setPosition(row, col, player.getPiece().getPiece().toString());

                if (board.checkWinner(player.getPiece().getPiece().toString())) {
                    board.printBoard();
                    System.out.println(player.getName() + " wins!");
                    player.incrementScore();
                    board.clearBoard();
                }

                queue.add(player);
            } else {
                System.out.println("Invalid move");
                continue;
            }
        }

        sc.close();
    }
}
