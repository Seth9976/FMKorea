package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class zzgy extends zzgc {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgy() {
        super(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        int v3;
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.zzc;
        if(v2 == 0L) {
            return -1;
        }
        try {
            v3 = this.zza.read(arr_b, v, ((int)Math.min(v2, v1)));
        }
        catch(IOException iOException0) {
            throw new zzgx(iOException0, 2000);
        }
        if(v3 > 0) {
            this.zzc -= (long)v3;
            this.zzg(v3);
        }
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        long v1;
        RandomAccessFile randomAccessFile0;
        Uri uri0 = zzgn0.zza;
        this.zzb = uri0;
        this.zzi(zzgn0);
        int v = 2006;
        try {
            String s = uri0.getPath();
            if(s == null) {
                throw null;
            }
            randomAccessFile0 = new RandomAccessFile(s, "r");
            this.zza = randomAccessFile0;
        }
        catch(FileNotFoundException fileNotFoundException0) {
            if(!TextUtils.isEmpty(uri0.getQuery()) || !TextUtils.isEmpty(uri0.getFragment())) {
                throw new zzgx(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing \'?\' or \'#\'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri0.getPath(), uri0.getQuery(), uri0.getFragment()), fileNotFoundException0, 1004);
            }
            if(zzfk.zza < 21 || !zzgw.zzb(fileNotFoundException0.getCause())) {
                v = 2005;
            }
            throw new zzgx(fileNotFoundException0, v);
        }
        catch(SecurityException securityException0) {
            throw new zzgx(securityException0, 2006);
        }
        catch(RuntimeException runtimeException0) {
            throw new zzgx(runtimeException0, 2000);
        }
        try {
            randomAccessFile0.seek(zzgn0.zzf);
            v1 = zzgn0.zzg;
            if(v1 == -1L) {
                v1 = this.zza.length() - zzgn0.zzf;
            }
        }
        catch(IOException iOException0) {
            throw new zzgx(iOException0, 2000);
        }
        this.zzc = v1;
        if(v1 < 0L) {
            throw new zzgx(null, null, 2008);
        }
        this.zzd = true;
        this.zzj(zzgn0);
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        try {
            this.zzb = null;
            RandomAccessFile randomAccessFile0 = this.zza;
            if(randomAccessFile0 != null) {
                randomAccessFile0.close();
            }
        }
        catch(IOException iOException0) {
            throw new zzgx(iOException0, 2000);
        }
        finally {
            this.zza = null;
            if(this.zzd) {
                this.zzd = false;
                this.zzh();
            }
        }
    }
}

