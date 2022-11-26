/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalpoo;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;

/**
 *
 * @author Sammy
 */
public class Write_File {

    public static void writef(String Nombre, String Cedula, String Telefono) {
        try {
            File f = new File("src/users.csv");
            if (f.createNewFile()) {
                System.out.println("File Created");
                FileWriter w = new FileWriter("src/users.csv", true);
                w.write(Nombre + ";" + Cedula + ";" + Telefono + ";\n");
                System.out.println("File Written");
                w.close();
            } else {
                FileWriter w = new FileWriter("src/users.csv", true);
                w.write(Nombre + ";" + Cedula + ";" + Telefono + ";\n");
                System.out.println("File Written");
                w.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void deleteline(String Nombre, String Cedula, String Telefono) {
        try {
            File inputFile = new File("src/users.csv");
            File tempFile = new File("src/tmp.csv");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String lineToRemove = Nombre+";"+Cedula+";"+Telefono+";";
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                // trim newline when comparing with lineToRemove
                String trimmedLine = currentLine.trim();
                if (trimmedLine.equals(lineToRemove)) {
                    continue;
                }
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            boolean successful = tempFile.renameTo(inputFile);

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
