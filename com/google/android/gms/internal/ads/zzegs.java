package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class zzegs implements zzedn {
    @Override  // com.google.android.gms.internal.ads.zzedn
    public final d zza(zzfbr zzfbr0, zzfbe zzfbe0) {
        String s = zzfbe0.zzw.optString("pubid", "");
        zzfca zzfca0 = zzfbr0.zza.zza;
        zzfby zzfby0 = new zzfby();
        zzfby0.zzp(zzfca0);
        zzfby0.zzs(s);
        Bundle bundle0 = zzegs.zzd(zzfca0.zzd.zzm);
        Bundle bundle1 = zzegs.zzd(bundle0.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundle1.putInt("gw", 1);
        String s1 = zzfbe0.zzw.optString("mad_hac", null);
        if(s1 != null) {
            bundle1.putString("mad_hac", s1);
        }
        String s2 = zzfbe0.zzw.optString("adJson", null);
        if(s2 != null) {
            bundle1.putString("_ad", s2);
        }
        bundle1.putBoolean("_noRefresh", true);
        Iterator iterator0 = zzfbe0.zzE.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s3 = (String)object0;
            String s4 = zzfbe0.zzE.optString(s3, null);
            if(s3 != null) {
                bundle1.putString(s3, s4);
            }
        }
        bundle0.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle1);
        zzfby0.zzE(new zzl(zzfca0.zzd.zza, zzfca0.zzd.zzb, bundle1, zzfca0.zzd.zzd, zzfca0.zzd.zze, zzfca0.zzd.zzf, zzfca0.zzd.zzg, zzfca0.zzd.zzh, zzfca0.zzd.zzi, zzfca0.zzd.zzj, zzfca0.zzd.zzk, zzfca0.zzd.zzl, bundle0, zzfca0.zzd.zzn, zzfca0.zzd.zzo, zzfca0.zzd.zzp, zzfca0.zzd.zzq, zzfca0.zzd.zzr, zzfca0.zzd.zzs, zzfca0.zzd.zzt, zzfca0.zzd.zzu, zzfca0.zzd.zzv, zzfca0.zzd.zzw, zzfca0.zzd.zzx));
        zzfca zzfca1 = zzfby0.zzG();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList(zzfbr0.zzb.zzb.zza));
        bundle3.putInt("refresh_interval", zzfbr0.zzb.zzb.zzc);
        bundle3.putString("gws_query_id", zzfbr0.zzb.zzb.zzb);
        bundle2.putBundle("parent_common_config", bundle3);
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", zzfbr0.zza.zza.zzf);
        bundle4.putString("allocation_id", zzfbe0.zzx);
        bundle4.putStringArrayList("click_urls", new ArrayList(zzfbe0.zzc));
        bundle4.putStringArrayList("imp_urls", new ArrayList(zzfbe0.zzd));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList(zzfbe0.zzq));
        bundle4.putStringArrayList("fill_urls", new ArrayList(zzfbe0.zzn));
        bundle4.putStringArrayList("video_start_urls", new ArrayList(zzfbe0.zzh));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList(zzfbe0.zzi));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList(zzfbe0.zzj));
        bundle4.putString("transaction_id", zzfbe0.zzk);
        bundle4.putString("valid_from_timestamp", zzfbe0.zzl);
        bundle4.putBoolean("is_closable_area_disabled", zzfbe0.zzQ);
        bundle4.putString("recursive_server_response_data", zzfbe0.zzap);
        if(zzfbe0.zzm != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", zzfbe0.zzm.zzb);
            bundle5.putString("rb_type", zzfbe0.zzm.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return this.zzc(zzfca1, bundle2, zzfbe0, zzfbr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbr0, zzfbe zzfbe0) {
        return !TextUtils.isEmpty(zzfbe0.zzw.optString("pubid", ""));
    }

    protected abstract d zzc(zzfca arg1, Bundle arg2, zzfbe arg3, zzfbr arg4);

    private static Bundle zzd(Bundle bundle0) {
        return bundle0 == null ? new Bundle() : new Bundle(bundle0);
    }
}

