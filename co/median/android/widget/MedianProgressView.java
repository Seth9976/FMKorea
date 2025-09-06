package co.median.android.widget;

import J0.b;
import N1.f;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.a;
import z3.g;
import z3.k;

public final class MedianProgressView extends FrameLayout {
    private final long f;

    public MedianProgressView(Context context0, AttributeSet attributeSet0) {
        k.e(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public MedianProgressView(Context context0, AttributeSet attributeSet0, int v) {
        k.e(context0, "context");
        super(context0, attributeSet0, v);
        this.f = 60L;
    }

    public MedianProgressView(Context context0, AttributeSet attributeSet0, int v, int v1, g g0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final void b() {
        this.animate().alpha(0.0f).setDuration(this.f).withEndAction(() -> this.setVisibility(4));
    }

    // 检测为 Lambda 实现
    private static final void c(MedianProgressView medianProgressView0) [...]

    public final void d() {
        this.setAlpha(1.0f);
        this.setVisibility(4);
    }

    public final void e() {
        f f0 = new f(this.getContext());
        f0.setIndeterminate(true);
        f0.setIndicatorColor(new int[]{a.getColor(f0.getContext(), 0x7F060320)});  // color:progress_indicator
        this.addView(f0);
    }

    public final void f() {
        this.setVisibility(0);
        this.setAlpha(1.0f);
    }

    public final void setProgressView(b b0) {
        k.e(b0, "progressViewItem");
        throw null;
    }
}

