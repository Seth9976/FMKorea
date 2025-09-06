package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import e.a;
import e.i;
import e.j;

public class d extends Drawable {
    private final Paint a;
    private float b;
    private float c;
    private float d;
    private float e;
    private boolean f;
    private final Path g;
    private final int h;
    private boolean i;
    private float j;
    private float k;
    private int l;
    private static final float m;

    static {
        d.m = 0.785398f;
    }

    public d(Context context0) {
        Paint paint0 = new Paint();
        this.a = paint0;
        this.g = new Path();
        this.i = false;
        this.l = 2;
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeJoin(Paint.Join.MITER);
        paint0.setStrokeCap(Paint.Cap.BUTT);
        paint0.setAntiAlias(true);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(null, j.Z0, a.y, i.b);
        this.c(typedArray0.getColor(j.d1, 0));
        this.b(typedArray0.getDimension(j.h1, 0.0f));
        this.f(typedArray0.getBoolean(j.g1, true));
        this.d(((float)Math.round(typedArray0.getDimension(j.f1, 0.0f))));
        this.h = typedArray0.getDimensionPixelSize(j.e1, 0);
        this.c = (float)Math.round(typedArray0.getDimension(j.c1, 0.0f));
        this.b = (float)Math.round(typedArray0.getDimension(j.a1, 0.0f));
        this.d = typedArray0.getDimension(j.b1, 0.0f);
        typedArray0.recycle();
    }

    private static float a(float f, float f1, float f2) [...] // Inlined contents

    public void b(float f) {
        if(this.a.getStrokeWidth() != f) {
            this.a.setStrokeWidth(f);
            this.k = (float)(((double)(f / 2.0f)) * Math.cos(d.m));
            this.invalidateSelf();
        }
    }

    public void c(int v) {
        if(v != this.a.getColor()) {
            this.a.setColor(v);
            this.invalidateSelf();
        }
    }

    public void d(float f) {
        if(f != this.e) {
            this.e = f;
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Rect rect0 = this.getBounds();
        boolean z = false;
        switch(this.l) {
            case 0: {
                break;
            }
            case 1: {
                z = true;
                break;
            }
            case 3: {
                if(androidx.core.graphics.drawable.a.f(this) == 0) {
                    z = true;
                }
                break;
            }
            default: {
                if(androidx.core.graphics.drawable.a.f(this) == 1) {
                    z = true;
                }
            }
        }
        float f = this.c + (((float)Math.sqrt(this.b * this.b * 2.0f)) - this.c) * this.j;
        float f1 = this.c + (this.d - this.c) * this.j;
        float f2 = (float)Math.round(0.0f + (this.k - 0.0f) * this.j);
        float f3 = 0.0f + (d.m - 0.0f) * this.j;
        float f4 = z ? 0.0f : -180.0f;
        float f5 = f4 + ((z ? 180.0f : 0.0f) - f4) * this.j;
        float f6 = (float)Math.round(Math.cos(f3) * ((double)f));
        float f7 = (float)Math.round(((double)f) * Math.sin(f3));
        this.g.rewind();
        float f8 = d.a(this.e + this.a.getStrokeWidth(), -this.k, this.j);
        this.g.moveTo(-f1 / 2.0f + f2, 0.0f);
        this.g.rLineTo(f1 - f2 * 2.0f, 0.0f);
        this.g.moveTo(-f1 / 2.0f, f8);
        this.g.rLineTo(f6, f7);
        this.g.moveTo(-f1 / 2.0f, -f8);
        this.g.rLineTo(f6, -f7);
        this.g.close();
        canvas0.save();
        float f9 = this.a.getStrokeWidth();
        float f10 = ((float)(((int)(((float)rect0.height()) - 3.0f * f9 - 2.0f * this.e)) / 4 * 2)) + (f9 * 1.5f + this.e);
        canvas0.translate(((float)rect0.centerX()), f10);
        if(this.f) {
            canvas0.rotate(f5 * ((float)((this.i ^ z) == 0 ? 1 : -1)));
        }
        else if(z) {
            canvas0.rotate(180.0f);
        }
        canvas0.drawPath(this.g, this.a);
        canvas0.restore();
    }

    public void e(float f) {
        if(this.j != f) {
            this.j = f;
            this.invalidateSelf();
        }
    }

    public void f(boolean z) {
        if(this.f != z) {
            this.f = z;
            this.invalidateSelf();
        }
    }

    public void g(boolean z) {
        if(this.i != z) {
            this.i = z;
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.h;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.h;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        if(v != this.a.getAlpha()) {
            this.a.setAlpha(v);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.a.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }
}

