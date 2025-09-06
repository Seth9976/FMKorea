package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

final class zzuq implements zzth, zzyd {
    final zzuv zza;
    private final long zzb;
    private final Uri zzc;
    private final zzhj zzd;
    private final zzul zze;
    private final zzabe zzf;
    private final zzeb zzg;
    private final zzabx zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzgn zzl;
    private zzace zzm;
    private boolean zzn;

    public zzuq(zzuv zzuv0, Uri uri0, zzgi zzgi0, zzul zzul0, zzabe zzabe0, zzeb zzeb0) {
        this.zza = zzuv0;
        super();
        this.zzc = uri0;
        this.zzd = new zzhj(zzgi0);
        this.zze = zzul0;
        this.zzf = zzabe0;
        this.zzg = zzeb0;
        this.zzh = new zzabx();
        this.zzj = true;
        this.zzb = zztj.zza();
        this.zzl = this.zzi(0L);
    }

    @Override  // com.google.android.gms.internal.ads.zzth
    public final void zza(zzfb zzfb0) {
        long v = this.zzn ? Math.max(zzuv.zzq(this.zza, true), this.zzk) : this.zzk;
        int v1 = zzfb0.zza();
        zzace zzace0 = this.zzm;
        zzace0.getClass();
        zzacc.zzb(zzace0, zzfb0, v1);
        zzace0.zzs(v, 1, v1, 0, null);
        this.zzn = true;
    }

    static void zzf(zzuq zzuq0, long v, long v1) {
        zzuq0.zzh.zza = v;
        zzuq0.zzk = v1;
        zzuq0.zzj = true;
        zzuq0.zzn = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzyd
    public final void zzg() {
        this.zzi = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzyd
    public final void zzh() {
        int v10;
        int v8;
        int v7;
        long v6;
        zzhj zzhj1;
        int v5;
        int v4;
        boolean z1;
        String s3;
        String s2;
        String s1;
        int v3;
        boolean z;
        int v2;
        while(!this.zzi) {
            try {
                long v = this.zzh.zza;
                zzgn zzgn0 = this.zzi(v);
                this.zzl = zzgn0;
                long v1 = this.zzd.zzb(zzgn0);
                if(v1 != -1L) {
                    v1 += v;
                    zzuv.zzB(this.zza);
                }
                zzuv zzuv0 = this.zza;
                Map map0 = this.zzd.zze();
                List list0 = (List)map0.get("icy-br");
                if(list0 == null) {
                    z = false;
                    v3 = -1;
                    goto label_27;
                label_25:
                    v3 = v2;
                    z = true;
                }
                else {
                    String s = (String)list0.get(0);
                    try {
                        v2 = -1;
                        v2 = Integer.parseInt(s) * 1000;
                        if(v2 <= 0) {
                            zzes.zzf("IcyHeaders", "Invalid bitrate: " + s);
                            z = false;
                            v3 = -1;
                        }
                        else {
                            goto label_25;
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                        zzes.zzf("IcyHeaders", "Invalid bitrate header: " + s);
                        z = false;
                        v3 = v2;
                    }
                }
            label_27:
                List list1 = (List)map0.get("icy-genre");
                zzaeb zzaeb0 = null;
                if(list1 == null) {
                    s1 = null;
                }
                else {
                    s1 = (String)list1.get(0);
                    z = true;
                }
                List list2 = (List)map0.get("icy-name");
                if(list2 == null) {
                    s2 = null;
                }
                else {
                    s2 = (String)list2.get(0);
                    z = true;
                }
                List list3 = (List)map0.get("icy-url");
                if(list3 == null) {
                    s3 = null;
                }
                else {
                    s3 = (String)list3.get(0);
                    z = true;
                }
                List list4 = (List)map0.get("icy-pub");
                if(list4 == null) {
                    z1 = false;
                }
                else {
                    z1 = ((String)list4.get(0)).equals("1");
                    z = true;
                }
                List list5 = (List)map0.get("icy-metaint");
                if(list5 == null) {
                    v5 = -1;
                    goto label_67;
                label_65:
                    v5 = v4;
                    z = true;
                }
                else {
                    String s4 = (String)list5.get(0);
                    try {
                        v4 = -1;
                        v4 = Integer.parseInt(s4);
                        if(v4 <= 0) {
                            zzes.zzf("IcyHeaders", "Invalid metadata interval: " + s4);
                            v5 = -1;
                        }
                        else {
                            goto label_65;
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                        zzes.zzf("IcyHeaders", "Invalid metadata interval: " + s4);
                        v5 = v4;
                    }
                }
            label_67:
                if(z) {
                    zzaeb0 = new zzaeb(v3, s1, s2, s3, z1, v5);
                }
                zzuv0.zzr = zzaeb0;
                zzhj zzhj0 = this.zzd;
                zzuv zzuv1 = this.zza;
                if(zzuv1.zzr == null || zzuv1.zzr.zzf == -1) {
                    zzhj1 = zzhj0;
                }
                else {
                    zzti zzti0 = new zzti(zzhj0, zzuv1.zzr.zzf, this);
                    zzace zzace0 = this.zza.zzu();
                    this.zzm = zzace0;
                    zzace0.zzk(zzuv.zzc);
                    zzhj1 = zzti0;
                }
                Map map1 = this.zzd.zze();
                this.zze.zzd(zzhj1, this.zzc, map1, v, v1, this.zzf);
                if(this.zza.zzr != null) {
                    this.zze.zzc();
                }
                if(this.zzj) {
                    this.zze.zzf(v, this.zzk);
                    this.zzj = false;
                }
                v6 = v;
                v7 = 0;
            }
            catch(Throwable throwable0) {
                v8 = 0;
                goto label_107;
            }
            while(v7 == 0) {
                if(!this.zzi) {
                    try {
                        try {
                            this.zzg.zza();
                        }
                        catch(InterruptedException unused_ex) {
                            throw new InterruptedIOException();
                        }
                        v7 = this.zze.zza(this.zzh);
                        long v9 = this.zze.zzb();
                        if(v9 <= this.zza.zzj + v6) {
                            continue;
                        }
                        this.zzg.zzc();
                        this.zza.zzp.post(this.zza.zzo);
                        v6 = v9;
                        continue;
                    }
                    catch(Throwable throwable0) {
                        v8 = v7;
                    }
                label_107:
                    if(v8 != 1) {
                        zzul zzul0 = this.zze;
                        if(zzul0.zzb() != -1L) {
                            this.zzh.zza = zzul0.zzb();
                        }
                    }
                    zzgk.zza(this.zzd);
                    throw throwable0;
                }
                v7 = 0;
                break;
            }
            if(v7 == 1) {
                v10 = 0;
            }
            else {
                zzul zzul1 = this.zze;
                if(zzul1.zzb() != -1L) {
                    this.zzh.zza = zzul1.zzb();
                }
                v10 = v7;
            }
            zzgk.zza(this.zzd);
            if(v10 != 0) {
                return;
            }
            if(false) {
                break;
            }
        }
    }

    private final zzgn zzi(long v) {
        zzgl zzgl0 = new zzgl();
        zzgl0.zzd(this.zzc);
        zzgl0.zzc(v);
        zzgl0.zza(6);
        zzgl0.zzb(zzuv.zzy());
        return zzgl0.zze();
    }
}

