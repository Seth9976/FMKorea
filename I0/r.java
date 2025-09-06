package I0;

import K0.q;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.PopupWindow;
import androidx.core.graphics.e;
import androidx.core.view.y0;
import z3.k;

public final class r {
    public static final r a;

    static {
        r.a = new r();
    }

    // 检测为 Lambda 实现
    private static final void f(q q0) [...]

    private static final void g(Activity activity0) {
        try {
            q q0 = a.V(activity0).Z();
            if(q0 == null) {
                return;
            }
            if(q0.g()) {
                return;
            }
            View view0 = activity0.findViewById(0x1020002);
            k.d(view0, "activity.findViewById(android.R.id.content)");
            int v = 0;
            View view1 = activity0.getLayoutInflater().inflate(s.a, ((ViewGroup)view0), false);
            PopupWindow popupWindow0 = new PopupWindow(view1, -2, -2);
            popupWindow0.setAnimationStyle(t.a);
            popupWindow0.setOnDismissListener(() -> {
                k.e(q0, "$widgetConfig");
                q0.k(false);
            });
            view1.setOnClickListener((View view0) -> {
                k.e(popupWindow0, "$popupWindow");
                popupWindow0.dismiss();
            });
            z3.t t0 = new z3.t();
            t0.f = 20;
            WindowInsets windowInsets0 = ((ViewGroup)view0).getRootWindowInsets();
            Integer integer0 = null;
            y0 y00 = windowInsets0 == null ? null : y0.x(windowInsets0);
            if(y00 != null) {
                e e0 = y00.f(7);
                k.d(e0, "ins.getInsets(WindowInse…Compat.Type.systemBars())");
                int v1 = e0.d;
                View view2 = ((ViewGroup)view0).findViewWithTag("bottom_navigation");
                boolean z = ((ViewGroup)view0).getPaddingBottom() > 0;
                if(view2 != null) {
                    k.d(view2, "bottomNav");
                    if(view2.getVisibility() != 0) {
                        view2 = null;
                    }
                    if(view2 != null) {
                        v = view2.getHeight();
                    }
                }
                int v2 = t0.f;
                if(z) {
                    if(v > 0) {
                        popupWindow0.setAnimationStyle(t.b);
                    }
                    v1 += v;
                }
                else {
                    Integer integer1 = v;
                    if(v > 0) {
                        integer0 = integer1;
                    }
                    if(integer0 != null) {
                        v1 = (int)integer0;
                    }
                }
                t0.f = v2 + v1;
            }
            activity0.runOnUiThread(() -> {
                k.e(popupWindow0, "$popupWindow");
                k.e(((ViewGroup)view0), "$mainView");
                k.e(t0, "$offset");
                k.e(q0, "$widgetConfig");
                popupWindow0.showAtLocation(((ViewGroup)view0), 81, 0, t0.f);
                q0.k(true);
            });
            if(q0.b() > -1L) {
                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    k.e(popupWindow0, "$popupWindow");
                    popupWindow0.dismiss();
                }, q0.b());
            }
        }
        catch(Exception exception0) {
            Log.e("MedianWidgetHelper", "showWidget: ", exception0);
        }
    }

    // 检测为 Lambda 实现
    private static final void h(Activity activity0, q q0) [...]

    // 检测为 Lambda 实现
    private static final void i(PopupWindow popupWindow0) [...]

    // 检测为 Lambda 实现
    private static final void j(PopupWindow popupWindow0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void k(PopupWindow popupWindow0, ViewGroup viewGroup0, z3.t t0, q q0) [...]

    public static final void l(Activity activity0) {
        k.e(activity0, "activity");
        q q0 = a.V(activity0).Z();
        if(q0 == null) {
            return;
        }
        if(q0.a() && q0.e() > -1L) {
            if(q0.f() <= 0L) {
                r.g(activity0);
                q0.j(System.currentTimeMillis());
            }
            else if(System.currentTimeMillis() - q0.f() >= q0.e()) {
                r.g(activity0);
                q0.j(System.currentTimeMillis());
            }
        }
    }

    public static final void m(Activity activity0) {
        k.e(activity0, "activity");
        q q0 = a.V(activity0).Z();
        if(q0 == null) {
            return;
        }
        if(!q0.a() && !q0.d()) {
            q0.i(true);
            if(q0.c() > -1L) {
                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    k.e(activity0, "$activity");
                    k.e(q0, "$widgetConfig");
                    r.g(activity0);
                    q0.h(true);
                    q0.j(System.currentTimeMillis());
                }, q0.c());
                return;
            }
            q0.h(true);
        }
    }
}

