package B0;

import C0.c;
import G3.h;
import android.graphics.Color;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.SearchView.SearchAutoComplete;
import androidx.appcompat.widget.SearchView.m;
import androidx.appcompat.widget.SearchView;
import androidx.core.graphics.b;
import co.median.android.MainActivity;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import l3.q;
import org.json.JSONArray;
import org.json.JSONObject;
import z3.g;
import z3.k;
import z3.u;

public final class e {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    private final MainActivity a;
    private boolean b;
    private androidx.appcompat.app.a c;
    private final MaterialToolbar d;
    private final ImageView e;
    private final HashMap f;
    private final int g;
    private final int h;
    private final int i;
    private Menu j;
    private SearchView k;
    private String l;
    private boolean m;
    private PopupWindow n;
    public static final a o;

    static {
        e.o = new a(null);
    }

    public e(MainActivity mainActivity0) {
        k.e(mainActivity0, "main");
        super();
        this.a = mainActivity0;
        this.b = true;
        View view0 = mainActivity0.findViewById(0x7F0901FD);  // id:toolbar
        k.d(view0, "findViewById(...)");
        this.d = (MaterialToolbar)view0;
        this.e = (ImageView)mainActivity0.findViewById(0x7F0901FA);  // id:title_image
        this.f = new HashMap();
        this.g = mainActivity0.getResources().getDimensionPixelSize(0x7F070055);  // dimen:action_menu_icon_size
        this.h = mainActivity0.getResources().getDimensionPixelSize(0x7F070053);  // dimen:action_custom_overflow_menu_width
        this.i = androidx.core.content.a.getColor(mainActivity0, 0x7F06033B);  // color:titleTextColor
        mainActivity0.k1(((MaterialToolbar)view0));
    }

    private final void A(Menu menu0, List list0) {
        Drawable drawable2;
        if(list0.isEmpty()) {
            return;
        }
        Drawable drawable0 = this.d.getOverflowIcon();
        if(drawable0 == null) {
            drawable2 = null;
        }
        else {
            Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
            if(drawable$ConstantState0 == null) {
                drawable2 = null;
            }
            else {
                Drawable drawable1 = drawable$ConstantState0.newDrawable();
                drawable2 = drawable1 == null ? null : drawable1.mutate();
            }
        }
        if(drawable2 != null) {
            drawable2.setColorFilter(androidx.core.graphics.a.a(this.i, b.o));
        }
        boolean z = false;
        MenuItem menuItem0 = menu0.add(0, 99, 0, "Overflow").setIcon(drawable2).setShowAsActionFlags(2);
        k.d(menuItem0, "setShowAsActionFlags(...)");
        this.f.put(menuItem0, "overflow");
        View view0 = LayoutInflater.from(this.a).inflate(0x7F0C008B, null);  // layout:overflow_menu_list_view
        ListView listView0 = (ListView)view0.findViewById(0x7F09011D);  // id:menuListView
        for(Object object0: list0) {
            String s = ((JSONObject)object0).optString("icon");
            if(s != null && !h.H(s)) {
                z = true;
                break;
            }
            if(false) {
                break;
            }
        }
        listView0.setAdapter(new t0(this.a, list0, z));
        PopupWindow popupWindow0 = new PopupWindow(view0, -2, -2, true);
        popupWindow0.setWidth(this.h);
        popupWindow0.setElevation(10.0f);
        this.n = popupWindow0;
        listView0.setOnItemClickListener((AdapterView adapterView0, View view0, int v, long v1) -> {
            JSONObject jSONObject0 = (JSONObject)list0.get(v);
            String s = jSONObject0.optString("system");
            String s1 = jSONObject0.optString("url");
            if((s == null || h.H(s)) && s != null) {
                switch(s) {
                    case "refresh": 
                    case "share": {
                        s1 = "share";
                        break;
                    }
                    case "search": {
                        Log.e("ActionManager", "setupOverflowMenu: The \"search\" system menu is not supported on the custom overflow menu yet.");
                        s1 = "";
                    }
                }
            }
            k.b(s1);
            if(!h.H(s1)) {
                this.q(s1);
            }
            PopupWindow popupWindow0 = this.n;
            if(popupWindow0 != null) {
                popupWindow0.dismiss();
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void B(List list0, e e0, AdapterView adapterView0, View view0, int v, long v1) [...]

    private final void C(boolean z, String s) {
        if(z) {
            this.e.setVisibility(0);
            this.d.setTitle("");
            return;
        }
        this.e.setVisibility(8);
        this.d.setTitle(s);
    }

    private final void D() {
        PopupWindow popupWindow0 = this.n;
        if(popupWindow0 != null) {
            int v = this.d.getWidth();
            popupWindow0.showAsDropDown(this.d, v - this.h - 15, 0);
        }
    }

    public final void g(Menu menu0) {
        k.e(menu0, "menu");
        this.j = menu0;
        this.f.clear();
        if(this.m) {
            this.s();
        }
        I0.a a0 = I0.a.V(this.a);
        HashMap hashMap0 = a0.f0;
        if(hashMap0 != null) {
            String s = this.l;
            if(s != null) {
                JSONObject jSONObject0 = (JSONObject)hashMap0.get(s);
                if(jSONObject0 == null) {
                    return;
                }
                JSONArray jSONArray0 = jSONObject0.optJSONArray("items");
                if(jSONArray0 != null && jSONArray0.length() != 0) {
                    boolean z = jSONObject0.optBoolean("allowLeftMenu");
                    ArrayList arrayList0 = new ArrayList();
                    int v = jSONArray0.length();
                    boolean z1 = false;
                    for(int v1 = 0; v1 < v; ++v1) {
                        JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                        if(!z1 && menu0.size() == 1 && jSONArray0.length() - v1 > 1) {
                            z1 = true;
                        }
                        if(z1) {
                            k.b(jSONObject1);
                            arrayList0.add(jSONObject1);
                        }
                        else if(v1 != 0 || !z || this.m || a0.L || !this.h(jSONObject1)) {
                            this.j(menu0, v1, jSONObject1);
                        }
                        else {
                            this.m = true;
                        }
                    }
                    this.A(menu0, arrayList0);
                }
            }
        }
    }

    private final boolean h(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return false;
        }
        if(!this.b) {
            return true;
        }
        u u0 = new u();
        u0.f = jSONObject0.optString("url");
        String s = jSONObject0.optString("icon");
        String s1 = jSONObject0.optString("system");
        if(s1 != null && !h.H(s1) && s1 != null) {
            switch(s1) {
                case "refresh": {
                    u0.f = "refresh";
                    if(s != null && !h.H(s)) {
                        s = "fa-rotate-right";
                    }
                    break;
                }
                case "search": {
                    Log.e("ActionManager", "addAsLeftActionMenu: The \"search\" system menu is not supported as a left-menu yet.");
                    return false;
                }
                case "share": {
                    u0.f = "share";
                    if(s != null && !h.H(s)) {
                        s = "fa fa-search";
                    }
                }
            }
        }
        k.b(s);
        Drawable drawable0 = new c(this.a, s, this.g, this.i).c();
        this.d.setNavigationIcon(drawable0);
        this.d.setNavigationIconTint(this.i);
        d d0 = (View view0) -> {
            String s = (String)u0.f;
            if(k.a(s, "share")) {
                this.a.w(null, null);
                return;
            }
            if(k.a(s, "refresh")) {
                this.a.c0();
                return;
            }
            this.a.o2().d(((String)u0.f), true);
        };
        this.d.setNavigationOnClickListener(d0);
        return true;
    }

    // 检测为 Lambda 实现
    private static final void i(u u0, e e0, View view0) [...]

    private final void j(Menu menu0, int v, JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        if(this.k(menu0, jSONObject0, v)) {
            return;
        }
        String s = jSONObject0.optString("label");
        String s1 = jSONObject0.optString("icon");
        String s2 = jSONObject0.optString("url");
        k.b(s1);
        Drawable drawable0 = new c(this.a, s1, this.g, this.i).c();
        MenuItem menuItem0 = menu0.add(0, v, 0, s).setIcon(drawable0).setShowAsActionFlags(2);
        k.d(menuItem0, "setShowAsActionFlags(...)");
        this.f.put(menuItem0, s2);
    }

    private final boolean k(Menu menu0, JSONObject jSONObject0, int v) {
        q q0;
        String s = jSONObject0.optString("system");
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        String s1 = jSONObject0.optString("label");
        String s2 = jSONObject0.optString("icon");
        String s3 = jSONObject0.optString("url");
        if(s != null) {
            switch(s) {
                case "refresh": {
                    q0 = new q("refresh", "fa-rotate-right", "Refresh");
                    break;
                }
                case "search": {
                    q0 = new q("search", "fa fa-search", "Search");
                    break;
                }
                case "share": {
                    q0 = new q("share", "fa-share", "Share");
                    break;
                }
                default: {
                    return false;
                }
            }
            String s4 = (String)q0.a();
            String s5 = (String)q0.b();
            String s6 = (String)q0.c();
            if(TextUtils.isEmpty(s1)) {
                s1 = s6;
            }
            if(TextUtils.isEmpty(s2)) {
                s2 = s5;
            }
            k.b(s2);
            Drawable drawable0 = new c(this.a, s2, this.g, this.i).c();
            MenuItem menuItem0 = menu0.add(0, v, 0, s1).setIcon(drawable0).setShowAsActionFlags(1);
            k.d(menuItem0, "setShowAsActionFlags(...)");
            if(k.a(s4, "search")) {
                k.b(s3);
                this.o(menuItem0, s3, drawable0);
            }
            this.f.put(menuItem0, s4);
            return true;
        }
        return false;
    }

    public final boolean l() {
        if(this.k != null && this.k.hasFocus()) {
            this.n();
            return true;
        }
        return false;
    }

    public final void m(String s) {
        if(s != null && !h.H(s)) {
            e.x(this, s, false, 2, null);
            I0.a a0 = I0.a.V(this.a);
            ArrayList arrayList0 = a0.g0;
            ArrayList arrayList1 = a0.h0;
            if(arrayList0 != null && arrayList1 != null) {
                int v1 = arrayList0.size();
                for(int v = 0; v < v1; ++v) {
                    if(((Pattern)arrayList0.get(v)).matcher(s).matches()) {
                        this.t(((String)arrayList1.get(v)));
                        return;
                    }
                }
                return;
            }
            this.t(null);
        }
    }

    private final void n() {
        SearchView searchView0 = this.k;
        if(searchView0 != null) {
            searchView0.setIconified(true);
        }
        this.a.invalidateOptionsMenu();
    }

    private final void o(MenuItem menuItem0, String s, Drawable drawable0) {
        public static final class B0.e.b implements m {
            final e a;
            final String b;

            B0.e.b(e e0, String s) {
                this.a = e0;
                this.b = s;
                super();
            }

            @Override  // androidx.appcompat.widget.SearchView$m
            public boolean a(String s) {
                k.e(s, "newText");
                return true;
            }

            @Override  // androidx.appcompat.widget.SearchView$m
            public boolean b(String s) {
                k.e(s, "query");
                try {
                    String s1 = URLEncoder.encode(s, "UTF-8");
                    this.a.a.J2(this.b + s1);
                }
                catch(UnsupportedEncodingException unused_ex) {
                }
                return true;
            }
        }


        public static final class B0.e.c implements MenuItem.OnActionExpandListener {
            final e a;
            final MenuItem b;

            B0.e.c(e e0, MenuItem menuItem0) {
                this.a = e0;
                this.b = menuItem0;
                super();
            }

            @Override  // android.view.MenuItem$OnActionExpandListener
            public boolean onMenuItemActionCollapse(MenuItem menuItem0) {
                k.e(menuItem0, "item");
                this.a.n();
                return true;
            }

            @Override  // android.view.MenuItem$OnActionExpandListener
            public boolean onMenuItemActionExpand(MenuItem menuItem0) {
                k.e(menuItem0, "item");
                this.a.u(false, this.b);
                return true;
            }
        }

        SearchView searchView0 = new SearchView(this.a);
        searchView0.setLayoutParams(new androidx.appcompat.widget.Toolbar.g(-1, -2));
        searchView0.setMaxWidth(0x7FFFFFFF);
        searchView0.setOnQueryTextListener(new B0.e.b(this, s));
        searchView0.setOnQueryTextFocusChangeListener((View view0, boolean z) -> if(!z && !searchView0.L()) {
            this.n();
        });
        SearchAutoComplete searchView$SearchAutoComplete0 = (SearchAutoComplete)searchView0.findViewById(0x7F0901A8);  // id:search_src_text
        if(searchView$SearchAutoComplete0 != null) {
            searchView$SearchAutoComplete0.setTextColor(this.i);
            searchView$SearchAutoComplete0.setHintTextColor(Color.argb(0xC0, Color.red(this.i), Color.green(this.i), Color.blue(this.i)));
        }
        ImageView imageView0 = (ImageView)searchView0.findViewById(0x7F0901A3);  // id:search_close_btn
        if(imageView0 != null) {
            imageView0.setColorFilter(this.i);
        }
        this.k = searchView0;
        menuItem0.setActionView(searchView0);
        menuItem0.setShowAsActionFlags(9);
        menuItem0.setOnActionExpandListener(new B0.e.c(this, menuItem0));
    }

    // 检测为 Lambda 实现
    private static final void p(SearchView searchView0, e e0, View view0, boolean z) [...]

    private final boolean q(String s) {
        if(s != null) {
            switch(s) {
                case "overflow": {
                    this.D();
                    return true;
                }
                case "refresh": {
                    this.a.c0();
                    return true;
                }
                case "search": {
                    break;
                }
                case "share": {
                    this.a.w(null, null);
                    return true;
                }
                default: {
                    this.a.o2().d(s, true);
                    break;
                }
            }
            return true;
        }
        return false;
    }

    private final boolean r(MenuItem menuItem0) {
        return this.q(((String)this.f.get(menuItem0)));
    }

    private final void s() {
        this.d.setNavigationIcon(null);
        this.d.setNavigationOnClickListener(null);
        this.m = false;
    }

    private final void t(String s) {
        String s1 = this.l;
        if(s1 == null) {
            if(s != null) {
                this.l = s;
                this.a.invalidateOptionsMenu();
            }
        }
        else if(!k.a(s1, s)) {
            this.l = s;
            this.a.invalidateOptionsMenu();
        }
    }

    public final void u(boolean z, MenuItem menuItem0) {
        k.e(menuItem0, "exception");
        Menu menu0 = this.j;
        if(menu0 == null) {
            return;
        }
        if(menu0 != null) {
            int v = menu0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                MenuItem menuItem1 = menu0.getItem(v1);
                k.d(menuItem1, "getItem(...)");
                if(menuItem1 != menuItem0) {
                    menuItem1.setVisible(z);
                    menuItem1.setEnabled(z);
                }
            }
        }
    }

    public final void v(CharSequence charSequence0) {
        k.e(charSequence0, "title");
        if(h.H(charSequence0)) {
            return;
        }
        this.e.setVisibility(8);
        this.d.setTitle(charSequence0);
    }

    public final void w(String s, boolean z) {
        String s2;
        String s1;
        if(this.c != null && s != null && !h.H(s)) {
            I0.a a0 = I0.a.V(this.a);
            HashMap hashMap0 = a0.W(s);
            boolean z1 = true;
            boolean z2 = false;
            ArrayList arrayList0 = a0.g0;
            ArrayList arrayList1 = a0.h0;
            Boolean boolean0 = null;
            if(arrayList0 != null && arrayList1 != null) {
                int v = arrayList0.size();
                int v1 = 0;
                while(v1 < v) {
                    Object object0 = arrayList0.get(v1);
                    k.d(object0, "get(...)");
                    if(((Pattern)object0).matcher(s).matches()) {
                        JSONObject jSONObject0 = (JSONObject)a0.f0.get(arrayList1.get(v1));
                        JSONArray jSONArray0 = jSONObject0 == null ? null : jSONObject0.optJSONArray("items");
                        if(jSONArray0 == null || jSONArray0.length() <= 0) {
                            break;
                        }
                        goto label_22;
                    }
                    ++v1;
                }
            }
            z1 = false;
        label_22:
            if(!a0.L0 && !a0.L && hashMap0 == null && !z1) {
                androidx.appcompat.app.a a1 = this.c;
                if(a1 != null) {
                    a1.k();
                }
                return;
            }
            if(this.a.d().getTitle() == null) {
                s1 = "에펨코리아";
                s2 = "getString(...)";
            }
            else {
                s1 = this.a.d().getTitle();
                s2 = "getTitle(...)";
            }
            k.d(s1, s2);
            if(hashMap0 == null) {
                this.C(a0.l0(s), s1);
            }
            else {
                Object object1 = hashMap0 == null ? null : hashMap0.get("title");
                String s3 = object1 instanceof String ? ((String)object1) : null;
                if(s3 == null) {
                    s3 = "";
                }
                if(s3.length() == 0 && !z) {
                    return;
                }
                if(s3.length() != 0) {
                    s1 = s3;
                }
                this.a.setTitle(s1);
                Object object2 = hashMap0 == null ? null : hashMap0.get("showImage");
                if(object2 instanceof Boolean) {
                    boolean0 = (Boolean)object2;
                }
                if(boolean0 != null) {
                    z2 = boolean0.booleanValue();
                }
                this.C(z2, s1);
            }
            androidx.appcompat.app.a a2 = this.c;
            if(a2 != null) {
                a2.y();
            }
        }
    }

    public static void x(e e0, String s, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        e0.w(s, z);
    }

    public final void y(boolean z) {
        this.b = z;
        androidx.appcompat.app.a a0 = this.a.a1();
        if(a0 == null) {
            return;
        }
        this.c = a0;
        I0.a a1 = I0.a.V(this.a);
        androidx.appcompat.app.a a2 = this.c;
        if(a2 != null) {
            if(!z) {
                a2.s(true);
                a2.t(true);
            }
            else if(!a1.L) {
                a2.s(false);
            }
        }
        B0.c c0 = (MenuItem menuItem0) -> {
            k.b(menuItem0);
            return this.r(menuItem0);
        };
        this.d.setOnMenuItemClickListener(c0);
        Drawable drawable0 = this.d.getNavigationIcon();
        if(drawable0 != null) {
            drawable0.setColorFilter(androidx.core.graphics.a.a(this.i, b.o));
        }
    }

    // 检测为 Lambda 实现
    private static final boolean z(e e0, MenuItem menuItem0) [...]
}

