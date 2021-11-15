package nix.education.java.chatbot;

import java.util.Scanner;

class ChatBot {
    public static void main(String[] args) {
        int reminder3, reminder5, reminder7;
        int age;
        int NumberWant;
        int PossibleAnswer;

        System.out.println("Hello! My name is Anton");
        System.out.println("I was created in 2021 year");
        System.out.println("Please, remind me your name");

        Scanner scanner = new Scanner(System.in);
        String my_name = scanner.next();

        System.out.println("What a great name you have," + my_name);
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        reminder3 = scanner.nextInt();
        reminder5 = scanner.nextInt();
        reminder7 = scanner.nextInt();
        age = (reminder3 * 70 + reminder5 * 21 + reminder7 * 15) % 105;

        System.out.println("Your age is " + age + ";" + "that's good time to start programming!");
        System.out.println("Now I will prove to you that i can count to any number you want");

        NumberWant = scanner.nextInt();

        for (int cI = 0; cI <= NumberWant; cI++) {
            System.out.println(cI + " !");
        }

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Which term is related to polymorphism??");
        System.out.println("1. Static typing");
        System.out.println("2. Dynamic allocation");
        System.out.println("3. Dynamic binding");
        System.out.println("4. Static allocation");

        do {
            PossibleAnswer = scanner.nextInt();
            if(PossibleAnswer == 3){
                System.out.println("Great you are right");
            }
            else{
                System.out.println("Please, try again");
            }
        }while(PossibleAnswer != 3);

        System.out.println("Goodbye, have a nice day");

    }
}