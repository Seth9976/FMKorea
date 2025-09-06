package B0;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar.h;

public final class c implements h {
    public final e a;

    public c(e e0) {
        this.a = e0;
    }

    @Override  // androidx.appcompat.widget.Toolbar$h
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        return e.z(this.a, menuItem0);
    }
}

