package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

@TargetApi(26)
public class zzv extends zzu {
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final Intent zzg(Activity activity0) {
        Intent intent0 = new Intent();
        intent0.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent0.putExtra("android.provider.extra.APP_PACKAGE", "com.fmkorea.m.fmk");
        return intent0;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final void zzh(Context context0, String s, String s1) {
        NotificationChannel notificationChannel0 = h.a("offline_notification_channel", "AdMob Offline Notifications", 2);
        notificationChannel0.setShowBadge(false);
        ((NotificationManager)context0.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel0);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zzi(Context context0, String s) {
        NotificationChannel notificationChannel0 = ((NotificationManager)context0.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel0 == null ? false : notificationChannel0.getImportance() == 0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final int zzj(Context context0, TelephonyManager telephonyManager0) {
        return !zzs.zzx(context0, "android.permission.ACCESS_NETWORK_STATE") || !telephonyManager0.isDataEnabled() ? 1 : 2;
    }
}

