package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzgrm extends zzgpq {
    protected zzgrq zza;
    private final zzgrq zzb;

    protected zzgrm(zzgrq zzgrq0) {
        this.zzb = zzgrq0;
        if(zzgrq0.zzaY()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zzgrq0.zzaD();
    }

    @Override  // com.google.android.gms.internal.ads.zzgpq
    public final Object clone() {
        return this.zzai();
    }

    private static void zza(Object object0, Object object1) {
        zzgti.zza().zzb(object0.getClass()).zzg(object0, object1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgpq
    public final zzgpq zzah() {
        return this.zzai();
    }

    public final zzgrm zzai() {
        zzgrm zzgrm0 = (zzgrm)this.zzb.zzb(5, null, null);
        zzgrm0.zza = this.zzam();
        return zzgrm0;
    }

    public final zzgrm zzaj(zzgrq zzgrq0) {
        if(!this.zzb.equals(zzgrq0)) {
            if(!this.zza.zzaY()) {
                this.zzaq();
            }
            zzgrm.zza(this.zza, zzgrq0);
        }
        return this;
    }

    public final zzgrm zzak(byte[] arr_b, int v, int v1, zzgrc zzgrc0) {
        if(!this.zza.zzaY()) {
            this.zzaq();
        }
        try {
            zzgti.zza().zzb(this.zza.getClass()).zzi(this.zza, arr_b, 0, v1, new zzgpu(zzgrc0));
            return this;
        }
        catch(zzgsc zzgsc0) {
            throw zzgsc0;
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw zzgsc.zzj();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", iOException0);
        }
    }

    public final zzgrq zzal() {
        zzgrq zzgrq0 = this.zzam();
        if(!zzgrq0.zzaX()) {
            throw new zzguj(zzgrq0);
        }
        return zzgrq0;
    }

    public zzgrq zzam() {
        if(!this.zza.zzaY()) {
            return this.zza;
        }
        this.zza.zzaS();
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgsz
    public zzgta zzan() {
        return this.zzam();
    }

    protected final void zzap() {
        if(!this.zza.zzaY()) {
            this.zzaq();
        }
    }

    protected void zzaq() {
        zzgrq zzgrq0 = this.zzb.zzaD();
        zzgrm.zza(zzgrq0, this.zza);
        this.zza = zzgrq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtb
    public final zzgta zzbf() {
        throw null;
    }
}

