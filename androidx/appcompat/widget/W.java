package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import e.a;

public class w extends SeekBar {
    private final x f;

    public w(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, a.J);
    }

    public w(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        Y.a(this, this.getContext());
        x x0 = new x(this);
        this.f = x0;
        x0.c(attributeSet0, v);
    }

    @Override  // android.widget.AbsSeekBar
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f.h();
    }

    @Override  // android.widget.AbsSeekBar
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f.i();
    }

    @Override  // android.widget.AbsSeekBar
    protected void onDraw(Canvas canvas0) {
        synchronized(this) {
            super.onDraw(canvas0);
            this.f.g(canvas0);
        }
    }
}

