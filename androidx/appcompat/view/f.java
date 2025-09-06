package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.g;
import j.c;
import j.d;
import java.util.ArrayList;

public class f extends ActionMode {
    public static class a implements androidx.appcompat.view.b.a {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList c;
        final g d;

        public a(Context context0, ActionMode.Callback actionMode$Callback0) {
            this.b = context0;
            this.a = actionMode$Callback0;
            this.c = new ArrayList();
            this.d = new g();
        }

        @Override  // androidx.appcompat.view.b$a
        public void a(b b0) {
            ActionMode actionMode0 = this.e(b0);
            this.a.onDestroyActionMode(actionMode0);
        }

        @Override  // androidx.appcompat.view.b$a
        public boolean b(b b0, Menu menu0) {
            ActionMode actionMode0 = this.e(b0);
            Menu menu1 = this.f(menu0);
            return this.a.onCreateActionMode(actionMode0, menu1);
        }

        @Override  // androidx.appcompat.view.b$a
        public boolean c(b b0, Menu menu0) {
            ActionMode actionMode0 = this.e(b0);
            Menu menu1 = this.f(menu0);
            return this.a.onPrepareActionMode(actionMode0, menu1);
        }

        @Override  // androidx.appcompat.view.b$a
        public boolean d(b b0, MenuItem menuItem0) {
            ActionMode actionMode0 = this.e(b0);
            c c0 = new c(this.b, ((w.b)menuItem0));
            return this.a.onActionItemClicked(actionMode0, c0);
        }

        public ActionMode e(b b0) {
            int v = this.c.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ActionMode actionMode0 = (f)this.c.get(v1);
                if(actionMode0 != null && actionMode0.b == b0) {
                    return actionMode0;
                }
            }
            ActionMode actionMode1 = new f(this.b, b0);
            this.c.add(actionMode1);
            return actionMode1;
        }

        private Menu f(Menu menu0) {
            Menu menu1 = (Menu)this.d.get(menu0);
            if(menu1 == null) {
                menu1 = new d(this.b, ((w.a)menu0));
                this.d.put(menu0, menu1);
            }
            return menu1;
        }
    }

    final Context a;
    final b b;

    public f(Context context0, b b0) {
        this.a = context0;
        this.b = b0;
    }

    @Override  // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override  // android.view.ActionMode
    public View getCustomView() {
        return this.b.d();
    }

    @Override  // android.view.ActionMode
    public Menu getMenu() {
        w.a a0 = (w.a)this.b.e();
        return new d(this.a, a0);
    }

    @Override  // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override  // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override  // android.view.ActionMode
    public Object getTag() {
        return this.b.h();
    }

    @Override  // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.i();
    }

    @Override  // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    @Override  // android.view.ActionMode
    public void invalidate() {
        this.b.k();
    }

    @Override  // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.l();
    }

    @Override  // android.view.ActionMode
    public void setCustomView(View view0) {
        this.b.m(view0);
    }

    @Override  // android.view.ActionMode
    public void setSubtitle(int v) {
        this.b.n(v);
    }

    @Override  // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence0) {
        this.b.o(charSequence0);
    }

    @Override  // android.view.ActionMode
    public void setTag(Object object0) {
        this.b.p(object0);
    }

    @Override  // android.view.ActionMode
    public void setTitle(int v) {
        this.b.q(v);
    }

    @Override  // android.view.ActionMode
    public void setTitle(CharSequence charSequence0) {
        this.b.r(charSequence0);
    }

    @Override  // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }
}

