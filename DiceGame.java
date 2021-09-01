import java.util.Scanner;
;public class DiceGame {

    private Die dice;
    private int totalScore = 0;

    DiceGame(){
        dice = new Die();
    }


    public void play(){
        System.out.println("Welcome to The Dice Game!");
        System.out.println("You must Get total of face value more than 10 to Win this Game!!");
        System.out.println("****************************************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        Player playername = new Player();
        playername.setNamePlayer(name);
        System.out.println("Hello " + playername.getNamePlayer());
        
        System.out.println("Input number of Dices: ");
        int numOfDices = scanner.nextInt();

        
        for(int i = 0; i < numOfDices; i++){
            dice.roll();
            int faceValue = dice.getFaceValue();
            System.out.println("Dice " + (i+1)  + " : " + faceValue);
            this.totalScore += faceValue;
            
        }
        System.out.println("Total Face Value: " +  totalScore);

        if(totalScore >= 10){
            System.out.println("You Win");
        }else{
            System.out.println("You Lose");
        }
    }
}