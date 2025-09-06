package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class zzavg {
    protected final Object zza;
    private static MessageDigest zzb;

    static {
    }

    public zzavg() {
        this.zza = new Object();
    }

    protected final MessageDigest zza() {
        synchronized(this.zza) {
            MessageDigest messageDigest0 = zzavg.zzb;
            if(messageDigest0 != null) {
                return messageDigest0;
            }
            for(int v1 = 0; v1 < 2; ++v1) {
                try {
                    zzavg.zzb = MessageDigest.getInstance("MD5");
                }
                catch(NoSuchAlgorithmException unused_ex) {
                }
            }
            return zzavg.zzb;
        }
    }

    abstract byte[] zzb(String arg1);
}

