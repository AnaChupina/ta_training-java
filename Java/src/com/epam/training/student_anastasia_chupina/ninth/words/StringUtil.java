package com.epam.training.student_anastasia_chupina.ninth.words;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Arrays;

public class StringUtil {
    public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample) {
        int amount = 0;
        if (sample == null || words == null || words.length == 0){
            return amount;
        }
        for (String word : words) {
            String str = word;
            str = str.strip();
            sample = sample.strip();
            if (sample.equalsIgnoreCase(str)) {
                amount += 1;
            }
        }
        return amount;
    }
    public static String[] splitWords(String text) {
        if (text == null || text.isEmpty()){
            return null;
        }
        Pattern p = Pattern.compile("\\w");
        Matcher m = p.matcher(text);
        if (!m.find()) {
            return null;
        }
        String [] strings;
        String [] words = text.split("[\\s.,;:?!]+");
        if (words[0].isEmpty()) {
            strings = new String [words.length-1];
            System.arraycopy(words,1,strings,0, strings.length);
            return strings;
        }
        return words;
    }

    public static String convertPath(String path, boolean toWin) {
        if (path == null || path.isEmpty()){
            return null;
        }
        boolean wrongFormat = false;
        Pattern p1 = Pattern.compile("~");
        Matcher m1 = p1.matcher(path);
        boolean isNotAStart = false;
        boolean isItUnix = false;
        while (m1.find()) {
            isItUnix = true;
            if (m1.start() != 0) {
                isNotAStart = true;
            }
        }
        if (isItUnix){
            if (path.indexOf('\\') != -1) {
                wrongFormat = true;
            }
        }
        Pattern p2 = Pattern.compile("C:");
        Matcher m2 = p2.matcher(path);
        boolean isNotAStart2 = false;
        boolean isItWin = false;
        while (m2.find()) {
            isItWin = true;
            if (m2.start() != 0) {
                isNotAStart2 = true;
            }
        }
        if (isItWin){
            if (path.indexOf('/') != -1) {
                wrongFormat = true;
            }
        }
        if (isNotAStart || isNotAStart2) {
            wrongFormat = true;
        }
        if (path.indexOf('/')!=-1 && path.indexOf('\\')!=-1) {
            return null;
        }
        if (wrongFormat) {
            return null;
        }
        String result = path;
        if (toWin) {
            result = result.replaceFirst("~", "C:\\\\User");
            if (result.startsWith("/")){
                result = result.replaceFirst("/", "C:\\\\");
            }
            result = result.replaceAll("/", "\\\\");

        }
        if (!toWin){
            if (result.startsWith("C:\\User")){
                result = result.replaceFirst("C:\\\\User", "~");
            } else if (result.startsWith("C:")) {
                result = result.replaceFirst("C:\\\\", "/");
            }
            result = result.replaceAll("\\\\", "/");
        }
        return result;
    }

    public static String joinWords(String[] words) {
        if (words == null || words.length == 0) {
            return  null;
        }
        int emptyWord = 0;
        StringBuilder builder = new StringBuilder();
        for (String word: words) {
            if (word.length() == 0) {
                emptyWord++;
            } else if (builder.length() != 0) {
                builder.append(", ");
                builder.append(word);
            } else {
                builder.append(word);
            }
        }
        if (emptyWord == words.length) {
            return null;
        }
        String result = builder.toString();
        StringJoiner joiner = new StringJoiner("", "[", "]");
        String res = joiner.add(result).toString();
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Test 1: countEqualIgnoreCaseAndSpaces");
        String[] words = new String[]{" WordS    \t", "words", "w0rds", "WOR  DS", };
        String sample = "words   ";
        int countResult = countEqualIgnoreCaseAndSpaces(words, sample);
        System.out.println("Result: " + countResult);
        int expectedCount = 2;
        System.out.println("Must be: " + expectedCount);

        System.out.println("Test 2: splitWords");
        String text = "   ,, first, second!!!! third";
        String[] splitResult = splitWords(text);
        System.out.println("Result : " + Arrays.toString(splitResult));
        String[] expectedSplit = new String[]{"first", "second", "third"};
        System.out.println("Must be: " + Arrays.toString(expectedSplit));

        System.out.println("Test 3: convertPath");
        String unixPath = "/some/unix/path";
        String convertResult = convertPath(unixPath, true);
        System.out.println("Result: " + convertResult);
        String expectedWinPath = "C:\\some\\unix\\path";
        System.out.println("Must be: " + expectedWinPath);

        System.out.println("Test 4: joinWords");
        String[] toJoin = new String[]{"go", "with", "the", "", "FLOW"};
        String joinResult = joinWords(toJoin);
        System.out.println("Result: " + joinResult);
        String expectedJoin = "[go, with, the, FLOW]";
        System.out.println("Must be: " + expectedJoin);
    }
}