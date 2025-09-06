package M1;

import android.os.Build.VERSION;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

public final class c {
    static abstract class a {
    }

    static class b implements d {
        private OnBackInvokedCallback a;

        private b() {
        }

        b(a c$a0) {
        }

        @Override  // M1.c$d
        public void a(View view0) {
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = M1.d.a(view0);
            if(onBackInvokedDispatcher0 == null) {
                return;
            }
            onBackInvokedDispatcher0.unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        }

        @Override  // M1.c$d
        public void b(M1.b b0, View view0, boolean z) {
            if(this.a != null) {
                return;
            }
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = view0.findOnBackInvokedDispatcher();
            if(onBackInvokedDispatcher0 == null) {
                return;
            }
            OnBackInvokedCallback onBackInvokedCallback0 = this.c(b0);
            this.a = onBackInvokedCallback0;
            onBackInvokedDispatcher0.registerOnBackInvokedCallback((z ? 1000000 : 0), onBackInvokedCallback0);
        }

        OnBackInvokedCallback c(M1.b b0) {
            Objects.requireNonNull(b0);
            return new e(b0);
        }

        boolean d() {
            return this.a != null;
        }
    }

    static class M1.c.c extends b {
        private M1.c.c() {
            super(null);
        }

        M1.c.c(a c$a0) {
        }

        @Override  // M1.c$b
        OnBackInvokedCallback c(M1.b b0) {
            class M1.c.c.a implements OnBackAnimationCallback {
                final M1.b a;
                final M1.c.c b;

                M1.c.c.a(M1.b b0) {
                    this.a = b0;
                    super();
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    if(!M1.c.c.this.d()) {
                        return;
                    }
                    this.a.d();
                }

                @Override  // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    this.a.c();
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackProgressed(BackEvent backEvent0) {
                    if(!M1.c.c.this.d()) {
                        return;
                    }
                    androidx.activity.b b0 = new androidx.activity.b(backEvent0);
                    this.a.b(b0);
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackStarted(BackEvent backEvent0) {
                    if(!M1.c.c.this.d()) {
                        return;
                    }
                    androidx.activity.b b0 = new androidx.activity.b(backEvent0);
                    this.a.a(b0);
                }
            }

            return new M1.c.c.a(this, b0);
        }
    }

    interface d {
        void a(View arg1);

        void b(M1.b arg1, View arg2, boolean arg3);
    }

    private final d a;
    private final M1.b b;
    private final View c;

    public c(M1.b b0, View view0) {
        this.a = c.a();
        this.b = b0;
        this.c = view0;
    }

    public c(View view0) {
        this(((M1.b)view0), view0);
    }

    private static d a() {
        int v = Build.VERSION.SDK_INT;
        if(v >= 34) {
            return new M1.c.c(null);
        }
        return v >= 33 ? new b(null) : null;
    }

    public boolean b() {
        return this.a != null;
    }

    private void c(boolean z) {
        d c$d0 = this.a;
        if(c$d0 != null) {
            c$d0.b(this.b, this.c, z);
        }
    }

    public void d() {
        this.c(true);
    }

    public void e() {
        d c$d0 = this.a;
        if(c$d0 != null) {
            c$d0.a(this.c);
        }
    }
}

