package androidx.core.widget;

import android.widget.ListView;

public class f extends a {
    private final ListView x;

    public f(ListView listView0) {
        super(listView0);
        this.x = listView0;
    }

    @Override  // androidx.core.widget.a
    public boolean a(int v) {
        return false;
    }

    @Override  // androidx.core.widget.a
    public boolean b(int v) {
        ListView listView0 = this.x;
        int v1 = listView0.getCount();
        if(v1 == 0) {
            return false;
        }
        int v2 = listView0.getChildCount();
        int v3 = listView0.getFirstVisiblePosition();
        return v <= 0 ? v < 0 && (v3 > 0 || listView0.getChildAt(0).getTop() < 0) : v3 + v2 < v1 || listView0.getChildAt(v2 - 1).getBottom() > listView0.getHeight();
    }

    @Override  // androidx.core.widget.a
    public void j(int v, int v1) {
        this.x.scrollListBy(v1);
    }
}

