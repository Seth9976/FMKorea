package com.google.android.gms.internal.consent_sdk;

import W1.a;
import W1.d;
import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

final class zzp {
    private final zzn zza;
    private final Activity zzb;
    private final a zzc;
    private final d zzd;

    zzp(zzn zzn0, Activity activity0, a a0, d d0, zzo zzo0) {
        this.zza = zzn0;
        this.zzb = activity0;
        this.zzc = a0;
        this.zzd = d0;
    }

    static zzck zza(zzp zzp0) {
        PackageInfo packageInfo0;
        List list1;
        List list0;
        Bundle bundle0;
        zzck zzck0 = new zzck();
        String s = zzp0.zzd.c();
        String s1 = null;
        if(TextUtils.isEmpty(s)) {
            try {
                bundle0 = null;
                bundle0 = zzp0.zza.zza.getPackageManager().getApplicationInfo("com.fmkorea.m.fmk", 0x80).metaData;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            if(bundle0 != null) {
                s = bundle0.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if(TextUtils.isEmpty(s)) {
                throw new zzi(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzck0.zza = s;
        if(!zzp0.zzd.b()) {
            String s2 = zzp0.zza.zzb.zza();
            if(s2 != null) {
                zzck0.zzb = s2;
            }
        }
        if(zzp0.zzc.b()) {
            list0 = new ArrayList();
            switch(zzp0.zzc.a()) {
                case 1: {
                    list0.add(zzcf.zzc);
                    break;
                }
                case 2: {
                    list0.add(zzcf.zzd);
                }
            }
            list0.add(zzcf.zze);
        }
        else {
            list0 = Collections.emptyList();
        }
        zzck0.zzj = list0;
        zzck0.zzf = zzp0.zza.zzc.zzc();
        zzck0.zze = Boolean.valueOf(zzp0.zzd.b());
        int v = Build.VERSION.SDK_INT;
        zzck0.zzd = Locale.getDefault().toLanguageTag();
        zzcg zzcg0 = new zzcg();
        zzcg0.zzb = v;
        zzcg0.zza = Build.MODEL;
        zzcg0.zzc = 2;
        zzck0.zzc = zzcg0;
        Configuration configuration0 = zzp0.zza.zza.getResources().getConfiguration();
        zzp0.zza.zza.getResources().getConfiguration();
        zzci zzci0 = new zzci();
        zzci0.zza = configuration0.screenWidthDp;
        zzci0.zzb = configuration0.screenHeightDp;
        zzci0.zzc = (double)zzp0.zza.zza.getResources().getDisplayMetrics().density;
        if(v < 28) {
            list1 = Collections.emptyList();
        }
        else {
            Window window0 = zzp0.zzb == null ? null : zzp0.zzb.getWindow();
            View view0 = window0 == null ? null : window0.getDecorView();
            WindowInsets windowInsets0 = view0 == null ? null : view0.getRootWindowInsets();
            DisplayCutout displayCutout0 = windowInsets0 == null ? null : windowInsets0.getDisplayCutout();
            if(displayCutout0 == null) {
                list1 = Collections.emptyList();
            }
            else {
                displayCutout0.getSafeInsetBottom();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: displayCutout0.getBoundingRects()) {
                    Rect rect0 = (Rect)object0;
                    if(rect0 != null) {
                        zzch zzch0 = new zzch();
                        zzch0.zzb = rect0.left;
                        zzch0.zzc = rect0.right;
                        zzch0.zza = rect0.top;
                        zzch0.zzd = rect0.bottom;
                        arrayList0.add(zzch0);
                    }
                }
                list1 = arrayList0;
            }
        }
        try {
            zzci0.zzd = list1;
            zzck0.zzg = zzci0;
            packageInfo0 = null;
            packageInfo0 = zzp0.zza.zza.getPackageManager().getPackageInfo("com.fmkorea.m.fmk", 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        zzce zzce0 = new zzce();
        zzce0.zza = "com.fmkorea.m.fmk";
        CharSequence charSequence0 = zzp0.zza.zza.getPackageManager().getApplicationLabel(zzp0.zza.zza.getApplicationInfo());
        if(charSequence0 != null) {
            s1 = charSequence0.toString();
        }
        zzce0.zzb = s1;
        if(packageInfo0 != null) {
            zzce0.zzc = Long.toString((Build.VERSION.SDK_INT < 28 ? ((long)packageInfo0.versionCode) : packageInfo0.getLongVersionCode()));
        }
        zzck0.zzh = zzce0;
        zzcj zzcj0 = new zzcj();
        zzcj0.zza = "2.1.0";
        zzck0.zzi = zzcj0;
        return zzck0;
    }
}

