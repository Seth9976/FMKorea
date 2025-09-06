package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.app.E;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class x {
    private final Runnable a;
    private final CopyOnWriteArrayList b;
    private final Map c;

    public x(Runnable runnable0) {
        this.b = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.a = runnable0;
    }

    public void a(z z0) {
        this.b.add(z0);
        this.a.run();
    }

    public void b(Menu menu0, MenuInflater menuInflater0) {
        for(Object object0: this.b) {
            ((z)object0).c(menu0, menuInflater0);
        }
    }

    public void c(Menu menu0) {
        for(Object object0: this.b) {
            ((z)object0).b(menu0);
        }
    }

    public boolean d(MenuItem menuItem0) {
        for(Object object0: this.b) {
            if(((z)object0).a(menuItem0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public void e(Menu menu0) {
        for(Object object0: this.b) {
            ((z)object0).d(menu0);
        }
    }

    public void f(z z0) {
        this.b.remove(z0);
        E.a(this.c.remove(z0));
        this.a.run();
    }
}

