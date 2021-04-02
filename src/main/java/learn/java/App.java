package learn.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Read Input From Console in 2 ways
 * using BufferedReader (faster)
 * using Scanner (slower)
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Read input from console!" );

        //Using Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a name: ");
        String name = scanner.nextLine();
        System.out.println("Input an age: ");
        int age = scanner.nextInt();
        System.out.println("input name: " + name + " & age is: " + age);

        //Using BufferedReader class
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the school name: ");
        String schoolName = bufferedReader.readLine();
        System.out.println("Input the school id: ");
        int schoolId = Integer.parseInt(bufferedReader.readLine());
        System.out.println("input school name is: " + schoolName + " & school id is: " + schoolId);

    }
}
