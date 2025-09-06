package co.median.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.drawerlayout.widget.DrawerLayout;

public class GoNativeDrawerLayout extends DrawerLayout {
    private boolean a0;

    public GoNativeDrawerLayout(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public GoNativeDrawerLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a0 = false;
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        if(this.a0) {
            Log.d("SWIPE", "GNDrawerLayout disabled touch");
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        if(this.a0) {
            Log.d("SWIPE", "GNDrawerLayout disabled touch");
            return false;
        }
        return super.onTouchEvent(motionEvent0);
    }

    public void setDisableTouch(boolean z) {
        this.a0 = z;
    }
}

