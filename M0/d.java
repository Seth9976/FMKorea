package M0;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import b1.a;
import com.facebook.appevents.m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

final class d implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private final Set f;
    private final Handler g;
    private WeakReference h;
    private AtomicBoolean i;
    private static final Map j;

    static {
        d.j = new HashMap();
    }

    private d(Activity activity0) {
        this.f = new HashSet();
        this.h = new WeakReference(activity0);
        this.g = new Handler(Looper.getMainLooper());
        this.i = new AtomicBoolean(false);
    }

    static void a(d d0, View view0) {
        Class class0 = d.class;
        if(a.d(class0)) {
            return;
        }
        try {
            d0.d(view0);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }

    private static String b(String s, String s1) {
        Class class0 = d.class;
        if(a.d(class0)) {
            return null;
        }
        try {
            return "r2".equals(s) ? s1.replaceAll("[^\\d.]", "") : s1;
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
            return null;
        }
    }

    private void c(View view0) {
        class M0.d.a implements Runnable {
            final View f;
            final d g;

            M0.d.a(View view0) {
                this.f = view0;
                super();
            }

            @Override
            public void run() {
                if(a.d(this)) {
                    return;
                }
                try {
                    View view0 = this.f;
                    if(!(view0 instanceof EditText)) {
                        return;
                    }
                    d.a(d.this, view0);
                }
                catch(Throwable throwable0) {
                    a.b(throwable0, this);
                }
            }
        }

        if(a.d(this)) {
            return;
        }
        try {
            this.f(new M0.d.a(this, view0));
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }

    private void d(View view0) {
        if(a.d(this)) {
            return;
        }
        try {
            String s = ((EditText)view0).getText().toString().trim().toLowerCase();
            if(!s.isEmpty() && !this.f.contains(s) && s.length() <= 100) {
                this.f.add(s);
                HashMap hashMap0 = new HashMap();
                List list0 = b.b(view0);
                List list1 = null;
                for(Object object0: c.e()) {
                    c c0 = (c)object0;
                    String s1 = d.b(c0.d(), s);
                    if(c0.f().isEmpty() || b.f(s1, c0.f())) {
                        if(!b.e(list0, c0.c())) {
                            if(list1 == null) {
                                list1 = b.a(view0);
                            }
                            if(!b.e(list1, c0.c())) {
                                continue;
                            }
                        }
                        d.e(hashMap0, c0.d(), s1);
                    }
                }
                m.n(hashMap0);
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, this);
    }

    private static void e(Map map0, String s, String s1) {
        Class class0 = d.class;
        if(a.d(class0)) {
            return;
        }
        try {
            switch(s) {
                case "r3": {
                    s1 = s1.startsWith("m") || s1.startsWith("b") || s1.startsWith("ge") ? "m" : "f";
                    break;
                }
                case "r4": {
                    s1 = s1.replaceAll("[^a-z]+", "");
                    break;
                }
                case "r5": {
                    s1 = s1.replaceAll("[^a-z]+", "");
                    break;
                }
                case "r6": {
                    if(s1.contains("-")) {
                        s1 = s1.split("-")[0];
                    }
                }
            }
            map0.put(s, s1);
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
    }

    private void f(Runnable runnable0) {
        if(a.d(this)) {
            return;
        }
        try {
            if(Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable0.run();
                return;
            }
            this.g.post(runnable0);
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, this);
    }

    private void g() {
        if(a.d(this)) {
            return;
        }
        try {
            if(this.i.getAndSet(true)) {
                return;
            }
            View view0 = S0.b.e(((Activity)this.h.get()));
            if(view0 == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            if(viewTreeObserver0.isAlive()) {
                viewTreeObserver0.addOnGlobalFocusChangeListener(this);
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }

    static void h(Activity activity0) {
        d d0;
        Class class0 = d.class;
        if(a.d(class0)) {
            return;
        }
        try {
            int v = activity0.hashCode();
            Map map0 = d.j;
            if(map0.containsKey(v)) {
                d0 = (d)map0.get(v);
            }
            else {
                d0 = new d(activity0);
                map0.put(activity0.hashCode(), d0);
            }
            d0.g();
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view0, View view1) {
        if(a.d(this)) {
            return;
        }
        try {
            if(view0 != null) {
                this.c(view0);
            }
            if(view1 != null) {
                this.c(view1);
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }
}

