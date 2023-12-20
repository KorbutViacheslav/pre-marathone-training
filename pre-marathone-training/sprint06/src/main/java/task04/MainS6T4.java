package task04;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class MainS6T4 {
    public static void main(String[] args) {
        String filePath = "pre-marathone-training/sprint06/src/main/java/task03/files-from-task/output.bin";
        // Read from file
        String readText = readFile(filePath);
        System.out.println("Text read from file: " + readText);
        //System.out.println(binaryToText(readText));

    }

    /*//Method for reading from a file
    public static String readFile(String filePath) {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            return new String(bytes, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //Method for converted 7-bit to text
    public static String binaryToText(String binaryData) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < binaryData.length(); i += 7) {
            String binaryChar = binaryData.substring(i, Math.min(i + 7, binaryData.length()));
            int charValue = Integer.parseInt(binaryChar, 2);
            text.append((char) charValue);
        }
        return text.toString();
    }*/

    /**
     * New best solution from gpt
     */
    // Method for reading from a file
    public static String readFile(String filePath) {
        try {
            String binaryText = new String(Files.readAllBytes(Paths.get(filePath)), "UTF-8");
            return Pattern.compile(".{7}").matcher(binaryText)
                    .replaceAll(m -> String.valueOf((char) Integer.parseInt(m.group(), 2)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
