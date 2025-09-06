package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import e.a;

public class u extends RatingBar {
    private final s f;

    public u(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, a.H);
    }

    public u(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        Y.a(this, this.getContext());
        s s0 = new s(this);
        this.f = s0;
        s0.c(attributeSet0, v);
    }

    @Override  // android.widget.RatingBar
    protected void onMeasure(int v, int v1) {
        synchronized(this) {
            super.onMeasure(v, v1);
            Bitmap bitmap0 = this.f.b();
            if(bitmap0 != null) {
                this.setMeasuredDimension(View.resolveSizeAndState(bitmap0.getWidth() * this.getNumStars(), v, 0), this.getMeasuredHeight());
            }
        }
    }
}

