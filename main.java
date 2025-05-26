import java.io.*;
import java.util.*;

    public class main {

        public static void main(String[] args) {
            String inputFilename = "input.txt";  // Path to your input text file
            String outputFilename = "vowel_count_output.txt";  // Path for the output file

            try {
                countVowelsInFile(inputFilename, outputFilename);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void countVowelsInFile(String inputFilename, String outputFilename) throws IOException {
            // Define the vowels
            String vowels = "aeiouAEIOU";
            int vowelCount = 0;
            int wordsStartingWithVowel = 0;

            // Read the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFilename));
            StringBuilder text = new StringBuilder();
            String line;

            // Reading the file content line by line
            while ((line = reader.readLine()) != null) {
                text.append(line).append(" ");
            }
            reader.close();

            // Split the text into words, remove punctuation
            String[] words = text.toString().replaceAll("[^a-zA-Z ]", "").split("\\s+");

            // Loop through each word
            for (String word : words) {
                // Check if the word starts with a vowel
                if (word.length() > 0 && vowels.indexOf(word.charAt(0)) != -1) {
                    wordsStartingWithVowel++;
                }

                // Count vowels in the word
                for (char c : word.toCharArray()) {
                    if (vowels.indexOf(c) != -1) {
                        vowelCount++;
                    }
                }
            }

            // Write the results to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename));
            writer.write("Vowel count: " + vowelCount + "\n");
            writer.write("Words starting with a vowel: " + wordsStartingWithVowel + "\n");
            writer.close();

            // Print the result on the console as well
            System.out.println("Vowel count: " + vowelCount);
            System.out.println("Words starting with a vowel: " + wordsStartingWithVowel);
            System.out.println("just for change");
            System.out.println("just f change");
            System.out.println("just fr change");
        }
    }


