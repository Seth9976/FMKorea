package co.median.android;

import android.content.Context;
import android.util.AttributeSet;
import co.median.android.widget.b;

public class MySwipeRefreshLayout extends b {
    public interface a {
        boolean a();
    }

    private a W;

    public MySwipeRefreshLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // co.median.android.widget.b
    public boolean c() {
        a mySwipeRefreshLayout$a0 = this.W;
        return mySwipeRefreshLayout$a0 == null ? super.c() : mySwipeRefreshLayout$a0.a();
    }

    public void setCanChildScrollUpCallback(a mySwipeRefreshLayout$a0) {
        this.W = mySwipeRefreshLayout$a0;
    }
}

