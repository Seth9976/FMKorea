package y0;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import z3.k;

public abstract class x {
    private static final String a;

    // 去混淆评级： 低(20)
    static {
        k.d("WM-WakeLocks", "tagWithPrefix(\"WakeLocks\")");
        x.a = "WM-WakeLocks";
    }

    public static final void a() {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        synchronized(y.a) {
            linkedHashMap0.putAll(y.a.a());
        }
        for(Object object0: linkedHashMap0.entrySet()) {
            PowerManager.WakeLock powerManager$WakeLock0 = (PowerManager.WakeLock)((Map.Entry)object0).getKey();
            String s = (String)((Map.Entry)object0).getValue();
            if(powerManager$WakeLock0 != null && powerManager$WakeLock0.isHeld()) {
                androidx.work.k.e().k("WM-WakeLocks", "WakeLock held for " + s);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context0, String s) {
        k.e(context0, "context");
        k.e(s, "tag");
        Object object0 = context0.getApplicationContext().getSystemService("power");
        k.c(object0, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock powerManager$WakeLock0 = ((PowerManager)object0).newWakeLock(1, "WorkManager: " + s);
        synchronized(y.a) {
            String s1 = (String)y.a.a().put(powerManager$WakeLock0, "WorkManager: " + s);
        }
        k.d(powerManager$WakeLock0, "wakeLock");
        return powerManager$WakeLock0;
    }
}

