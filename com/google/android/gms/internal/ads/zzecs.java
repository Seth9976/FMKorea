package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.RemoteException;
import androidx.core.app.m.e;
import androidx.core.app.p;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Timer;

public final class zzecs extends zzbru {
    private final Context zza;
    private final zzdrh zzb;
    private final zzcaf zzc;
    private final zzech zzd;
    private final zzfgo zze;
    private String zzf;
    private String zzg;

    public zzecs(Context context0, zzech zzech0, zzcaf zzcaf0, zzdrh zzdrh0, zzfgo zzfgo0) {
        this.zza = context0;
        this.zzb = zzdrh0;
        this.zzc = zzcaf0;
        this.zzd = zzech0;
        this.zze = zzfgo0;
    }

    public static void zzc(Context context0, zzdrh zzdrh0, zzfgo zzfgo0, zzech zzech0, String s, String s1, Map map0) {
        String s3;
        String s2 = zzt.zzo().zzx(context0) ? "online" : "offline";
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue() || zzdrh0 == null) {
            zzfgn zzfgn0 = zzfgn.zzb(s1);
            zzfgn0.zza("gqi", s);
            zzfgn0.zza("device_connectivity", s2);
            zzfgn0.zza("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
            for(Object object1: map0.entrySet()) {
                zzfgn0.zza(((String)((Map.Entry)object1).getKey()), ((String)((Map.Entry)object1).getValue()));
            }
            s3 = zzfgo0.zza(zzfgn0);
        }
        else {
            zzdrg zzdrg0 = zzdrh0.zza();
            zzdrg0.zzb("gqi", s);
            zzdrg0.zzb("action", s1);
            zzdrg0.zzb("device_connectivity", s2);
            zzdrg0.zzb("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
            for(Object object0: map0.entrySet()) {
                zzdrg0.zzb(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            s3 = zzdrg0.zzf();
        }
        zzech0.zzd(new zzecj(zzt.zzB().currentTimeMillis(), s, s3, 2));
    }

    // 检测为 Lambda 实现
    final void zzd(Activity activity0, zzl zzl0, DialogInterface dialogInterface0, int v) [...]

    @Override  // com.google.android.gms.internal.ads.zzbrv
    public final void zze(Intent intent0) {
        SQLiteDatabase sQLiteDatabase0;
        String s = intent0.getStringExtra("offline_notification_action");
        if(!s.equals("offline_notification_clicked") && !s.equals("offline_notification_dismissed")) {
            return;
        }
        String s1 = intent0.getStringExtra("gws_query_id");
        String s2 = intent0.getStringExtra("uri");
        boolean z = zzt.zzo().zzx(this.zza);
        HashMap hashMap0 = new HashMap();
        int v = 2;
        if(s.equals("offline_notification_clicked")) {
            hashMap0.put("offline_notification_action", "offline_notification_clicked");
            if(z) {
                v = 1;
            }
            hashMap0.put("obvs", "33");
            hashMap0.put("olaih", String.valueOf(s2.startsWith("http")));
            try {
                Intent intent1 = this.zza.getPackageManager().getLaunchIntentForPackage(s2);
                if(intent1 == null) {
                    intent1 = new Intent("android.intent.action.VIEW");
                    intent1.setData(Uri.parse(s2));
                }
                intent1.addFlags(0x10000000);
                this.zza.startActivity(intent1);
                hashMap0.put("olaa", "olas");
            }
            catch(ActivityNotFoundException unused_ex) {
                hashMap0.put("olaa", "olaf");
            }
        }
        else {
            hashMap0.put("offline_notification_action", "offline_notification_dismissed");
        }
        this.zzp(s1, "offline_notification_action", hashMap0);
        try {
            sQLiteDatabase0 = this.zzd.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            zzcaa.zzg(("Failed to get writable offline buffering database: " + sQLiteException0.toString()));
            return;
        }
        if(v == 1) {
            this.zzd.zzg(sQLiteDatabase0, this.zzc, s1);
            return;
        }
        zzech.zzi(sQLiteDatabase0, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrv
    public final void zzf(String[] arr_s, int[] arr_v, IObjectWrapper iObjectWrapper0) {
        int v = 0;
        while(v < arr_s.length) {
            if(arr_s[v].equals("android.permission.POST_NOTIFICATIONS")) {
                zzecu zzecu0 = (zzecu)ObjectWrapper.unwrap(iObjectWrapper0);
                Activity activity0 = zzecu0.zza();
                zzl zzl0 = zzecu0.zzb();
                HashMap hashMap0 = new HashMap();
                if(arr_v[v] == 0) {
                    hashMap0.put("dialog_action", "confirm");
                    this.zzq();
                    this.zzs(activity0, zzl0);
                }
                else {
                    hashMap0.put("dialog_action", "dismiss");
                    if(zzl0 != null) {
                        zzl0.zzb();
                    }
                }
                this.zzp(this.zzf, "asnpdc", hashMap0);
                if(true) {
                    break;
                }
            }
            else {
                ++v;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbrv
    public final void zzg(IObjectWrapper iObjectWrapper0) {
        zzecu zzecu0 = (zzecu)ObjectWrapper.unwrap(iObjectWrapper0);
        Activity activity0 = zzecu0.zza();
        zzl zzl0 = zzecu0.zzb();
        this.zzf = zzecu0.zzc();
        this.zzg = zzecu0.zzd();
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzie)).booleanValue()) {
            this.zzp(this.zzf, "dialog_impression", zzfug.zzd());
            AlertDialog.Builder alertDialog$Builder0 = zzs.zzH(activity0);
            alertDialog$Builder0.setTitle(zzecs.zzo(string.offline_opt_in_title, "Open ad when you\'re back online.")).setMessage(zzecs.zzo(string.offline_opt_in_message, "We\'ll send you a notification with a link to the advertiser site.")).setPositiveButton(zzecs.zzo(string.offline_opt_in_confirm, "OK"), (DialogInterface dialogInterface0, int v) -> {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("dialog_action", "confirm");
                this.zzp(this.zzf, "dialog_click", hashMap0);
                this.zzr(activity0, zzl0);
            }).setNegativeButton(zzecs.zzo(string.offline_opt_in_decline, "No thanks"), (DialogInterface dialogInterface0, int v) -> {
                this.zzd.zzc(this.zzf);
                HashMap hashMap0 = new HashMap();
                hashMap0.put("dialog_action", "dismiss");
                this.zzp(this.zzf, "dialog_click", hashMap0);
                if(zzl0 != null) {
                    zzl0.zzb();
                }
            }).setOnCancelListener((DialogInterface dialogInterface0) -> {
                this.zzd.zzc(this.zzf);
                HashMap hashMap0 = new HashMap();
                hashMap0.put("dialog_action", "dismiss");
                this.zzp(this.zzf, "dialog_click", hashMap0);
                if(zzl0 != null) {
                    zzl0.zzb();
                }
            });
            alertDialog$Builder0.create().show();
            return;
        }
        this.zzr(activity0, zzl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrv
    public final void zzh() {
        zzecd zzecd0 = new zzecd(this.zzc);
        this.zzd.zze(zzecd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrv
    public final void zzi(IObjectWrapper iObjectWrapper0, String s, String s1) {
        String s2;
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzt.zzq().zzh(context0, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntent0 = zzecs.zzt(context0, "offline_notification_clicked", s1, s);
        PendingIntent pendingIntent1 = zzecs.zzt(context0, "offline_notification_dismissed", s1, s);
        e m$e0 = new e(context0, "offline_notification_channel").l(zzecs.zzo(string.offline_notification_title, "View the ad you saved when you were offline")).k(zzecs.zzo(string.offline_notification_text, "Tap to open ad")).f(true).n(pendingIntent1).j(pendingIntent0).z(context0.getApplicationInfo().icon);
        NotificationManager notificationManager0 = (NotificationManager)context0.getSystemService("notification");
        HashMap hashMap0 = new HashMap();
        try {
            notificationManager0.notify(s1, 0xD431, m$e0.b());
            s2 = "offline_notification_impression";
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            hashMap0.put("notification_not_shown_reason", illegalArgumentException0.getMessage());
            s2 = "offline_notification_failed";
        }
        this.zzp(s1, s2, hashMap0);
    }

    // 检测为 Lambda 实现
    final void zzj(zzl zzl0, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    final void zzk(zzl zzl0, DialogInterface dialogInterface0) [...]

    // 检测为 Lambda 实现
    final void zzl(Activity activity0, zzl zzl0, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    final void zzm(zzl zzl0, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    final void zzn(zzl zzl0, DialogInterface dialogInterface0) [...]

    private static String zzo(int v, String s) {
        Resources resources0 = zzt.zzo().zzd();
        return resources0 == null ? s : resources0.getString(v);
    }

    private final void zzp(String s, String s1, Map map0) {
        zzecs.zzc(this.zza, this.zzb, this.zze, this.zzd, s, s1, map0);
    }

    private final void zzq() {
        try {
            if(zzs.zzw(this.zza).zzf(ObjectWrapper.wrap(this.zza), this.zzg, this.zzf)) {
                return;
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("Failed to schedule offline notification poster.", remoteException0);
        }
        this.zzd.zzc(this.zzf);
        this.zzp(this.zzf, "offline_notification_worker_not_scheduled", zzfug.zzd());
    }

    private final void zzr(Activity activity0, zzl zzl0) {
        if(!p.d(activity0).a()) {
            if(Build.VERSION.SDK_INT < 33) {
                AlertDialog.Builder alertDialog$Builder0 = zzs.zzH(activity0);
                alertDialog$Builder0.setTitle(zzecs.zzo(string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzecs.zzo(string.notifications_permission_confirm, "Allow"), (DialogInterface dialogInterface0, int v) -> {
                    HashMap hashMap0 = new HashMap();
                    hashMap0.put("dialog_action", "confirm");
                    this.zzp(this.zzf, "rtsdc", hashMap0);
                    activity0.startActivity(zzt.zzq().zzg(activity0));
                    this.zzq();
                    if(zzl0 != null) {
                        zzl0.zzb();
                    }
                }).setNegativeButton(zzecs.zzo(string.notifications_permission_decline, "Don\'t allow"), (DialogInterface dialogInterface0, int v) -> {
                    this.zzd.zzc(this.zzf);
                    HashMap hashMap0 = new HashMap();
                    hashMap0.put("dialog_action", "dismiss");
                    this.zzp(this.zzf, "rtsdc", hashMap0);
                    if(zzl0 != null) {
                        zzl0.zzb();
                    }
                }).setOnCancelListener((DialogInterface dialogInterface0) -> {
                    this.zzd.zzc(this.zzf);
                    HashMap hashMap0 = new HashMap();
                    hashMap0.put("dialog_action", "dismiss");
                    this.zzp(this.zzf, "rtsdc", hashMap0);
                    if(zzl0 != null) {
                        zzl0.zzb();
                    }
                });
                alertDialog$Builder0.create().show();
                this.zzp(this.zzf, "rtsdi", zzfug.zzd());
                return;
            }
            activity0.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 0x3039);
            this.zzp(this.zzf, "asnpdi", zzfug.zzd());
            return;
        }
        this.zzq();
        this.zzs(activity0, zzl0);
    }

    private final void zzs(Activity activity0, zzl zzl0) {
        String s = zzecs.zzo(string.offline_opt_in_confirmation, "You\'ll get a notification with the link when you\'re back online");
        AlertDialog.Builder alertDialog$Builder0 = zzs.zzH(activity0);
        alertDialog$Builder0.setMessage(s).setOnCancelListener(new zzecn(zzl0));
        AlertDialog alertDialog0 = alertDialog$Builder0.create();
        alertDialog0.show();
        Timer timer0 = new Timer();
        timer0.schedule(new zzecr(this, alertDialog0, timer0, zzl0), 3000L);
    }

    private static final PendingIntent zzt(Context context0, String s, String s1, String s2) {
        Intent intent0 = new Intent();
        intent0.setClassName(context0, "com.google.android.gms.ads.AdService");
        intent0.setAction(s);
        intent0.putExtra("offline_notification_action", s);
        intent0.putExtra("gws_query_id", s1);
        intent0.putExtra("uri", s2);
        return zzfon.zza(context0, 0, intent0, zzfon.zza | 0x40000000, 0);
    }
}

