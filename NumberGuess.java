import java.util.Scanner;

public class NumberGuess{
    public static void guessingNumberGame(){
        int i;
        int num_of_trails =5;
        int round=1;
        int your_score=0;
        int computer_score=0;
        System.out.println("A number is chosen between 1 to 100.");
        System.out.println(" Guess the number within 5 trials.");
        while(round<=5){
            System.out.println("******Round "+ round+" Started******");
            Scanner sc = new Scanner(System.in);
            int computer_input = 1 + (int)(100 * Math.random());
            for(i=0; i < num_of_trails; i++){
                System.out.println("Guess the number:");
                int user_input = sc.nextInt();
                
                if (computer_input == user_input){
                    System.out.println("Congratulations! You guessed the number in  round " + round);
                    your_score++;
                    break;
                }else if(computer_input > user_input && i !=num_of_trails - 1) {
                    System.out.println("The number is "+ "greater than " + user_input); 
                    computer_score++;
                }else if (computer_input < user_input && i !=num_of_trails - 1) {
                    computer_score++;
                    System.out.println("The number is"+ " less than " + user_input);
                }
            }
            if(i==num_of_trails){
                System.out.println("You lost!! .You have exhausted all the trials in round "+round);
                System.out.println("The number was " + computer_input);
            }
            round++;  
            System.out.println();
        }
        System.out.println("your score is: "+your_score+ " and Computer score is: "+computer_score);
        
	}

	public static void main(String arg[]){
		guessingNumberGame();
	}
}
