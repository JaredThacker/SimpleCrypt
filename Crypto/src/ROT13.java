import java.util.Arrays;
import java.util.List;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13 {
    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder shifted = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char charToShift = text.charAt(i);
            if (charToShift >= 'a' && charToShift <= 'm') {
                charToShift += 13;
            } else if (charToShift >= 'A' && charToShift <= 'M') {
                charToShift += 13;
            } else if (charToShift >= 'n' && charToShift <= 'z') {
                charToShift -= 13;
            } else if (charToShift >= 'N' && charToShift <= 'Z') {
                charToShift -= 13;
            }
            shifted.append(charToShift);
        }
        return shifted.toString();
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        StringBuilder rotated = new StringBuilder();
        String rightHalf = s.substring(s.indexOf(c));
        String leftHalf = s.substring(0, s.indexOf(c));
        return rotated.append(rightHalf).append(leftHalf).toString();
    }
}
