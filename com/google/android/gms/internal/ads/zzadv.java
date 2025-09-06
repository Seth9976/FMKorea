package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class zzadv {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzadv() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x200);
        this.zza = byteArrayOutputStream0;
        this.zzb = new DataOutputStream(byteArrayOutputStream0);
    }

    public final byte[] zza(zzadu zzadu0) {
        this.zza.reset();
        try {
            zzadv.zzb(this.zzb, zzadu0.zza);
            zzadv.zzb(this.zzb, (zzadu0.zzb == null ? "" : zzadu0.zzb));
            this.zzb.writeLong(zzadu0.zzc);
            this.zzb.writeLong(zzadu0.zzd);
            this.zzb.write(zzadu0.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        }
        catch(IOException iOException0) {
        }
        throw new RuntimeException(iOException0);
    }

    private static void zzb(DataOutputStream dataOutputStream0, String s) {
        dataOutputStream0.writeBytes(s);
        dataOutputStream0.writeByte(0);
    }
}

