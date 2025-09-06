package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.k;
import androidx.work.m;
import androidx.work.u;

public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a;

    static {
        DiagnosticsReceiver.a = "WM-DiagnosticsRcvr";
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(intent0 == null) {
            return;
        }
        k.e().a("WM-DiagnosticsRcvr", "Requesting diagnostics");
        try {
            u.f(context0).b(m.e(DiagnosticsWorker.class));
        }
        catch(IllegalStateException illegalStateException0) {
            k.e().d("WM-DiagnosticsRcvr", "WorkManager is not initialized", illegalStateException0);
        }
    }
}

