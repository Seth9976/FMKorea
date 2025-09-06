package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Set;

public final class zzcyc extends zzdbs implements zzbhh {
    private final Bundle zzb;

    zzcyc(Set set0) {
        super(set0);
        this.zzb = new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbhh
    public final void zza(String s, Bundle bundle0) {
        synchronized(this) {
            this.zzb.putAll(bundle0);
            this.zzt((zzcyb this) -> ((OnAdMetadataChangedListener)object0).onAdMetadataChanged());
        }
    }

    public final Bundle zzb() {
        synchronized(this) {
            return new Bundle(this.zzb);
        }
    }
}

