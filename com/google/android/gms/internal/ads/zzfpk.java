package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

@SuppressLint({"RestrictedApi"})
@TargetApi(18)
final class zzfpk {
    final zzfqi zza;
    private static final zzfpx zzb;
    private static final Intent zzc;
    private final String zzd;

    static {
        zzfpk.zzb = new zzfpx("OverlayDisplayService");
        zzfpk.zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    }

    zzfpk(Context context0) {
        this.zza = zzfql.zza(context0) ? new zzfqi(context0.getApplicationContext(), zzfpk.zzb, "OverlayDisplayService", zzfpk.zzc, zzfpf.zza, null) : null;
        this.zzd = "com.fmkorea.m.fmk";
    }

    static zzfpx zza() {
        return zzfpk.zzb;
    }

    static String zzb(zzfpk zzfpk0) {
        return zzfpk0.zzd;
    }

    final void zzc() {
        if(this.zza == null) {
            return;
        }
        zzfpk.zzb.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzu();
    }

    final void zzd(zzfpb zzfpb0, zzfpp zzfpp0) {
        if(this.zza == null) {
            zzfpk.zzb.zza("error: %s", new Object[]{"Play Store not found."});
            return;
        }
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        zzfph zzfph0 = new zzfph(this, taskCompletionSource0, zzfpb0, zzfpp0, taskCompletionSource0);
        this.zza.zzs(zzfph0, taskCompletionSource0);
    }

    final void zze(zzfpm zzfpm0, zzfpp zzfpp0) {
        if(this.zza == null) {
            zzfpk.zzb.zza("error: %s", new Object[]{"Play Store not found."});
            return;
        }
        if(zzfpm0.zzg() == null) {
            zzfpk.zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfpn zzfpn0 = zzfpo.zzc();
            zzfpn0.zzb(0x1FE0);
            zzfpp0.zza(zzfpn0.zzc());
            return;
        }
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        zzfpg zzfpg0 = new zzfpg(this, taskCompletionSource0, zzfpm0, zzfpp0, taskCompletionSource0);
        this.zza.zzs(zzfpg0, taskCompletionSource0);
    }

    final void zzf(zzfpr zzfpr0, zzfpp zzfpp0, int v) {
        if(this.zza == null) {
            zzfpk.zzb.zza("error: %s", new Object[]{"Play Store not found."});
            return;
        }
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        zzfpi zzfpi0 = new zzfpi(this, taskCompletionSource0, zzfpr0, v, zzfpp0, taskCompletionSource0);
        this.zza.zzs(zzfpi0, taskCompletionSource0);
    }
}

