package W1;

import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzcn;
import java.util.ArrayList;
import java.util.List;

public class a {
    public static class W1.a.a {
        private final List a;
        private final Context b;
        private int c;
        private boolean d;

        public W1.a.a(Context context0) {
            this.a = new ArrayList();
            this.c = 0;
            this.b = context0.getApplicationContext();
        }

        // 去混淆评级： 低(30)
        public a a() {
            return new a(zzcn.zzb() || this.a.contains(zzcn.zza(this.b)) || this.d, this, null);
        }

        static int b(W1.a.a a$a0) {
            return a$a0.c;
        }
    }

    private final boolean a;
    private final int b;

    a(boolean z, W1.a.a a$a0, g g0) {
        this.a = z;
        this.b = W1.a.a.b(a$a0);
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }
}

