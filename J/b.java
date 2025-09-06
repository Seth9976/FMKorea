package j;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.g;

abstract class b {
    final Context a;
    private g b;
    private g c;

    b(Context context0) {
        this.a = context0;
    }

    final MenuItem c(MenuItem menuItem0) {
        if(menuItem0 instanceof w.b) {
            if(this.b == null) {
                this.b = new g();
            }
            MenuItem menuItem1 = (MenuItem)this.b.get(((w.b)menuItem0));
            if(menuItem1 == null) {
                menuItem1 = new c(this.a, ((w.b)menuItem0));
                this.b.put(((w.b)menuItem0), menuItem1);
            }
            return menuItem1;
        }
        return menuItem0;
    }

    final SubMenu d(SubMenu subMenu0) [...] // Inlined contents

    final void e() {
        g g0 = this.b;
        if(g0 != null) {
            g0.clear();
        }
        g g1 = this.c;
        if(g1 != null) {
            g1.clear();
        }
    }

    final void f(int v) {
        if(this.b == null) {
            return;
        }
        for(int v1 = 0; v1 < this.b.size(); ++v1) {
            if(((w.b)this.b.j(v1)).getGroupId() == v) {
                this.b.l(v1);
                --v1;
            }
        }
    }

    final void g(int v) {
        if(this.b == null) {
            return;
        }
        for(int v1 = 0; v1 < this.b.size(); ++v1) {
            if(((w.b)this.b.j(v1)).getItemId() == v) {
                this.b.l(v1);
                return;
            }
        }
    }
}

