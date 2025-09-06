package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

public final class zzgg extends zzgc {
    private zzgn zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgg() {
        super(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        if(v1 == 0) {
            return 0;
        }
        int v2 = this.zzd;
        if(v2 == 0) {
            return -1;
        }
        int v3 = Math.min(v1, v2);
        System.arraycopy(this.zzb, this.zzc, arr_b, v, v3);
        this.zzc += v3;
        this.zzd -= v3;
        this.zzg(v3);
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        this.zzi(zzgn0);
        this.zza = zzgn0;
        Uri uri0 = zzgn0.zza.normalizeScheme();
        String s = uri0.getScheme();
        zzdy.zze("data".equals(s), "Unsupported scheme: " + s);
        String[] arr_s = uri0.getSchemeSpecificPart().split(",", -1);
        if(arr_s.length != 2) {
            throw zzcd.zzb(("Unexpected URI format: " + uri0), null);
        }
        String s1 = arr_s[1];
        if(arr_s[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(s1, 0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw zzcd.zzb(("Error while parsing Base64 encoded string: " + s1), illegalArgumentException0);
            }
        }
        else {
            this.zzb = URLDecoder.decode(s1, "US-ASCII").getBytes(zzfqu.zzc);
        }
        long v = zzgn0.zzf;
        int v1 = this.zzb.length;
        if(v <= ((long)v1)) {
            this.zzc = (int)v;
            int v2 = v1 - ((int)v);
            this.zzd = v2;
            long v3 = zzgn0.zzg;
            if(v3 != -1L) {
                this.zzd = (int)Math.min(v2, v3);
            }
            this.zzj(zzgn0);
            return zzgn0.zzg == -1L ? ((long)this.zzd) : zzgn0.zzg;
        }
        this.zzb = null;
        throw new zzgj(2008);
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zza == null ? null : this.zza.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        if(this.zzb != null) {
            this.zzb = null;
            this.zzh();
        }
        this.zza = null;
    }
}

