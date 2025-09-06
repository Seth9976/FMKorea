package androidx.core.app;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

abstract class o {
    private static final Object a;
    private static final Object b;

    static {
        o.a = new Object();
        o.b = new Object();
    }

    static Bundle a(a m$a0) {
        Bundle bundle0 = new Bundle();
        IconCompat iconCompat0 = m$a0.d();
        bundle0.putInt("icon", (iconCompat0 == null ? 0 : iconCompat0.e()));
        bundle0.putCharSequence("title", m$a0.h());
        bundle0.putParcelable("actionIntent", m$a0.a());
        Bundle bundle1 = m$a0.c() == null ? new Bundle() : new Bundle(m$a0.c());
        bundle1.putBoolean("android.support.allowGeneratedReplies", m$a0.b());
        bundle0.putBundle("extras", bundle1);
        bundle0.putParcelableArray("remoteInputs", o.c(m$a0.e()));
        bundle0.putBoolean("showsUserInterface", m$a0.g());
        bundle0.putInt("semanticAction", m$a0.f());
        return bundle0;
    }

    private static Bundle b(t t0) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(t[] arr_t) {
        if(arr_t == null) {
            return null;
        }
        Bundle[] arr_bundle = new Bundle[arr_t.length];
        for(int v = 0; v < arr_t.length; ++v) {
            t t0 = arr_t[v];
            arr_bundle[v] = o.b(null);
        }
        return arr_bundle;
    }
}

