package com.springernature.codingtests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class App {

    public static void main(String[] args) throws IOException {

        byte[] inputBytes = Files.readAllBytes(Paths.get("src/main/resources/input-file.txt"));

        String str = new String(inputBytes);
        String[] inputWords = str.split(" ");

        StringBuilder stringBuilder1 = new StringBuilder();
        for (String word : inputWords) {
            String newWord = word + "t1 ";
            stringBuilder1.append(newWord);
        }

        byte[] outputBytes = stringBuilder1.toString().getBytes();
        Files.write(Paths.get("src/main/resources/output-file.txt"), outputBytes);

    }
}
