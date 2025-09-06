package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class zzhb extends zzgj {
    public final zzgn zzb;
    public final int zzc;

    public zzhb(zzgn zzgn0, int v, int v1) {
        super(2008);
        this.zzb = zzgn0;
        this.zzc = 1;
    }

    public zzhb(IOException iOException0, zzgn zzgn0, int v, int v1) {
        super(iOException0, zzhb.zzb(v, v1));
        this.zzb = zzgn0;
        this.zzc = v1;
    }

    public zzhb(String s, zzgn zzgn0, int v, int v1) {
        super(s, zzhb.zzb(v, v1));
        this.zzb = zzgn0;
        this.zzc = v1;
    }

    public zzhb(String s, IOException iOException0, zzgn zzgn0, int v, int v1) {
        super(s, iOException0, zzhb.zzb(v, v1));
        this.zzb = zzgn0;
        this.zzc = v1;
    }

    public static zzhb zza(IOException iOException0, zzgn zzgn0, int v) {
        int v1;
        String s = iOException0.getMessage();
        if(iOException0 instanceof SocketTimeoutException) {
            v1 = 2002;
        }
        else if(iOException0 instanceof InterruptedIOException) {
            v1 = 1004;
        }
        else {
            v1 = s == null || !zzfqo.zza(s).matches("cleartext.*not permitted.*") ? 2001 : 2007;
        }
        return v1 == 2007 ? new zzha(iOException0, zzgn0) : new zzhb(iOException0, zzgn0, v1, v);
    }

    private static int zzb(int v, int v1) [...] // Inlined contents
}

