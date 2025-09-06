package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

public final class zzgnd extends zzgrq implements zzgtb {
    private static final zzgnd zzb;
    private int zzd;
    private zzgrz zze;

    static {
        zzgnd zzgnd0 = new zzgnd();
        zzgnd.zzb = zzgnd0;
        zzgrq.zzaU(zzgnd.class, zzgnd0);
    }

    private zzgnd() {
        this.zze = zzgrq.zzaN();
    }

    public final int zza() {
        return this.zze.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzgrq
    protected final Object zzb(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgrq.zzaR(zzgnd.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000B\u0002\u001B", new Object[]{"zzd", "zze", zzgnc.class});
            }
            case 3: {
                return new zzgnd();
            }
            default: {
                switch(v - 1) {
                    case 4: {
                        return new zzgna(null);
                    }
                    case 5: {
                        return zzgnd.zzb;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    public static zzgna zzd() {
        return (zzgna)zzgnd.zzb.zzaA();
    }

    public final zzgnc zze(int v) {
        return (zzgnc)this.zze.get(v);
    }

    static zzgnd zzf() {
        return zzgnd.zzb;
    }

    public static zzgnd zzg(InputStream inputStream0, zzgrc zzgrc0) {
        return (zzgnd)zzgrq.zzaH(zzgnd.zzb, inputStream0, zzgrc0);
    }

    public final List zzh() {
        return this.zze;
    }

    static void zzi(zzgnd zzgnd0, int v) {
        zzgnd0.zzd = v;
    }

    static void zzj(zzgnd zzgnd0, zzgnc zzgnc0) {
        zzgnc0.getClass();
        zzgrz zzgrz0 = zzgnd0.zze;
        if(!zzgrz0.zzc()) {
            zzgnd0.zze = zzgrq.zzaO(zzgrz0);
        }
        zzgnd0.zze.add(zzgnc0);
    }
}

