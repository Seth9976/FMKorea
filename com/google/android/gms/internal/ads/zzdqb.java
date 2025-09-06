package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;

public final class zzdqb implements zza, zzcwl, zzcxc, zzcxw, zzczd, zzdbp {
    private final zzaxe zza;
    private boolean zzb;

    public zzdqb(zzaxe zzaxe0, zzeyz zzeyz0) {
        this.zzb = false;
        this.zza = zzaxe0;
        zzaxe0.zzc(2);
        if(zzeyz0 != null) {
            zzaxe0.zzc(1101);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized(this) {
            if(!this.zzb) {
                this.zza.zzc(7);
                this.zzb = true;
                return;
            }
            this.zza.zzc(8);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(zze zze0) {
        switch(zze0.zza) {
            case 1: {
                this.zza.zzc(101);
                return;
            }
            case 2: {
                this.zza.zzc(102);
                return;
            }
            case 3: {
                this.zza.zzc(5);
                return;
            }
            case 4: {
                this.zza.zzc(103);
                return;
            }
            case 5: {
                this.zza.zzc(104);
                return;
            }
            case 6: {
                this.zza.zzc(105);
                return;
            }
            case 7: {
                this.zza.zzc(106);
                return;
            }
            default: {
                this.zza.zzc(4);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbun0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbr0) {
        zzdpx zzdpx0 = new zzdpx(zzfbr0);
        this.zza.zzb(zzdpx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbp
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbp
    public final void zzi(zzaxz zzaxz0) {
        zzdqa zzdqa0 = new zzdqa(zzaxz0);
        this.zza.zzb(zzdqa0);
        this.zza.zzc(0x44F);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbp
    public final void zzj(zzaxz zzaxz0) {
        zzdpz zzdpz0 = new zzdpz(zzaxz0);
        this.zza.zzb(zzdpz0);
        this.zza.zzc(1102);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbp
    public final void zzl(boolean z) {
        this.zza.zzc((z ? 1107 : 1108));
    }

    @Override  // com.google.android.gms.internal.ads.zzdbp
    public final void zzm(zzaxz zzaxz0) {
        zzdpy zzdpy0 = new zzdpy(zzaxz0);
        this.zza.zzb(zzdpy0);
        this.zza.zzc(0x450);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbp
    public final void zzn(boolean z) {
        this.zza.zzc((z ? 1105 : 1106));
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        synchronized(this) {
            this.zza.zzc(6);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        this.zza.zzc(3);
    }
}

