package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzcf;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzbbb {
    private final Context zza;

    public zzbbb(Context context0) {
        Preconditions.checkNotNull(context0, "Context can not be null");
        this.zza = context0;
    }

    public final boolean zza(Intent intent0) {
        Preconditions.checkNotNull(intent0, "Intent can not be null");
        return !this.zza.getPackageManager().queryIntentActivities(intent0, 0).isEmpty();
    }

    public final boolean zzb() {
        return this.zza(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc() {
        return ((Boolean)zzcf.zza(this.zza, zzbba.zza)).booleanValue() && Wrappers.packageManager(this.zza).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}

