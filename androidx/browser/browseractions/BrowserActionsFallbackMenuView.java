package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import n.a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {
    private final int f;
    private final int g;

    public BrowserActionsFallbackMenuView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f = this.getResources().getDimensionPixelOffset(a.b);
        this.g = this.getResources().getDimensionPixelOffset(a.a);
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(this.getResources().getDisplayMetrics().widthPixels - this.f * 2, this.g), 0x40000000), v1);
    }
}

