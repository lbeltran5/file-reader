package com.solvd.laba;

// importing necessary libraries
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class FileReader {
    public static void main(String[] args) {
        try {
            // To read the text from the input file
            String textInput = FileUtils.readFileToString(new File("text_to_read.txt"), "UTF-8");

            // To split the text into words
            String[] words = StringUtils.split(textInput);

            // To create a HashSet to store the unique words
            Set<String> uniqueWords = new HashSet<>();

            // To Iterate over each word and add to the HashSet
            for (String word : words) {
                uniqueWords.add(word);
            }

            // To get the number of unique words
            int uniqueWordCount = uniqueWords.size();

            // To write the result into a new file
            FileUtils.writeStringToFile(new File("text_unique_words.txt"), "Unique word count: " + uniqueWordCount, "UTF-8");

            System.out.println("Unique word count: " + uniqueWordCount);
        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
        }
    }
}