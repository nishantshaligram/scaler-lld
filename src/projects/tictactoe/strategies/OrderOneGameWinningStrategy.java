package projects.tictactoe.strategies;

import projects.tictactoe.models.Board;
import projects.tictactoe.models.Cell;
import projects.tictactoe.models.Player;
import projects.tictactoe.strategies.gameWinningStrategy.GameWinningStrategy;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {
    private int boardDimension;
    public OrderOneGameWinningStrategy(int boardDimension) {
        this.boardDimension = boardDimension;
    }

    @Override
    public boolean checkWinner(Board board, Player lastPlayedPlayer, Cell lastPlayedCell) {
        //TODO: Implement this
        return false;
    }
}
