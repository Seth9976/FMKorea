package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

public final class zzcdf {
    private long zza;

    public final long zza(ByteBuffer byteBuffer0) {
        zzane zzane0;
        long v = this.zza;
        if(v > 0L) {
            return v;
        }
        try {
            zzand zzand0 = null;
            ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
            byteBuffer1.flip();
            Iterator iterator0 = new zzamz(new zzcde(byteBuffer1), zzcdh.zzb).zze().iterator();
            while(true) {
                zzane0 = null;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                zzanb zzanb0 = (zzanb)object0;
                if(zzanb0 instanceof zzand) {
                    zzand0 = (zzand)zzanb0;
                    break;
                }
            }
            for(Object object1: zzand0.zze()) {
                zzanb zzanb1 = (zzanb)object1;
                if(zzanb1 instanceof zzane) {
                    zzane0 = (zzane)zzanb1;
                    break;
                }
                if(false) {
                    break;
                }
            }
            long v1 = zzane0.zzd() * 1000L / zzane0.zze();
            this.zza = v1;
            return v1;
        }
        catch(RuntimeException | IOException unused_ex) {
            return 0L;
        }
    }
}

