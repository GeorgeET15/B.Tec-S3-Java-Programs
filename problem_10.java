import java.io.*;

public class problem_10 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "TEXT.txt";
        String outputFileName = "CypherText.txt";
        int shift = 3;

        FileReader reader = new FileReader(inputFileName);
        FileWriter writer = new FileWriter(outputFileName);

        int character;
        while ((character = reader.read()) != -1) {
            if (Character.isLetter(character)) {
                char originalChar = (char) character;
                char encryptedChar = encryptChar(originalChar, shift);
                writer.write(encryptedChar);
            } else {
                writer.write(character);
            }
        }

        reader.close();
        writer.close();

        System.out.println("File has been encrypted and saved to " + outputFileName);
    }

    static char encryptChar(char ch, int shift) {
        if (Character.isLowerCase(ch)) {
            return (char) ((ch - 'a' + shift) % 26 + 'a');
        } else if (Character.isUpperCase(ch)) {
            return (char) ((ch - 'A' + shift) % 26 + 'A');
        } else {
            return ch; 
        }
    }
}
