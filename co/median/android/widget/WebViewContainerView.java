package co.median.android.widget;

import I0.a;
import I0.d;
import I0.j;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import co.median.android.GoNativeApplication;
import co.median.android.MainActivity;
import co.median.android.m;
import co.median.android.w;
import java.lang.reflect.InvocationTargetException;

public class WebViewContainerView extends FrameLayout {
    private ViewGroup f;
    private boolean g;

    public WebViewContainerView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.g = false;
        this.a(context0);
    }

    private void a(Context context0) {
        if(a.V(context0).Y3) {
            try {
                this.f = (ViewGroup)Class.forName("co.median.plugins.android.gecko.GNGeckoView").getConstructor(Context.class).newInstance(context0);
                this.g = true;
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
        else {
            this.f = new m(context0);
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -1);
        this.f.setLayoutParams(viewGroup$LayoutParams0);
        this.addView(this.f);
    }

    public void b(MainActivity mainActivity0, boolean z) {
        if(this.g) {
            try {
                Class class0 = Class.forName("co.median.plugins.android.gecko.WebViewSetup");
                class0.getMethod("setupWebviewForActivity", Activity.class, j.class, d.class, Boolean.TYPE).invoke(class0, mainActivity0, ((j)this.f), ((GoNativeApplication)mainActivity0.getApplication()).q, Boolean.valueOf(z));
            }
            catch(ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException classNotFoundException0) {
                classNotFoundException0.printStackTrace();
            }
            return;
        }
        w.c(this.getWebview(), mainActivity0);
    }

    public j getWebview() {
        return (j)this.f;
    }
}

