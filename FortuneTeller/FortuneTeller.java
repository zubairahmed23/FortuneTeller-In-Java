//Written by Sheikh Zubair Ahmed
import java.util.Scanner;
import java.util.Random;

public class FortuneTeller{
    public static void main(String[]argstell
    ){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter a question:");
        String question = sc.nextLine();
        sc.close();

        String[] predictions = {"Yes", "No", "Ask again later", "Cannot predict now", "Don't count on it", "Most likely", "Outlook not so good", "Signs point to yes", "Definitely not", "Maybe", "Concentrate and ask again", "My sources say no"};
        int randomInt = random.nextInt(12);
        String prediction = predictions[randomInt];

        System.out.println("--------------------------------");
        System.out.println("Question = "+question);
        System.out.println("My Prediction = "+prediction);
        System.out.println("--------------------------------");
    }
}