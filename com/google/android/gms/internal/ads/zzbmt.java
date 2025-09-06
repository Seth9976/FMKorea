package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbmt extends zzcaz {
    private final Object zza;
    private final zzbb zzb;
    private boolean zzc;
    private int zzd;

    public zzbmt(zzbb zzbb0) {
        this.zza = new Object();
        this.zzb = zzbb0;
        this.zzc = false;
        this.zzd = 0;
    }

    public final zzbmo zza() {
        zzbmo zzbmo0 = new zzbmo(this);
        synchronized(this.zza) {
            this.zzi(new zzbmp(this, zzbmo0), new zzbmq(this, zzbmo0));
            Preconditions.checkState(this.zzd >= 0);
            ++this.zzd;
            return zzbmo0;
        }
    }

    public final void zzb() {
        synchronized(this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            this.zzc();
        }
    }

    protected final void zzc() {
        synchronized(this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            if(!this.zzc || this.zzd != 0) {
                zze.zza("There are still references to the engine. Not destroying.");
            }
            else {
                zze.zza("No reference is left (including root). Cleaning up engine.");
                this.zzi(new zzbms(this), new zzcav());
            }
        }
    }

    protected final void zzd() {
        synchronized(this.zza) {
            Preconditions.checkState(this.zzd > 0);
            zze.zza("Releasing 1 reference for JS Engine");
            --this.zzd;
            this.zzc();
        }
    }
}

