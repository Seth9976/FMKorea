package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzk;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

public final class zzcck {
    private final Context zza;
    private final String zzb;
    private final zzcag zzc;
    private final zzbcg zzd;
    private final zzbcj zze;
    private final zzbf zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcbp zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;

    public zzcck(Context context0, zzcag zzcag0, String s, zzbcj zzbcj0, zzbcg zzbcg0) {
        zzbd zzbd0 = new zzbd();
        zzbd0.zza("min_1", 4.900000E-324, 1.0);
        zzbd0.zza("1_5", 1.0, 5.0);
        zzbd0.zza("5_10", 5.0, 10.0);
        zzbd0.zza("10_20", 10.0, 20.0);
        zzbd0.zza("20_30", 20.0, 30.0);
        zzbd0.zza("30_max", 30.0, 1.797693E+308);
        this.zzf = zzbd0.zzb();
        this.zzi = false;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzq = -1L;
        this.zza = context0;
        this.zzc = zzcag0;
        this.zzb = s;
        this.zze = zzbcj0;
        this.zzd = zzbcg0;
        String s1 = (String)zzba.zzc().zzb(zzbbr.zzA);
        if(s1 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] arr_s = TextUtils.split(s1, ",");
        this.zzh = new String[arr_s.length];
        this.zzg = new long[arr_s.length];
        for(int v = 0; v < arr_s.length; ++v) {
            try {
                this.zzg[v] = Long.parseLong(arr_s[v]);
            }
            catch(NumberFormatException numberFormatException0) {
                zzcaa.zzk("Unable to parse frame hash target time number.", numberFormatException0);
                this.zzg[v] = -1L;
            }
        }
    }

    public final void zza(zzcbp zzcbp0) {
        zzbcb.zza(this.zze, this.zzd, new String[]{"vpc2"});
        this.zzi = true;
        String s = zzcbp0.zzj();
        this.zze.zzd("vpn", s);
        this.zzn = zzcbp0;
    }

    public final void zzb() {
        if(this.zzi && !this.zzj) {
            zzbcb.zza(this.zze, this.zzd, new String[]{"vfr2"});
            this.zzj = true;
        }
    }

    public final void zzc() {
        this.zzm = true;
        if(this.zzj && !this.zzk) {
            zzbcb.zza(this.zze, this.zzd, new String[]{"vfp2"});
            this.zzk = true;
        }
    }

    public final void zzd() {
        if(((Boolean)zzbdy.zza.zze()).booleanValue() && !this.zzo) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("type", "native-player-metrics");
            bundle0.putString("request", this.zzb);
            bundle0.putString("player", this.zzn.zzj());
            for(Object object0: this.zzf.zza()) {
                bundle0.putString("fps_c_" + ((zzbc)object0).zza, Integer.toString(((zzbc)object0).zze));
                bundle0.putString("fps_p_" + ((zzbc)object0).zza, Double.toString(((zzbc)object0).zzd));
            }
            for(int v = 0; true; ++v) {
                long[] arr_v = this.zzg;
                if(v >= arr_v.length) {
                    break;
                }
                String s = this.zzh[v];
                if(s != null) {
                    bundle0.putString("fh_" + ((long)arr_v[v]).toString(), s);
                }
            }
            String s1 = this.zzc.zza;
            bundle0.putString("device", zzs.zzp());
            bundle0.putString("eids", TextUtils.join(",", zzba.zza().zza()));
            zzk zzk0 = new zzk(this.zza, s1);
            zzbzt.zzw(this.zza, s1, "gmob-apps", bundle0, true, zzk0);
            this.zzo = true;
        }
    }

    public final void zze() {
        this.zzm = false;
    }

    public final void zzf(zzcbp zzcbp0) {
        if(this.zzk && !this.zzl) {
            if(zze.zzc() && !this.zzl) {
                zze.zza("VideoMetricsMixin first frame");
            }
            zzbcb.zza(this.zze, this.zzd, new String[]{"vff2"});
            this.zzl = true;
        }
        long v = zzt.zzB().nanoTime();
        if(this.zzm && this.zzp && this.zzq != -1L) {
            double f = (double)TimeUnit.SECONDS.toNanos(1L);
            this.zzf.zzb(f / ((double)(v - this.zzq)));
        }
        this.zzp = this.zzm;
        this.zzq = v;
        long v1 = (long)(((Long)zzba.zzc().zzb(zzbbr.zzB)));
        long v2 = (long)zzcbp0.zza();
        for(int v3 = 0; true; ++v3) {
            String[] arr_s = this.zzh;
            if(v3 >= arr_s.length) {
                break;
            }
            if(arr_s[v3] == null && v1 > Math.abs(v2 - this.zzg[v3])) {
                String[] arr_s1 = this.zzh;
                Bitmap bitmap0 = zzcbp0.getBitmap(8, 8);
                long v4 = 0x3FL;
                long v5 = 0L;
                for(int v6 = 0; v6 < 8; ++v6) {
                    for(int v7 = 0; v7 < 8; ++v7) {
                        int v8 = bitmap0.getPixel(v7, v6);
                        v5 |= (Color.blue(v8) + Color.red(v8) + Color.green(v8) <= 0x80 ? 0L : 1L) << ((int)v4);
                        --v4;
                    }
                }
                arr_s1[v3] = String.format("%016X", v5);
                return;
            }
        }
    }
}

