
package Games;
import java.util.Scanner;


import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {

        PrizeTerminal cash = new PrizeTerminal("Cash reward",20,35,0,"Card Game");
        PayingCards cardOne = new PayingCards(100,50,1);
        PayingCards cardTwo = new PayingCards(100,50,1);


        Scanner menu = new Scanner(System.in);
        System.out.println("Please use the menu below\n"+
                "1 - Enter card number you wish to use \n"+
                "2 - Transfer credits from card to card.");


        int menu1 = menu.nextInt();
        if(menu1==1){
            System.out.println("You choosed reward NO.1");
            cardTwo.setCreditsMinus(cash.getRequiredPoints());
            System.out.println("CardOne current Balance is "+ cardTwo.getBalanceTickets());

        }else if(menu1 == 2){
            System.out.println("Please enter from which card you wish to transfer credits.");
            int cardChoosen = menu.nextInt();
            if(cardChoosen==1){
                int tempCardCredits = cardOne.getBalanceTickets();
                cardTwo.setCreditsPlus(cardOne.getBalanceTickets());
                cardOne.setCreditsMinus(tempCardCredits);
                System.out.println("Card One balance is: "+cardOne.getBalanceTickets()+"\n"+
                        "Card Two balance is: "+ cardTwo.getBalanceTickets());

            }else if(cardChoosen==2){
                int tempCardCredits = cardTwo.getBalanceTickets();
                cardOne.setCreditsPlus(cardTwo.getBalanceTickets());
                cardTwo.setCreditsMinus(tempCardCredits);
                System.out.println("Card One balance is: "+cardOne.getBalanceTickets()+"\n"+
                        "Card Two balance is: "+ cardTwo.getBalanceTickets());
            }
        }






    }
}




