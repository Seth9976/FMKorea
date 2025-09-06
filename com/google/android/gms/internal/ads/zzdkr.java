package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzdkr implements Callable {
    public final zzdks zza;
    public final d zzb;
    public final d zzc;
    public final d zzd;
    public final d zze;
    public final d zzf;
    public final JSONObject zzg;
    public final d zzh;
    public final d zzi;
    public final d zzj;
    public final d zzk;

    public zzdkr(zzdks zzdks0, d d0, d d1, d d2, d d3, d d4, JSONObject jSONObject0, d d5, d d6, d d7, d d8) {
        this.zza = zzdks0;
        this.zzb = d0;
        this.zzc = d1;
        this.zzd = d2;
        this.zze = d3;
        this.zzf = d4;
        this.zzg = jSONObject0;
        this.zzh = d5;
        this.zzi = d6;
        this.zzj = d7;
        this.zzk = d8;
    }

    @Override
    public final Object call() {
        d d0 = this.zzi;
        d d1 = this.zzj;
        d d2 = this.zzk;
        zzdic zzdic0 = (zzdic)this.zzb.get();
        zzdic0.zzP(((List)this.zzc.get()));
        zzdic0.zzM(((zzbew)this.zzd.get()));
        zzdic0.zzQ(((zzbew)this.zze.get()));
        zzdic0.zzJ(((zzbeo)this.zzf.get()));
        zzdic0.zzS(zzdlf.zzj(this.zzg));
        zzdic0.zzL(zzdlf.zzi(this.zzg));
        zzcfi zzcfi0 = (zzcfi)this.zzh.get();
        if(zzcfi0 != null) {
            zzdic0.zzad(zzcfi0);
            zzdic0.zzac(zzcfi0.zzF());
            zzdic0.zzab(zzcfi0.zzq());
        }
        zzcfi zzcfi1 = (zzcfi)d0.get();
        if(zzcfi1 != null) {
            zzdic0.zzO(zzcfi1);
            zzdic0.zzae(zzcfi1.zzF());
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzeX)).booleanValue()) {
            zzdic0.zzU(d1);
            zzdic0.zzX(new zzcas());
        }
        else {
            zzcfi zzcfi2 = (zzcfi)d1.get();
            if(zzcfi2 != null) {
                zzdic0.zzT(zzcfi2);
            }
        }
        for(Object object0: ((List)d2.get())) {
            zzdlj zzdlj0 = (zzdlj)object0;
            if(zzdlj0.zza == 1) {
                zzdic0.zzZ(zzdlj0.zzb, zzdlj0.zzc);
            }
            else {
                zzdic0.zzN(zzdlj0.zzb, zzdlj0.zzd);
            }
        }
        return zzdic0;
    }
}

