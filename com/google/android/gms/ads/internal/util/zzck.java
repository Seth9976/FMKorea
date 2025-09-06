package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzck {
    private final BroadcastReceiver zza;
    private final Map zzb;
    private boolean zzc;
    private boolean zzd;
    private Context zze;

    public zzck() {
        this.zzc = false;
        this.zzb = new WeakHashMap();
        this.zza = new zzcj(this);
    }

    static void zza(zzck zzck0, Context context0, Intent intent0) {
        zzck0.zze(context0, intent0);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void zzb(Context context0) {
        synchronized(this) {
            if(this.zzc) {
                return;
            }
            Context context1 = context0.getApplicationContext();
            this.zze = context1;
            if(context1 == null) {
                this.zze = context0;
            }
            zzbbr.zza(this.zze);
            this.zzd = ((Boolean)zzba.zzc().zzb(zzbbr.zzdE)).booleanValue();
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.SCREEN_ON");
            intentFilter0.addAction("android.intent.action.SCREEN_OFF");
            intentFilter0.addAction("android.intent.action.USER_PRESENT");
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzjT)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.zze.registerReceiver(this.zza, intentFilter0);
            }
            else {
                this.zze.registerReceiver(this.zza, intentFilter0, 4);
            }
            this.zzc = true;
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void zzc(Context context0, BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0) {
        synchronized(this) {
            if(this.zzd) {
                this.zzb.put(broadcastReceiver0, intentFilter0);
                return;
            }
            zzbbr.zza(context0);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzjT)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
                context0.registerReceiver(broadcastReceiver0, intentFilter0, 4);
                return;
            }
            context0.registerReceiver(broadcastReceiver0, intentFilter0);
        }
    }

    public final void zzd(Context context0, BroadcastReceiver broadcastReceiver0) {
        synchronized(this) {
            if(this.zzd) {
                this.zzb.remove(broadcastReceiver0);
                return;
            }
            context0.unregisterReceiver(broadcastReceiver0);
        }
    }

    private final void zze(Context context0, Intent intent0) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.zzb.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((IntentFilter)map$Entry0.getValue()).hasAction(intent0.getAction())) {
                    arrayList0.add(((BroadcastReceiver)map$Entry0.getKey()));
                }
            }
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((BroadcastReceiver)arrayList0.get(v2)).onReceive(context0, intent0);
            }
        }
    }
}

