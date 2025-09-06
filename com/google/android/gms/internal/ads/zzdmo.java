package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;

public class zzdmo implements zza, zzo, zzz, zzbhh, zzbhj {
    private zza zza;
    private zzbhh zzb;
    private zzo zzc;
    private zzbhj zzd;
    private zzz zze;

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized(this) {
            zza zza0 = this.zza;
            if(zza0 != null) {
                zza0.onAdClicked();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbhh
    public final void zza(String s, Bundle bundle0) {
        synchronized(this) {
            zzbhh zzbhh0 = this.zzb;
            if(zzbhh0 != null) {
                zzbhh0.zza(s, bundle0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbhj
    public final void zzb(String s, String s1) {
        synchronized(this) {
            zzbhj zzbhj0 = this.zzd;
            if(zzbhj0 != null) {
                zzbhj0.zzb(s, s1);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        synchronized(this) {
            zzo zzo0 = this.zzc;
            if(zzo0 != null) {
                zzo0.zzbL();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        synchronized(this) {
            zzo zzo0 = this.zzc;
            if(zzo0 != null) {
                zzo0.zzbo();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        synchronized(this) {
            zzo zzo0 = this.zzc;
            if(zzo0 != null) {
                zzo0.zzbu();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        synchronized(this) {
            zzo zzo0 = this.zzc;
            if(zzo0 != null) {
                zzo0.zzbv();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        synchronized(this) {
            zzo zzo0 = this.zzc;
            if(zzo0 != null) {
                zzo0.zzbx();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int v) {
        synchronized(this) {
            zzo zzo0 = this.zzc;
            if(zzo0 != null) {
                zzo0.zzby(v);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzz
    public final void zzg() {
        synchronized(this) {
            zzz zzz0 = this.zze;
            if(zzz0 != null) {
                zzz0.zzg();
            }
        }
    }

    protected final void zzh(zza zza0, zzbhh zzbhh0, zzo zzo0, zzbhj zzbhj0, zzz zzz0) {
        synchronized(this) {
            this.zza = zza0;
            this.zzb = zzbhh0;
            this.zzc = zzo0;
            this.zzd = zzbhj0;
            this.zze = zzz0;
        }
    }
}

