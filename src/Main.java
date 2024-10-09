import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Tamagotchi!");

        Scanner keyboard = new Scanner(System.in);
        Tamagotchi Tamagotchi = new Tamagotchi();

        System.out.println("Choose a name for your Tamagotchi:");
        Tamagotchi.name=keyboard.nextLine();
        System.out.println("Nice name!");

        while(Tamagotchi.getAlive() == true){
        Tamagotchi.printStats();
            System.out.println("What do you want to do?");
            System.out.println("1. Teach " + Tamagotchi.name + " a new word");
            System.out.println("2. Talk to " + Tamagotchi.name);
            System.out.println("3. Feed " + Tamagotchi.name);
            System.out.println("4. Do nothing");

            String doWhat = keyboard.nextLine();

            if(doWhat.equals("1")){
                System.out.println("What word do you want to teach your Tamagotchi?");
                String word = keyboard.nextLine();
                Tamagotchi.teach(word);
            }

            else if (doWhat.equals("2")){
                Tamagotchi.speak();
            }

            else if (doWhat.equals("3")){

            }
        }
    }



}