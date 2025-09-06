package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class zzp {
    public static final zzp zza;

    static {
        zzp.zza = new zzp();
    }

    public final zzl zza(Context context0, zzdx zzdx0) {
        Date date0 = zzdx0.zzn();
        long v = date0 == null ? -1L : date0.getTime();
        Set set0 = zzdx0.zzq();
        List list0 = set0.isEmpty() ? null : Collections.unmodifiableList(new ArrayList(set0));
        boolean z = zzdx0.zzs(context0);
        Bundle bundle0 = zzdx0.zzf(AdMobAdapter.class);
        SearchAdRequest searchAdRequest0 = zzdx0.zzi();
        zzfh zzfh0 = searchAdRequest0 == null ? null : new zzfh(searchAdRequest0);
        String s = context0.getApplicationContext() == null ? null : zzbzt.zzq(Thread.currentThread().getStackTrace(), "com.fmkorea.m.fmk");
        RequestConfiguration requestConfiguration0 = zzej.zzf().zzc();
        Object object0 = Collections.max(Arrays.asList(new String[]{0, ""}), (Object object0, Object object1) -> RequestConfiguration.zza.indexOf(((String)object0)) - RequestConfiguration.zza.indexOf(((String)object1)));
        List list1 = zzdx0.zzo();
        return new zzl(8, v, bundle0, zzdx0.zza(), list0, z, Math.max(zzdx0.zzc(), requestConfiguration0.getTagForChildDirectedTreatment()), false, zzdx0.zzl(), zzfh0, null, zzdx0.zzk(), zzdx0.zzg(), zzdx0.zze(), Collections.unmodifiableList(new ArrayList(zzdx0.zzp())), zzdx0.zzm(), s, zzdx0.zzr(), null, requestConfiguration0.getTagForUnderAgeOfConsent(), ((String)object0), list1, zzdx0.zzb(), zzdx0.zzj());
    }
}

