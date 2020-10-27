package com.cnunes.titleconverter;

public class TitlecaseConverter {

    public static String convertToTitleCase(String input) {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();

        for (String word : input.split("\\s")) {
            if (word.length() < 4) {
                builder.append(word.toLowerCase());
            } else {
                builder.append(word.substring(0, 1).toUpperCase());
                builder.append(word.substring(1).toLowerCase());
            }
            builder.append(" ");
        }

        return builder.toString();
    }
}
