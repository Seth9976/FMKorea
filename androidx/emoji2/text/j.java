package androidx.emoji2.text;

import B.h;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

public abstract class j extends ReplacementSpan {
    private final Paint.FontMetricsInt a;
    private final p b;
    private short c;
    private short d;
    private float e;

    j(p p0) {
        this.a = new Paint.FontMetricsInt();
        this.c = -1;
        this.d = -1;
        this.e = 1.0f;
        h.h(p0, "rasterizer cannot be null");
        this.b = p0;
    }

    public final p a() {
        return this.b;
    }

    final int b() {
        return this.c;
    }

    @Override  // android.text.style.ReplacementSpan
    public int getSize(Paint paint0, CharSequence charSequence0, int v, int v1, Paint.FontMetricsInt paint$FontMetricsInt0) {
        paint0.getFontMetricsInt(this.a);
        this.e = ((float)Math.abs(this.a.descent - this.a.ascent)) * 1.0f / ((float)this.b.e());
        this.d = (short)(((int)(((float)this.b.e()) * this.e)));
        short v2 = (short)(((int)(((float)this.b.i()) * this.e)));
        this.c = v2;
        if(paint$FontMetricsInt0 != null) {
            paint$FontMetricsInt0.ascent = this.a.ascent;
            paint$FontMetricsInt0.descent = this.a.descent;
            paint$FontMetricsInt0.top = this.a.top;
            paint$FontMetricsInt0.bottom = this.a.bottom;
        }
        return v2;
    }
}

