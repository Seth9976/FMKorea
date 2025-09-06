package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzefk extends zzbvn implements zzcxs {
    private zzbvo zza;
    private zzcxr zzb;
    private zzdeh zzc;

    @Override  // com.google.android.gms.internal.ads.zzcxs
    public final void zza(zzcxr zzcxr0) {
        synchronized(this) {
            this.zzb = zzcxr0;
        }
    }

    public final void zzc(zzbvo zzbvo0) {
        synchronized(this) {
            this.zza = zzbvo0;
        }
    }

    public final void zzd(zzdeh zzdeh0) {
        synchronized(this) {
            this.zzc = zzdeh0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zze(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            zzbvo zzbvo0 = this.zza;
            if(zzbvo0 != null) {
                ((zzeii)zzbvo0).zzb.onAdClicked();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzf(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            zzbvo zzbvo0 = this.zza;
            if(zzbvo0 != null) {
                zzbvo0.zzf(iObjectWrapper0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzg(IObjectWrapper iObjectWrapper0, int v) {
        synchronized(this) {
            zzcxr zzcxr0 = this.zzb;
            if(zzcxr0 != null) {
                zzcxr0.zza(v);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzh(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            zzbvo zzbvo0 = this.zza;
            if(zzbvo0 != null) {
                ((zzeii)zzbvo0).zzc.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzi(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            zzcxr zzcxr0 = this.zzb;
            if(zzcxr0 != null) {
                zzcxr0.zzd();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzj(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            zzbvo zzbvo0 = this.zza;
            if(zzbvo0 != null) {
                ((zzeii)zzbvo0).zza.zzbv();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzk(IObjectWrapper iObjectWrapper0, int v) {
        synchronized(this) {
            zzdeh zzdeh0 = this.zzc;
            if(zzdeh0 != null) {
                zzcaa.zzj(("Fail to initialize adapter " + ((zzeih)zzdeh0).zzc.zza));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzl(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            zzdeh zzdeh0 = this.zzc;
            if(zzdeh0 != null) {
                zzeij.zzc(((zzeih)zzdeh0).zzd).execute(new zzeig(((zzeih)zzdeh0), ((zzeih)zzdeh0).zza, ((zzeih)zzdeh0).zzb, ((zzeih)zzdeh0).zzc));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzm(IObjectWrapper iObjectWrapper0, zzbvp zzbvp0) {
        synchronized(this) {
            zzbvo zzbvo0 = this.zza;
            if(zzbvo0 != null) {
                ((zzeii)zzbvo0).zzd.zza(zzbvp0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzn(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            zzbvo zzbvo0 = this.zza;
            if(zzbvo0 != null) {
                ((zzeii)zzbvo0).zzc.zze();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvo
    public final void zzo(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            zzbvo zzbvo0 = this.zza;
            if(zzbvo0 != null) {
                ((zzeii)zzbvo0).zzd.zzc();
            }
        }
    }
}

