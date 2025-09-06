package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class zzzc extends Surface {
    public final boolean zza;
    private static int zzb;
    private static boolean zzc;
    private final zzza zzd;
    private boolean zze;

    zzzc(zzza zzza0, SurfaceTexture surfaceTexture0, boolean z, zzzb zzzb0) {
        super(surfaceTexture0);
        this.zzd = zzza0;
        this.zza = z;
    }

    @Override  // android.view.Surface
    public final void release() {
        super.release();
        synchronized(this.zzd) {
            if(!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }

    public static zzzc zza(Context context0, boolean z) {
        int v = 0;
        zzdy.zzf(!z || zzzc.zzb(context0));
        zzza zzza0 = new zzza();
        if(z) {
            v = zzzc.zzb;
        }
        return zzza0.zza(v);
    }

    public static boolean zzb(Context context0) {
        int v1;
        synchronized(zzzc.class) {
            if(!zzzc.zzc) {
                if(!zzeh.zzc(context0)) {
                    v1 = 0;
                }
                else if(zzeh.zzd()) {
                    v1 = 1;
                }
                else {
                    v1 = 2;
                }
                zzzc.zzb = v1;
                zzzc.zzc = true;
            }
            return zzzc.zzb != 0;
        }
    }
}

