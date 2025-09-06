package N0;

import O0.f;
import S0.b;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import com.facebook.appevents.g;
import com.facebook.h;
import java.lang.ref.WeakReference;

public abstract class d {
    public static class a implements View.OnTouchListener {
        private O0.a f;
        private WeakReference g;
        private WeakReference h;
        private View.OnTouchListener i;
        private boolean j;

        public a(O0.a a0, View view0, View view1) {
            this.j = false;
            if(a0 != null && view0 != null && view1 != null) {
                this.i = f.h(view1);
                this.f = a0;
                this.g = new WeakReference(view1);
                this.h = new WeakReference(view0);
                this.j = true;
            }
        }

        public boolean a() {
            return this.j;
        }

        private void b() {
            class N0.d.a.a implements Runnable {
                final String f;
                final Bundle g;
                final a h;

                N0.d.a.a(String s, Bundle bundle0) {
                    this.f = s;
                    this.g = bundle0;
                    super();
                }

                @Override
                public void run() {
                    if(b1.a.d(this)) {
                        return;
                    }
                    try {
                        g.h(h.e()).g(this.f, this.g);
                    }
                    catch(Throwable throwable0) {
                        b1.a.b(throwable0, this);
                    }
                }
            }

            O0.a a0 = this.f;
            if(a0 == null) {
                return;
            }
            String s = a0.b();
            Bundle bundle0 = c.f(this.f, ((View)this.h.get()), ((View)this.g.get()));
            if(bundle0.containsKey("_valueToSum")) {
                bundle0.putDouble("_valueToSum", b.g(bundle0.getString("_valueToSum")));
            }
            bundle0.putString("_is_fb_codeless", "1");
            h.m().execute(new N0.d.a.a(this, s, bundle0));
        }

        @Override  // android.view.View$OnTouchListener
        public boolean onTouch(View view0, MotionEvent motionEvent0) {
            if(motionEvent0.getAction() == 1) {
                this.b();
            }
            return this.i != null && this.i.onTouch(view0, motionEvent0);
        }
    }

    static {
    }

    public static a a(O0.a a0, View view0, View view1) {
        Class class0 = d.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            return new a(a0, view0, view1);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }
}

