package com.google.android.gms.internal.ads;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

public final class zzask extends zzatm {
    public zzask(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1) {
        super(zzary0, "Q+fOnDUQnIPH75lusFutOgWOI4DeJ6z7X13oo1pZ5m19Kfyi56UOJglWSBqO3AzA", "Hu+f/NX/SE2ncwqgjWboivCw8sh0xmVI9uGBmdlJpc4=", zzanv0, v, 49);
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        int v = 1;
        this.zze.zzaa(3);
        try {
            boolean z = ((Boolean)this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzanv zzanv0 = this.zze;
            if(z) {
                v = 2;
            }
            zzanv0.zzaa(v);
        }
        catch(InvocationTargetException invocationTargetException0) {
            if(!(invocationTargetException0.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw invocationTargetException0;
            }
        }
    }
}

