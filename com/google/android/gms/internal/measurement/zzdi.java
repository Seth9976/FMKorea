package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.internal.zzgz;

final class zzdi extends zza {
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final Bundle zzf;
    private final zzdf zzg;

    zzdi(zzdf zzdf0, String s, String s1, Context context0, Bundle bundle0) {
        this.zzg = zzdf0;
        this.zzc = s;
        this.zzd = s1;
        this.zze = context0;
        this.zzf = bundle0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    public final void zza() {
        String s2;
        String s1;
        String s;
        try {
            if(this.zzg.zzc(this.zzc, this.zzd)) {
                s = this.zzd;
                s1 = this.zzc;
                s2 = this.zzg.zzc;
            }
            else {
                s2 = null;
                s1 = null;
                s = null;
            }
            Preconditions.checkNotNull(this.zze);
            zzcu zzcu0 = this.zzg.zza(this.zze, true);
            this.zzg.zzj = zzcu0;
            if(this.zzg.zzj == null) {
                Log.w(this.zzg.zzc, "Failed to connect to measurement client.");
                return;
            }
            int v = DynamiteModule.getLocalVersion(this.zze, "com.google.android.gms.measurement.dynamite");
            int v1 = DynamiteModule.getRemoteVersion(this.zze, "com.google.android.gms.measurement.dynamite");
            String s3 = zzgz.zza(this.zze);
            zzdd zzdd0 = new zzdd(82001L, ((long)Math.max(v, v1)), v1 < v, s2, s1, s, this.zzf, s3);
            ((zzcu)Preconditions.checkNotNull(this.zzg.zzj)).initialize(ObjectWrapper.wrap(this.zze), zzdd0, this.zza);
            return;
        }
        catch(Exception exception0) {
        }
        this.zzg.zza(exception0, true, false);
    }
}

