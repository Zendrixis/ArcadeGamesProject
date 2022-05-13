package Games;

public class PrizeTerminal {
    public String reward;
    public int rewardValue;
    public int rewardPoints;
    public int warranty;
    public String typeOfGames;

    public PrizeTerminal(String reward,int rewardValue,int rewardPrice,int warranty,String typeOfGames){
        this.reward = reward;
        this.rewardValue = rewardValue;
        this.rewardPoints = rewardPrice;
        this.warranty = warranty;
        this.typeOfGames = typeOfGames;
    }
    //thy price interface
    public String rewardInterface(){
        return "Reward: "+this.reward +"\n"+
                "Reward value is: "+rewardValue+"$\n"+
                "Required points: "+this.rewardPoints+"\n"+
                "The warranty is "+this.warranty+"\n"+
                "Type of games played :"+this.typeOfGames;
    }

    public int getRequiredPoints(){
        return rewardPoints;
    }

}
