package Games;


public class PayingCards {
    //cad fields/attributes.
    private int balanceCredits;
    private int balanceTickets;
    public int cardNumber;


    public PayingCards(int balance,int tickets,int number){
        this.balanceCredits = balance;
        this.balanceTickets = tickets;
        this.cardNumber = number;

    }

    //getter for card attributes.

    public int getCredits(){
        return balanceCredits;
    }
    public int getBalanceTickets(){
        return balanceTickets;
    }

    //setter for card attributes.

    public void setCreditsMinus(int x){
        this.balanceTickets-=x;
    }
    public void setCreditsPlus(int x){
        this.balanceTickets+=x;
    }
    //show the card current interface
    public String cardInterface(){
        return "Balance: "+this.balanceCredits+"\n"+
                "Ticket Balance: "+ this.balanceTickets+"\n"+
                "Card No: "+this.cardNumber;
    }




}
