package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class a {
    public static final class androidx.core.text.a.a {
        private boolean a;
        private int b;
        private o c;

        public androidx.core.text.a.a() {
            this.c(a.e(Locale.getDefault()));
        }

        public a a() {
            return this.b != 2 || this.c != a.d ? new a(this.a, this.b, this.c) : androidx.core.text.a.a.b(this.a);
        }

        // 去混淆评级： 低(20)
        private static a b(boolean z) {
            return z ? a.h : a.g;
        }

        private void c(boolean z) {
            this.a = z;
            this.c = a.d;
            this.b = 2;
        }
    }

    static class b {
        private final CharSequence a;
        private final boolean b;
        private final int c;
        private int d;
        private char e;
        private static final byte[] f;

        static {
            b.f = new byte[0x700];
            for(int v = 0; v < 0x700; ++v) {
                b.f[v] = Character.getDirectionality(v);
            }
        }

        b(CharSequence charSequence0, boolean z) {
            this.a = charSequence0;
            this.b = z;
            this.c = charSequence0.length();
        }

        byte a() {
            char c = this.a.charAt(this.d - 1);
            this.e = c;
            if(Character.isLowSurrogate(c)) {
                int v = Character.codePointBefore(this.a, this.d);
                this.d -= Character.charCount(v);
                return Character.getDirectionality(v);
            }
            --this.d;
            byte b = b.c(this.e);
            if(this.b) {
                int v1 = this.e;
                if(v1 == 62) {
                    return this.h();
                }
                return v1 == 59 ? this.f() : b;
            }
            return b;
        }

        byte b() {
            char c = this.a.charAt(this.d);
            this.e = c;
            if(Character.isHighSurrogate(c)) {
                int v = Character.codePointAt(this.a, this.d);
                this.d += Character.charCount(v);
                return Character.getDirectionality(v);
            }
            ++this.d;
            byte b = b.c(this.e);
            if(this.b) {
                int v1 = this.e;
                if(v1 == 60) {
                    return this.i();
                }
                return v1 == 38 ? this.g() : b;
            }
            return b;
        }

        private static byte c(char c) {
            return c >= 0x700 ? Character.getDirectionality(c) : b.f[c];
        }

        int d() {
            this.d = 0;
            int v = 0;
            int v1 = 0;
            int v2 = 0;
            while(0 < this.c && v == 0) {
                int v3 = this.b();
            alab1:
                switch(v3) {
                    case 0: {
                    label_20:
                        if(v2 == 0) {
                            return -1;
                        }
                        break;
                    }
                    case 1: {
                    label_22:
                        if(v2 == 0) {
                            return 1;
                        }
                        break;
                    }
                    default: {
                        if(v3 == 2) {
                            goto label_22;
                        }
                        else {
                            if(v3 == 9) {
                                continue;
                            }
                            switch(v3) {
                                case 14: 
                                case 15: {
                                    ++v2;
                                    v1 = -1;
                                    continue;
                                }
                                case 16: 
                                case 17: {
                                    ++v2;
                                    v1 = 1;
                                    continue;
                                }
                                case 18: {
                                    --v2;
                                    v1 = 0;
                                    continue;
                                }
                                default: {
                                    break alab1;
                                }
                            }
                        }
                        goto label_20;
                    }
                }
                v = v2;
            }
            if(v == 0) {
                return 0;
            }
            return v1 == 0 ? 0 : v1;
        }

        int e() {
            this.d = this.c;
            int v = 0;
        alab1:
            while(true) {
                int v1 = v;
            label_3:
                if(this.d <= 0) {
                    return 0;
                }
                switch(this.a()) {
                    case 0: {
                        if(v == 0) {
                            return -1;
                        }
                        if(v1 != 0) {
                            goto label_3;
                        }
                        break;
                    }
                    case 1: 
                    case 2: {
                        if(v == 0) {
                            return 1;
                        }
                        if(v1 != 0) {
                            goto label_3;
                        }
                        break;
                    }
                    case 9: {
                        goto label_3;
                    }
                    case 14: 
                    case 15: {
                        break alab1;
                    }
                    case 16: 
                    case 17: {
                        goto label_17;
                    }
                    case 18: {
                        ++v;
                        goto label_3;
                    }
                    default: {
                        if(v1 != 0) {
                            goto label_3;
                        }
                    }
                }
            }
            if(v1 == v) {
                return -1;
            label_17:
                if(v1 == v) {
                    return 1;
                }
            }
            --v;
            goto label_3;
        }

        private byte f() {
            int v = this.d;
            do {
                int v1 = this.d;
                if(v1 <= 0) {
                    break;
                }
                this.d = v1 - 1;
                char c = this.a.charAt(v1 - 1);
                this.e = c;
                if(c == 38) {
                    return 12;
                }
            }
            while(c != 59);
            this.d = v;
            this.e = ';';
            return 13;
        }

        private byte g() {
            do {
                int v = this.d;
                if(v >= this.c) {
                    break;
                }
                this.d = v + 1;
                char c = this.a.charAt(v);
                this.e = c;
            }
            while(c != 59);
            return 12;
        }

        private byte h() {
            int v = this.d;
        alab1:
            while(true) {
            alab2:
                while(true) {
                    int v1 = this.d;
                    if(v1 <= 0) {
                        break alab1;
                    }
                    this.d = v1 - 1;
                    char c = this.a.charAt(v1 - 1);
                    this.e = c;
                    if(c == 60) {
                        return 12;
                    }
                    switch(c) {
                        case 34: 
                        case 39: {
                        label_10:
                            int v2 = this.d;
                            if(v2 <= 0) {
                                continue alab1;
                            }
                            this.d = v2 - 1;
                            char c1 = this.a.charAt(v2 - 1);
                            this.e = c1;
                            if(c1 == c) {
                                break;
                            }
                            break alab2;
                        }
                        case 62: {
                            break alab1;
                        }
                    }
                }
                goto label_10;
            }
            this.d = v;
            this.e = '>';
            return 13;
        }

        private byte i() {
            int v2;
            int v = this.d;
        alab1:
            while(true) {
                do {
                    do {
                        int v1 = this.d;
                        if(v1 >= this.c) {
                            break alab1;
                        }
                        this.d = v1 + 1;
                        char c = this.a.charAt(v1);
                        this.e = c;
                        if(c == 62) {
                            return 12;
                        }
                        if(c != 34 && c != 39) {
                            continue alab1;
                        }
                    label_9:
                        v2 = this.d;
                    }
                    while(v2 >= this.c);
                    this.d = v2 + 1;
                    char c1 = this.a.charAt(v2);
                    this.e = c1;
                }
                while(c1 == c);
                goto label_9;
            }
            this.d = v;
            this.e = '<';
            return 13;
        }
    }

    private final boolean a;
    private final int b;
    private final o c;
    static final o d;
    private static final String e;
    private static final String f;
    static final a g;
    static final a h;

    static {
        a.d = p.c;
        a.e = "‎";
        a.f = "\u200F";
        a.g = new a(false, 2, p.c);
        a.h = new a(true, 2, p.c);
    }

    a(boolean z, int v, o o0) {
        this.a = z;
        this.b = v;
        this.c = o0;
    }

    private static int a(CharSequence charSequence0) {
        return new b(charSequence0, false).d();
    }

    private static int b(CharSequence charSequence0) {
        return new b(charSequence0, false).e();
    }

    public static a c() {
        return new androidx.core.text.a.a().a();
    }

    public boolean d() {
        return (this.b & 2) != 0;
    }

    static boolean e(Locale locale0) {
        return q.a(locale0) == 1;
    }

    // 去混淆评级： 低(20)
    private String f(CharSequence charSequence0, o o0) {
        boolean z = o0.a(charSequence0, 0, charSequence0.length());
        if(!this.a && (z || a.b(charSequence0) == 1)) {
            return "‎";
        }
        return !this.a || z && a.b(charSequence0) != -1 ? "" : "\u200F";
    }

    // 去混淆评级： 低(20)
    private String g(CharSequence charSequence0, o o0) {
        boolean z = o0.a(charSequence0, 0, charSequence0.length());
        if(!this.a && (z || a.a(charSequence0) == 1)) {
            return "‎";
        }
        return !this.a || z && a.a(charSequence0) != -1 ? "" : "\u200F";
    }

    public CharSequence h(CharSequence charSequence0) {
        return this.i(charSequence0, this.c, true);
    }

    public CharSequence i(CharSequence charSequence0, o o0, boolean z) {
        if(charSequence0 == null) {
            return null;
        }
        boolean z1 = o0.a(charSequence0, 0, charSequence0.length());
        CharSequence charSequence1 = new SpannableStringBuilder();
        if(this.d() && z) {
            ((SpannableStringBuilder)charSequence1).append(this.g(charSequence0, (z1 ? p.b : p.a)));
        }
        if(z1 == this.a) {
            ((SpannableStringBuilder)charSequence1).append(charSequence0);
        }
        else {
            ((SpannableStringBuilder)charSequence1).append(((char)(z1 ? 0x202B : 0x202A)));
            ((SpannableStringBuilder)charSequence1).append(charSequence0);
            ((SpannableStringBuilder)charSequence1).append('‬');
        }
        if(z) {
            ((SpannableStringBuilder)charSequence1).append(this.f(charSequence0, (z1 ? p.b : p.a)));
        }
        return charSequence1;
    }

    public String j(String s) {
        return this.k(s, this.c, true);
    }

    public String k(String s, o o0, boolean z) {
        return s == null ? null : this.i(s, o0, z).toString();
    }
}

