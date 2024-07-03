/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Azinm
 */
import java.util.Random;

public class TortoiseAndHareRace {
    public static void main(String[] args) {
        int tortoisePosition = 1;
        int harePosition = 1;
        
        Random rand = new Random();
        
        System.out.println("ON YOUR MARK, GET SET");
        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");
        
        while (tortoisePosition < 70 && harePosition < 70) {
            int tortoiseMove = rand.nextInt(10) + 1;
            int hareMove = rand.nextInt(10) + 1;
            
            // Tortoise moves
            if (tortoiseMove <= 5) {
                tortoisePosition += 3;
            } else if (tortoiseMove <= 7) {
                tortoisePosition -= 6;
            } else {
                tortoisePosition += 1;
            }
            
            // Hare moves
            if (hareMove <= 2) {
                harePosition += 0;
            } else if (hareMove <= 4) {
                harePosition += 9;
            } else if (hareMove == 5) {
                harePosition -= 12;
            } else if (hareMove <= 8) {
                harePosition += 1;
            } else {
                harePosition -= 2;
            }
            
            // Check for tie
            if (tortoisePosition == harePosition) {
                for (int i = 1; i < tortoisePosition; i++) {
                    System.out.print(" ");
                }
                System.out.println("OUCH!!!");
            } else if (tortoisePosition < harePosition) {
                for (int i = 1; i < tortoisePosition; i++) {
                    System.out.print(" ");
                }
                System.out.print("T");
                for (int i = tortoisePosition + 1; i < harePosition; i++) {
                    System.out.print(" ");
                }
                System.out.println("H");
            } else {
                for (int i = 1; i < harePosition; i++) {
                    System.out.print(" ");
                }
                System.out.print("H");
                for (int i = harePosition + 1; i < tortoisePosition; i++) {
                    System.out.print(" ");
                }
                System.out.println("T");
            }
        }
        
        // Check winner
        if (tortoisePosition >= 70 && harePosition >= 70) {
            System.out.println("It's a tie.");
        } else if (tortoisePosition >= 70) {
            System.out.println("TORTOISE WINS!!! YAY!!!");
        } else {
            System.out.println("Hare wins. Yuch.");
        }
        
                    try{
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
    }
}
