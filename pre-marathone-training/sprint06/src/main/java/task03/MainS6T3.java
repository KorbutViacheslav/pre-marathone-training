package task03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainS6T3 {
    public static void main(String[] args) {
        String filePath = "pre-marathone-training/sprint06/src/main/java/task03/files-from-task/output.bin";
        String text = "Hello!";

        File file = new File(filePath);
        file.getParentFile().mkdirs();

        writeFile(filePath, text);

    }

    public static void writeFile(String filename, String text) {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            for (char character : text.toCharArray()) {
                // Convert each character to its 7-bit binary representation
                String binaryRepresentation = String.format("%7s", Integer.toBinaryString(character))
                        .replace(' ', '0');

                // Write the binary representation to the file
                for (char bit : binaryRepresentation.toCharArray()) {
                    fos.write(bit);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
