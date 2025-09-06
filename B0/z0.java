package B0;

import C0.c;
import G3.h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import co.median.android.MainActivity;
import co.median.android.widget.GoNativeDrawerLayout;
import com.google.android.material.navigation.NavigationView;
import java.util.LinkedHashMap;
import java.util.Map;
import l3.u;
import org.json.JSONArray;
import z3.k;

public final class z0 {
    private final MainActivity a;
    private final GoNativeDrawerLayout b;
    private b c;
    private final NavigationView d;
    private final RelativeLayout e;
    private final ExpandableListView f;
    private final T g;
    private final Map h;
    private boolean i;
    private boolean j;
    private String k;

    public z0(MainActivity mainActivity0) {
        public static final class a extends BroadcastReceiver {
            final z0 a;

            a(z0 z00) {
                this.a = z00;
                super();
            }

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                k.e(context0, "context");
                k.e(intent0, "intent");
                if(intent0.getAction() != null && k.a(intent0.getAction(), "io.gonative.android.AppConfig.processedMenu")) {
                    this.a.s(this.a.k);
                }
            }
        }

        k.e(mainActivity0, "main");
        super();
        this.a = mainActivity0;
        View view0 = mainActivity0.findViewById(0x7F0900AF);  // id:drawer_layout
        k.d(view0, "findViewById(...)");
        this.b = (GoNativeDrawerLayout)view0;
        View view1 = mainActivity0.findViewById(0x7F090145);  // id:nav_menu
        k.d(view1, "findViewById(...)");
        this.d = (NavigationView)view1;
        this.e = (RelativeLayout)((NavigationView)view1).findViewById(0x7F0900DC);  // id:header_layout
        ExpandableListView expandableListView0 = (ExpandableListView)((NavigationView)view1).findViewById(0x7F0900B0);  // id:drawer_list
        this.f = expandableListView0;
        this.g = new T(mainActivity0, expandableListView0);
        this.h = new LinkedHashMap();
        this.i = true;
        this.j = true;
        this.k = "default";
        a z0$a0 = new a(this);
        X.a.b(mainActivity0).c(z0$a0, new IntentFilter("io.gonative.android.AppConfig.processedMenu"));
    }

    public final void d(String s) {
        k.e(s, "url");
        this.g.a(s);
    }

    public final void e(String s) {
        k.e(s, "url");
        I0.a a0 = I0.a.V(this.a);
        this.k(a0.m0(s));
        boolean z = true;
        if(this.b.s(0x800003) != 1) {
            GoNativeDrawerLayout goNativeDrawerLayout0 = this.b;
            if(!a0.F || !this.a.O1()) {
                z = false;
            }
            goNativeDrawerLayout0.setDisableTouch(z);
        }
    }

    public final void f() {
        this.b.j();
    }

    public final MainActivity g() {
        return this.a;
    }

    private final boolean h(MenuItem menuItem0) {
        String s = (String)this.h.get(menuItem0);
        if(s != null) {
            this.a.o2().d(s, true);
            return true;
        }
        return false;
    }

    public final boolean i() {
        return this.b.F(this.d);
    }

    public final boolean j(MenuItem menuItem0) {
        k.e(menuItem0, "menuItem");
        return this.c != null && this.c.h(menuItem0);
    }

    private final void k(boolean z) {
        if(!this.i) {
            return;
        }
        I0.a a0 = I0.a.V(this.a);
        if(!a0.L) {
            return;
        }
        this.b.setDrawerLockMode(!z);
        if((this.j || a0.L0) && z) {
            Toolbar toolbar0 = (Toolbar)this.a.findViewById(0x7F0901FD);  // id:toolbar
            if(toolbar0 != null) {
                toolbar0.setVisibility(0);
            }
        }
        androidx.appcompat.app.a a1 = this.a.a1();
        if(a1 != null) {
            a1.s(z);
            if(a0.O != null && !h.H(a0.O)) {
                int v = this.a.getResources().getDimensionPixelSize(0x7F070055);  // dimen:action_menu_icon_size
                int v1 = androidx.core.content.a.getColor(this.a, 0x7F06033B);  // color:titleTextColor
                String s = a0.O;
                k.d(s, "sideBarMenuIcon");
                a1.v(new c(this.a, s, v, v1).c());
            }
        }
    }

    public final void l(boolean z) {
        this.j = z;
        this.k(z);
    }

    private final void m() {
        I0.a a0 = I0.a.V(this.a);
        if(!a0.Q0 && !a0.R0) {
            this.e.setVisibility(8);
        }
        if(!a0.Q0) {
            ImageView imageView0 = (ImageView)this.e.findViewById(0x7F090050);  // id:app_logo
            if(imageView0 != null) {
                imageView0.setVisibility(8);
            }
        }
        TextView textView0 = (TextView)this.e.findViewById(0x7F090051);  // id:app_name
        if(textView0 != null) {
            if(a0.R0) {
                textView0.setText(a0.g);
                return;
            }
            textView0.setVisibility(4);
        }
    }

    public final void n(boolean z) {
        public static final class B0.z0.b extends b {
            final z0 l;
            final I0.a m;

            B0.z0.b(z0 z00, I0.a a0, MainActivity mainActivity0, GoNativeDrawerLayout goNativeDrawerLayout0) {
                this.l = z00;
                this.m = a0;
                super(mainActivity0, goNativeDrawerLayout0, 0x7F120071, 0x7F120070);  // string:drawer_open "Open drawer"
            }

            @Override  // androidx.drawerlayout.widget.DrawerLayout$d
            public void a(View view0) {
                k.e(view0, "drawerView");
                this.l.b.setDisableTouch(false);
            }

            @Override  // androidx.drawerlayout.widget.DrawerLayout$d
            public void b(View view0) {
                k.e(view0, "view");
                this.l.b.setDisableTouch(this.m.F && this.l.g().O1());
            }
        }

        this.i = z;
        I0.a a0 = I0.a.V(this.a);
        if(z) {
            B0.z0.b z0$b0 = new B0.z0.b(this, a0, this.a, this.b);
            z0$b0.j(true);
            z0$b0.e().c(androidx.core.content.a.getColor(this.a, 0x7F06033B));  // color:titleTextColor
            this.c = z0$b0;
        }
        y0 y00 = (MenuItem menuItem0) -> {
            k.e(menuItem0, "item");
            this.f();
            return this.h(menuItem0);
        };
        this.d.setNavigationItemSelectedListener(y00);
        this.m();
        this.s(this.k);
    }

    // 检测为 Lambda 实现
    private static final boolean o(z0 z00, MenuItem menuItem0) [...]

    public final void p(boolean z) {
        if(z) {
            GoNativeDrawerLayout goNativeDrawerLayout0 = this.b;
            goNativeDrawerLayout0.setDrawerLockMode(0);
            b b0 = this.c;
            if(b0 != null) {
                goNativeDrawerLayout0.c(b0);
            }
        }
        else {
            GoNativeDrawerLayout goNativeDrawerLayout1 = this.b;
            goNativeDrawerLayout1.setDrawerLockMode(1);
            b b1 = this.c;
            if(b1 != null) {
                goNativeDrawerLayout1.S(b1);
            }
        }
    }

    public final u q(Configuration configuration0) {
        k.e(configuration0, "newConfig");
        b b0 = this.c;
        if(b0 != null) {
            b0.g(configuration0);
            return u.a;
        }
        return null;
    }

    public final u r() {
        b b0 = this.c;
        if(b0 != null) {
            b0.l();
            return u.a;
        }
        return null;
    }

    public final void s(String s) {
        k.e(s, "status");
        this.k = s;
        JSONArray jSONArray0 = (JSONArray)I0.a.V(this.a).K.get(s);
        this.g.m(jSONArray0);
    }
}

