package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

public final class zzems implements zzesi {
    public final ArrayList zza;

    public zzems(ArrayList arrayList0) {
        this.zza = arrayList0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        ((Bundle)object0).putStringArrayList("ad_types", this.zza);
    }
}

