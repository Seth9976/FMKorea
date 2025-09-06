package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

public abstract class t {
    static abstract class a {
        static void a(Object object0, Intent intent0, Bundle bundle0) {
            RemoteInput.addResultsToIntent(((RemoteInput[])object0), intent0, bundle0);
        }

        public static RemoteInput b(t t0) {
            throw null;
        }

        static Bundle c(Intent intent0) {
            return RemoteInput.getResultsFromIntent(intent0);
        }
    }

    static RemoteInput a(t t0) {
        return a.b(t0);
    }

    static RemoteInput[] b(t[] arr_t) {
        if(arr_t == null) {
            return null;
        }
        RemoteInput[] arr_remoteInput = new RemoteInput[arr_t.length];
        for(int v = 0; v < arr_t.length; ++v) {
            t t0 = arr_t[v];
            arr_remoteInput[v] = t.a(null);
        }
        return arr_remoteInput;
    }
}

