package P1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.h.e;
import androidx.core.content.res.h;
import z1.k;

public class d {
    public final ColorStateList a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final float h;
    public final float i;
    public final float j;
    public final boolean k;
    public final float l;
    private ColorStateList m;
    private float n;
    private final int o;
    private boolean p;
    private Typeface q;

    public d(Context context0, int v) {
        this.p = false;
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, k.g7);
        this.l(typedArray0.getDimension(k.h7, 0.0f));
        this.k(c.a(context0, typedArray0, k.k7));
        this.a = c.a(context0, typedArray0, k.l7);
        this.b = c.a(context0, typedArray0, k.m7);
        this.e = typedArray0.getInt(k.j7, 0);
        this.f = typedArray0.getInt(k.i7, 1);
        int v1 = c.g(typedArray0, k.s7, k.r7);
        this.o = typedArray0.getResourceId(v1, 0);
        this.d = typedArray0.getString(v1);
        this.g = typedArray0.getBoolean(k.t7, false);
        this.c = c.a(context0, typedArray0, k.n7);
        this.h = typedArray0.getFloat(k.o7, 0.0f);
        this.i = typedArray0.getFloat(k.p7, 0.0f);
        this.j = typedArray0.getFloat(k.q7, 0.0f);
        typedArray0.recycle();
        TypedArray typedArray1 = context0.obtainStyledAttributes(v, k.x4);
        this.k = typedArray1.hasValue(k.y4);
        this.l = typedArray1.getFloat(k.y4, 0.0f);
        typedArray1.recycle();
    }

    private void d() {
        if(this.q == null) {
            String s = this.d;
            if(s != null) {
                this.q = Typeface.create(s, this.e);
            }
        }
        if(this.q == null) {
            switch(this.f) {
                case 1: {
                    this.q = Typeface.SANS_SERIF;
                    break;
                }
                case 2: {
                    this.q = Typeface.SERIF;
                    break;
                }
                case 3: {
                    this.q = Typeface.MONOSPACE;
                    break;
                }
                default: {
                    this.q = Typeface.DEFAULT;
                }
            }
            this.q = Typeface.create(this.q, this.e);
        }
    }

    public Typeface e() {
        this.d();
        return this.q;
    }

    public Typeface f(Context context0) {
        if(this.p) {
            return this.q;
        }
        if(!context0.isRestricted()) {
            try {
                Typeface typeface0 = h.h(context0, this.o);
                this.q = typeface0;
                if(typeface0 != null) {
                    this.q = Typeface.create(typeface0, this.e);
                }
                goto label_10;
            }
            catch(UnsupportedOperationException exception0) {
            }
            catch(Resources.NotFoundException | Exception unused_ex) {
                goto label_10;
            }
            Log.d("TextAppearance", "Error loading font " + this.d, exception0);
        }
    label_10:
        this.d();
        this.p = true;
        return this.q;
    }

    public void g(Context context0, f f0) {
        class a extends e {
            final f a;
            final d b;

            a(f f0) {
                this.a = f0;
                super();
            }

            @Override  // androidx.core.content.res.h$e
            public void h(int v) {
                d.this.p = true;
                this.a.a(v);
            }

            @Override  // androidx.core.content.res.h$e
            public void i(Typeface typeface0) {
                Typeface typeface1 = Typeface.create(typeface0, d.this.e);
                d.this.q = typeface1;
                d.this.p = true;
                Typeface typeface2 = d.this.q;
                this.a.b(typeface2, false);
            }
        }

        if(this.m(context0)) {
            this.f(context0);
        }
        else {
            this.d();
        }
        int v = this.o;
        if(v == 0) {
            this.p = true;
        }
        if(this.p) {
            f0.b(this.q, true);
            return;
        }
        try {
            h.j(context0, v, new a(this, f0), null);
        }
        catch(Resources.NotFoundException unused_ex) {
            this.p = true;
            f0.a(1);
        }
        catch(Exception exception0) {
            Log.d("TextAppearance", "Error loading font " + this.d, exception0);
            this.p = true;
            f0.a(-3);
        }
    }

    public void h(Context context0, TextPaint textPaint0, f f0) {
        class b extends f {
            final Context a;
            final TextPaint b;
            final f c;
            final d d;

            b(Context context0, TextPaint textPaint0, f f0) {
                this.a = context0;
                this.b = textPaint0;
                this.c = f0;
                super();
            }

            @Override  // P1.f
            public void a(int v) {
                this.c.a(v);
            }

            @Override  // P1.f
            public void b(Typeface typeface0, boolean z) {
                d.this.p(this.a, this.b, typeface0);
                this.c.b(typeface0, z);
            }
        }

        this.p(context0, textPaint0, this.e());
        this.g(context0, new b(this, context0, textPaint0, f0));
    }

    public ColorStateList i() {
        return this.m;
    }

    public float j() {
        return this.n;
    }

    public void k(ColorStateList colorStateList0) {
        this.m = colorStateList0;
    }

    public void l(float f) {
        this.n = f;
    }

    // 去混淆评级： 低(30)
    private boolean m(Context context0) {
        return (this.o == 0 ? null : h.c(context0, this.o)) != null;
    }

    public void n(Context context0, TextPaint textPaint0, f f0) {
        this.o(context0, textPaint0, f0);
        textPaint0.setColor((this.m == null ? 0xFF000000 : this.m.getColorForState(textPaint0.drawableState, this.m.getDefaultColor())));
        int v = this.c == null ? 0 : this.c.getColorForState(textPaint0.drawableState, this.c.getDefaultColor());
        textPaint0.setShadowLayer(this.j, this.h, this.i, v);
    }

    public void o(Context context0, TextPaint textPaint0, f f0) {
        if(this.m(context0)) {
            this.p(context0, textPaint0, this.f(context0));
            return;
        }
        this.h(context0, textPaint0, f0);
    }

    public void p(Context context0, TextPaint textPaint0, Typeface typeface0) {
        Typeface typeface1 = j.a(context0, typeface0);
        if(typeface1 != null) {
            typeface0 = typeface1;
        }
        textPaint0.setTypeface(typeface0);
        int v = typeface0.getStyle();
        int v1 = this.e & ~v;
        textPaint0.setFakeBoldText((v1 & 1) != 0);
        textPaint0.setTextSkewX(((v1 & 2) == 0 ? 0.0f : -0.25f));
        textPaint0.setTextSize(this.n);
        if(this.k) {
            textPaint0.setLetterSpacing(this.l);
        }
    }
}

