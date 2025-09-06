package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

final class zzahm implements zzaht {
    private final zzahs zza;
    private final long zzb;
    private final long zzc;
    private final zzahy zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzahm(zzahy zzahy0, long v, long v1, long v2, long v3, boolean z) {
        zzdy.zzd(Long.compare(v, 0L) >= 0 && v1 > v);
        this.zzd = zzahy0;
        this.zzb = v;
        this.zzc = v1;
        if(v2 == v1 - v || z) {
            this.zzf = v3;
            this.zze = 4;
        }
        else {
            this.zze = 0;
        }
        this.zza = new zzahs();
    }

    static long zza(zzahm zzahm0) {
        return zzahm0.zzc;
    }

    static long zzb(zzahm zzahm0) {
        return zzahm0.zzb;
    }

    static long zzc(zzahm zzahm0) {
        return zzahm0.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzaht
    public final long zzd(zzabc zzabc0) {
        long v3;
        int v = this.zze;
        if(v == 0) {
            long v11 = zzabc0.zzf();
            this.zzg = v11;
            this.zze = 1;
            long v12 = this.zzc - 0xFF1BL;
            if(v12 > v11) {
                return v12;
            }
        }
        else if(v != 1) {
            switch(v) {
                case 2: {
                    long v1 = this.zzj;
                    if(this.zzi == v1) {
                        v3 = -1L;
                    }
                    else {
                        long v2 = zzabc0.zzf();
                        if(this.zza.zzc(zzabc0, v1)) {
                            this.zza.zzb(zzabc0, false);
                            zzabc0.zzj();
                            long v4 = this.zza.zzb;
                            long v5 = this.zzh - v4;
                            int v6 = this.zza.zzd + this.zza.zze;
                            int v7 = Long.compare(v5, 0L);
                            if(v7 >= 0 && v5 < 72000L) {
                                v3 = -1L;
                            }
                            else {
                                if(v7 < 0) {
                                    this.zzj = v2;
                                    this.zzl = v4;
                                }
                                else {
                                    this.zzi = zzabc0.zzf() + ((long)v6);
                                    this.zzk = v4;
                                }
                                long v8 = this.zzj;
                                long v9 = this.zzi;
                                long v10 = v8 - v9;
                                if(v10 < 100000L) {
                                    this.zzj = v9;
                                    v3 = v9;
                                }
                                else {
                                    v3 = Math.max(v9, Math.min(zzabc0.zzf() - ((long)v6) * (v7 > 0 ? 1L : 2L) + v5 * v10 / (this.zzl - this.zzk), v8 - 1L));
                                }
                            }
                        }
                        else {
                            v3 = this.zzi;
                            if(v3 == v2) {
                                throw new IOException("No ogg page can be found.");
                            }
                        }
                    }
                    if(v3 != -1L) {
                        return v3;
                    }
                    this.zze = 3;
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    return -1L;
                }
            }
            while(true) {
                this.zza.zzc(zzabc0, -1L);
                this.zza.zzb(zzabc0, false);
                zzahs zzahs0 = this.zza;
                if(zzahs0.zzb > this.zzh) {
                    break;
                }
                ((zzaar)zzabc0).zzo(zzahs0.zzd + zzahs0.zze, false);
                this.zzi = zzabc0.zzf();
                this.zzk = this.zza.zzb;
            }
            zzabc0.zzj();
            this.zze = 4;
            return -(this.zzk + 2L);
        }
        this.zza.zza();
        if(!this.zza.zzc(zzabc0, -1L)) {
            throw new EOFException();
        }
        this.zza.zzb(zzabc0, false);
        ((zzaar)zzabc0).zzo(this.zza.zzd + this.zza.zze, false);
        long v13;
        for(v13 = this.zza.zzb; (this.zza.zza & 4) != 4 && this.zza.zzc(zzabc0, -1L) && zzabc0.zzf() < this.zzc && this.zza.zzb(zzabc0, true) && zzabf.zze(zzabc0, this.zza.zzd + this.zza.zze); v13 = this.zza.zzb) {
        }
        this.zzf = v13;
        this.zze = 4;
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzaht
    public final zzaca zze() {
        return Long.compare(this.zzf, 0L) != 0 ? new zzahl(this, null) : null;
    }

    static zzahy zzf(zzahm zzahm0) {
        return zzahm0.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzaht
    public final void zzg(long v) {
        this.zzh = Math.max(0L, Math.min(v, this.zzf - 1L));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}

