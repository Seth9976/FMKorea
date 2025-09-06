package com.google.android.gms.internal.ads;

import jeb.synthetic.FIN;

public final class zzeb {
    private final zzdz zza;
    private boolean zzb;

    public zzeb() {
        throw null;
    }

    public zzeb(zzdz zzdz0) {
        this.zza = zzdz0;
    }

    public final void zza() {
        synchronized(this) {
            while(!this.zzb) {
                this.wait();
            }
        }
    }

    public final void zzb() {
        int v;
        __monitor_enter(this);
        boolean z = false;
    alab1:
        while(true) {
            v = FIN.finallyOpen$NT();
            while(true) {
                if(this.zzb) {
                    break alab1;
                }
                try {
                    this.wait();
                }
                catch(InterruptedException unused_ex) {
                    z = true;
                    break;
                }
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
            FIN.finallyExec$NT(v);
            return;
        }
        FIN.finallyCodeBegin$NT(v);
        __monitor_exit(this);
        FIN.finallyCodeEnd$NT(v);
    }

    public final boolean zzc() {
        boolean z;
        synchronized(this) {
            z = this.zzb;
            this.zzb = false;
        }
        return z;
    }

    public final boolean zzd() {
        synchronized(this) {
        }
        return this.zzb;
    }

    public final boolean zze() {
        synchronized(this) {
            if(this.zzb) {
                return false;
            }
            this.zzb = true;
            this.notifyAll();
            return true;
        }
    }
}

