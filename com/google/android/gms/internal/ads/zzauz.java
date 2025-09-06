package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

public final class zzauz {
    private final Object zza;
    private zzaux zzb;
    private boolean zzc;

    public zzauz() {
        this.zza = new Object();
        this.zzb = null;
        this.zzc = false;
    }

    public final Activity zza() {
        synchronized(this.zza) {
            zzaux zzaux0 = this.zzb;
            if(zzaux0 != null) {
                return zzaux0.zza();
            }
        }
        return null;
    }

    public final Context zzb() {
        synchronized(this.zza) {
            zzaux zzaux0 = this.zzb;
            if(zzaux0 != null) {
                return zzaux0.zzb();
            }
        }
        return null;
    }

    public final void zzc(zzauy zzauy0) {
        synchronized(this.zza) {
            if(this.zzb == null) {
                this.zzb = new zzaux();
            }
            this.zzb.zzf(zzauy0);
        }
    }

    public final void zzd(Context context0) {
        synchronized(this.zza) {
            if(!this.zzc) {
                Context context1 = context0.getApplicationContext();
                if(context1 == null) {
                    context1 = context0;
                }
                Application application0 = context1 instanceof Application ? ((Application)context1) : null;
                if(application0 == null) {
                    zzcaa.zzj("Can not cast Context to Application");
                    return;
                }
                if(this.zzb == null) {
                    this.zzb = new zzaux();
                }
                this.zzb.zzg(application0, context0);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzauy zzauy0) {
        synchronized(this.zza) {
            zzaux zzaux0 = this.zzb;
            if(zzaux0 == null) {
                return;
            }
            zzaux0.zzh(zzauy0);
        }
    }
}

