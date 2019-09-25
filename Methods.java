package com.company;

public class Methods {

   public static void main (String[] args) {
       String playerName;

       int highScoreTablePosition = calculateHighScorePosition(1500);
       displayHighScorePosition("David", highScoreTablePosition);

       highScoreTablePosition = calculateHighScorePosition(900);
       displayHighScorePosition("Tomas", highScoreTablePosition);

       highScoreTablePosition = calculateHighScorePosition(400);
       displayHighScorePosition("Luis", highScoreTablePosition);

       highScoreTablePosition = calculateHighScorePosition(50);
       displayHighScorePosition("Carlos", highScoreTablePosition);

   }

   public static void displayHighScorePosition (String playerName, int highScoreTablePosition) {
       System.out.println(playerName + " managed to get into position " + highScoreTablePosition + " on the high score table");
   }

   public static int calculateHighScorePosition (int playerScore) {
       if (playerScore > 1000){
           return 1;
       } else if (playerScore > 500 && playerScore < 1000){
           return 2;
       } else if (playerScore > 100 && playerScore < 500){
           return 3;
       }
       return 4;
   }
}
