package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class zzxx implements zzhk, zzxt {
    public static final zzfud zza;
    public static final zzfud zzb;
    public static final zzfud zzc;
    public static final zzfud zzd;
    public static final zzfud zze;
    public static final zzfud zzf;
    private static zzxx zzg;
    private final zzfug zzh;
    private final zzxr zzi;
    private final zzym zzj;
    private final zzdz zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;

    static {
        zzxx.zza = zzfud.zzp(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
        zzxx.zzb = zzfud.zzp(1500000L, 980000L, 750000L, 520000L, 290000L);
        zzxx.zzc = zzfud.zzp(2000000L, 1300000L, 1000000L, 860000L, 610000L);
        zzxx.zzd = zzfud.zzp(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        zzxx.zze = zzfud.zzp(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        zzxx.zzf = zzfud.zzp(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    }

    zzxx(Context context0, Map map0, int v, zzdz zzdz0, boolean z, zzxw zzxw0) {
        this.zzh = zzfug.zzc(map0);
        this.zzi = new zzxr();
        this.zzj = new zzym(2000);
        this.zzk = zzdz0;
        if(context0 != null) {
            zzez zzez0 = zzez.zzb(context0);
            int v1 = zzez0.zza();
            this.zzo = v1;
            this.zzr = this.zzi(v1);
            zzez0.zzd(new zzxv(this));
            return;
        }
        this.zzo = 0;
        this.zzr = this.zzi(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhk
    public final void zza(zzgi zzgi0, zzgn zzgn0, boolean z, int v) {
        synchronized(this) {
            if(!zzxx.zzl(zzgn0, z)) {
                return;
            }
            this.zzn += (long)v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhk
    public final void zzb(zzgi zzgi0, zzgn zzgn0, boolean z) {
        synchronized(this) {
            if(!zzxx.zzl(zzgn0, z)) {
                return;
            }
            zzdy.zzf(this.zzl > 0);
            long v1 = SystemClock.elapsedRealtime();
            int v2 = (int)(v1 - this.zzm);
            this.zzp += (long)v2;
            long v3 = this.zzn;
            this.zzq += v3;
            if(v2 > 0) {
                this.zzj.zzb(((int)Math.sqrt(v3)), ((float)v3) * 8000.0f / ((float)v2));
                if(this.zzp >= 2000L || this.zzq >= 0x80000L) {
                    this.zzr = (long)this.zzj.zza(0.5f);
                }
                this.zzj(v2, this.zzn, this.zzr);
                this.zzm = v1;
                this.zzn = 0L;
            }
            --this.zzl;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhk
    public final void zzc(zzgi zzgi0, zzgn zzgn0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzhk
    public final void zzd(zzgi zzgi0, zzgn zzgn0, boolean z) {
        synchronized(this) {
            if(!zzxx.zzl(zzgn0, z)) {
                return;
            }
            if(this.zzl == 0) {
                this.zzm = SystemClock.elapsedRealtime();
            }
            ++this.zzl;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzxt
    public final void zze(Handler handler0, zzxs zzxs0) {
        zzxs0.getClass();
        this.zzi.zza(handler0, zzxs0);
    }

    @Override  // com.google.android.gms.internal.ads.zzxt
    public final void zzf(zzxs zzxs0) {
        this.zzi.zzc(zzxs0);
    }

    public static zzxx zzg(Context context0) {
        String s1;
        synchronized(zzxx.class) {
            if(zzxx.zzg == null) {
                Context context1 = context0 == null ? null : context0.getApplicationContext();
                if(context0 == null) {
                    s1 = zzfqo.zzb(Locale.getDefault().getCountry());
                }
                else {
                    TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
                    if(telephonyManager0 == null) {
                        s1 = zzfqo.zzb(Locale.getDefault().getCountry());
                    }
                    else {
                        String s = telephonyManager0.getNetworkCountryIso();
                        s1 = TextUtils.isEmpty(s) ? zzfqo.zzb(Locale.getDefault().getCountry()) : zzfqo.zzb(s);
                    }
                }
                int[] arr_v = zzxx.zzm(s1);
                HashMap hashMap0 = new HashMap(8);
                hashMap0.put(0, 1000000L);
                hashMap0.put(2, ((Long)zzxx.zza.get(arr_v[0])));
                hashMap0.put(3, ((Long)zzxx.zzb.get(arr_v[1])));
                hashMap0.put(4, ((Long)zzxx.zzc.get(arr_v[2])));
                hashMap0.put(5, ((Long)zzxx.zzd.get(arr_v[3])));
                hashMap0.put(10, ((Long)zzxx.zze.get(arr_v[4])));
                hashMap0.put(9, ((Long)zzxx.zzf.get(arr_v[5])));
                hashMap0.put(7, ((Long)zzxx.zza.get(arr_v[0])));
                zzxx.zzg = new zzxx(context1, hashMap0, 2000, zzdz.zza, true, null);
            }
            return zzxx.zzg;
        }
    }

    public static void zzh(zzxx zzxx0, int v) {
        zzxx0.zzk(v);
    }

    private final long zzi(int v) {
        Long long0 = (Long)this.zzh.get(v);
        if(long0 == null) {
            long0 = (Long)this.zzh.get(0);
        }
        if(long0 == null) {
            long0 = 1000000L;
        }
        return (long)long0;
    }

    private final void zzj(int v, long v1, long v2) {
        int v4;
        long v3;
        if(v == 0) {
            if(Long.compare(v1, 0L) == 0) {
                if(v2 != this.zzs) {
                    v3 = 0L;
                    v4 = 0;
                    this.zzs = v2;
                    this.zzi.zzb(v4, v3, v2);
                    return;
                }
                return;
            }
            else {
                v3 = v1;
            }
            v4 = 0;
        }
        else {
            v4 = v;
            v3 = v1;
        }
        this.zzs = v2;
        this.zzi.zzb(v4, v3, v2);
    }

    private final void zzk(int v) {
        synchronized(this) {
            if(this.zzo == v) {
                return;
            }
            this.zzo = v;
            if(v != 0 && v != 1 && v != 8) {
                this.zzr = this.zzi(v);
                long v2 = SystemClock.elapsedRealtime();
                this.zzj((this.zzl <= 0 ? 0 : ((int)(v2 - this.zzm))), this.zzn, this.zzr);
                this.zzm = v2;
                this.zzn = 0L;
                this.zzq = 0L;
                this.zzp = 0L;
                this.zzj.zzc();
            }
        }
    }

    // 去混淆评级： 低(20)
    private static boolean zzl(zzgn zzgn0, boolean z) {
        return z && !zzgn0.zza(8);
    }

    private static int[] zzm(String s) {
        switch(s) {
            case "AD": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "AE": {
                return new int[]{1, 4, 2, 3, 4, 1};
            }
            case "AF": {
                return new int[]{4, 4, 3, 4, 2, 2};
            }
            case "AG": {
                return new int[]{2, 4, 3, 4, 2, 2};
            }
            case "AI": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "AL": {
                return new int[]{1, 1, 1, 2, 2, 2};
            }
            case "AM": {
                return new int[]{2, 3, 2, 3, 2, 2};
            }
            case "AO": {
                return new int[]{3, 4, 4, 3, 2, 2};
            }
            case "AQ": {
                return new int[]{4, 2, 2, 2, 2, 2};
            }
            case "AR": {
                return new int[]{2, 2, 2, 2, 1, 2};
            }
            case "AS": {
                return new int[]{2, 2, 3, 3, 2, 2};
            }
            case "AT": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "AU": {
                return new int[]{0, 3, 1, 1, 3, 0};
            }
            case "AW": {
                return new int[]{2, 2, 3, 4, 2, 2};
            }
            case "AX": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "AZ": {
                return new int[]{4, 2, 3, 3, 2, 2};
            }
            case "BA": {
                return new int[]{1, 1, 1, 1, 2, 2};
            }
            case "BB": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "BD": {
                return new int[]{2, 1, 3, 2, 4, 2};
            }
            case "BE": {
                return new int[]{0, 0, 1, 0, 1, 2};
            }
            case "BF": {
                return new int[]{4, 3, 4, 4, 2, 2};
            }
            case "BG": {
                return new int[]{0, 0, 0, 0, 1, 2};
            }
            case "BH": {
                return new int[]{1, 3, 1, 3, 4, 2};
            }
            case "BI": {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case "BJ": {
                return new int[]{4, 4, 2, 3, 2, 2};
            }
            case "BL": {
                return new int[]{1, 2, 2, 2, 2, 2};
            }
            case "BM": {
                return new int[]{0, 2, 0, 0, 2, 2};
            }
            case "BN": {
                return new int[]{3, 2, 0, 0, 2, 2};
            }
            case "BO": {
                return new int[]{1, 2, 4, 4, 2, 2};
            }
            case "BQ": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "BR": {
                return new int[]{1, 1, 1, 1, 2, 4};
            }
            case "BS": {
                return new int[]{3, 2, 1, 1, 2, 2};
            }
            case "BT": {
                return new int[]{3, 1, 2, 2, 3, 2};
            }
            case "BW": {
                return new int[]{3, 2, 1, 0, 2, 2};
            }
            case "BY": {
                return new int[]{1, 2, 3, 3, 2, 2};
            }
            case "BZ": {
                return new int[]{2, 2, 2, 1, 2, 2};
            }
            case "CA": {
                return new int[]{0, 2, 1, 2, 3, 3};
            }
            case "CD": {
                return new int[]{3, 3, 2, 2, 2, 2};
            }
            case "CF": {
                return new int[]{4, 2, 4, 2, 2, 2};
            }
            case "CG": {
                return new int[]{3, 4, 3, 3, 2, 2};
            }
            case "CH": {
                return new int[]{0, 1, 0, 0, 0, 2};
            }
            case "CI": {
                return new int[]{2, 4, 3, 4, 2, 2};
            }
            case "CK": {
                return new int[]{2, 2, 2, 1, 2, 2};
            }
            case "CL": {
                return new int[]{0, 1, 2, 2, 2, 2};
            }
            case "CM": {
                return new int[]{4, 3, 3, 4, 2, 2};
            }
            case "CN": {
                return new int[]{2, 0, 1, 1, 3, 1};
            }
            case "CO": {
                return new int[]{2, 3, 3, 2, 2, 2};
            }
            case "CR": {
                return new int[]{2, 4, 4, 4, 2, 2};
            }
            case "CU": {
                return new int[]{4, 2, 4, 4, 2, 2};
            }
            case "CV": {
                return new int[]{2, 3, 0, 1, 2, 2};
            }
            case "CW": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "CX": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "CY": {
                return new int[]{1, 0, 1, 0, 0, 2};
            }
            case "CZ": {
                return new int[]{0, 0, 2, 0, 1, 2};
            }
            case "DE": {
                return new int[]{0, 1, 4, 2, 2, 1};
            }
            case "DJ": {
                return new int[]{4, 2, 3, 3, 2, 2};
            }
            case "DK": {
                return new int[]{0, 0, 2, 0, 0, 2};
            }
            case "DM": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "DO": {
                return new int[]{3, 4, 4, 4, 2, 2};
            }
            case "DZ": {
                return new int[]{3, 3, 4, 4, 2, 2};
            }
            case "EC": {
                return new int[]{1, 3, 2, 1, 2, 2};
            }
            case "EE": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "EG": {
                return new int[]{3, 4, 3, 3, 2, 2};
            }
            case "ER": {
                return new int[]{4, 2, 2, 2, 2, 2};
            }
            case "ES": {
                return new int[]{0, 0, 0, 0, 1, 0};
            }
            case "ET": {
                return new int[]{4, 3, 4, 4, 4, 2};
            }
            case "FI": {
                return new int[]{0, 0, 0, 1, 0, 2};
            }
            case "FJ": {
                return new int[]{3, 2, 2, 3, 2, 2};
            }
            case "FK": {
                return new int[]{3, 2, 2, 2, 2, 2};
            }
            case "FM": {
                return new int[]{4, 2, 4, 0, 2, 2};
            }
            case "FO": {
                return new int[]{0, 2, 2, 0, 2, 2};
            }
            case "FR": {
                return new int[]{1, 1, 1, 1, 0, 2};
            }
            case "GA": {
                return new int[]{3, 4, 0, 0, 2, 2};
            }
            case "GB": {
                return new int[]{1, 1, 3, 2, 2, 2};
            }
            case "GD": {
                return new int[]{2, 2, 0, 0, 2, 2};
            }
            case "GE": {
                return new int[]{1, 1, 0, 2, 2, 2};
            }
            case "GF": {
                return new int[]{3, 2, 3, 3, 2, 2};
            }
            case "GG": {
                return new int[]{0, 2, 1, 1, 2, 2};
            }
            case "GH": {
                return new int[]{3, 3, 3, 2, 2, 2};
            }
            case "GI": {
                return new int[]{0, 2, 0, 1, 2, 2};
            }
            case "GL": {
                return new int[]{1, 2, 2, 0, 2, 2};
            }
            case "GM": {
                return new int[]{4, 3, 2, 4, 2, 2};
            }
            case "GN": {
                return new int[]{3, 4, 4, 2, 2, 2};
            }
            case "GP": {
                return new int[]{2, 1, 1, 3, 2, 2};
            }
            case "GQ": {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case "GR": {
                return new int[]{1, 0, 0, 0, 1, 2};
            }
            case "GT": {
                return new int[]{2, 1, 2, 1, 2, 2};
            }
            case "GU": {
                return new int[]{2, 2, 4, 3, 3, 2};
            }
            case "GW": {
                return new int[]{4, 4, 1, 2, 2, 2};
            }
            case "GY": {
                return new int[]{3, 1, 1, 3, 2, 2};
            }
            case "HK": {
                return new int[]{0, 1, 0, 1, 1, 0};
            }
            case "HR": {
                return new int[]{1, 0, 0, 0, 0, 2};
            }
            case "HT": {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case "HU": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "ID": {
                return new int[]{3, 1, 3, 3, 2, 4};
            }
            case "IE": {
                return new int[]{1, 1, 1, 1, 1, 2};
            }
            case "IL": {
                return new int[]{1, 2, 2, 3, 4, 2};
            }
            case "IM": {
                return new int[]{0, 2, 0, 1, 2, 2};
            }
            case "IN": {
                return new int[]{1, 1, 3, 2, 2, 3};
            }
            case "IO": {
                return new int[]{3, 2, 2, 0, 2, 2};
            }
            case "IQ": {
                return new int[]{3, 2, 3, 2, 2, 2};
            }
            case "IR": {
                return new int[]{4, 2, 3, 3, 4, 3};
            }
            case "IS": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "IT": {
                return new int[]{0, 1, 1, 2, 1, 2};
            }
            case "JE": {
                return new int[]{0, 2, 0, 1, 2, 2};
            }
            case "JM": {
                return new int[]{2, 4, 3, 1, 2, 2};
            }
            case "JO": {
                return new int[]{1, 1, 1, 1, 2, 2};
            }
            case "JP": {
                return new int[]{0, 3, 2, 3, 4, 2};
            }
            case "KE": {
                return new int[]{3, 2, 1, 1, 1, 2};
            }
            case "KG": {
                return new int[]{2, 1, 1, 2, 2, 2};
            }
            case "KH": {
                return new int[]{1, 0, 4, 2, 2, 2};
            }
            case "KI": {
                return new int[]{4, 2, 4, 4, 2, 2};
            }
            case "KM": {
                return new int[]{4, 3, 3, 2, 2, 2};
            }
            case "KN": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "KR": {
                return new int[]{0, 2, 2, 4, 4, 4};
            }
            case "KW": {
                return new int[]{1, 0, 0, 0, 0, 2};
            }
            case "KY": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "KZ": {
                return new int[]{2, 1, 2, 2, 3, 2};
            }
            case "LA": {
                return new int[]{1, 2, 1, 3, 2, 2};
            }
            case "LB": {
                return new int[]{3, 1, 1, 2, 2, 2};
            }
            case "LC": {
                return new int[]{2, 2, 1, 1, 2, 2};
            }
            case "LI": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "LK": {
                return new int[]{3, 2, 3, 3, 4, 2};
            }
            case "LR": {
                return new int[]{3, 4, 4, 4, 2, 2};
            }
            case "LS": {
                return new int[]{4, 3, 3, 3, 2, 2};
            }
            case "LT": {
                return new int[]{0, 1, 0, 1, 0, 2};
            }
            case "LU": {
                return new int[]{4, 0, 3, 2, 1, 3};
            }
            case "LV": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "LY": {
                return new int[]{4, 2, 3, 3, 2, 2};
            }
            case "MA": {
                return new int[]{3, 3, 1, 1, 2, 2};
            }
            case "MC": {
                return new int[]{1, 2, 2, 0, 2, 2};
            }
            case "MD": {
                return new int[]{1, 0, 0, 0, 2, 2};
            }
            case "ME": {
                return new int[]{2, 0, 0, 1, 3, 2};
            }
            case "MF": {
                return new int[]{1, 2, 2, 3, 2, 2};
            }
            case "MG": {
                return new int[]{3, 4, 3, 3, 2, 2};
            }
            case "MH": {
                return new int[]{4, 2, 2, 4, 2, 2};
            }
            case "MK": {
                return new int[]{1, 0, 0, 1, 3, 2};
            }
            case "ML": {
                return new int[]{3, 3, 2, 2, 2, 2};
            }
            case "MM": {
                return new int[]{3, 2, 3, 3, 4, 2};
            }
            case "MN": {
                return new int[]{2, 0, 2, 2, 2, 2};
            }
            case "MO": {
                return new int[]{0, 2, 4, 4, 3, 1};
            }
            case "MP": {
                return new int[]{1, 2, 2, 2, 2, 2};
            }
            case "MQ": {
                return new int[]{2, 1, 2, 3, 2, 2};
            }
            case "MR": {
                return new int[]{4, 3, 3, 4, 2, 2};
            }
            case "MS": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "MT": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "MU": {
                return new int[]{3, 1, 0, 2, 2, 2};
            }
            case "MV": {
                return new int[]{3, 2, 1, 3, 4, 2};
            }
            case "MW": {
                return new int[]{3, 2, 2, 1, 2, 2};
            }
            case "MX": {
                return new int[]{2, 4, 4, 4, 3, 2};
            }
            case "MY": {
                return new int[]{1, 0, 4, 1, 1, 0};
            }
            case "MZ": {
                return new int[]{3, 1, 2, 2, 2, 2};
            }
            case "NA": {
                return new int[]{3, 4, 3, 2, 2, 2};
            }
            case "NC": {
                return new int[]{2, 3, 3, 4, 2, 2};
            }
            case "NE": {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case "NF": {
                return new int[]{3, 2, 2, 2, 2, 2};
            }
            case "NG": {
                return new int[]{3, 4, 2, 1, 2, 2};
            }
            case "NI": {
                return new int[]{2, 4, 4, 4, 2, 2};
            }
            case "NL": {
                return new int[]{2, 1, 4, 3, 0, 4};
            }
            case "NO": {
                return new int[]{0, 0, 3, 0, 0, 2};
            }
            case "NP": {
                return new int[]{2, 2, 4, 3, 2, 2};
            }
            case "NR": {
                return new int[]{4, 2, 4, 4, 2, 2};
            }
            case "NU": {
                return new int[]{4, 2, 2, 2, 2, 2};
            }
            case "NZ": {
                return new int[]{0, 0, 1, 2, 4, 2};
            }
            case "OM": {
                return new int[]{2, 3, 1, 2, 4, 2};
            }
            case "PA": {
                return new int[]{2, 3, 2, 3, 2, 2};
            }
            case "PE": {
                return new int[]{1, 2, 4, 4, 3, 2};
            }
            case "PF": {
                return new int[]{2, 2, 3, 1, 2, 2};
            }
            case "PG": {
                return new int[]{4, 3, 3, 3, 2, 2};
            }
            case "PH": {
                return new int[]{2, 1, 2, 3, 2, 1};
            }
            case "PK": {
                return new int[]{3, 3, 3, 3, 2, 2};
            }
            case "PL": {
                return new int[]{1, 0, 2, 2, 4, 4};
            }
            case "PM": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "PR": {
                return new int[]{2, 0, 2, 1, 2, 0};
            }
            case "PS": {
                return new int[]{3, 4, 1, 3, 2, 2};
            }
            case "PT": {
                return new int[]{0, 0, 0, 0, 1, 2};
            }
            case "PW": {
                return new int[]{2, 2, 4, 1, 2, 2};
            }
            case "PY": {
                return new int[]{1, 2, 2, 2, 2, 2};
            }
            case "QA": {
                return new int[]{1, 4, 4, 4, 4, 2};
            }
            case "RE": {
                return new int[]{0, 3, 2, 3, 1, 2};
            }
            case "RO": {
                return new int[]{0, 0, 1, 1, 3, 2};
            }
            case "RS": {
                return new int[]{1, 0, 0, 1, 2, 2};
            }
            case "RU": {
                return new int[]{1, 0, 0, 1, 3, 3};
            }
            case "RW": {
                return new int[]{3, 3, 2, 0, 2, 2};
            }
            case "SA": {
                return new int[]{3, 1, 1, 2, 2, 0};
            }
            case "SB": {
                return new int[]{4, 2, 4, 3, 2, 2};
            }
            case "SC": {
                return new int[]{4, 2, 2, 2, 2, 2};
            }
            case "SD": {
                return new int[]{4, 3, 4, 4, 2, 2};
            }
            case "SE": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "SG": {
                return new int[]{2, 3, 3, 3, 1, 1};
            }
            case "SH": {
                return new int[]{4, 2, 2, 2, 2, 2};
            }
            case "SI": {
                return new int[]{0, 0, 0, 0, 1, 2};
            }
            case "SJ": {
                return new int[]{3, 2, 2, 2, 2, 2};
            }
            case "SK": {
                return new int[]{0, 1, 1, 1, 2, 2};
            }
            case "SL": {
                return new int[]{4, 2, 3, 3, 2, 2};
            }
            case "SM": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "SN": {
                return new int[]{4, 4, 3, 2, 2, 2};
            }
            case "SO": {
                return new int[]{2, 2, 3, 4, 4, 2};
            }
            case "SR": {
                return new int[]{2, 4, 4, 1, 2, 2};
            }
            case "SS": {
                return new int[]{4, 3, 2, 4, 2, 2};
            }
            case "ST": {
                return new int[]{2, 2, 1, 2, 2, 2};
            }
            case "SV": {
                return new int[]{2, 3, 2, 1, 2, 2};
            }
            case "SX": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "SY": {
                return new int[]{4, 3, 4, 4, 2, 2};
            }
            case "SZ": {
                return new int[]{4, 4, 3, 4, 2, 2};
            }
            case "TC": {
                return new int[]{3, 2, 1, 2, 2, 2};
            }
            case "TD": {
                return new int[]{4, 3, 4, 4, 2, 2};
            }
            case "TG": {
                return new int[]{3, 4, 1, 0, 2, 2};
            }
            case "TH": {
                return new int[]{0, 1, 2, 2, 2, 2};
            }
            case "TJ": {
                return new int[]{3, 3, 4, 4, 2, 2};
            }
            case "TL": {
                return new int[]{4, 2, 4, 4, 2, 2};
            }
            case "TM": {
                return new int[]{4, 2, 2, 4, 2, 2};
            }
            case "TN": {
                return new int[]{3, 1, 1, 1, 2, 2};
            }
            case "TO": {
                return new int[]{3, 2, 4, 3, 2, 2};
            }
            case "TR": {
                return new int[]{1, 1, 1, 1, 2, 2};
            }
            case "TT": {
                return new int[]{2, 4, 1, 0, 2, 2};
            }
            case "TV": {
                return new int[]{4, 2, 2, 4, 2, 2};
            }
            case "TW": {
                return new int[]{0, 0, 0, 0, 0, 0};
            }
            case "TZ": {
                return new int[]{3, 4, 2, 1, 3, 2};
            }
            case "UA": {
                return new int[]{0, 2, 1, 2, 3, 3};
            }
            case "UG": {
                return new int[]{3, 3, 2, 3, 4, 2};
            }
            case "US": {
                return new int[]{2, 2, 4, 1, 3, 1};
            }
            case "UY": {
                return new int[]{2, 1, 1, 2, 1, 2};
            }
            case "UZ": {
                return new int[]{1, 2, 3, 4, 3, 2};
            }
            case "VA": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "VC": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "VE": {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case "VG": {
                return new int[]{2, 2, 1, 1, 2, 4};
            }
            case "VI": {
                return new int[]{0, 2, 1, 2, 2, 2};
            }
            case "VN": {
                return new int[]{0, 0, 1, 2, 2, 2};
            }
            case "VU": {
                return new int[]{4, 3, 3, 2, 2, 2};
            }
            case "WF": {
                return new int[]{4, 2, 2, 4, 2, 2};
            }
            case "WS": {
                return new int[]{3, 1, 2, 2, 2, 2};
            }
            case "XK": {
                return new int[]{1, 2, 1, 1, 2, 2};
            }
            case "YE": {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case "YT": {
                return new int[]{2, 3, 3, 4, 2, 2};
            }
            case "ZA": {
                return new int[]{2, 4, 2, 1, 1, 2};
            }
            case "ZM": {
                return new int[]{4, 4, 4, 3, 2, 2};
            }
            case "ZW": {
                return new int[]{4, 2, 4, 3, 2, 2};
            }
            default: {
                return new int[]{2, 2, 2, 2, 2, 2};
            }
        }
    }
}

