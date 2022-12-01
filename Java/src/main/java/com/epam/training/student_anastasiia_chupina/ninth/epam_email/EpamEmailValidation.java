package com.epam.training.student_anastasiia_chupina.ninth.epam_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    public static boolean validateEpamEmail(String email) {
        if (email == null) {
            return false;
        }
        Pattern p = Pattern.compile("\\b[a-zA-Z]+_[a-zA-Z]+[1-9]?@epam\\.com\\b");
        Matcher m = p.matcher(email);
        boolean b = m.matches();
        return b;
    }
}
