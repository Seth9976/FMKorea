package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class zzgb extends zzgc {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzgb(Context context0) {
        super(false);
        this.zza = context0.getAssets();
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        int v3;
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.zzd;
        if(Long.compare(v2, 0L) != 0) {
            try {
                if(v2 != -1L) {
                    v1 = (int)Math.min(v2, v1);
                }
                v3 = this.zzc.read(arr_b, v, v1);
            }
            catch(IOException iOException0) {
                throw new zzga(iOException0, 2000);
            }
            if(v3 == -1) {
                return -1;
            }
            long v4 = this.zzd;
            if(v4 != -1L) {
                this.zzd = v4 - ((long)v3);
            }
            this.zzg(v3);
            return v3;
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        try {
            this.zzb = zzgn0.zza;
            String s = zzgn0.zza.getPath();
            if(s == null) {
                throw null;
            }
            if(s.startsWith("/android_asset/")) {
                s = s.substring(15);
            }
            else if(s.startsWith("/")) {
                s = s.substring(1);
            }
            this.zzi(zzgn0);
            InputStream inputStream0 = this.zza.open(s, 1);
            this.zzc = inputStream0;
            if(inputStream0.skip(zzgn0.zzf) < zzgn0.zzf) {
                throw new zzga(null, 2008);
            }
            long v = zzgn0.zzg;
            if(v == -1L) {
                long v1 = (long)this.zzc.available();
                this.zzd = v1;
                if(v1 == 0x7FFFFFFFL) {
                    this.zzd = -1L;
                }
            }
            else {
                this.zzd = v;
            }
            goto label_28;
        }
        catch(zzga zzga0) {
        }
        catch(IOException iOException0) {
            throw new zzga(iOException0, (iOException0 instanceof FileNotFoundException ? 2005 : 2000));
        }
        throw zzga0;
    label_28:
        this.zze = true;
        this.zzj(zzgn0);
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        try {
            this.zzb = null;
            InputStream inputStream0 = this.zzc;
            if(inputStream0 != null) {
                inputStream0.close();
            }
        }
        catch(IOException iOException0) {
            throw new zzga(iOException0, 2000);
        }
        finally {
            this.zzc = null;
            if(this.zze) {
                this.zze = false;
                this.zzh();
            }
        }
    }
}

