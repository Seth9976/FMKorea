package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public final class zzhi extends zzgc {
    private final Resources zza;
    private final String zzb;
    private Uri zzc;
    private AssetFileDescriptor zzd;
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzhi(Context context0) {
        super(false);
        this.zza = context0.getResources();
        this.zzb = "com.fmkorea.m.fmk";
    }

    public static Uri buildRawResourceUri(int v) {
        return Uri.parse(("rawresource:///" + v));
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        int v3;
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.zzf;
        if(Long.compare(v2, 0L) != 0) {
            try {
                if(Long.compare(v2, -1L) != 0) {
                    v1 = (int)Math.min(v2, v1);
                }
                v3 = this.zze.read(arr_b, v, v1);
            }
            catch(IOException iOException0) {
                throw new zzhh(null, iOException0, 2000);
            }
            if(v3 == -1) {
                if(this.zzf != -1L) {
                    throw new zzhh("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                }
                return -1;
            }
            long v4 = this.zzf;
            if(v4 != -1L) {
                this.zzf = v4 - ((long)v3);
            }
            this.zzg(v3);
            return v3;
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        long v5;
        AssetFileDescriptor assetFileDescriptor0;
        int v;
        Uri uri0 = zzgn0.zza.normalizeScheme();
        this.zzc = uri0;
        if(TextUtils.equals("rawresource", uri0.getScheme())) {
            try {
            label_18:
                String s4 = uri0.getLastPathSegment();
                if(s4 == null) {
                    throw null;
                }
                v = Integer.parseInt(s4);
            }
            catch(NumberFormatException unused_ex) {
                throw new zzhh("Resource identifier must be an integer.", null, 1004);
            }
        }
        else if(TextUtils.equals("android.resource", uri0.getScheme()) && uri0.getPathSegments().size() == 1) {
            String s = uri0.getLastPathSegment();
            s.getClass();
            if(s.matches("\\d+")) {
                goto label_18;
            }
            else {
                goto label_7;
            }
        }
        else {
        label_7:
            if(!TextUtils.equals("android.resource", uri0.getScheme())) {
                throw new zzhh("Unsupported URI scheme (" + uri0.getScheme() + "). Only rawresource and android.resource are supported.", null, 1004);
            }
            String s1 = uri0.getPath();
            s1.getClass();
            if(s1.startsWith("/")) {
                s1 = s1.substring(1);
            }
            String s2 = uri0.getHost();
            String s3 = TextUtils.isEmpty(s2) ? "" : s2 + ":";
            v = this.zza.getIdentifier(s3 + s1, "raw", this.zzb);
            if(v == 0) {
                throw new zzhh("Resource not found.", null, 2005);
            }
        }
        this.zzi(zzgn0);
        try {
            assetFileDescriptor0 = this.zza.openRawResourceFd(v);
            this.zzd = assetFileDescriptor0;
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            throw new zzhh(null, resources$NotFoundException0, 2005);
        }
        if(assetFileDescriptor0 == null) {
            throw new zzhh("Resource is compressed: " + uri0, null, 2000);
        }
        long v1 = assetFileDescriptor0.getLength();
        FileInputStream fileInputStream0 = new FileInputStream(assetFileDescriptor0.getFileDescriptor());
        this.zze = fileInputStream0;
        int v2 = Long.compare(v1, -1L);
        try {
            if(v2 != 0 && zzgn0.zzf > v1) {
                throw new zzhh(null, null, 2008);
            }
            long v3 = assetFileDescriptor0.getStartOffset();
            long v4 = fileInputStream0.skip(zzgn0.zzf + v3) - v3;
            if(v4 != zzgn0.zzf) {
                throw new zzhh(null, null, 2008);
            }
            if(v2 == 0) {
                FileChannel fileChannel0 = fileInputStream0.getChannel();
                if(fileChannel0.size() == 0L) {
                    this.zzf = -1L;
                    v5 = -1L;
                }
                else {
                    v5 = fileChannel0.size() - fileChannel0.position();
                    this.zzf = v5;
                    if(v5 < 0L) {
                        throw new zzhh(null, null, 2008);
                    }
                }
            }
            else {
                v5 = v1 - v4;
                this.zzf = v5;
                if(v5 < 0L) {
                    throw new zzgj(2008);
                }
            }
            goto label_60;
        }
        catch(zzhh zzhh0) {
        }
        catch(IOException iOException0) {
            throw new zzhh(null, iOException0, 2000);
        }
        throw zzhh0;
    label_60:
        long v6 = zzgn0.zzg;
        if(v6 != -1L) {
            if(v5 != -1L) {
                v6 = Math.min(v5, v6);
            }
            this.zzf = v6;
        }
        this.zzg = true;
        this.zzj(zzgn0);
        return zzgn0.zzg == -1L ? this.zzf : zzgn0.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        try {
            try {
                this.zzc = null;
                InputStream inputStream0 = this.zze;
                if(inputStream0 != null) {
                    inputStream0.close();
                }
                goto label_24;
            }
            catch(IOException iOException0) {
            }
            throw new zzhh(null, iOException0, 2000);
        }
        catch(Throwable throwable0) {
            try {
                this.zze = null;
                AssetFileDescriptor assetFileDescriptor0 = this.zzd;
                if(assetFileDescriptor0 != null) {
                    assetFileDescriptor0.close();
                }
            }
            catch(IOException iOException1) {
                throw new zzhh(null, iOException1, 2000);
            }
            finally {
                this.zzd = null;
                if(this.zzg) {
                    this.zzg = false;
                    this.zzh();
                }
            }
            throw throwable0;
        }
        try {
        label_24:
            this.zze = null;
            AssetFileDescriptor assetFileDescriptor1 = this.zzd;
            if(assetFileDescriptor1 != null) {
                assetFileDescriptor1.close();
            }
        }
        catch(IOException iOException2) {
            throw new zzhh(null, iOException2, 2000);
        }
        finally {
            this.zzd = null;
            if(this.zzg) {
                this.zzg = false;
                this.zzh();
            }
        }
    }
}

