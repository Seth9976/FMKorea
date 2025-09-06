package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider.VisibilityListener;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class c extends b implements MenuItem {
    class a extends androidx.core.view.b implements ActionProvider.VisibilityListener {
        private androidx.core.view.b.b d;
        private final ActionProvider e;
        final c f;

        a(Context context0, ActionProvider actionProvider0) {
            super(context0);
            this.e = actionProvider0;
        }

        @Override  // androidx.core.view.b
        public boolean a() {
            return this.e.hasSubMenu();
        }

        @Override  // androidx.core.view.b
        public boolean b() {
            return this.e.isVisible();
        }

        @Override  // androidx.core.view.b
        public View c(MenuItem menuItem0) {
            return this.e.onCreateActionView(menuItem0);
        }

        @Override  // androidx.core.view.b
        public boolean d() {
            return this.e.onPerformDefaultAction();
        }

        @Override  // androidx.core.view.b
        public void e(SubMenu subMenu0) {
            this.e.onPrepareSubMenu(subMenu0);
        }

        @Override  // androidx.core.view.b
        public boolean f() {
            return this.e.overridesItemVisibility();
        }

        @Override  // androidx.core.view.b
        public void i(androidx.core.view.b.b b$b0) {
            this.d = b$b0;
            this.e.setVisibilityListener((b$b0 == null ? null : this));
        }

        static ActionProvider j(a c$a0) {
            return c$a0.e;
        }

        @Override  // android.view.ActionProvider$VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            androidx.core.view.b.b b$b0 = this.d;
            if(b$b0 != null) {
                b$b0.onActionProviderVisibilityChanged(z);
            }
        }
    }

    static class j.c.b extends FrameLayout implements androidx.appcompat.view.c {
        final CollapsibleActionView f;

        j.c.b(View view0) {
            super(view0.getContext());
            this.f = (CollapsibleActionView)view0;
            this.addView(view0);
        }

        View a() {
            return (View)this.f;
        }

        @Override  // androidx.appcompat.view.c
        public void c() {
            this.f.onActionViewExpanded();
        }

        @Override  // androidx.appcompat.view.c
        public void f() {
            this.f.onActionViewCollapsed();
        }
    }

    class j.c.c implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener a;
        final c b;

        j.c.c(MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
            this.a = menuItem$OnActionExpandListener0;
        }

        @Override  // android.view.MenuItem$OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem0) {
            MenuItem menuItem1 = c.this.c(menuItem0);
            return this.a.onMenuItemActionCollapse(menuItem1);
        }

        @Override  // android.view.MenuItem$OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem0) {
            MenuItem menuItem1 = c.this.c(menuItem0);
            return this.a.onMenuItemActionExpand(menuItem1);
        }
    }

    class d implements MenuItem.OnMenuItemClickListener {
        private final MenuItem.OnMenuItemClickListener f;
        final c g;

        d(MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
            this.f = menuItem$OnMenuItemClickListener0;
        }

        @Override  // android.view.MenuItem$OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem0) {
            MenuItem menuItem1 = c.this.c(menuItem0);
            return this.f.onMenuItemClick(menuItem1);
        }
    }

    private final w.b d;
    private Method e;

    public c(Context context0, w.b b0) {
        super(context0);
        if(b0 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.d = b0;
    }

    @Override  // android.view.MenuItem
    public boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    @Override  // android.view.MenuItem
    public boolean expandActionView() {
        return this.d.expandActionView();
    }

    @Override  // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b b0 = this.d.b();
        return b0 instanceof a ? a.j(((a)b0)) : null;
    }

    @Override  // android.view.MenuItem
    public View getActionView() {
        View view0 = this.d.getActionView();
        return view0 instanceof j.c.b ? ((j.c.b)view0).a() : view0;
    }

    @Override  // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    @Override  // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    @Override  // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    @Override  // android.view.MenuItem
    public int getGroupId() {
        return this.d.getGroupId();
    }

    @Override  // android.view.MenuItem
    public Drawable getIcon() {
        return this.d.getIcon();
    }

    @Override  // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    @Override  // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    @Override  // android.view.MenuItem
    public Intent getIntent() {
        return this.d.getIntent();
    }

    @Override  // android.view.MenuItem
    public int getItemId() {
        return this.d.getItemId();
    }

    @Override  // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    @Override  // android.view.MenuItem
    public int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    @Override  // android.view.MenuItem
    public char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    @Override  // android.view.MenuItem
    public int getOrder() {
        return this.d.getOrder();
    }

    @Override  // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.d(this.d.getSubMenu());
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitle() {
        return this.d.getTitle();
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    @Override  // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    public void h(boolean z) {
        try {
            if(this.e == null) {
                this.e = this.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.e.invoke(this.d, Boolean.valueOf(z));
            return;
        }
        catch(Exception exception0) {
        }
        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception0);
    }

    @Override  // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    @Override  // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    @Override  // android.view.MenuItem
    public boolean isCheckable() {
        return this.d.isCheckable();
    }

    @Override  // android.view.MenuItem
    public boolean isChecked() {
        return this.d.isChecked();
    }

    @Override  // android.view.MenuItem
    public boolean isEnabled() {
        return this.d.isEnabled();
    }

    @Override  // android.view.MenuItem
    public boolean isVisible() {
        return this.d.isVisible();
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider0) {
        a c$a0 = new a(this, this.a, actionProvider0);
        w.b b0 = this.d;
        if(actionProvider0 == null) {
            c$a0 = null;
        }
        b0.a(c$a0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionView(int v) {
        this.d.setActionView(v);
        View view0 = this.d.getActionView();
        if(view0 instanceof CollapsibleActionView) {
            j.c.b c$b0 = new j.c.b(view0);
            this.d.setActionView(c$b0);
        }
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionView(View view0) {
        if(view0 instanceof CollapsibleActionView) {
            view0 = new j.c.b(view0);
        }
        this.d.setActionView(view0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.d.setAlphabeticShortcut(c);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int v) {
        this.d.setAlphabeticShortcut(c, v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.d.setCheckable(z);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.d.setChecked(z);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence0) {
        this.d.setContentDescription(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.d.setEnabled(z);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(int v) {
        this.d.setIcon(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable0) {
        this.d.setIcon(drawable0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList0) {
        this.d.setIconTintList(colorStateList0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.d.setIconTintMode(porterDuff$Mode0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIntent(Intent intent0) {
        this.d.setIntent(intent0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.d.setNumericShortcut(c);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int v) {
        this.d.setNumericShortcut(c, v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        j.c.c c$c0 = menuItem$OnActionExpandListener0 == null ? null : new j.c.c(this, menuItem$OnActionExpandListener0);
        this.d.setOnActionExpandListener(c$c0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        d c$d0 = menuItem$OnMenuItemClickListener0 == null ? null : new d(this, menuItem$OnMenuItemClickListener0);
        this.d.setOnMenuItemClickListener(c$d0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setShortcut(char c, char c1) {
        this.d.setShortcut(c, c1);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setShortcut(char c, char c1, int v, int v1) {
        this.d.setShortcut(c, c1, v, v1);
        return this;
    }

    @Override  // android.view.MenuItem
    public void setShowAsAction(int v) {
        this.d.setShowAsAction(v);
    }

    @Override  // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int v) {
        this.d.setShowAsActionFlags(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(int v) {
        this.d.setTitle(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence0) {
        this.d.setTitle(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence0) {
        this.d.setTitleCondensed(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence0) {
        this.d.setTooltipText(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.d.setVisible(z);
    }
}

