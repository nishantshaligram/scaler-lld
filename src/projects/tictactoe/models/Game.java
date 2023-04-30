package projects.tictactoe.models;

import projects.tictactoe.exception.InvalidGameConstructionParameterException;
import projects.tictactoe.strategies.OrderOneGameWinningStrategy;
import projects.tictactoe.strategies.gameWinningStrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameStatus gameStatus;
    private Player winner;
    private int nextPlayerIndex;
    private GameWinningStrategy gameWinningStrategy;

    private Game(){

    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void undo(){

    }

    public Player getWinner() {
        return winner;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    public static class Builder {
        private int dimension;
        private List<Player> players;
        public int getDimension() {
            return dimension;
        }
        public void setDimension(int dimension) {
            this.dimension = dimension;
        }
        public List<Player> getPlayers() {
            return players;
        }
        public void setPlayers(List<Player> players) {
            this.players = players;
        }

        private boolean valid() throws InvalidGameConstructionParameterException {
            if(this.dimension < 3) {
                throw new InvalidGameConstructionParameterException("Dimension of game can't be 1");
            }
            if(this.players.size() != this.dimension-1) {
                throw new InvalidGameConstructionParameterException("Number of players must be Dimension minus 1");
            }

            //TODO: validate that no two players have same character

            //TODO: validate only one player is of type BOT

            return true;
        }

        public Game buid() throws InvalidGameConstructionParameterException {
            try {
                valid();
            }
            catch (Exception e){
                throw new InvalidGameConstructionParameterException();
            }

            Game game = new Game();
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setPlayers(players);
            game.setMoves(new ArrayList<>());
            game.setBoard(new Board(dimension));
            game.setNextPlayerIndex(0);
            game.setGameWinningStrategy(new OrderOneGameWinningStrategy(dimension));

            return game;
        }
    }
}

