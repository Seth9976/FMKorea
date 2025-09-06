package com.google.android.gms.internal.measurement;

import X1.g;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;

public final class zzgl {
    private static volatile g zza;
    private static final Object zzb;

    static {
        zzgl.zza = g.a();
        zzgl.zzb = new Object();
    }

    private static boolean zza(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            if((packageManager0.getApplicationInfo("com.google.android.gms", 0).flags & 0x81) != 0) {
                return true;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    public static boolean zza(Context context0, Uri uri0) {
        String s = uri0.getAuthority();
        boolean z = false;
        if(!"com.google.android.gms.phenotype".equals(s)) {
            Log.e("PhenotypeClientHelper", s + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if(zzgl.zza.c()) {
            return ((Boolean)zzgl.zza.b()).booleanValue();
        }
        synchronized(zzgl.zzb) {
            if(zzgl.zza.c()) {
                return ((Boolean)zzgl.zza.b()).booleanValue();
            }
            ProviderInfo providerInfo0 = context0.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", (Build.VERSION.SDK_INT >= 29 ? 0x10000000 : 0));
            if(providerInfo0 != null && "com.google.android.gms".equals(providerInfo0.packageName) && zzgl.zza(context0)) {
                z = true;
            }
            zzgl.zza = g.d(Boolean.valueOf(z));
        }
        return ((Boolean)zzgl.zza.b()).booleanValue();
    }
}

