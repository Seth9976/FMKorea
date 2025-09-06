package com.google.android.gms.internal.ads;

final class zzfys extends zzfws.zzi implements Runnable {
    private final Runnable zza;

    public zzfys(Runnable runnable0) {
        runnable0.getClass();
        this.zza = runnable0;
    }

    @Override
    public final void run() {
        try {
            this.zza.run();
        }
        catch(RuntimeException | Error runtimeException0) {
            this.zzd(runtimeException0);
            throw runtimeException0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    protected final String zza() {
        return "task=[" + this.zza.toString() + "]";
    }
}

