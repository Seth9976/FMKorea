package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

final class zzbss extends zzbyn {
    final QueryInfoGenerationCallback zza;

    zzbss(zzbst zzbst0, QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        this.zza = queryInfoGenerationCallback0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbyo
    public final void zzb(String s) {
        this.zza.onFailure(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyo
    public final void zzc(String s, String s1, Bundle bundle0) {
        QueryInfo queryInfo0 = new QueryInfo(new zzem(s, bundle0, s1));
        this.zza.onSuccess(queryInfo0);
    }
}

