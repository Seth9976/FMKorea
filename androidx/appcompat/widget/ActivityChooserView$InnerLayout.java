package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ActivityChooserView.InnerLayout extends LinearLayout {
    private static final int[] f;

    static {
        ActivityChooserView.InnerLayout.f = new int[]{0x10100D4};
    }

    public ActivityChooserView.InnerLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        c0 c00 = c0.u(context0, attributeSet0, ActivityChooserView.InnerLayout.f);
        this.setBackgroundDrawable(c00.g(0));
        c00.x();
    }
}

