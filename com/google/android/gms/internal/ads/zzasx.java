package com.google.android.gms.internal.ads;

public final class zzasx extends zzatm {
    private final zzarb zzi;
    private final long zzj;
    private final long zzk;

    public zzasx(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1, zzarb zzarb0, long v2, long v3) {
        super(zzary0, "KHu8Xbxzr2mu9S25CNgKE5zXBf18Zj2waiAPYoFRjyhOXCyg+mYLv2x/JjCH7GjX", "NOrE2caDXO4nkFR2Fjy7NgGPKtPlIg1WAorknI/US68=", zzanv0, v, 11);
        this.zzi = zzarb0;
        this.zzj = v2;
        this.zzk = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        zzarb zzarb0 = this.zzi;
        if(zzarb0 != null) {
            zzaqz zzaqz0 = new zzaqz(((String)this.zzf.invoke(null, zzarb0.zzb(), this.zzj, this.zzk)));
            synchronized(this.zze) {
                this.zze.zzz(((long)zzaqz0.zza));
                if(((long)zzaqz0.zzb) >= 0L) {
                    this.zze.zzQ(((long)zzaqz0.zzb));
                }
                if(((long)zzaqz0.zzc) >= 0L) {
                    this.zze.zzf(((long)zzaqz0.zzc));
                }
            }
        }
    }
}

