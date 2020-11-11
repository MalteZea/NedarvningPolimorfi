package Main;
import Fruits.*;
import Vegetables.*;
import Flowers.*;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Persistens {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Velkommen til Grøntorvets lagersystem");
        System.out.println("Indlæser data...");

        Persistens p = new Persistens();
        p.save();
        //p.load();
    }

        public void save () throws FileNotFoundException {
            java.io.File file = new java.io.File("data/varer.txt");
            // Create a file
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            Lager lager = new Lager();
            lager.fyldOp();
            for (Varer element : lager.vareLager) {
                output.println(element);
            }

            // Write formatted output to the file
            output.print("Bønner ");
            output.println(10);
            output.print("Æbler ");
            output.println(20);
            output.print("Roser");
            output.println(25);


            // Close the file
            output.close();
        }
    /*public void load() throws FileNotFoundException {
        // Create a File instance
        java.io.File file = new java.io.File("data/varer.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read data from a file
        while (input.hasNext()) {
            String vare = input.next();
            int antal = input.nextInt();
            System.out.println(
                    vare + " " + antal);
        }
        // Close the file
        input.close();
    }*/
    }