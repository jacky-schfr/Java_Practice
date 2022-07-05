/* You are a guest on a TV show, where you can win a million by knowing the answer to a multiple choice question with
* 4 possible answers. But this time you don't know the answer at all, so you take your 50% percent joker and try to
* win by simply guessing the right answer. Will you be able to win this round?*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FiftyPercentJoker {
    static Random random = new Random();
    static String choiceString;

    public void fiftyPercent(ArrayList<String> choices, String solutionString){
        int half = choices.size()/2;
        choiceString = choices.get(random.nextInt(choices.size()));
        while (choices.size()!= half){
            int num = random.nextInt(choices.size());
                if (!choices.get(num).equals(solutionString)){
                    choices.remove(num);
                }
            }
        System.out.println("You chose: " + choiceString);
        if (choices.size() > 1){
            System.out.println("Choices left: "+choices);
        }
        else {
            System.out.println("The solution is: "+solutionString);
        }
    }

    public boolean solution(){
        ArrayList<String> choices = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        String solutionString = choices.get(random.nextInt(4));
        boolean win;


        while (choices.size()!= 1){
            fiftyPercent(choices, solutionString);
        }
        if (choices.get(0).equals(choiceString)){
            System.out.println("Congratulations! You win!");
            win = true;
        }
        else{
            System.out.println("You have lost.");
            win = false;
        }
        return win;
    }

    public static void main (String[] args){
        double counter = 0, win = 0, percentage;
        long tries = 1000000;


        FiftyPercentJoker m = new FiftyPercentJoker();

        while (counter<tries){
            counter +=1;
            if(m.solution()){
                win+=1;
            }
        }

        percentage = win/counter;
        System.out.println("After "+tries+" tries, your percentage to win is: "+ percentage);

    }
}
