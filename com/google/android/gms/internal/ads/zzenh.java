package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

public final class zzenh implements zzesi {
    public final ArrayList zza;

    public zzenh(ArrayList arrayList0) {
        this.zza = arrayList0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        ((Bundle)object0).putStringArrayList("android_permissions", this.zza);
    }
}

