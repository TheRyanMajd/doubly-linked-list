package csci2720.dll;

import java.util.Scanner;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        String list = (scan.nextLine());
        try {
            String fileContent = fileToString(file);
            System.out.println("File content as a String:");
            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println( "Hello World!" + list);
    } // main

    public static String fileToString(File file) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        }

        return stringBuilder.toString();
    }

}
