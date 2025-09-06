package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class zzgf extends zzgc {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgf(Context context0) {
        super(false);
        this.zza = context0.getContentResolver();
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        int v3;
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.zze;
        if(Long.compare(v2, 0L) != 0) {
            try {
                if(v2 != -1L) {
                    v1 = (int)Math.min(v2, v1);
                }
                v3 = this.zzd.read(arr_b, v, v1);
            }
            catch(IOException iOException0) {
                throw new zzge(iOException0, 2000);
            }
            if(v3 == -1) {
                return -1;
            }
            long v4 = this.zze;
            if(v4 != -1L) {
                this.zze = v4 - ((long)v3);
            }
            this.zzg(v3);
            return v3;
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        int v7;
        IOException iOException1;
        long v5;
        AssetFileDescriptor assetFileDescriptor0;
        Uri uri0;
        try {
            uri0 = zzgn0.zza.normalizeScheme();
            this.zzb = uri0;
            this.zzi(zzgn0);
            if("content".equals(uri0.getScheme())) {
                Bundle bundle0 = new Bundle();
                bundle0.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor0 = this.zza.openTypedAssetFileDescriptor(uri0, "*/*", bundle0);
            }
            else {
                assetFileDescriptor0 = this.zza.openAssetFileDescriptor(uri0, "r");
            }
            this.zzc = assetFileDescriptor0;
            if(assetFileDescriptor0 != null) {
                long v = assetFileDescriptor0.getLength();
                FileInputStream fileInputStream0 = new FileInputStream(assetFileDescriptor0.getFileDescriptor());
                this.zzd = fileInputStream0;
                int v1 = Long.compare(v, -1L);
                if(v1 != 0 && zzgn0.zzf > v) {
                    throw new zzge(null, 2008);
                }
                long v2 = assetFileDescriptor0.getStartOffset();
                long v3 = fileInputStream0.skip(zzgn0.zzf + v2) - v2;
                if(v3 != zzgn0.zzf) {
                    throw new zzge(null, 2008);
                }
                if(v1 == 0) {
                    FileChannel fileChannel0 = fileInputStream0.getChannel();
                    long v4 = fileChannel0.size();
                    if(v4 == 0L) {
                        this.zze = -1L;
                        v5 = -1L;
                    }
                    else {
                        v5 = v4 - fileChannel0.position();
                        this.zze = v5;
                        if(v5 < 0L) {
                            throw new zzge(null, 2008);
                        }
                    }
                }
                else {
                    v5 = v - v3;
                    this.zze = v5;
                    if(v5 < 0L) {
                        throw new zzge(null, 2008);
                    }
                }
                goto label_36;
            }
            goto label_44;
        }
        catch(zzge zzge0) {
            throw zzge0;
        }
        catch(IOException iOException0) {
            v7 = 2000;
            goto label_54;
        }
    label_36:
        long v6 = zzgn0.zzg;
        if(v6 != -1L) {
            if(v5 != -1L) {
                v6 = Math.min(v5, v6);
            }
            this.zze = v6;
        }
        this.zzf = true;
        this.zzj(zzgn0);
        return zzgn0.zzg == -1L ? this.zze : zzgn0.zzg;
        try {
        label_44:
            iOException1 = new IOException("Could not open file descriptor for: " + uri0);
            v7 = 2000;
        }
        catch(zzge zzge0) {
            throw zzge0;
        }
        catch(IOException iOException0) {
            v7 = 2000;
            goto label_54;
        }
        try {
            throw new zzge(iOException1, 2000);
        }
        catch(zzge zzge0) {
            try {
                throw zzge0;
            }
            catch(zzge zzge0) {
            }
            catch(IOException iOException0) {
                v7 = 2000;
                goto label_54;
            }
            throw zzge0;
        }
        catch(IOException iOException0) {
        }
    label_54:
        if(iOException0 instanceof FileNotFoundException) {
            v7 = 2005;
        }
        throw new zzge(iOException0, v7);
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        try {
            try {
                this.zzb = null;
                FileInputStream fileInputStream0 = this.zzd;
                if(fileInputStream0 != null) {
                    fileInputStream0.close();
                }
                goto label_24;
            }
            catch(IOException iOException0) {
            }
            throw new zzge(iOException0, 2000);
        }
        catch(Throwable throwable0) {
            try {
                this.zzd = null;
                AssetFileDescriptor assetFileDescriptor0 = this.zzc;
                if(assetFileDescriptor0 != null) {
                    assetFileDescriptor0.close();
                }
            }
            catch(IOException iOException1) {
                throw new zzge(iOException1, 2000);
            }
            finally {
                this.zzc = null;
                if(this.zzf) {
                    this.zzf = false;
                    this.zzh();
                }
            }
            throw throwable0;
        }
        try {
        label_24:
            this.zzd = null;
            AssetFileDescriptor assetFileDescriptor1 = this.zzc;
            if(assetFileDescriptor1 != null) {
                assetFileDescriptor1.close();
            }
        }
        catch(IOException iOException2) {
            throw new zzge(iOException2, 2000);
        }
        finally {
            this.zzc = null;
            if(this.zzf) {
                this.zzf = false;
                this.zzh();
            }
        }
    }
}

