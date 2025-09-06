package co.median.android;

import B0.C0;
import B0.E0;
import B0.N;
import I0.a;
import I0.g;
import I0.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView.c;
import g.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class s implements c {
    static class b {
        Pattern a;
        JSONArray b;

        private b() {
        }

        b(E0 e00) {
        }
    }

    private final MainActivity a;
    private final BottomNavigationView b;
    private final a c;
    private String d;
    private String e;
    private JSONArray f;
    private Map g;
    private final int h;
    private final int i;
    private final Map j;
    private boolean k;
    private boolean l;
    private BroadcastReceiver m;
    private static final String n = "co.median.android.s";

    static {
    }

    s(MainActivity mainActivity0, BottomNavigationView bottomNavigationView0) {
        class co.median.android.s.a extends BroadcastReceiver {
            final s a;

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                if(intent0.getAction() != null && intent0.getAction().equals("io.gonative.android.AppConfig.processedTabNavigation")) {
                    s.this.d = null;
                    s.this.l();
                    s.this.h(s.this.e);
                }
            }
        }

        this.j = new HashMap();
        this.l = true;
        this.a = mainActivity0;
        this.b = bottomNavigationView0;
        bottomNavigationView0.setOnItemSelectedListener(this);
        this.c = a.V(mainActivity0);
        this.h = mainActivity0.getResources().getInteger(0x7F0A004D);  // integer:tabbar_icon_size
        this.i = androidx.core.content.a.getColor(mainActivity0, 0x7F06033A);  // color:tabBarTextColor
        this.m = new co.median.android.s.a(this);
        X.a.b(mainActivity0).c(this.m, new IntentFilter("io.gonative.android.AppConfig.processedTabNavigation"));
        this.l();
    }

    @Override  // com.google.android.material.navigation.NavigationBarView$c
    public boolean a(MenuItem menuItem0) {
        JSONArray jSONArray0 = this.f;
        if(jSONArray0 != null) {
            JSONObject jSONObject0 = jSONArray0.optJSONObject(menuItem0.getItemId());
            String s = jSONObject0.optString("url");
            String s1 = jSONObject0.optString("javascript");
            if(!this.l) {
                this.l = true;
                return true;
            }
            if(!TextUtils.isEmpty(s)) {
                if(!TextUtils.isEmpty(s1)) {
                    this.a.o2().f(s, s1, true, true);
                    return true;
                }
                this.a.o2().e(s, true, true);
            }
        }
        return true;
    }

    public void g(String s) {
        if(this.f == null) {
            return;
        }
        for(int v = 0; v < this.f.length(); ++v) {
            List list0 = this.j(v);
            if(list0 != null) {
                for(Object object0: list0) {
                    if(((Pattern)object0).matcher(s).matches()) {
                        this.b.getMenu().findItem(v).setChecked(true);
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
    }

    public void h(String s) {
        String s1;
        this.e = s;
        if(this.a != null && s != null) {
            if(this.k) {
                this.g(s);
                return;
            }
            ArrayList arrayList0 = this.c.d0;
            ArrayList arrayList1 = this.c.e0;
            if(arrayList0 != null && arrayList1 != null) {
                for(int v = 0; true; ++v) {
                    s1 = null;
                    if(v >= arrayList0.size()) {
                        break;
                    }
                    if(((Pattern)arrayList0.get(v)).matcher(s).matches()) {
                        s1 = (String)arrayList1.get(v);
                        break;
                    }
                }
                this.q(s1);
                if(s1 != null) {
                    this.g(s);
                }
                return;
            }
            this.t(false);
        }
    }

    public void i() {
        Menu menu0 = this.b.getMenu();
        menu0.setGroupCheckable(0, true, false);
        for(int v = 0; v < menu0.size(); ++v) {
            menu0.getItem(v).setChecked(false);
        }
        menu0.setGroupCheckable(0, true, true);
    }

    private List j(int v) {
        if(this.f != null && v >= 0 && v < this.f.length()) {
            JSONObject jSONObject0 = this.f.optJSONObject(v);
            if(jSONObject0 == null) {
                return null;
            }
            if(this.j.containsKey(jSONObject0)) {
                return (List)this.j.get(jSONObject0);
            }
            List list0 = this.k(jSONObject0);
            this.j.put(jSONObject0, list0);
            return list0;
        }
        return null;
    }

    private List k(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        Object object0 = jSONObject0.opt("regex");
        return object0 == null ? null : l.c(object0);
    }

    private void l() {
        ArrayList arrayList0 = this.c.d0;
        ArrayList arrayList1 = this.c.e0;
        if(arrayList0 != null && arrayList1 != null) {
            this.g = new HashMap();
            HashMap hashMap0 = new HashMap();
            for(int v = 0; v < arrayList1.size(); ++v) {
                hashMap0.put(((String)arrayList1.get(v)), ((Pattern)arrayList0.get(v)));
            }
            for(Object object0: this.c.c0.entrySet()) {
                b s$b0 = new b(null);
                s$b0.b = (JSONArray)((Map.Entry)object0).getValue();
                s$b0.a = (Pattern)hashMap0.get(((Map.Entry)object0).getKey());
                this.g.put(((String)((Map.Entry)object0).getKey()), s$b0);
            }
        }
    }

    // 检测为 Lambda 实现
    private void m(int v) [...]

    // 检测为 Lambda 实现
    private void n(boolean z) [...]

    public boolean o(String s, String s1) {
        if(s == null) {
            return false;
        }
        if(s1 == null) {
            s1 = "";
        }
        if(this.f != null) {
            for(int v = 0; v < this.f.length(); ++v) {
                JSONObject jSONObject0 = this.f.optJSONObject(v);
                if(jSONObject0 != null && (s.equals(jSONObject0.optString("url")) && s1.equals(jSONObject0.optString("javascript")))) {
                    BottomNavigationView bottomNavigationView0 = this.b;
                    if(bottomNavigationView0 != null) {
                        bottomNavigationView0.setSelectedItemId(v);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void p(int v, boolean z) {
        if(v >= 0 && v < this.b.getMenu().size()) {
            this.l = z;
            this.b.setSelectedItemId(v);
        }
    }

    private void q(String s) {
        boolean z = false;
        if(s == null) {
            this.d = null;
            this.t(false);
            return;
        }
        if(this.d == null || !this.d.equals(s)) {
            this.d = s;
            this.r(((JSONArray)a.V(this.a).c0.get(s)));
            if(this.b.getMenu().size() != 0) {
                z = true;
            }
            this.t(z);
        }
    }

    private void r(JSONArray jSONArray0) {
        this.f = jSONArray0;
        if(jSONArray0 == null) {
            this.b.getMenu().clear();
            return;
        }
        Menu menu0 = this.b.getMenu();
        int v = menu0.size();
        int v1 = jSONArray0.length();
        int v2 = -1;
        for(int v3 = 0; v3 < jSONArray0.length(); ++v3) {
            if(v3 > 4) {
                g.a().b("co.median.android.s", "Tab menu items list should not have more than 5 items");
                break;
            }
            JSONObject jSONObject0 = jSONArray0.optJSONObject(v3);
            if(jSONObject0 != null) {
                String s = jSONObject0.optString("label");
                String s1 = jSONObject0.optString("icon");
                String s2 = jSONObject0.optString("activeIcon");
                String s3 = jSONObject0.optString("inactiveIcon");
                if(!s.isEmpty() || !s1.isEmpty() || !s2.isEmpty() || !jSONObject0.optString("url").isEmpty()) {
                    if(s1.isEmpty()) {
                        s1 = s2.isEmpty() ? "faw_question" : s2;
                    }
                    if(s2.isEmpty()) {
                        s2 = s1;
                    }
                    if(s3.isEmpty()) {
                        s3 = s1;
                    }
                    e e0 = N.a(this.a, s2, s3, this.h, this.i);
                    if(v3 < v) {
                        MenuItem menuItem0 = menu0.getItem(v3);
                        if(menuItem0 != null) {
                            menuItem0.setTitle(s);
                            menuItem0.setIcon(e0);
                        }
                    }
                    else {
                        menu0.add(0, v3, 0, s).setIcon(e0);
                    }
                    if(jSONObject0.optBoolean("selected")) {
                        v2 = v3;
                    }
                }
            }
        }
        if(v > v1) {
            for(int v4 = v1; v4 < v; ++v4) {
                MenuItem menuItem1 = menu0.getItem(v1);
                if(menuItem1 != null) {
                    menu0.removeItem(menuItem1.getItemId());
                }
            }
        }
        if(v2 > -1) {
            new Handler().postDelayed(() -> this.p(v2, false), 10L);
        }
    }

    public void s(JSONObject jSONObject0, int v) {
        if(jSONObject0 == null) {
            return;
        }
        this.k = true;
        JSONArray jSONArray0 = jSONObject0.optJSONArray("items");
        if(jSONArray0 != null) {
            this.r(jSONArray0);
        }
        if(v != -1) {
            b s$b0 = (b)this.g.get(Integer.toString(v));
            if(s$b0 != null && jSONArray0 == null) {
                this.r(s$b0.b);
                goto label_12;
            }
            return;
        }
    label_12:
        Object object0 = jSONObject0.opt("enabled");
        if(object0 instanceof Boolean) {
            this.t(((Boolean)object0).booleanValue());
        }
    }

    public void t(boolean z) {
        C0 c00 = () -> {
            if(z) {
                this.b.setVisibility(0);
                return;
            }
            this.b.setVisibility(8);
        };
        this.a.runOnUiThread(c00);
    }

    public void u() {
        if(this.m != null) {
            X.a.b(this.a).e(this.m);
            this.m = null;
        }
    }
}

