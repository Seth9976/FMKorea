package androidx.emoji2.text;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

class t implements Spannable {
    static abstract class a {
        static IntStream a(CharSequence charSequence0) {
            return charSequence0.chars();
        }

        static IntStream b(CharSequence charSequence0) {
            return charSequence0.codePoints();
        }
    }

    static class b {
        boolean a(CharSequence charSequence0) {
            return false;
        }
    }

    static class c extends b {
        @Override  // androidx.emoji2.text.t$b
        boolean a(CharSequence charSequence0) {
            return u.a(charSequence0);
        }
    }

    private boolean f;
    private Spannable g;

    t(Spannable spannable0) {
        this.f = false;
        this.g = spannable0;
    }

    t(CharSequence charSequence0) {
        this.f = false;
        this.g = new SpannableString(charSequence0);
    }

    private void a() {
        Spannable spannable0 = this.g;
        if(!this.f && t.c().a(spannable0)) {
            this.g = new SpannableString(spannable0);
        }
        this.f = true;
    }

    Spannable b() {
        return this.g;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    @Override
    public char charAt(int v) {
        return this.g.charAt(v);
    }

    @Override
    public IntStream chars() {
        return a.a(this.g);
    }

    @Override
    public IntStream codePoints() {
        return a.b(this.g);
    }

    @Override  // android.text.Spanned
    public int getSpanEnd(Object object0) {
        return this.g.getSpanEnd(object0);
    }

    @Override  // android.text.Spanned
    public int getSpanFlags(Object object0) {
        return this.g.getSpanFlags(object0);
    }

    @Override  // android.text.Spanned
    public int getSpanStart(Object object0) {
        return this.g.getSpanStart(object0);
    }

    @Override  // android.text.Spanned
    public Object[] getSpans(int v, int v1, Class class0) {
        return this.g.getSpans(v, v1, class0);
    }

    @Override
    public int length() {
        return this.g.length();
    }

    @Override  // android.text.Spanned
    public int nextSpanTransition(int v, int v1, Class class0) {
        return this.g.nextSpanTransition(v, v1, class0);
    }

    @Override  // android.text.Spannable
    public void removeSpan(Object object0) {
        this.a();
        this.g.removeSpan(object0);
    }

    @Override  // android.text.Spannable
    public void setSpan(Object object0, int v, int v1, int v2) {
        this.a();
        this.g.setSpan(object0, v, v1, v2);
    }

    @Override
    public CharSequence subSequence(int v, int v1) {
        return this.g.subSequence(v, v1);
    }

    @Override
    public String toString() {
        return this.g.toString();
    }
}

