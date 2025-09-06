package androidx.appcompat.view;

import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public abstract class i implements Window.Callback {
    static abstract class a {
        static boolean a(Window.Callback window$Callback0, SearchEvent searchEvent0) {
            return window$Callback0.onSearchRequested(searchEvent0);
        }

        static ActionMode b(Window.Callback window$Callback0, ActionMode.Callback actionMode$Callback0, int v) {
            return window$Callback0.onWindowStartingActionMode(actionMode$Callback0, v);
        }
    }

    static abstract class b {
        static void a(Window.Callback window$Callback0, List list0, Menu menu0, int v) {
            window$Callback0.onProvideKeyboardShortcuts(list0, menu0, v);
        }
    }

    static abstract class c {
        static void a(Window.Callback window$Callback0, boolean z) {
            window$Callback0.onPointerCaptureChanged(z);
        }
    }

    final Window.Callback f;

    public i(Window.Callback window$Callback0) {
        if(window$Callback0 == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f = window$Callback0;
    }

    public final Window.Callback a() {
        return this.f;
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent0) {
        return this.f.dispatchGenericMotionEvent(motionEvent0);
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return this.f.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent0) {
        return this.f.dispatchKeyShortcutEvent(keyEvent0);
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        return this.f.dispatchPopulateAccessibilityEvent(accessibilityEvent0);
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        return this.f.dispatchTouchEvent(motionEvent0);
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent0) {
        return this.f.dispatchTrackballEvent(motionEvent0);
    }

    @Override  // android.view.Window$Callback
    public void onActionModeFinished(ActionMode actionMode0) {
        this.f.onActionModeFinished(actionMode0);
    }

    @Override  // android.view.Window$Callback
    public void onActionModeStarted(ActionMode actionMode0) {
        this.f.onActionModeStarted(actionMode0);
    }

    @Override  // android.view.Window$Callback
    public void onAttachedToWindow() {
        this.f.onAttachedToWindow();
    }

    @Override  // android.view.Window$Callback
    public boolean onCreatePanelMenu(int v, Menu menu0) {
        return this.f.onCreatePanelMenu(v, menu0);
    }

    @Override  // android.view.Window$Callback
    public View onCreatePanelView(int v) {
        return this.f.onCreatePanelView(v);
    }

    @Override  // android.view.Window$Callback
    public void onDetachedFromWindow() {
        this.f.onDetachedFromWindow();
    }

    @Override  // android.view.Window$Callback
    public boolean onMenuItemSelected(int v, MenuItem menuItem0) {
        return this.f.onMenuItemSelected(v, menuItem0);
    }

    @Override  // android.view.Window$Callback
    public boolean onMenuOpened(int v, Menu menu0) {
        return this.f.onMenuOpened(v, menu0);
    }

    @Override  // android.view.Window$Callback
    public void onPanelClosed(int v, Menu menu0) {
        this.f.onPanelClosed(v, menu0);
    }

    @Override  // android.view.Window$Callback
    public void onPointerCaptureChanged(boolean z) {
        c.a(this.f, z);
    }

    @Override  // android.view.Window$Callback
    public boolean onPreparePanel(int v, View view0, Menu menu0) {
        return this.f.onPreparePanel(v, view0, menu0);
    }

    @Override  // android.view.Window$Callback
    public void onProvideKeyboardShortcuts(List list0, Menu menu0, int v) {
        b.a(this.f, list0, menu0, v);
    }

    @Override  // android.view.Window$Callback
    public boolean onSearchRequested() {
        return this.f.onSearchRequested();
    }

    @Override  // android.view.Window$Callback
    public boolean onSearchRequested(SearchEvent searchEvent0) {
        return a.a(this.f, searchEvent0);
    }

    @Override  // android.view.Window$Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams windowManager$LayoutParams0) {
        this.f.onWindowAttributesChanged(windowManager$LayoutParams0);
    }

    @Override  // android.view.Window$Callback
    public void onWindowFocusChanged(boolean z) {
        this.f.onWindowFocusChanged(z);
    }

    @Override  // android.view.Window$Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0, int v) {
        return a.b(this.f, actionMode$Callback0, v);
    }
}

