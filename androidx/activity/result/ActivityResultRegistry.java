package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class ActivityResultRegistry {
    static class c {
        final a a;
        final d.a b;

        c(a a0, d.a a1) {
            this.a = a0;
            this.b = a1;
        }
    }

    static class d {
        final h a;
        private final ArrayList b;

        d(h h0) {
            this.a = h0;
            this.b = new ArrayList();
        }

        void a(l l0) {
            this.a.a(l0);
            this.b.add(l0);
        }

        void b() {
            for(Object object0: this.b) {
                this.a.c(((l)object0));
            }
            this.b.clear();
        }
    }

    private final Map a;
    final Map b;
    private final Map c;
    ArrayList d;
    final transient Map e;
    final Map f;
    final Bundle g;

    public ActivityResultRegistry() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new Bundle();
    }

    private void a(int v, String s) {
        this.a.put(v, s);
        this.b.put(s, v);
    }

    public final boolean b(int v, int v1, Intent intent0) {
        String s = (String)this.a.get(v);
        if(s == null) {
            return false;
        }
        this.d(s, v1, intent0, ((c)this.e.get(s)));
        return true;
    }

    public final boolean c(int v, Object object0) {
        String s = (String)this.a.get(v);
        if(s == null) {
            return false;
        }
        c activityResultRegistry$c0 = (c)this.e.get(s);
        if(activityResultRegistry$c0 == null) {
            this.g.remove(s);
            this.f.put(s, object0);
        }
        else {
            a a0 = activityResultRegistry$c0.a;
            if(a0 == null) {
                this.g.remove(s);
                this.f.put(s, object0);
                return true;
            }
            else if(this.d.remove(s)) {
                a0.a(object0);
                return true;
            }
        }
        return true;
    }

    private void d(String s, int v, Intent intent0, c activityResultRegistry$c0) {
        if(activityResultRegistry$c0 != null && activityResultRegistry$c0.a != null && this.d.contains(s)) {
            Object object0 = activityResultRegistry$c0.b.c(v, intent0);
            activityResultRegistry$c0.a.a(object0);
            this.d.remove(s);
            return;
        }
        this.f.remove(s);
        ActivityResult activityResult0 = new ActivityResult(v, intent0);
        this.g.putParcelable(s, activityResult0);
    }

    private int e() {
        int v;
        for(v = B3.c.f.c(0x7FFF0000); this.a.containsKey(((int)(v + 0x10000))); v = B3.c.f.c(0x7FFF0000)) {
        }
        return v + 0x10000;
    }

    public abstract void f(int arg1, d.a arg2, Object arg3, androidx.core.app.c arg4);

    public final void g(Bundle bundle0) {
        if(bundle0 == null) {
            return;
        }
        ArrayList arrayList0 = bundle0.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList arrayList1 = bundle0.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if(arrayList1 != null && arrayList0 != null) {
            this.d = bundle0.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle1 = bundle0.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            this.g.putAll(bundle1);
            for(int v = 0; v < arrayList1.size(); ++v) {
                String s = (String)arrayList1.get(v);
                if(this.b.containsKey(s)) {
                    Integer integer0 = (Integer)this.b.remove(s);
                    if(!this.g.containsKey(s)) {
                        this.a.remove(integer0);
                    }
                }
                this.a(((int)(((Integer)arrayList0.get(v)))), ((String)arrayList1.get(v)));
            }
        }
    }

    public final void h(Bundle bundle0) {
        bundle0.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.b.values()));
        bundle0.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.b.keySet()));
        bundle0.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.d));
        bundle0.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", ((Bundle)this.g.clone()));
    }

    public final b i(String s, n n0, d.a a0, a a1) {
        class androidx.activity.result.ActivityResultRegistry.a extends b {
            final String a;
            final d.a b;
            final ActivityResultRegistry c;

            androidx.activity.result.ActivityResultRegistry.a(String s, d.a a0) {
                this.a = s;
                this.b = a0;
                super();
            }

            @Override  // androidx.activity.result.b
            public void b(Object object0, androidx.core.app.c c0) {
                Integer integer0 = (Integer)ActivityResultRegistry.this.b.get(this.a);
                if(integer0 != null) {
                    ActivityResultRegistry.this.d.add(this.a);
                    try {
                        ActivityResultRegistry.this.f(((int)integer0), this.b, object0, c0);
                        return;
                    }
                    catch(Exception exception0) {
                        ActivityResultRegistry.this.d.remove(this.a);
                        throw exception0;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.b + " and input " + object0 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }

            @Override  // androidx.activity.result.b
            public void c() {
                ActivityResultRegistry.this.l(this.a);
            }
        }

        h h0 = n0.getLifecycle();
        if(h0.b().f(androidx.lifecycle.h.b.i)) {
            throw new IllegalStateException("LifecycleOwner " + n0 + " is attempting to register while current state is " + h0.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        this.k(s);
        d activityResultRegistry$d0 = (d)this.c.get(s);
        if(activityResultRegistry$d0 == null) {
            activityResultRegistry$d0 = new d(h0);
        }
        activityResultRegistry$d0.a(new l() {
            final ActivityResultRegistry i;

            @Override  // androidx.lifecycle.l
            public void c(n n0, androidx.lifecycle.h.a h$a0) {
                if(androidx.lifecycle.h.a.ON_START.equals(h$a0)) {
                    c activityResultRegistry$c0 = new c(a1, a0);
                    ActivityResultRegistry.this.e.put(s, activityResultRegistry$c0);
                    if(ActivityResultRegistry.this.f.containsKey(s)) {
                        Object object0 = ActivityResultRegistry.this.f.get(s);
                        ActivityResultRegistry.this.f.remove(s);
                        a1.a(object0);
                    }
                    ActivityResult activityResult0 = (ActivityResult)ActivityResultRegistry.this.g.getParcelable(s);
                    if(activityResult0 != null) {
                        ActivityResultRegistry.this.g.remove(s);
                        Object object1 = a0.c(activityResult0.b(), activityResult0.a());
                        a1.a(object1);
                    }
                }
                else {
                    if(androidx.lifecycle.h.a.ON_STOP.equals(h$a0)) {
                        ActivityResultRegistry.this.e.remove(s);
                        return;
                    }
                    if(androidx.lifecycle.h.a.ON_DESTROY.equals(h$a0)) {
                        ActivityResultRegistry.this.l(s);
                    }
                }
            }
        });
        this.c.put(s, activityResultRegistry$d0);
        return new androidx.activity.result.ActivityResultRegistry.a(this, s, a0);
    }

    public final b j(String s, d.a a0, a a1) {
        class androidx.activity.result.ActivityResultRegistry.b extends b {
            final String a;
            final d.a b;
            final ActivityResultRegistry c;

            androidx.activity.result.ActivityResultRegistry.b(String s, d.a a0) {
                this.a = s;
                this.b = a0;
                super();
            }

            @Override  // androidx.activity.result.b
            public void b(Object object0, androidx.core.app.c c0) {
                Integer integer0 = (Integer)ActivityResultRegistry.this.b.get(this.a);
                if(integer0 != null) {
                    ActivityResultRegistry.this.d.add(this.a);
                    try {
                        ActivityResultRegistry.this.f(((int)integer0), this.b, object0, c0);
                        return;
                    }
                    catch(Exception exception0) {
                        ActivityResultRegistry.this.d.remove(this.a);
                        throw exception0;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.b + " and input " + object0 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }

            @Override  // androidx.activity.result.b
            public void c() {
                ActivityResultRegistry.this.l(this.a);
            }
        }

        this.k(s);
        c activityResultRegistry$c0 = new c(a1, a0);
        this.e.put(s, activityResultRegistry$c0);
        if(this.f.containsKey(s)) {
            Object object0 = this.f.get(s);
            this.f.remove(s);
            a1.a(object0);
        }
        ActivityResult activityResult0 = (ActivityResult)this.g.getParcelable(s);
        if(activityResult0 != null) {
            this.g.remove(s);
            a1.a(a0.c(activityResult0.b(), activityResult0.a()));
        }
        return new androidx.activity.result.ActivityResultRegistry.b(this, s, a0);
    }

    private void k(String s) {
        if(((Integer)this.b.get(s)) != null) {
            return;
        }
        this.a(this.e(), s);
    }

    final void l(String s) {
        if(!this.d.contains(s)) {
            Integer integer0 = (Integer)this.b.remove(s);
            if(integer0 != null) {
                this.a.remove(integer0);
            }
        }
        this.e.remove(s);
        if(this.f.containsKey(s)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + s + ": " + this.f.get(s));
            this.f.remove(s);
        }
        if(this.g.containsKey(s)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + s + ": " + this.g.getParcelable(s));
            this.g.remove(s);
        }
        d activityResultRegistry$d0 = (d)this.c.get(s);
        if(activityResultRegistry$d0 != null) {
            activityResultRegistry$d0.b();
            this.c.remove(s);
        }
    }
}

