package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
                int Number = (int) (Math.random()*200 + 2);
                int Answer = 0;
                System.out.println("The correct guess would be " + Number);
                int count = 1;

                while (Answer != Number)
                {
                    String response = JOptionPane.showInputDialog(null,
                            "Enter a guess between 1 and 200", "Number Guess", 3);
                    Answer = Integer.parseInt(response);
                    JOptionPane.showMessageDialog(null, ""+ determineGuess(Answer, Number, count));
                    count++;
                }
            }

            public static String determineGuess(int Answer, int Number, int count){
                if (Answer <=0 || Answer >200) {
                    return "Your guess is invalid";
                }
                else if (Answer == Number ){
                    return "Correct!\nTotal Guesses: " + count;
                }
                else if (Answer > Number) {
                    return "Your guess is too high, try again.\nTry Number: " + count;
                }
                else if (Answer < Number) {
                    return "Your guess is too low, try again.\nTry Number: " + count;
                }
                else {
                    return "Your guess is incorrect\nTry Number: " + count;
                }
    }
}