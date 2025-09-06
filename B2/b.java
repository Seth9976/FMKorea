package b2;

import a2.e;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.internal.d;
import com.google.firebase.analytics.connector.internal.f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b implements a {
    private final AppMeasurementSdk a;
    final Map b;
    private static volatile a c;

    private b(AppMeasurementSdk appMeasurementSdk0) {
        Preconditions.checkNotNull(appMeasurementSdk0);
        this.a = appMeasurementSdk0;
        this.b = new ConcurrentHashMap();
    }

    @Override  // b2.a
    public b2.a.a a(String s, b2.a.b a$b0) {
        class b2.b.a implements b2.a.a {
            private final String a;
            private final b b;

            b2.b.a(String s) {
                this.a = s;
                super();
            }
        }

        d d0;
        Preconditions.checkNotNull(a$b0);
        if(!com.google.firebase.analytics.connector.internal.a.g(s)) {
            return null;
        }
        if(this.f(s)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk0 = this.a;
        if("fiam".equals(s)) {
            d0 = new d(appMeasurementSdk0, a$b0);
        }
        else if("clx".equals(s)) {
            d0 = new f(appMeasurementSdk0, a$b0);
        }
        else {
            d0 = null;
        }
        if(d0 != null) {
            this.b.put(s, d0);
            return new b2.b.a(this, s);
        }
        return null;
    }

    @Override  // b2.a
    public void b(String s, String s1, Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        if(!com.google.firebase.analytics.connector.internal.a.g(s)) {
            return;
        }
        if(!com.google.firebase.analytics.connector.internal.a.c(s1, bundle0)) {
            return;
        }
        if(!com.google.firebase.analytics.connector.internal.a.e(s, s1, bundle0)) {
            return;
        }
        com.google.firebase.analytics.connector.internal.a.b(s, s1, bundle0);
        this.a.logEvent(s, s1, bundle0);
    }

    @Override  // b2.a
    public void c(String s, String s1, Object object0) {
        if(!com.google.firebase.analytics.connector.internal.a.g(s)) {
            return;
        }
        if(!com.google.firebase.analytics.connector.internal.a.d(s, s1)) {
            return;
        }
        this.a.setUserProperty(s, s1, object0);
    }

    public static a d(e e0, Context context0, y2.d d0) {
        Preconditions.checkNotNull(e0);
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(d0);
        Preconditions.checkNotNull(context0.getApplicationContext());
        if(b.c == null) {
            synchronized(b.class) {
                if(b.c == null) {
                    Bundle bundle0 = new Bundle(1);
                    if(e0.t()) {
                        d0.a(a2.b.class, (c this) -> runnable0.run(), (y2.a a0) -> throw null);
                        bundle0.putBoolean("dataCollectionDefaultEnabled", e0.s());
                    }
                    b.c = new b(zzdf.zza(context0, null, null, null, bundle0).zzb());
                }
            }
        }
        return b.c;
    }

    // 检测为 Lambda 实现
    static void e(y2.a a0) [...]

    // 去混淆评级： 低(20)
    private final boolean f(String s) {
        return !s.isEmpty() && this.b.containsKey(s) && this.b.get(s) != null;
    }
}

