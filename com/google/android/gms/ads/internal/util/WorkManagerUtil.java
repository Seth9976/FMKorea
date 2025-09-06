package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.b.b;
import androidx.work.c.a;
import androidx.work.c;
import androidx.work.d;
import androidx.work.l;
import androidx.work.m;
import androidx.work.u;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcaa;

@KeepForSdk
public class WorkManagerUtil extends zzbq {
    private static void zzb(Context context0) {
        try {
            u.g(context0.getApplicationContext(), new b().a());
        }
        catch(IllegalStateException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper0) {
        u u0;
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        WorkManagerUtil.zzb(context0);
        try {
            u0 = u.f(context0);
        }
        catch(IllegalStateException illegalStateException0) {
            zzcaa.zzk("Failed to instantiate WorkManager.", illegalStateException0);
            return;
        }
        u0.a("offline_ping_sender_work");
        c c0 = new a().b(l.g).a();
        u0.b(((m)((androidx.work.m.a)((androidx.work.m.a)new androidx.work.m.a(OfflinePingSender.class).i(c0)).a("offline_ping_sender_work")).b()));
    }

    @Override  // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper0, String s, String s1) {
        u u0;
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        WorkManagerUtil.zzb(context0);
        c c0 = new a().b(l.g).a();
        d d0 = new androidx.work.d.a().h("uri", s).h("gws_query_id", s1).a();
        m m0 = (m)((androidx.work.m.a)((androidx.work.m.a)((androidx.work.m.a)new androidx.work.m.a(OfflineNotificationPoster.class).i(c0)).l(d0)).a("offline_notification_work")).b();
        try {
            u0 = u.f(context0);
        }
        catch(IllegalStateException illegalStateException0) {
            zzcaa.zzk("Failed to instantiate WorkManager.", illegalStateException0);
            return false;
        }
        u0.b(m0);
        return true;
    }
}

