package com.google.android.gms.internal.ads;

public final class zzasw extends zzatm {
    private final zzarq zzi;

    public zzasw(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1, zzarq zzarq0) {
        super(zzary0, "tfuuP59pzWN+H8zv1geT3jADiBKBGMQRjmCPoIvL5f45Lvl5qgJ0PgBqZF4WPnQj", "MIrDuKB7N0O22daoYjLtFOJg5TtVRHK1+0ktwmGNtdU=", zzanv0, v, 94);
        this.zzi = zzarq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        int v = (int)(((Integer)this.zzf.invoke(null, this.zzi.zza())));
        synchronized(this.zze) {
            this.zze.zzae(zzaoj.zza(v));
        }
    }
}

