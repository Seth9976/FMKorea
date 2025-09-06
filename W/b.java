package w;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import android.view.View;

public interface b extends MenuItem {
    b a(androidx.core.view.b arg1);

    androidx.core.view.b b();

    @Override  // android.view.MenuItem
    boolean collapseActionView();

    @Override  // android.view.MenuItem
    boolean expandActionView();

    @Override  // android.view.MenuItem
    View getActionView();

    @Override  // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override  // android.view.MenuItem
    CharSequence getContentDescription();

    @Override  // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override  // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override  // android.view.MenuItem
    int getNumericModifiers();

    @Override  // android.view.MenuItem
    CharSequence getTooltipText();

    @Override  // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override  // android.view.MenuItem
    MenuItem setActionView(int arg1);

    @Override  // android.view.MenuItem
    MenuItem setActionView(View arg1);

    @Override  // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char arg1, int arg2);

    b setContentDescription(CharSequence arg1);

    @Override  // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList arg1);

    @Override  // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode arg1);

    @Override  // android.view.MenuItem
    MenuItem setNumericShortcut(char arg1, int arg2);

    @Override  // android.view.MenuItem
    MenuItem setShortcut(char arg1, char arg2, int arg3, int arg4);

    @Override  // android.view.MenuItem
    void setShowAsAction(int arg1);

    @Override  // android.view.MenuItem
    MenuItem setShowAsActionFlags(int arg1);

    b setTooltipText(CharSequence arg1);
}

