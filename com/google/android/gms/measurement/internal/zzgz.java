package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R.string;
import com.google.android.gms.common.internal.Preconditions;

public final class zzgz {
    private final Resources zza;
    private final String zzb;

    public zzgz(Context context0, String s) {
        Preconditions.checkNotNull(context0);
        this.zza = context0.getResources();
        if(!TextUtils.isEmpty(s)) {
            this.zzb = s;
            return;
        }
        this.zzb = zzgz.zza(context0);
    }

    public static String zza(Context context0) {
        try {
            return context0.getResources().getResourcePackageName(string.common_google_play_services_unknown_issue);
        }
        catch(Resources.NotFoundException unused_ex) {
            return "com.fmkorea.m.fmk";
        }
    }

    public final String zza(String s) {
        int v = this.zza.getIdentifier(s, "string", this.zzb);
        if(v == 0) {
            return null;
        }
        try {
            return this.zza.getString(v);
        }
        catch(Resources.NotFoundException unused_ex) {
            return null;
        }
    }
}

