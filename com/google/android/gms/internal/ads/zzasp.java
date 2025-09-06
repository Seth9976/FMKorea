package com.google.android.gms.internal.ads;

public final class zzasp extends zzatm {
    private final long zzi;

    public zzasp(zzary zzary0, String s, String s1, zzanv zzanv0, long v, int v1, int v2) {
        super(zzary0, "MbAcGuLi+XGl3MsgqAiQYLikemL120ZFxn+dIhaD+rHWJuTeO/M8+1c58cczHjCs", "Eg2eC3eNesWzbAUINzxj1mXRcYgmzS654CxZFoVQbAM=", zzanv0, v1, 25);
        this.zzi = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        long v = (long)(((Long)this.zzf.invoke(null, null)));
        synchronized(this.zze) {
            this.zze.zzt(v);
            long v2 = this.zzi;
            if(v2 != 0L) {
                this.zze.zzT(v - v2);
                this.zze.zzU(this.zzi);
            }
        }
    }
}

