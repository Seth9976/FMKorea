package O0;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import b1.a;

public abstract class d {
    private static boolean a(TextView textView0) {
        Class class0 = d.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            String s = f.k(textView0).replaceAll("\\s", "");
            int v = s.length();
            if(v >= 12 && v <= 19) {
                int v1 = v - 1;
                int v2 = 0;
                int v3 = 0;
                while(v1 >= 0) {
                    int v4 = s.charAt(v1);
                    if(v4 < 0x30 || v4 > 57) {
                        return false;
                    }
                    int v5 = v4 - 0x30;
                    if(v3 != 0) {
                        v5 *= 2;
                        if(v5 > 9) {
                            v5 = v5 % 10 + 1;
                        }
                    }
                    v2 += v5;
                    v3 ^= 1;
                    --v1;
                }
                return v2 % 10 == 0;
            }
            return false;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return false;
    }

    private static boolean b(TextView textView0) {
        Class class0 = d.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            if(textView0.getInputType() == 0x20) {
                return true;
            }
            String s = f.k(textView0);
            return s == null || s.length() == 0 ? false : Patterns.EMAIL_ADDRESS.matcher(s).matches();
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return false;
        }
    }

    private static boolean c(TextView textView0) {
        Class class0 = d.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            return textView0.getInputType() == 0x80 ? true : textView0.getTransformationMethod() instanceof PasswordTransformationMethod;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return false;
        }
    }

    private static boolean d(TextView textView0) {
        Class class0 = d.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            if(textView0.getInputType() == 0x60) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
        return false;
    }

    private static boolean e(TextView textView0) {
        Class class0 = d.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            if(textView0.getInputType() == 3) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
        return false;
    }

    private static boolean f(TextView textView0) {
        Class class0 = d.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            if(textView0.getInputType() == 0x70) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
        return false;
    }

    public static boolean g(View view0) {
        Class class0 = d.class;
        if(a.d(class0)) {
            return false;
        }
        try {
            if(view0 instanceof TextView && (d.c(((TextView)view0)) || d.a(((TextView)view0)) || d.d(((TextView)view0)) || d.f(((TextView)view0)) || d.e(((TextView)view0)) || d.b(((TextView)view0)))) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
        return false;
    }
}

