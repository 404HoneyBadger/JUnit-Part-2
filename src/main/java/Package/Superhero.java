package Package;


import java.util.Scanner;

public class Superhero {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero");
        System.out.println("Who is the hero of our story?");
        String name = scanner.nextLine();
        System.out.println("What is their superpower?");
        String power = scanner.nextLine();
        System.out.println("Here is the story:");
        storyStart(name, power);
        storyMiddle(name);
        storyEnding(name, power);

    }

    public static String storyStart(String name, String power){
        return "There once was a superhero named " + name +", who had the power of " + power +".";
    }
    public static String storyMiddle(String name){
        return "As they grew older, " + name + " saw that the world needed them.";

    }
    public static String storyEnding(String name, String power){
        return name + " used their ability to " + power + " to save the world";

    }

}