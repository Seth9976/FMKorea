package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzgp implements zzgi {
    private final Context zza;
    private final List zzb;
    private final zzgi zzc;
    private zzgi zzd;
    private zzgi zze;
    private zzgi zzf;
    private zzgi zzg;
    private zzgi zzh;
    private zzgi zzi;
    private zzgi zzj;
    private zzgi zzk;

    public zzgp(Context context0, zzgi zzgi0) {
        this.zza = context0.getApplicationContext();
        this.zzc = zzgi0;
        this.zzb = new ArrayList();
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        zzgi zzgi0 = this.zzk;
        zzgi0.getClass();
        return zzgi0.zza(arr_b, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        zzgi zzgi1;
        zzdy.zzf(this.zzk == null);
        String s = zzgn0.zza.getScheme();
        String s1 = zzgn0.zza.getScheme();
        if(!TextUtils.isEmpty(s1) && !"file".equals(s1)) {
            if("asset".equals(s)) {
                this.zzk = this.zzg();
                return this.zzk.zzb(zzgn0);
            }
            if("content".equals(s)) {
                if(this.zzf == null) {
                    zzgf zzgf0 = new zzgf(this.zza);
                    this.zzf = zzgf0;
                    this.zzh(zzgf0);
                }
                this.zzk = this.zzf;
                return this.zzk.zzb(zzgn0);
            }
            if("rtmp".equals(s)) {
                if(this.zzg == null) {
                    try {
                        zzgi zzgi0 = (zzgi)Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.zzg = zzgi0;
                        this.zzh(zzgi0);
                    }
                    catch(ClassNotFoundException unused_ex) {
                        zzes.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    }
                    catch(Exception exception0) {
                        throw new RuntimeException("Error instantiating RTMP extension", exception0);
                    }
                    if(this.zzg == null) {
                        this.zzg = this.zzc;
                    }
                }
                this.zzk = this.zzg;
                return this.zzk.zzb(zzgn0);
            }
            if("udp".equals(s)) {
                if(this.zzh == null) {
                    zzhm zzhm0 = new zzhm(2000);
                    this.zzh = zzhm0;
                    this.zzh(zzhm0);
                }
                this.zzk = this.zzh;
                return this.zzk.zzb(zzgn0);
            }
            if("data".equals(s)) {
                if(this.zzi == null) {
                    zzgg zzgg0 = new zzgg();
                    this.zzi = zzgg0;
                    this.zzh(zzgg0);
                }
                this.zzk = this.zzi;
                return this.zzk.zzb(zzgn0);
            }
            if("rawresource".equals(s) || "android.resource".equals(s)) {
                if(this.zzj == null) {
                    zzhi zzhi0 = new zzhi(this.zza);
                    this.zzj = zzhi0;
                    this.zzh(zzhi0);
                }
                zzgi1 = this.zzj;
            }
            else {
                zzgi1 = this.zzc;
            }
            this.zzk = zzgi1;
            return this.zzk.zzb(zzgn0);
        }
        String s2 = zzgn0.zza.getPath();
        if(s2 != null && s2.startsWith("/android_asset/")) {
            this.zzk = this.zzg();
            return this.zzk.zzb(zzgn0);
        }
        if(this.zzd == null) {
            zzgy zzgy0 = new zzgy();
            this.zzd = zzgy0;
            this.zzh(zzgy0);
        }
        this.zzk = this.zzd;
        return this.zzk.zzb(zzgn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzk == null ? null : this.zzk.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        zzgi zzgi0 = this.zzk;
        if(zzgi0 != null) {
            try {
                zzgi0.zzd();
                this.zzk = null;
            }
            catch(Throwable throwable0) {
                this.zzk = null;
                throw throwable0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Map zze() {
        return this.zzk == null ? Collections.emptyMap() : this.zzk.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzf(zzhk zzhk0) {
        zzhk0.getClass();
        this.zzc.zzf(zzhk0);
        this.zzb.add(zzhk0);
        zzgp.zzi(this.zzd, zzhk0);
        zzgp.zzi(this.zze, zzhk0);
        zzgp.zzi(this.zzf, zzhk0);
        zzgp.zzi(this.zzg, zzhk0);
        zzgp.zzi(this.zzh, zzhk0);
        zzgp.zzi(this.zzi, zzhk0);
        zzgp.zzi(this.zzj, zzhk0);
    }

    private final zzgi zzg() {
        if(this.zze == null) {
            zzgb zzgb0 = new zzgb(this.zza);
            this.zze = zzgb0;
            this.zzh(zzgb0);
        }
        return this.zze;
    }

    private final void zzh(zzgi zzgi0) {
        for(int v = 0; v < this.zzb.size(); ++v) {
            zzgi0.zzf(((zzhk)this.zzb.get(v)));
        }
    }

    private static final void zzi(zzgi zzgi0, zzhk zzhk0) {
        if(zzgi0 != null) {
            zzgi0.zzf(zzhk0);
        }
    }
}

