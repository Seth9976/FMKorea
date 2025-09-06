package R1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader.TileMode;
import androidx.core.graphics.d;

public class a {
    private final Paint a;
    private final Paint b;
    private final Paint c;
    private int d;
    private int e;
    private int f;
    private final Path g;
    private final Paint h;
    private static final int[] i;
    private static final float[] j;
    private static final int[] k;
    private static final float[] l;

    static {
        a.i = new int[3];
        a.j = new float[]{0.0f, 0.5f, 1.0f};
        a.k = new int[4];
        a.l = new float[]{0.0f, 0.0f, 0.5f, 1.0f};
    }

    public a() {
        this(0xFF000000);
    }

    public a(int v) {
        this.g = new Path();
        Paint paint0 = new Paint();
        this.h = paint0;
        this.a = new Paint();
        this.d(v);
        paint0.setColor(0);
        Paint paint1 = new Paint(4);
        this.b = paint1;
        paint1.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint1);
    }

    public void a(Canvas canvas0, Matrix matrix0, RectF rectF0, int v, float f, float f1) {
        boolean z = Float.compare(f1, 0.0f) < 0;
        Path path0 = this.g;
        if(z) {
            a.k[0] = 0;
            a.k[1] = this.f;
            a.k[2] = this.e;
            a.k[3] = this.d;
        }
        else {
            path0.rewind();
            path0.moveTo(rectF0.centerX(), rectF0.centerY());
            path0.arcTo(rectF0, f, f1);
            path0.close();
            float f2 = (float)(-v);
            rectF0.inset(f2, f2);
            a.k[0] = 0;
            a.k[1] = this.d;
            a.k[2] = this.e;
            a.k[3] = this.f;
        }
        float f3 = rectF0.width();
        if(f3 / 2.0f <= 0.0f) {
            return;
        }
        float f4 = 1.0f - ((float)v) / (f3 / 2.0f);
        a.l[1] = f4;
        a.l[2] = (1.0f - f4) / 2.0f + f4;
        RadialGradient radialGradient0 = new RadialGradient(rectF0.centerX(), rectF0.centerY(), f3 / 2.0f, a.k, a.l, Shader.TileMode.CLAMP);
        this.b.setShader(radialGradient0);
        canvas0.save();
        canvas0.concat(matrix0);
        canvas0.scale(1.0f, rectF0.height() / rectF0.width());
        if(!z) {
            canvas0.clipPath(path0, Region.Op.DIFFERENCE);
            canvas0.drawPath(path0, this.h);
        }
        canvas0.drawArc(rectF0, f, f1, true, this.b);
        canvas0.restore();
    }

    public void b(Canvas canvas0, Matrix matrix0, RectF rectF0, int v) {
        rectF0.bottom += (float)v;
        rectF0.offset(0.0f, ((float)(-v)));
        a.i[0] = this.f;
        a.i[1] = this.e;
        a.i[2] = this.d;
        LinearGradient linearGradient0 = new LinearGradient(rectF0.left, rectF0.top, rectF0.left, rectF0.bottom, a.i, a.j, Shader.TileMode.CLAMP);
        this.c.setShader(linearGradient0);
        canvas0.save();
        canvas0.concat(matrix0);
        canvas0.drawRect(rectF0, this.c);
        canvas0.restore();
    }

    public Paint c() {
        return this.a;
    }

    public void d(int v) {
        this.d = d.k(v, 68);
        this.e = d.k(v, 20);
        this.f = d.k(v, 0);
        this.a.setColor(this.d);
    }
}

