package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.Arrays;
import java.util.Set;

final class i {
    static abstract class a {
        static int a(CharSequence charSequence0, int v, int v1) {
            boolean z;
            if(v < 0 || charSequence0.length() < v || v1 < 0) {
                return -1;
            }
            while(true) {
                z = false;
            label_3:
                if(v1 == 0) {
                    return v;
                }
                --v;
                if(v < 0) {
                    return z ? -1 : 0;
                }
                int v2 = charSequence0.charAt(v);
                if(!z) {
                    break;
                }
                if(!Character.isHighSurrogate(((char)v2))) {
                    return -1;
                }
                --v1;
            }
            if(!Character.isSurrogate(((char)v2))) {
                --v1;
                goto label_3;
            }
            if(!Character.isHighSurrogate(((char)v2))) {
                z = true;
                goto label_3;
            }
            return -1;
        }

        static int b(CharSequence charSequence0, int v, int v1) {
            boolean z;
            int v2 = charSequence0.length();
            if(v < 0 || v2 < v || v1 < 0) {
                return -1;
            }
            while(true) {
                z = false;
            label_4:
                if(v1 == 0) {
                    return v;
                }
                if(v >= v2) {
                    return z ? -1 : v2;
                }
                int v3 = charSequence0.charAt(v);
                if(!z) {
                    break;
                }
                if(!Character.isLowSurrogate(((char)v3))) {
                    return -1;
                }
                --v1;
                ++v;
            }
            if(!Character.isSurrogate(((char)v3))) {
                --v1;
                ++v;
                goto label_4;
            }
            if(!Character.isLowSurrogate(((char)v3))) {
                ++v;
                z = true;
                goto label_4;
            }
            return -1;
        }
    }

    static class b implements c {
        public t a;
        private final j b;

        b(t t0, j f$j0) {
            this.a = t0;
            this.b = f$j0;
        }

        @Override  // androidx.emoji2.text.i$c
        public Object a() {
            return this.c();
        }

        @Override  // androidx.emoji2.text.i$c
        public boolean b(CharSequence charSequence0, int v, int v1, p p0) {
            if(p0.k()) {
                return true;
            }
            if(this.a == null) {
                Spannable spannable0 = charSequence0 instanceof Spannable ? ((Spannable)charSequence0) : new SpannableString(charSequence0);
                this.a = new t(spannable0);
            }
            androidx.emoji2.text.j j0 = this.b.a(p0);
            this.a.setSpan(j0, v, v1, 33);
            return true;
        }

        public t c() {
            return this.a;
        }
    }

    interface c {
        Object a();

        boolean b(CharSequence arg1, int arg2, int arg3, p arg4);
    }

    static class d implements c {
        private final String a;

        d(String s) {
            this.a = s;
        }

        @Override  // androidx.emoji2.text.i$c
        public Object a() {
            return this;
        }

        @Override  // androidx.emoji2.text.i$c
        public boolean b(CharSequence charSequence0, int v, int v1, p p0) {
            if(TextUtils.equals(charSequence0.subSequence(v, v1), this.a)) {
                p0.l(true);
                return false;
            }
            return true;
        }

        public d c() [...] // Inlined contents
    }

    static final class e {
        private int a;
        private final androidx.emoji2.text.n.a b;
        private androidx.emoji2.text.n.a c;
        private androidx.emoji2.text.n.a d;
        private int e;
        private int f;
        private final boolean g;
        private final int[] h;

        e(androidx.emoji2.text.n.a n$a0, boolean z, int[] arr_v) {
            this.a = 1;
            this.b = n$a0;
            this.c = n$a0;
            this.g = z;
            this.h = arr_v;
        }

        int a(int v) {
            androidx.emoji2.text.n.a n$a0 = this.c.a(v);
            int v1 = 2;
            if(this.a == 2) {
                if(n$a0 != null) {
                    this.c = n$a0;
                    ++this.f;
                }
                else if(e.f(v)) {
                    v1 = this.g();
                }
                else if(!e.d(v)) {
                    v1 = 3;
                    if(this.c.b() == null) {
                        v1 = this.g();
                    }
                    else if(this.f != 1) {
                        this.d = this.c;
                        this.g();
                    }
                    else if(this.h()) {
                        this.d = this.c;
                        this.g();
                    }
                    else {
                        v1 = this.g();
                    }
                }
            }
            else if(n$a0 == null) {
                v1 = this.g();
            }
            else {
                this.a = 2;
                this.c = n$a0;
                this.f = 1;
            }
            this.e = v;
            return v1;
        }

        p b() {
            return this.c.b();
        }

        p c() {
            return this.d.b();
        }

        private static boolean d(int v) {
            return v == 0xFE0F;
        }

        // 去混淆评级： 低(20)
        boolean e() {
            return this.a == 2 && this.c.b() != null && (this.f > 1 || this.h());
        }

        private static boolean f(int v) {
            return v == 0xFE0E;
        }

        private int g() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        private boolean h() {
            if(this.c.b().j()) {
                return true;
            }
            if(e.d(this.e)) {
                return true;
            }
            if(this.g) {
                if(this.h == null) {
                    return true;
                }
                int v = this.c.b().b(0);
                return Arrays.binarySearch(this.h, v) < 0;
            }
            return false;
        }
    }

    private final j a;
    private final n b;
    private androidx.emoji2.text.f.e c;
    private final boolean d;
    private final int[] e;

    i(n n0, j f$j0, androidx.emoji2.text.f.e f$e0, boolean z, int[] arr_v, Set set0) {
        this.a = f$j0;
        this.b = n0;
        this.c = f$e0;
        this.d = z;
        this.e = arr_v;
        this.g(set0);
    }

    private static boolean a(Editable editable0, KeyEvent keyEvent0, boolean z) {
        if(i.f(keyEvent0)) {
            return false;
        }
        int v = Selection.getSelectionStart(editable0);
        int v1 = Selection.getSelectionEnd(editable0);
        if(i.e(v, v1)) {
            return false;
        }
        androidx.emoji2.text.j[] arr_j = (androidx.emoji2.text.j[])editable0.getSpans(v, v1, androidx.emoji2.text.j.class);
        if(arr_j != null && arr_j.length > 0) {
            for(int v2 = 0; v2 < arr_j.length; ++v2) {
                androidx.emoji2.text.j j0 = arr_j[v2];
                int v3 = editable0.getSpanStart(j0);
                int v4 = editable0.getSpanEnd(j0);
                if(z && v3 == v || !z && v4 == v || v > v3 && v < v4) {
                    editable0.delete(v3, v4);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(InputConnection inputConnection0, Editable editable0, int v, int v1, boolean z) {
        int v5;
        int v4;
        if(editable0 != null && inputConnection0 != null && v >= 0 && v1 >= 0) {
            int v2 = Selection.getSelectionStart(editable0);
            int v3 = Selection.getSelectionEnd(editable0);
            if(i.e(v2, v3)) {
                return false;
            }
            if(z) {
                v4 = a.a(editable0, v2, Math.max(v, 0));
                v5 = a.b(editable0, v3, Math.max(v1, 0));
                if(v4 == -1 || v5 == -1) {
                    return false;
                }
            }
            else {
                v4 = Math.max(v2 - v, 0);
                v5 = Math.min(v3 + v1, editable0.length());
            }
            androidx.emoji2.text.j[] arr_j = (androidx.emoji2.text.j[])editable0.getSpans(v4, v5, androidx.emoji2.text.j.class);
            if(arr_j != null && arr_j.length > 0) {
                for(int v6 = 0; v6 < arr_j.length; ++v6) {
                    androidx.emoji2.text.j j0 = arr_j[v6];
                    v4 = Math.min(editable0.getSpanStart(j0), v4);
                    v5 = Math.max(editable0.getSpanEnd(j0), v5);
                }
                int v7 = Math.min(v5, editable0.length());
                inputConnection0.beginBatchEdit();
                editable0.delete(Math.max(v4, 0), v7);
                inputConnection0.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean c(Editable editable0, int v, KeyEvent keyEvent0) {
        boolean z;
        switch(v) {
            case 67: {
                z = i.a(editable0, keyEvent0, false);
                break;
            }
            case 0x70: {
                z = i.a(editable0, keyEvent0, true);
                break;
            }
            default: {
                z = false;
            }
        }
        if(z) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable0);
            return true;
        }
        return false;
    }

    private boolean d(CharSequence charSequence0, int v, int v1, p p0) {
        if(p0.d() == 0) {
            p0.m(this.c.a(charSequence0, v, v1, p0.h()));
        }
        return p0.d() == 2;
    }

    private static boolean e(int v, int v1) {
        return v == -1 || v1 == -1 || v != v1;
    }

    private static boolean f(KeyEvent keyEvent0) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent0.getMetaState());
    }

    private void g(Set set0) {
        if(set0.isEmpty()) {
            return;
        }
        for(Object object0: set0) {
            String s = new String(((int[])object0), 0, ((int[])object0).length);
            this.i(s, 0, s.length(), 1, true, new d(s));
        }
    }

    CharSequence h(CharSequence charSequence0, int v, int v1, int v2, boolean z) {
        CharSequence charSequence1;
        t t0;
        if(charSequence0 instanceof o) {
            ((o)charSequence0).a();
        }
        try {
            Class class0 = androidx.emoji2.text.j.class;
            if(charSequence0 instanceof o) {
                t0 = new t(((Spannable)charSequence0));
            }
            else if(charSequence0 instanceof Spannable) {
                t0 = new t(((Spannable)charSequence0));
            }
            else if(charSequence0 instanceof Spanned && ((Spanned)charSequence0).nextSpanTransition(v - 1, v1 + 1, class0) <= v1) {
                t0 = new t(charSequence0);
            }
            else {
                t0 = null;
            }
            if(t0 != null) {
                androidx.emoji2.text.j[] arr_j = (androidx.emoji2.text.j[])t0.getSpans(v, v1, class0);
                if(arr_j != null && arr_j.length > 0) {
                    for(int v3 = 0; v3 < arr_j.length; ++v3) {
                        androidx.emoji2.text.j j0 = arr_j[v3];
                        int v4 = t0.getSpanStart(j0);
                        int v5 = t0.getSpanEnd(j0);
                        if(v4 != v1) {
                            t0.removeSpan(j0);
                        }
                        v = Math.min(v4, v);
                        v1 = Math.max(v5, v1);
                    }
                }
            }
            if(v != v1 && v < charSequence0.length()) {
                if(v2 != 0x7FFFFFFF && t0 != null) {
                    v2 -= ((androidx.emoji2.text.j[])t0.getSpans(0, t0.length(), class0)).length;
                }
                t t1 = (t)this.i(charSequence0, v, v1, v2, z, new b(t0, this.a));
                if(t1 != null) {
                    charSequence1 = t1.b();
                    goto label_38;
                label_35:
                    if(!(charSequence0 instanceof o)) {
                        throw throwable0;
                    }
                    goto label_36;
                }
                goto label_41;
            }
            goto label_44;
        }
        catch(Throwable throwable0) {
            goto label_35;
        }
    label_36:
        ((o)charSequence0).d();
        throw throwable0;
    label_38:
        if(charSequence0 instanceof o) {
            ((o)charSequence0).d();
        }
        return charSequence1;
    label_41:
        if(charSequence0 instanceof o) {
            ((o)charSequence0).d();
        }
        return charSequence0;
    label_44:
        if(charSequence0 instanceof o) {
            ((o)charSequence0).d();
        }
        return charSequence0;
    }

    private Object i(CharSequence charSequence0, int v, int v1, int v2, boolean z, c i$c0) {
        int v5;
        e i$e0 = new e(this.b.f(), this.d, this.e);
        int v3 = 0;
        boolean z1 = true;
        int v4 = Character.codePointAt(charSequence0, v);
    alab1:
        while(true) {
            v5 = v;
            while(true) {
                if(v >= v1 || v3 >= v2 || !z1) {
                    break alab1;
                }
                switch(i$e0.a(v4)) {
                    case 1: {
                        v5 += Character.charCount(Character.codePointAt(charSequence0, v5));
                        if(v5 < v1) {
                            v4 = Character.codePointAt(charSequence0, v5);
                        }
                        v = v5;
                        continue;
                    }
                    case 2: {
                        v += Character.charCount(v4);
                        if(v >= v1) {
                            continue;
                        }
                        v4 = Character.codePointAt(charSequence0, v);
                        continue;
                    }
                    case 3: {
                        break;
                    }
                    default: {
                        continue;
                    }
                }
                if(!z && this.d(charSequence0, v5, v, i$e0.c())) {
                    break;
                }
                z1 = i$c0.b(charSequence0, v5, v, i$e0.c());
                ++v3;
                break;
            }
        }
        if(i$e0.e() && v3 < v2 && z1 && (z || !this.d(charSequence0, v5, v, i$e0.b()))) {
            i$c0.b(charSequence0, v5, v, i$e0.b());
        }
        return i$c0.a();
    }
}

