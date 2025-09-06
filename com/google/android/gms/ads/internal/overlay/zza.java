package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzcaa;

public final class zza {
    public static final boolean zza(Context context0, Intent intent0, zzz zzz0, zzx zzx0, boolean z) {
        if(z) {
            return zza.zzc(context0, intent0.getData(), zzz0, zzx0);
        }
        try {
            zze.zza(("Launching an intent: " + intent0.toURI()));
            zzs.zzQ(context0, intent0);
            if(zzz0 != null) {
                zzz0.zzg();
            }
            if(zzx0 != null) {
                zzx0.zza(true);
            }
            return true;
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
        }
        zzcaa.zzj(activityNotFoundException0.getMessage());
        if(zzx0 != null) {
            zzx0.zza(false);
        }
        return false;
    }

    public static final boolean zzb(Context context0, zzc zzc0, zzz zzz0, zzx zzx0) {
        int v = 0;
        if(zzc0 == null) {
            zzcaa.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbbr.zza(context0);
        Intent intent0 = zzc0.zzh;
        if(intent0 != null) {
            return zza.zza(context0, intent0, zzz0, zzx0, zzc0.zzj);
        }
        Intent intent1 = new Intent();
        if(TextUtils.isEmpty(zzc0.zzb)) {
            zzcaa.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if(TextUtils.isEmpty(zzc0.zzc)) {
            intent1.setData(Uri.parse(zzc0.zzb));
        }
        else {
            intent1.setDataAndType(Uri.parse(zzc0.zzb), zzc0.zzc);
        }
        intent1.setAction("android.intent.action.VIEW");
        if(!TextUtils.isEmpty(zzc0.zzd)) {
            intent1.setPackage(zzc0.zzd);
        }
        if(!TextUtils.isEmpty(zzc0.zze)) {
            String[] arr_s = zzc0.zze.split("/", 2);
            if(arr_s.length < 2) {
                zzcaa.zzj(("Could not parse component name from open GMSG: " + zzc0.zze));
                return false;
            }
            intent1.setClassName(arr_s[0], arr_s[1]);
        }
        String s = zzc0.zzf;
        if(!TextUtils.isEmpty(s)) {
            try {
                v = Integer.parseInt(s);
            }
            catch(NumberFormatException unused_ex) {
                zzcaa.zzj("Could not parse intent flags.");
            }
            intent1.addFlags(v);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzeq)).booleanValue()) {
            intent1.addFlags(0x10000000);
            intent1.putExtra("android.support.customtabs.extra.user_opt_out", true);
            return zza.zza(context0, intent1, zzz0, zzx0, zzc0.zzj);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzep)).booleanValue()) {
            zzs.zzm(context0, intent1);
        }
        return zza.zza(context0, intent1, zzz0, zzx0, zzc0.zzj);
    }

    private static final boolean zzc(Context context0, Uri uri0, zzz zzz0, zzx zzx0) {
        int v;
        try {
            v = zzt.zzp().zzk(context0, uri0);
            if(zzz0 != null) {
                zzz0.zzg();
            }
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            zzcaa.zzj(activityNotFoundException0.getMessage());
            v = 6;
        }
        if(zzx0 != null) {
            zzx0.zzb(v);
        }
        return v == 5;
    }
}

