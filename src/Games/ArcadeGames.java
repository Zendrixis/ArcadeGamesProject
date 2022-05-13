package Games;

public class ArcadeGames {

    private String game;
    private int gamePrice;
    private int rewardTickets;

    public ArcadeGames(String game,int gamePrice,int rewardTickets){
        this.game = game;
        this.gamePrice = gamePrice;
        this.rewardTickets = rewardTickets;
    }
    //The game interface
    public String gameInterface(){
        return this.game+"\n"+
                this.gamePrice+"\n"+
                this.rewardTickets;

    }
}
