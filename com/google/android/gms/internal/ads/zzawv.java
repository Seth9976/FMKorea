package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

public final class zzawv implements Runnable {
    public final zzawy zza;
    public final zzawp zzb;
    public final zzawq zzc;
    public final zzcas zzd;

    public zzawv(zzawy zzawy0, zzawp zzawp0, zzawq zzawq0, zzcas zzcas0) {
        this.zza = zzawy0;
        this.zzb = zzawp0;
        this.zzc = zzawq0;
        this.zzd = zzcas0;
    }

    @Override
    public final void run() {
        zzcas zzcas0;
        zzawy zzawy0;
        try {
            zzawy0 = this.zza;
            zzcas0 = this.zzd;
            zzaws zzaws0 = this.zzb.zzq();
            zzawn zzawn0 = this.zzb.zzp() ? zzaws0.zzg(this.zzc) : zzaws0.zzf(this.zzc);
            if(!zzawn0.zze()) {
                zzcas0.zzd(new RuntimeException("No entry contents."));
                zzaxa.zze(zzawy0.zzc);
                return;
            }
            zzawx zzawx0 = new zzawx(zzawy0, zzawn0.zzc(), 1);
            int v = zzawx0.read();
            if(v == -1) {
                throw new IOException("Unable to read from cache.");
            }
            zzawx0.unread(v);
            zzcas0.zzc(zzaxc.zzb(zzawx0, zzawn0.zzd(), zzawn0.zzg(), zzawn0.zza(), zzawn0.zzf()));
            return;
        }
        catch(IOException | RemoteException iOException0) {
        }
        zzcaa.zzh("Unable to obtain a cache service instance.", iOException0);
        zzcas0.zzd(iOException0);
        zzaxa.zze(zzawy0.zzc);
    }
}

