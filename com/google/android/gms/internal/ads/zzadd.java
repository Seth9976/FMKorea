package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

public final class zzadd implements zzabb {
    public static final zzabi zza;
    private final byte[] zzb;
    private final zzfb zzc;
    private final zzabj zzd;
    private zzabe zze;
    private zzace zzf;
    private int zzg;
    private zzbz zzh;
    private zzabo zzi;
    private int zzj;
    private int zzk;
    private zzadb zzl;
    private int zzm;
    private long zzn;

    static {
        zzadd.zza = (Uri uri0, Map map0) -> new zzabb[]{new zzadd(0)};
    }

    public zzadd() {
        this(0);
    }

    public zzadd(int v) {
        this.zzb = new byte[42];
        this.zzc = new zzfb(new byte[0x8000], 0);
        this.zzd = new zzabj();
        this.zzg = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        zzaca zzaca0;
        int v = this.zzg;
        boolean z = true;
        switch(v) {
            case 0: {
                zzabc0.zzj();
                long v12 = zzabc0.zze();
                zzbz zzbz0 = zzabl.zza(zzabc0, true);
                ((zzaar)zzabc0).zzo(((int)(zzabc0.zze() - v12)), false);
                this.zzh = zzbz0;
                this.zzg = 1;
                return 0;
            }
            case 1: {
                ((zzaar)zzabc0).zzm(this.zzb, 0, 42, false);
                zzabc0.zzj();
                this.zzg = 2;
                return 0;
            }
            case 2: {
                zzfb zzfb4 = new zzfb(4);
                ((zzaar)zzabc0).zzn(zzfb4.zzI(), 0, 4, false);
                if(zzfb4.zzt() != 0x664C6143L) {
                    throw zzcd.zza("Failed to read FLAC stream marker.", null);
                }
                this.zzg = 3;
                return 0;
            }
            case 3: {
                zzabo zzabo2 = this.zzi;
                while(true) {
                    zzabc0.zzj();
                    zzfa zzfa0 = new zzfa(new byte[4], 4);
                    ((zzaar)zzabc0).zzm(zzfa0.zza, 0, 4, false);
                    boolean z1 = zzfa0.zzn();
                    int v13 = zzfa0.zzd(7);
                    int v14 = zzfa0.zzd(24) + 4;
                    if(v13 == 0) {
                        byte[] arr_b = new byte[38];
                        ((zzaar)zzabc0).zzn(arr_b, 0, 38, false);
                        zzabo2 = new zzabo(arr_b, 4);
                    }
                    else {
                        if(zzabo2 == null) {
                            break;
                        }
                        if(v13 == 3) {
                            zzfb zzfb5 = new zzfb(v14);
                            ((zzaar)zzabc0).zzn(zzfb5.zzI(), 0, v14, false);
                            zzabo2 = zzabo2.zzf(zzabl.zzb(zzfb5));
                        }
                        else if(v13 == 4) {
                            zzfb zzfb6 = new zzfb(v14);
                            ((zzaar)zzabc0).zzn(zzfb6.zzI(), 0, v14, false);
                            zzfb6.zzH(4);
                            zzabo2 = zzabo2.zzg(Arrays.asList(zzack.zzc(zzfb6, false, false).zzb));
                        }
                        else if(v13 == 6) {
                            zzfb zzfb7 = new zzfb(v14);
                            ((zzaar)zzabc0).zzn(zzfb7.zzI(), 0, v14, false);
                            zzfb7.zzH(4);
                            zzabo2 = zzabo2.zze(zzfud.zzm(zzadx.zzb(zzfb7)));
                        }
                        else {
                            ((zzaar)zzabc0).zzo(v14, false);
                        }
                    }
                    this.zzi = zzabo2;
                    if(z1) {
                        zzabo2.getClass();
                        this.zzj = Math.max(zzabo2.zzc, 6);
                        this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
                        this.zzg = 4;
                        return 0;
                    }
                }
                throw new IllegalArgumentException();
            }
            default: {
                if(v != 4) {
                    this.zzf.getClass();
                    zzabo zzabo0 = this.zzi;
                    zzabo0.getClass();
                    zzadb zzadb0 = this.zzl;
                    if(zzadb0 != null && zzadb0.zze()) {
                        return zzadb0.zza(zzabc0, zzabx0);
                    }
                    if(this.zzn == -1L) {
                        this.zzn = zzabk.zzb(zzabc0, zzabo0);
                        return 0;
                    }
                    zzfb zzfb0 = this.zzc;
                    int v1 = zzfb0.zzd();
                    if(v1 < 0x8000) {
                        int v2 = zzabc0.zza(zzfb0.zzI(), v1, 0x8000 - v1);
                        if(v2 != -1) {
                            z = false;
                            this.zzc.zzF(v1 + v2);
                        }
                        else if(this.zzc.zza() == 0) {
                            this.zzf();
                            return -1;
                        }
                    }
                    else {
                        z = false;
                    }
                    zzfb zzfb1 = this.zzc;
                    int v3 = zzfb1.zzc();
                    int v4 = this.zzm;
                    int v5 = this.zzj;
                    if(v4 < v5) {
                        zzfb1.zzH(Math.min(v5 - v4, zzfb1.zza()));
                    }
                    long v6 = this.zze(this.zzc, z);
                    int v7 = this.zzc.zzc() - v3;
                    this.zzc.zzG(v3);
                    zzacc.zzb(this.zzf, this.zzc, v7);
                    this.zzm += v7;
                    if(v6 != -1L) {
                        this.zzf();
                        this.zzm = 0;
                        this.zzn = v6;
                    }
                    zzfb zzfb2 = this.zzc;
                    if(zzfb2.zza() >= 16) {
                        return 0;
                    }
                    int v8 = zzfb2.zza();
                    System.arraycopy(zzfb2.zzI(), zzfb2.zzc(), zzfb2.zzI(), 0, v8);
                    this.zzc.zzG(0);
                    this.zzc.zzF(v8);
                    return 0;
                }
                zzabc0.zzj();
                zzfb zzfb3 = new zzfb(2);
                ((zzaar)zzabc0).zzm(zzfb3.zzI(), 0, 2, false);
                int v9 = zzfb3.zzp();
                if(v9 >> 2 == 0x3FFE) {
                    zzabc0.zzj();
                    this.zzk = v9;
                    zzabe zzabe0 = this.zze;
                    long v10 = zzabc0.zzf();
                    long v11 = zzabc0.zzd();
                    zzabo zzabo1 = this.zzi;
                    zzabo1.getClass();
                    if(zzabo1.zzk != null) {
                        zzaca0 = new zzabm(zzabo1, v10);
                    }
                    else if(Long.compare(v11, -1L) == 0 || zzabo1.zzj <= 0L) {
                        zzaca0 = new zzabz(zzabo1.zza(), 0L);
                    }
                    else {
                        zzadb zzadb1 = new zzadb(zzabo1, this.zzk, v10, v11);
                        this.zzl = zzadb1;
                        zzaca0 = zzadb1.zzb();
                    }
                    zzabe0.zzN(zzaca0);
                    this.zzg = 5;
                    return 0;
                }
                zzabc0.zzj();
                throw zzcd.zza("First frame does not start with sync code.", null);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zze = zzabe0;
        this.zzf = zzabe0.zzv(0, 1);
        zzabe0.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        long v2 = 0L;
        if(Long.compare(v, 0L) == 0) {
            this.zzg = 0;
        }
        else {
            zzadb zzadb0 = this.zzl;
            if(zzadb0 != null) {
                zzadb0.zzd(v1);
            }
        }
        if(v1 != 0L) {
            v2 = -1L;
        }
        this.zzn = v2;
        this.zzm = 0;
        this.zzc.zzD(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        zzabl.zza(zzabc0, false);
        zzfb zzfb0 = new zzfb(4);
        ((zzaar)zzabc0).zzm(zzfb0.zzI(), 0, 4, false);
        return zzfb0.zzt() == 0x664C6143L;
    }

    private final long zze(zzfb zzfb0, boolean z) {
        this.zzi.getClass();
        int v;
        for(v = zzfb0.zzc(); v <= zzfb0.zzd() - 16; ++v) {
            zzfb0.zzG(v);
            if(zzabk.zzc(zzfb0, this.zzi, this.zzk, this.zzd)) {
                zzfb0.zzG(v);
                return this.zzd.zza;
            }
        }
        if(z) {
            while(v <= zzfb0.zzd() - this.zzj) {
                zzfb0.zzG(v);
                try {
                    boolean z1 = false;
                    z1 = zzabk.zzc(zzfb0, this.zzi, this.zzk, this.zzd);
                }
                catch(IndexOutOfBoundsException unused_ex) {
                }
                if(zzfb0.zzc() <= zzfb0.zzd() && z1) {
                    zzfb0.zzG(v);
                    return this.zzd.zza;
                }
                ++v;
            }
            zzfb0.zzG(zzfb0.zzd());
            return -1L;
        }
        zzfb0.zzG(v);
        return -1L;
    }

    private final void zzf() {
        this.zzf.zzs(this.zzn * 1000000L / ((long)this.zzi.zze), 1, this.zzm, 0, null);
    }
}

