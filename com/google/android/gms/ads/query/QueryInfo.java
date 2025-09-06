package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbzp;

public class QueryInfo {
    private final zzem zza;

    public QueryInfo(zzem zzem0) {
        this.zza = zzem0;
    }

    public static void generate(Context context0, AdFormat adFormat0, AdRequest adRequest0, QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        QueryInfo.zza(context0, adFormat0, adRequest0, null, queryInfoGenerationCallback0);
    }

    public static void generate(Context context0, AdFormat adFormat0, AdRequest adRequest0, String s, QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        Preconditions.checkNotNull(s, "AdUnitId cannot be null.");
        QueryInfo.zza(context0, adFormat0, adRequest0, s, queryInfoGenerationCallback0);
    }

    public String getQuery() {
        return this.zza.zzb();
    }

    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    @KeepForSdk
    public String getRequestId() {
        return this.zza.zzc();
    }

    private static void zza(Context context0, AdFormat adFormat0, AdRequest adRequest0, String s, QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        zzbbr.zza(context0);
        if(((Boolean)zzbdi.zzk.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzkc)).booleanValue()) {
            zza zza0 = new zza(context0, adFormat0, adRequest0, s, queryInfoGenerationCallback0);
            zzbzp.zzb.execute(zza0);
            return;
        }
        new zzbst(context0, adFormat0, (adRequest0 == null ? null : adRequest0.zza()), s).zzb(queryInfoGenerationCallback0);
    }
}

