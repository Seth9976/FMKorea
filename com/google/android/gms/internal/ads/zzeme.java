package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class zzeme implements zzesi {
    final zzfca zza;
    private final long zzb;

    public zzeme(zzfca zzfca0, long v) {
        Preconditions.checkNotNull(zzfca0, "the targeting must not be null");
        this.zza = zzfca0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        Bundle bundle0 = (Bundle)object0;
        zzl zzl0 = this.zza.zzd;
        bundle0.putInt("http_timeout_millis", zzl0.zzw);
        bundle0.putString("slotname", this.zza.zzf);
        int v = this.zza.zzo.zza - 1;
        if(this.zza.zzo.zza == 0) {
            throw null;
        }
        boolean z = true;
        switch(v) {
            case 1: {
                bundle0.putBoolean("is_new_rewarded", true);
                break;
            }
            case 2: {
                bundle0.putBoolean("is_rewarded_interstitial", true);
            }
        }
        bundle0.putLong("start_signals_timestamp", this.zzb);
        zzfcm.zzf(bundle0, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzl0.zzb)), Long.compare(zzl0.zzb, -1L) != 0);
        zzfcm.zzb(bundle0, "extras", zzl0.zzc);
        zzfcm.zze(bundle0, "cust_gender", zzl0.zzd, zzl0.zzd != -1);
        zzfcm.zzd(bundle0, "kw", zzl0.zze);
        zzfcm.zze(bundle0, "tag_for_child_directed_treatment", zzl0.zzg, zzl0.zzg != -1);
        if(zzl0.zzf) {
            bundle0.putBoolean("test_request", true);
        }
        zzfcm.zze(bundle0, "d_imp_hdr", 1, zzl0.zza >= 2 && zzl0.zzh);
        boolean z1 = zzl0.zza >= 2 && !TextUtils.isEmpty(zzl0.zzi);
        zzfcm.zzf(bundle0, "ppid", zzl0.zzi, z1);
        Location location0 = zzl0.zzk;
        if(location0 != null) {
            float f = location0.getAccuracy();
            long v1 = location0.getTime();
            double f1 = location0.getLatitude();
            double f2 = location0.getLongitude();
            Bundle bundle1 = new Bundle();
            bundle1.putFloat("radius", f * 1000.0f);
            bundle1.putLong("lat", ((long)(f1 * 10000000.0)));
            bundle1.putLong("long", ((long)(f2 * 10000000.0)));
            bundle1.putLong("time", v1 * 1000L);
            bundle0.putBundle("uule", bundle1);
        }
        zzfcm.zzc(bundle0, "url", zzl0.zzl);
        zzfcm.zzd(bundle0, "neighboring_content_urls", zzl0.zzv);
        zzfcm.zzb(bundle0, "custom_targeting", zzl0.zzn);
        zzfcm.zzd(bundle0, "category_exclusions", zzl0.zzo);
        zzfcm.zzc(bundle0, "request_agent", zzl0.zzp);
        zzfcm.zzc(bundle0, "request_pkg", zzl0.zzq);
        zzfcm.zzg(bundle0, "is_designed_for_families", zzl0.zzr, zzl0.zza >= 7);
        if(zzl0.zza >= 8) {
            int v2 = zzl0.zzt;
            if(v2 == -1) {
                z = false;
            }
            zzfcm.zze(bundle0, "tag_for_under_age_of_consent", v2, z);
            zzfcm.zzc(bundle0, "max_ad_content_rating", zzl0.zzu);
        }
    }
}

