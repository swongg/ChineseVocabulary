package chinesevocabulary;

import java.util.*;

public class UserInterface {

    private Scanner reader;

    private Characters characters;

    private int score;
    
    private Random rand;

    public UserInterface() {

        reader = new Scanner(System.in);

        characters = new Characters();

        score = 0;
        
        rand = new Random();

    }

    public void intro() {
        System.out.println("");
        System.out.println("(>'-')> <('-'<) ^('-')^ v('-')v(>'-')> (^-^)");

        while (true) {
            System.out.println("");
            System.out.println("Welcome to my world.");
            System.out.println("1. Type start to start the game.");
            System.out.println("2. Type show to show a list of characters and their English translations.");
            System.out.println("3. Type add to add a character to the list.");
            System.out.println("4. Type remove to remove a character from the list.");
            System.out.println("5. Type quit to end the game.");
            System.out.println("");

            String ans = reader.nextLine();

            if (ans.equals("start")) {
                start();
                
            }

            if (ans.equals("show")) {
                show();

            }

            if (ans.equals("add")) {
                add();
            }

            if (ans.equals("remove")) {
                remove();

            }

            if (ans.equals("quit")) {
                quit();
                break;
            }

        }

    }

    public void start() {
        System.out.println("\"Instructions: A random Chinese character will populate. Type the English translation of the character. Type quit to "
                + "end the program.\" + \" 祝好运!\"");

        ArrayList<String> keys = new ArrayList<>(characters.getWords().keySet());

        while (true) {
            String randomKey = keys.get(rand.nextInt(keys.size()));
            System.out.println("");

            System.out.println("Please translate this: " + randomKey);

            String ans = reader.nextLine();
            if (ans.equals(characters.getWord(randomKey))) {
                score++;

            } else if (ans.equals("quit")) {
                System.out.println("Thank you for playing. Your score is " + score);
                break;

            } else {
                System.out.println("Thank you for playing. Your score is " + score);
                break;
            }

        }

    }

    public void show() {
        characters.printWords();
        System.out.println("");

    }

    public void add() {
        System.out.println("Write a chinese character.");

        String chin = reader.nextLine();
        System.out.println("Write the english translation.");

        String eng = reader.nextLine();
        characters.getWords().put(chin, eng);

    }

    public void remove() {
        System.out.println("");

        System.out.println("What character do you want to remove?");

        String word = reader.nextLine();

        characters.getWords().remove(word);

    }

    public void quit() {
        System.out.println("再见 :D");

    }

}
