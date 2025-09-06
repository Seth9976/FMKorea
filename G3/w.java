package G3;

import D3.d;
import java.util.NoSuchElementException;
import z3.k;

abstract class w extends v {
    public static final String h0(String s, int v) {
        k.e(s, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested character count " + v + " is less than zero.").toString());
        }
        String s1 = s.substring(d.b(v, s.length()));
        k.d(s1, "substring(...)");
        return s1;
    }

    public static char i0(CharSequence charSequence0) {
        k.e(charSequence0, "<this>");
        if(charSequence0.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence0.charAt(u.z(charSequence0));
    }
}

