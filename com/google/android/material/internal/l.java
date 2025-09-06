package com.google.android.material.internal;

import android.text.Layout.Alignment;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;

final class l {
    static abstract class a extends Exception {
    }

    private CharSequence a;
    private final TextPaint b;
    private final int c;
    private int d;
    private int e;
    private Layout.Alignment f;
    private int g;
    private float h;
    private float i;
    private int j;
    private boolean k;
    private boolean l;
    private TextUtils.TruncateAt m;
    static final int n;

    static {
        l.n = 1;
    }

    private l(CharSequence charSequence0, TextPaint textPaint0, int v) {
        this.a = charSequence0;
        this.b = textPaint0;
        this.c = v;
        this.d = 0;
        this.e = charSequence0.length();
        this.f = Layout.Alignment.ALIGN_NORMAL;
        this.g = 0x7FFFFFFF;
        this.h = 0.0f;
        this.i = 1.0f;
        this.j = l.n;
        this.k = true;
        this.m = null;
    }

    public StaticLayout a() {
        if(this.a == null) {
            this.a = "";
        }
        int v = Math.max(0, this.c);
        CharSequence charSequence0 = this.g == 1 ? TextUtils.ellipsize(this.a, this.b, ((float)v), this.m) : this.a;
        int v1 = Math.min(charSequence0.length(), this.e);
        this.e = v1;
        if(this.l && this.g == 1) {
            this.f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder staticLayout$Builder0 = StaticLayout.Builder.obtain(charSequence0, this.d, v1, this.b, v);
        staticLayout$Builder0.setAlignment(this.f);
        staticLayout$Builder0.setIncludePad(this.k);
        staticLayout$Builder0.setTextDirection((this.l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR));
        TextUtils.TruncateAt textUtils$TruncateAt0 = this.m;
        if(textUtils$TruncateAt0 != null) {
            staticLayout$Builder0.setEllipsize(textUtils$TruncateAt0);
        }
        staticLayout$Builder0.setMaxLines(this.g);
        float f = this.h;
        if(f != 0.0f || this.i != 1.0f) {
            staticLayout$Builder0.setLineSpacing(f, this.i);
        }
        if(this.g > 1) {
            staticLayout$Builder0.setHyphenationFrequency(this.j);
        }
        return staticLayout$Builder0.build();
    }

    public static l b(CharSequence charSequence0, TextPaint textPaint0, int v) {
        return new l(charSequence0, textPaint0, v);
    }

    public l c(Layout.Alignment layout$Alignment0) {
        this.f = layout$Alignment0;
        return this;
    }

    public l d(TextUtils.TruncateAt textUtils$TruncateAt0) {
        this.m = textUtils$TruncateAt0;
        return this;
    }

    public l e(int v) {
        this.j = v;
        return this;
    }

    public l f(boolean z) {
        this.k = z;
        return this;
    }

    public l g(boolean z) {
        this.l = z;
        return this;
    }

    public l h(float f, float f1) {
        this.h = f;
        this.i = f1;
        return this;
    }

    public l i(int v) {
        this.g = v;
        return this;
    }

    public l j(m m0) {
        return this;
    }
}

