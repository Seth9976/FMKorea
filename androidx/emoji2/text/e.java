package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.core.graphics.f;

class e implements androidx.emoji2.text.f.e {
    private final TextPaint a;
    private static final ThreadLocal b;

    static {
        e.b = new ThreadLocal();
    }

    e() {
        TextPaint textPaint0 = new TextPaint();
        this.a = textPaint0;
        textPaint0.setTextSize(10.0f);
    }

    @Override  // androidx.emoji2.text.f$e
    public boolean a(CharSequence charSequence0, int v, int v1, int v2) {
        StringBuilder stringBuilder0 = e.b();
        stringBuilder0.setLength(0);
        while(v < v1) {
            stringBuilder0.append(charSequence0.charAt(v));
            ++v;
        }
        return f.a(this.a, stringBuilder0.toString());
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal0 = e.b;
        if(threadLocal0.get() == null) {
            threadLocal0.set(new StringBuilder());
        }
        return (StringBuilder)threadLocal0.get();
    }
}

