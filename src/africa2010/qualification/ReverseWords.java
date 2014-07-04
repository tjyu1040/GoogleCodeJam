package africa2010.qualification;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * GoogleCodeJam created by Timothy on 7/3/2014.
 */
public class ReverseWords {

    public static final String INPUT_FILES_PATH = "InputFiles\\2010\\Africa\\Qualification\\";
    public static final String OUTPUT_FILES_PATH = "OutputFiles\\2010\\Africa\\Qualification\\";

    public void solve(Scanner inputFile, PrintWriter outputFile) {
        String line = inputFile.nextLine();
        String[] words = line.split(" ");

        for (int i = words.length - 1; i > -1; i--) {
            System.out.print(words[i] + " ");
            outputFile.print(words[i] + " ");
        }
        System.out.println();
        outputFile.println();
    }

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = keyboard.nextLine();

        Scanner inputFile = new Scanner(new File(INPUT_FILES_PATH + filename));
        PrintWriter outputFile = new PrintWriter(OUTPUT_FILES_PATH + filename.substring(0, filename.length() - 2) + "out");

        int testCases = inputFile.nextInt();
        for (int testCount = 1; testCount <= testCases; testCount++) {
            System.out.print("Case #" + testCount + ": ");
            outputFile.print("Case #" + testCount + ": ");
            new ReverseWords().solve(inputFile, outputFile);
        }
        outputFile.flush();
        outputFile.close();
        inputFile.close();
    }
}
