package com.google.android.material.internal;

import P1.d;
import P1.f;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

public class n {
    class a extends f {
        final n a;

        @Override  // P1.f
        public void a(int v) {
            n.this.e = true;
            b n$b0 = (b)n.this.f.get();
            if(n$b0 != null) {
                n$b0.a();
            }
        }

        @Override  // P1.f
        public void b(Typeface typeface0, boolean z) {
            if(z) {
                return;
            }
            n.this.e = true;
            b n$b0 = (b)n.this.f.get();
            if(n$b0 != null) {
                n$b0.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] arg1);
    }

    private final TextPaint a;
    private final f b;
    private float c;
    private float d;
    private boolean e;
    private WeakReference f;
    private d g;

    public n(b n$b0) {
        this.a = new TextPaint(1);
        this.b = new a(this);
        this.e = true;
        this.f = new WeakReference(null);
        this.j(n$b0);
    }

    private float c(String s) {
        return s == null ? 0.0f : Math.abs(this.a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence0) {
        if(charSequence0 == null) {
            return 0.0f;
        }
        int v = charSequence0.length();
        return this.a.measureText(charSequence0, 0, v);
    }

    public d e() {
        return this.g;
    }

    public float f(String s) {
        if(!this.e) {
            return this.d;
        }
        this.i(s);
        return this.d;
    }

    public TextPaint g() {
        return this.a;
    }

    public float h(String s) {
        if(!this.e) {
            return this.c;
        }
        this.i(s);
        return this.c;
    }

    private void i(String s) {
        this.c = this.d(s);
        this.d = this.c(s);
        this.e = false;
    }

    public void j(b n$b0) {
        this.f = new WeakReference(n$b0);
    }

    public void k(d d0, Context context0) {
        if(this.g != d0) {
            this.g = d0;
            if(d0 != null) {
                d0.o(context0, this.a, this.b);
                b n$b0 = (b)this.f.get();
                if(n$b0 != null) {
                    this.a.drawableState = n$b0.getState();
                }
                d0.n(context0, this.a, this.b);
                this.e = true;
            }
            b n$b1 = (b)this.f.get();
            if(n$b1 != null) {
                n$b1.a();
                n$b1.onStateChange(n$b1.getState());
            }
        }
    }

    public void l(boolean z) {
        this.e = z;
    }

    public void m(boolean z) {
        this.e = z;
    }

    public void n(Context context0) {
        this.g.n(context0, this.a, this.b);
    }
}

