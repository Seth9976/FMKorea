package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class zzavi {
    ByteArrayOutputStream zza;
    Base64OutputStream zzb;

    public zzavi() {
        this.zza = new ByteArrayOutputStream(0x1000);
        this.zzb = new Base64OutputStream(this.zza, 10);
    }

    @Override
    public final String toString() {
        try {
            this.zzb.close();
        }
        catch(IOException iOException0) {
            zzcaa.zzh("HashManager: Unable to convert to Base64.", iOException0);
        }
        try {
            try {
                this.zza.close();
                String s = this.zza.toString();
                this.zza = null;
                this.zzb = null;
                return s;
            }
            catch(IOException iOException1) {
                zzcaa.zzh("HashManager: Unable to convert to Base64.", iOException1);
                this.zza = null;
                this.zzb = null;
                return "";
            }
        }
        catch(Throwable throwable0) {
            this.zza = null;
            this.zzb = null;
            throw throwable0;
        }
    }
}

