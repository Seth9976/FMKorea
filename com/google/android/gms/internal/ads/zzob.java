package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public final class zzob implements zzof {
    public static final zzfry zza;
    private static final Random zzb;
    private final zzcv zzc;
    private final zzct zzd;
    private final HashMap zze;
    private final zzfry zzf;
    private zzoe zzg;
    private zzcw zzh;
    private String zzi;
    private long zzj;

    static {
        zzob.zza = () -> // 去混淆评级： 低(20)
        "FPW1vhocCl0bFo00";
        zzob.zzb = new Random();
    }

    public zzob() {
        throw null;
    }

    public zzob(zzfry zzfry0) {
        this.zzf = zzfry0;
        this.zzc = new zzcv();
        this.zzd = new zzct();
        this.zze = new HashMap();
        this.zzh = zzcw.zza;
        this.zzj = -1L;
    }

    static long zza(zzob zzob0) {
        return zzob0.zzl();
    }

    static zzct zzb(zzob zzob0) {
        return zzob0.zzd;
    }

    static zzcv zzc(zzob zzob0) {
        return zzob0.zzc;
    }

    // 去混淆评级： 低(20)
    public static String zzd() [...] // 潜在的解密器

    @Override  // com.google.android.gms.internal.ads.zzof
    public final String zze() {
        synchronized(this) {
        }
        return this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzof
    public final String zzf(zzcw zzcw0, zzts zzts0) {
        synchronized(this) {
            return this.zzm(zzcw0.zzn(zzts0.zza, this.zzd).zzd, zzts0).zzb;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzof
    public final void zzg(zzly zzly0) {
        synchronized(this) {
            String s = this.zzi;
            if(s != null) {
                zzoa zzoa0 = (zzoa)this.zze.get(s);
                if(zzoa0 == null) {
                    throw null;
                }
                this.zzo(zzoa0);
            }
            Iterator iterator0 = this.zze.values().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                zzoa zzoa1 = (zzoa)object0;
                iterator0.remove();
                if(zzoa1.zzf) {
                    zzoe zzoe0 = this.zzg;
                    if(zzoe0 != null) {
                        zzoe0.zzd(zzly0, zzoa1.zzb, false);
                    }
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzof
    public final void zzh(zzoe zzoe0) {
        this.zzg = zzoe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzof
    public final void zzi(zzly zzly0) {
        synchronized(this) {
            if(this.zzg != null) {
                if(zzly0.zzb.zzo()) {
                    return;
                }
                zzts zzts0 = zzly0.zzd;
                if(zzts0 != null) {
                    long v1 = this.zzl();
                    if(zzts0.zzd < v1) {
                        return;
                    }
                    zzoa zzoa0 = (zzoa)this.zze.get(this.zzi);
                    if(zzoa0 != null && zzoa0.zzd == -1L && zzoa0.zzc != zzly0.zzc) {
                        return;
                    }
                }
                zzoa zzoa1 = this.zzm(zzly0.zzc, zzly0.zzd);
                if(this.zzi == null) {
                    this.zzi = zzoa1.zzb;
                }
                zzts zzts1 = zzly0.zzd;
                if(zzts1 != null && zzts1.zzb()) {
                    zzts zzts2 = new zzts(zzts1.zza, zzts1.zzd, zzts1.zzb);
                    zzoa zzoa2 = this.zzm(zzly0.zzc, zzts2);
                    if(!zzoa2.zzf) {
                        zzoa.zzf(zzoa2, true);
                        zzly0.zzb.zzn(zzly0.zzd.zza, this.zzd);
                        zzfk.zzr(0L);
                        zzfk.zzr(0L);
                    }
                }
                if(!zzoa1.zzf) {
                    zzoa.zzf(zzoa1, true);
                }
                if(zzoa1.zzb.equals(this.zzi) && !zzoa1.zzg) {
                    zzoa.zze(zzoa1, true);
                    this.zzg.zzc(zzly0, zzoa1.zzb);
                    return;
                }
                return;
            }
        }
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzof
    public final void zzj(zzly zzly0, int v) {
        synchronized(this) {
            if(this.zzg != null) {
                Iterator iterator0 = this.zze.values().iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    zzoa zzoa0 = (zzoa)object0;
                    if(zzoa0.zzk(zzly0)) {
                        iterator0.remove();
                        if(zzoa0.zzf) {
                            boolean z = zzoa0.zzb.equals(this.zzi);
                            boolean z1 = v == 0 && z && zzoa0.zzg;
                            if(z) {
                                this.zzo(zzoa0);
                            }
                            this.zzg.zzd(zzly0, zzoa0.zzb, z1);
                        }
                    }
                }
                this.zzp(zzly0);
                return;
            }
        }
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzof
    public final void zzk(zzly zzly0) {
        synchronized(this) {
            if(this.zzg != null) {
                zzcw zzcw0 = this.zzh;
                this.zzh = zzly0.zzb;
                Iterator iterator0 = this.zze.values().iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    zzoa zzoa0 = (zzoa)object0;
                    if(!zzoa0.zzl(zzcw0, this.zzh) || zzoa0.zzk(zzly0)) {
                        iterator0.remove();
                        if(zzoa0.zzf) {
                            if(zzoa0.zzb.equals(this.zzi)) {
                                this.zzo(zzoa0);
                            }
                            this.zzg.zzd(zzly0, zzoa0.zzb, false);
                        }
                    }
                }
                this.zzp(zzly0);
                return;
            }
        }
        throw null;
    }

    private final long zzl() {
        zzoa zzoa0 = (zzoa)this.zze.get(this.zzi);
        return zzoa0 == null || zzoa0.zzd == -1L ? this.zzj + 1L : zzoa0.zzd;
    }

    private final zzoa zzm(int v, zzts zzts0) {
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        zzoa zzoa0 = null;
        for(Object object0: this.zze.values()) {
            zzoa zzoa1 = (zzoa)object0;
            zzoa1.zzg(v, zzts0);
            if(zzoa1.zzj(v, zzts0)) {
                long v2 = zzoa1.zzd;
                if(v2 != -1L) {
                    int v3 = Long.compare(v2, v1);
                    if(v3 >= 0) {
                        if(v3 != 0 || zzoa0.zze == null || zzoa1.zze == null) {
                            continue;
                        }
                        zzoa0 = zzoa1;
                        continue;
                    }
                }
                zzoa0 = zzoa1;
                v1 = v2;
            }
        }
        if(zzoa0 == null) {
            zzoa zzoa2 = new zzoa(this, "tmnTmeLgnb0wvze9", v, zzts0);
            this.zze.put("tmnTmeLgnb0wvze9", zzoa2);
            return zzoa2;
        }
        return zzoa0;
    }

    private static String zzn() [...] // 潜在的解密器

    private final void zzo(zzoa zzoa0) {
        if(zzoa0.zzd != -1L) {
            this.zzj = zzoa0.zzd;
        }
        this.zzi = null;
    }

    private final void zzp(zzly zzly0) {
        if(zzly0.zzb.zzo()) {
            String s = this.zzi;
            if(s != null) {
                zzoa zzoa0 = (zzoa)this.zze.get(s);
                zzoa0.getClass();
                this.zzo(zzoa0);
            }
            return;
        }
        zzoa zzoa1 = (zzoa)this.zze.get(this.zzi);
        this.zzi = this.zzm(zzly0.zzc, zzly0.zzd).zzb;
        this.zzi(zzly0);
        if(zzly0.zzd != null && zzly0.zzd.zzb() && (zzoa1 == null || zzoa1.zzd != zzly0.zzd.zzd || zzoa1.zze == null || zzoa1.zze.zzb != zzly0.zzd.zzb || zzoa1.zze.zzc != zzly0.zzd.zzc)) {
            zzts zzts0 = new zzts(zzly0.zzd.zza, zzly0.zzd.zzd);
            zzoa.zzd(this.zzm(zzly0.zzc, zzts0));
        }
    }
}

