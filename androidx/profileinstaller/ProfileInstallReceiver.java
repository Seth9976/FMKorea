package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import e0.m;

public class ProfileInstallReceiver extends BroadcastReceiver {
    class a implements c {
        final ProfileInstallReceiver a;

        @Override  // androidx.profileinstaller.i$c
        public void a(int v, Object object0) {
            i.b.a(v, object0);
        }

        @Override  // androidx.profileinstaller.i$c
        public void b(int v, Object object0) {
            i.b.b(v, object0);
            ProfileInstallReceiver.this.setResultCode(v);
        }
    }

    static void a(c i$c0) {
        if(Build.VERSION.SDK_INT >= 24) {
            Process.sendSignal(Process.myPid(), 10);
            i$c0.b(12, null);
            return;
        }
        i$c0.b(13, null);
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(intent0 == null) {
            return;
        }
        String s = intent0.getAction();
        if("androidx.profileinstaller.action.INSTALL_PROFILE".equals(s)) {
            i.k(context0, new m(), new a(this), true);
            return;
        }
        if("androidx.profileinstaller.action.SKIP_FILE".equals(s)) {
            Bundle bundle0 = intent0.getExtras();
            if(bundle0 != null) {
                String s1 = bundle0.getString("EXTRA_SKIP_FILE_OPERATION");
                if("WRITE_SKIP_FILE".equals(s1)) {
                    i.l(context0, new m(), new a(this));
                    return;
                }
                if("DELETE_SKIP_FILE".equals(s1)) {
                    i.c(context0, new m(), new a(this));
                }
            }
        }
        else {
            if("androidx.profileinstaller.action.SAVE_PROFILE".equals(s)) {
                ProfileInstallReceiver.a(new a(this));
                return;
            }
            if("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(s)) {
                Bundle bundle1 = intent0.getExtras();
                if(bundle1 != null) {
                    String s2 = bundle1.getString("EXTRA_BENCHMARK_OPERATION");
                    a profileInstallReceiver$a0 = new a(this);
                    if("DROP_SHADER_CACHE".equals(s2)) {
                        androidx.profileinstaller.a.b(context0, profileInstallReceiver$a0);
                        return;
                    }
                    profileInstallReceiver$a0.b(16, null);
                }
            }
        }
    }
}

