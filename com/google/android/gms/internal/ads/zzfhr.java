package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class zzfhr implements Runnable {
    private final List zza;
    private final zzfhu zzb;
    private String zzc;
    private String zzd;
    private zzfbq zze;
    private zze zzf;
    private Future zzg;
    private int zzh;

    zzfhr(zzfhu zzfhu0) {
        this.zza = new ArrayList();
        this.zzh = 2;
        this.zzb = zzfhu0;
    }

    @Override
    public final void run() {
        synchronized(this) {
            this.zzg();
        }
    }

    public final zzfhr zza(zzfhg zzfhg0) {
        synchronized(this) {
            if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                zzfhg0.zzi();
                this.zza.add(zzfhg0);
                Future future0 = this.zzg;
                if(future0 != null) {
                    future0.cancel(false);
                }
                long v1 = (long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzis)))));
                this.zzg = zzcan.zzd.schedule(this, v1, TimeUnit.MILLISECONDS);
            }
            return this;
        }
    }

    public final zzfhr zzb(String s) {
        synchronized(this) {
            if(((Boolean)zzbdd.zzc.zze()).booleanValue() && zzfhq.zze(s)) {
                this.zzc = s;
            }
            return this;
        }
    }

    public final zzfhr zzc(zze zze0) {
        synchronized(this) {
            if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                this.zzf = zze0;
            }
            return this;
        }
    }

    public final zzfhr zzd(ArrayList arrayList0) {
        synchronized(this) {
            if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                if(arrayList0.contains("banner") || arrayList0.contains("BANNER")) {
                    this.zzh = 3;
                }
                else if(arrayList0.contains("interstitial") || arrayList0.contains("INTERSTITIAL")) {
                    this.zzh = 4;
                }
                else if(arrayList0.contains("native") || arrayList0.contains("NATIVE")) {
                    this.zzh = 8;
                }
                else if(arrayList0.contains("rewarded") || arrayList0.contains("REWARDED")) {
                    this.zzh = 5;
                }
                else if(arrayList0.contains("app_open_ad")) {
                    this.zzh = 7;
                }
                else if(arrayList0.contains("rewarded_interstitial") || arrayList0.contains("REWARDED_INTERSTITIAL")) {
                    this.zzh = 6;
                }
            }
            return this;
        }
    }

    public final zzfhr zze(String s) {
        synchronized(this) {
            if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                this.zzd = s;
            }
            return this;
        }
    }

    public final zzfhr zzf(zzfbq zzfbq0) {
        synchronized(this) {
            if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                this.zze = zzfbq0;
            }
            return this;
        }
    }

    public final void zzg() {
        synchronized(this) {
            if(!((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                return;
            }
            Future future0 = this.zzg;
            if(future0 != null) {
                future0.cancel(false);
            }
            for(Object object0: this.zza) {
                zzfhg zzfhg0 = (zzfhg)object0;
                int v1 = this.zzh;
                if(v1 != 2) {
                    zzfhg0.zzm(v1);
                }
                if(!TextUtils.isEmpty(this.zzc)) {
                    zzfhg0.zze(this.zzc);
                }
                if(!TextUtils.isEmpty(this.zzd) && !zzfhg0.zzk()) {
                    zzfhg0.zzd(this.zzd);
                }
                zzfbq zzfbq0 = this.zze;
                if(zzfbq0 == null) {
                    zze zze0 = this.zzf;
                    if(zze0 != null) {
                        zzfhg0.zza(zze0);
                    }
                }
                else {
                    zzfhg0.zzb(zzfbq0);
                }
                zzfhk zzfhk0 = zzfhg0.zzl();
                this.zzb.zzb(zzfhk0);
            }
            this.zza.clear();
        }
    }

    public final zzfhr zzh(int v) {
        synchronized(this) {
            if(((Boolean)zzbdd.zzc.zze()).booleanValue()) {
                this.zzh = v;
            }
            return this;
        }
    }
}

