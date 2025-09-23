/*
Project- Ashesi premier league
Author- Kofi Ayeh Boampong
ID-82972028
Date- 22/09/2025

*/

import java.util.Scanner;

public class AshesiPremierLeague {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name :");
        String name = input.nextLine();
        System.out.print("Enter age :");
        int age = input.nextInt();
        System.out.print("Enter height :");
        double height_metres = input.nextDouble();
        System.out.print("Enter weight :");
        double weight_lbs = input.nextDouble();
        System.out.print("Enter jersey no. :");
        int jerseyNo = input.nextInt();

        final float Pounds = 0.45359237F;
        final int  Meters = 100;

        float weight_kg = (float) (weight_lbs * Pounds);
        int roundweight_kg = (int) weight_kg ;

        int height_cm = (int) height_metres * Meters;


        boolean eligible = (age >= 18 && age <= 35 && roundweight_kg < 90);

        System.out.println("Eligibility - " + (eligible ? "Eligible" : "Not Eligible"));

        if (!eligible) {
            System.out.println("Eligibility - Not Eligible");
        }

        if (age < 18 || age > 35 || roundweight_kg >= 90) {
            System.out.println("Error (either you are a baby, go to school or too heavy, go to the gym,  or too old,go and marry)");
        }


        String PlayerCategory;

        if (age < 20) PlayerCategory = "Rising Star,That's right";
        else if (age <= 30) PlayerCategory= "Prime Player,Seasoned Maggi";
        else PlayerCategory = "Veteran,OG";

        System.out.println("Player Category - " + PlayerCategory);


        switch (jerseyNo) {
            case 1:
                System.out.println("Position: Goalkeeper");
                break;
            case 2:
            case 5:
                System.out.println("Position: Defender");
                break;
            case 6:
            case 8:
                System.out.println("Position: Midfielder");
                break;
            case 7:
            case 11:
                System.out.println("Position: Winger");
                break;
            case 9:
                System.out.println("Position: Striker");
                break;
            case 10:
                System.out.println("Position: Playmaker");
                break;
            default:
                System.out.println("Player position not known");
        }


        switch (jerseyNo) {
            case 2:
                System.out.println("Position: Defender");
            case 6:
                System.out.println("Position: Midfielder");
            case 7:
                System.out.println("Position: Winger");
                break;
            default:
                System.out.println("Player position not known");
        }

        switch (jerseyNo) {
            case 2: case 5:
                System.out.println("Position: Defender");
                break;
            case 6: case 8:
                System.out.println("Position: Midfielder");
                break;
            case 7: case 11:
                System.out.println("Position: Winger");
                break;
            case 1:
                System.out.println("Position: Goalkeeper");
                break;
            case 9:
                System.out.println("Position: Striker");
                break;
            case 10:
                System.out.println("Position: Playmaker");
                break;
            default:
                System.out.println("Player position not known");
        }

        if (PlayerCategory.contains("Prime Player")) {
            if (roundweight_kg < 80) {
                System.out.println("Decision: Starting Lineup");
            } else {
                System.out.println("Decision: Bench");
            }
        } else {
            System.out.println("Decision: Bench");
        }

        String finalDecision = eligible ? "Play" : "Rest";
        System.out.println("Final Decision: " + finalDecision);


        boolean isAttacker = (jerseyNo == 7 || jerseyNo == 9 || jerseyNo == 10 || jerseyNo == 11);


        int nextYearAge = age;
        nextYearAge++;


        System.out.println("Player Status");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + PlayerCategory + ")");
        System.out.println("Height: " + height_cm + " cm");
        System.out.println("Weight: " + roundweight_kg + " kg");
        System.out.println("Jersey: " + jerseyNo);
        System.out.println("Attacker jersey: " + (isAttacker ? "Yes" : "No"));
        System.out.println("Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
        System.out.println("Final Decision: " + finalDecision);
        System.out.println("Next Year Age (increment demo): " + nextYearAge);


        System.out.println(" Fall-through");
        int demoNumber = 2;
        switch (demoNumber) {
            case 1:
                System.out.println("Case 1 executed");
            case 2:
                System.out.println("Case 2 executed ");
            case 3:
                System.out.println("Case 3 executed ");
            default:
                System.out.println("Default executed ");
        }

    }
}



