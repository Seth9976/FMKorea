package f2;

import android.os.Bundle;
import b2.a.b;
import g2.f;
import java.util.Locale;

class e implements b {
    private h2.b a;
    private h2.b b;

    @Override  // b2.a$b
    public void a(int v, Bundle bundle0) {
        f.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", v, bundle0));
        if(bundle0 == null) {
            return;
        }
        String s = bundle0.getString("name");
        if(s != null) {
            Bundle bundle1 = bundle0.getBundle("params");
            if(bundle1 == null) {
                bundle1 = new Bundle();
            }
            this.c(s, bundle1);
        }
    }

    private static void b(h2.b b0, String s, Bundle bundle0) {
        if(b0 == null) {
            return;
        }
        b0.onEvent(s, bundle0);
    }

    private void c(String s, Bundle bundle0) {
        e.b(("clx".equals(bundle0.getString("_o")) ? this.a : this.b), s, bundle0);
    }

    public void d(h2.b b0) {
        this.b = b0;
    }

    public void e(h2.b b0) {
        this.a = b0;
    }
}

