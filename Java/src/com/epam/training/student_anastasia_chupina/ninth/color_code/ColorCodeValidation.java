package com.epam.training.student_anastasia_chupina.ninth.color_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if (color == null) {
            return false;
        }
        Pattern p = Pattern.compile("^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$");
        Matcher m = p.matcher(color);
        boolean b = m.matches();
        return b;
    }
}