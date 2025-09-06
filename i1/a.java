package I1;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewConfiguration;

public class a implements View.OnTouchListener {
    private final Dialog f;
    private final int g;
    private final int h;
    private final int i;

    public a(Dialog dialog0, Rect rect0) {
        this.f = dialog0;
        this.g = rect0.left;
        this.h = rect0.top;
        this.i = ViewConfiguration.get(dialog0.getContext()).getScaledWindowTouchSlop();
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        View view1 = view0.findViewById(0x1020002);
        int v = view1.getLeft();
        int v1 = this.g + v;
        int v2 = view1.getWidth();
        int v3 = view1.getTop();
        int v4 = this.h + v3;
        if(new RectF(((float)v1), ((float)v4), ((float)(v2 + v1)), ((float)(view1.getHeight() + v4))).contains(motionEvent0.getX(), motionEvent0.getY())) {
            return false;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        if(motionEvent0.getAction() == 1) {
            motionEvent1.setAction(4);
        }
        if(Build.VERSION.SDK_INT < 28) {
            motionEvent1.setAction(0);
            motionEvent1.setLocation(((float)(-this.i - 1)), ((float)(-this.i - 1)));
        }
        view0.performClick();
        return this.f.onTouchEvent(motionEvent1);
    }
}

