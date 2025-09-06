package N1;

import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

final class d extends j {
    private float b;
    private float c;
    private float d;
    private boolean e;
    private float f;

    d(g g0) {
        super(g0);
    }

    @Override  // N1.j
    void a(Canvas canvas0, Rect rect0, float f, boolean z, boolean z1) {
        float f1 = ((float)rect0.width()) / ((float)this.f());
        float f2 = ((float)rect0.height()) / ((float)this.e());
        float f3 = ((float)((g)this.a).h) / 2.0f + ((float)((g)this.a).i);
        canvas0.translate(f3 * f1 + ((float)rect0.left), f3 * f2 + ((float)rect0.top));
        canvas0.rotate(-90.0f);
        canvas0.scale(f1, f2);
        if(((g)this.a).j != 0) {
            canvas0.scale(1.0f, -1.0f);
        }
        canvas0.clipRect(-f3, -f3, f3, f3);
        c c0 = this.a;
        this.e = ((g)c0).a / 2 <= ((g)c0).b;
        this.b = ((float)((g)c0).a) * f;
        this.c = ((float)Math.min(((g)c0).a / 2, ((g)c0).b)) * f;
        c c1 = this.a;
        float f4 = ((float)(((g)c1).h - ((g)c1).a)) / 2.0f;
        this.d = f4;
        if(z || z1) {
            if(z && ((g)c1).e == 2 || z1 && ((g)c1).f == 1) {
                this.d = f4 + (1.0f - f) * ((float)((g)c1).a) / 2.0f;
            }
            else if(z && ((g)c1).e == 1 || z1 && ((g)c1).f == 2) {
                this.d = f4 - (1.0f - f) * ((float)((g)c1).a) / 2.0f;
            }
        }
        if(z1 && ((g)c1).f == 3) {
            this.f = f;
            return;
        }
        this.f = 1.0f;
    }

    @Override  // N1.j
    void b(Canvas canvas0, Paint paint0, int v, int v1) {
    }

    @Override  // N1.j
    void c(Canvas canvas0, Paint paint0, a j$a0, int v) {
        int v1 = H1.a.a(j$a0.c, v);
        this.h(canvas0, paint0, j$a0.a, j$a0.b, v1, j$a0.d, j$a0.d);
    }

    @Override  // N1.j
    void d(Canvas canvas0, Paint paint0, float f, float f1, int v, int v1, int v2) {
        this.h(canvas0, paint0, f, f1, H1.a.a(v, v1), v2, v2);
    }

    @Override  // N1.j
    int e() {
        return this.k();
    }

    @Override  // N1.j
    int f() {
        return this.k();
    }

    private void h(Canvas canvas0, Paint paint0, float f, float f1, int v, int v1, int v2) {
        float f2 = Float.compare(f1, f) < 0 ? f1 + 1.0f - f : f1 - f;
        if(this.f < 1.0f) {
            float f3 = f % 1.0f + f2;
            if(f3 > 1.0f) {
                this.h(canvas0, paint0, f % 1.0f, 1.0f, v, v1, 0);
                this.h(canvas0, paint0, 1.0f, f3, v, 0, v2);
                return;
            }
        }
        float f4 = (float)Math.toDegrees(this.c / this.d);
        if(Float.compare(f % 1.0f, 0.0f) == 0 && f2 >= 0.99f) {
            f2 += (f2 - 0.99f) * (f4 * 2.0f / 360.0f) / 0.01f;
        }
        float f5 = (1.0f - f % 1.0f) * (1.0f - this.f) + f % 1.0f * 1.0f;
        float f6 = (1.0f - f2) * 0.0f + f2 * this.f;
        float f7 = (float)Math.toDegrees(((float)v1) / this.d);
        float f8 = f6 * 360.0f - f7 - ((float)Math.toDegrees(((float)v2) / this.d));
        float f9 = f5 * 360.0f + f7;
        if(f8 <= 0.0f) {
            return;
        }
        paint0.setAntiAlias(true);
        paint0.setColor(v);
        paint0.setStrokeWidth(this.b);
        if(f8 < f4 * 2.0f) {
            float f10 = f8 / (f4 * 2.0f);
            paint0.setStyle(Paint.Style.FILL);
            this.j(canvas0, paint0, f9 + f4 * f10, this.c * 2.0f, this.b, f10);
            return;
        }
        RectF rectF0 = new RectF(-this.d, -this.d, this.d, this.d);
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeCap((this.e ? Paint.Cap.ROUND : Paint.Cap.BUTT));
        float f11 = f9 + f4;
        canvas0.drawArc(rectF0, f11, f8 - f4 * 2.0f, false, paint0);
        if(!this.e && this.c > 0.0f) {
            paint0.setStyle(Paint.Style.FILL);
            this.i(canvas0, paint0, f11, this.c * 2.0f, this.b);
            this.i(canvas0, paint0, f9 + f8 - f4, this.c * 2.0f, this.b);
        }
    }

    private void i(Canvas canvas0, Paint paint0, float f, float f1, float f2) {
        this.j(canvas0, paint0, f, f1, f2, 1.0f);
    }

    private void j(Canvas canvas0, Paint paint0, float f, float f1, float f2, float f3) {
        float f4 = (float)(((int)Math.min(f2, this.b)));
        float f5 = Math.min(f1 / 2.0f, this.c * f4 / this.b);
        RectF rectF0 = new RectF(-f4 / 2.0f, -f1 / 2.0f, f4 / 2.0f, f1 / 2.0f);
        canvas0.save();
        canvas0.translate(((float)(((double)this.d) * Math.cos(Math.toRadians(f)))), ((float)(((double)this.d) * Math.sin(Math.toRadians(f)))));
        canvas0.rotate(f);
        canvas0.scale(f3, f3);
        canvas0.drawRoundRect(rectF0, f5, f5, paint0);
        canvas0.restore();
    }

    private int k() {
        return ((g)this.a).h + ((g)this.a).i * 2;
    }
}

