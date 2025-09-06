package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

public final class zzil extends zzcf {
    public static final zzn zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final zzam zzh;
    public final int zzi;
    public final zzbw zzj;
    final boolean zzk;
    private static final String zzl;
    private static final String zzm;
    private static final String zzn;
    private static final String zzo;
    private static final String zzp;
    private static final String zzq;

    static {
        zzil.zzd = zzik.zza;
        zzil.zzl = "rt";
        zzil.zzm = "ru";
        zzil.zzn = "rv";
        zzil.zzo = "rw";
        zzil.zzp = "rx";
        zzil.zzq = "ry";
    }

    private zzil(int v, Throwable throwable0, int v1) {
        this(v, throwable0, null, v1, null, -1, null, 4, false);
    }

    private zzil(int v, Throwable throwable0, String s, int v1, String s1, int v2, zzam zzam0, int v3, boolean z) {
        String s2;
        String s4;
        switch(v) {
            case 0: {
                s2 = "Source error";
                break;
            }
            case 1: {
                String s3 = String.valueOf(zzam0);
                switch(v3) {
                    case 0: {
                        s4 = "NO";
                        break;
                    }
                    case 1: {
                        s4 = "NO_UNSUPPORTED_TYPE";
                        break;
                    }
                    case 2: {
                        s4 = "NO_UNSUPPORTED_DRM";
                        break;
                    }
                    case 3: {
                        s4 = "NO_EXCEEDS_CAPABILITIES";
                        break;
                    }
                    case 4: {
                        s4 = "YES";
                        break;
                    }
                    default: {
                        throw new IllegalStateException();
                    }
                }
                s2 = s1 + " error, index=" + v2 + ", format=" + s3 + ", format_supported=" + s4;
                break;
            }
            default: {
                s2 = "Unexpected runtime error";
            }
        }
        if(!TextUtils.isEmpty(null)) {
            s2 = s2 + ": null";
        }
        this(s2, throwable0, v1, v, s1, v2, zzam0, v3, null, SystemClock.elapsedRealtime(), z);
    }

    private zzil(String s, Throwable throwable0, int v, int v1, String s1, int v2, zzam zzam0, int v3, zzbw zzbw0, long v4, boolean z) {
        super(s, throwable0, v, v4);
        boolean z2;
        int v5;
        boolean z1 = false;
        if(z) {
            v5 = v1;
            if(v5 == 1) {
                v5 = 1;
                z2 = true;
            }
            else {
                z2 = false;
            }
        }
        else {
            v5 = v1;
            z2 = true;
        }
        zzdy.zzd(z2);
        if(throwable0 != null) {
            z1 = true;
        }
        zzdy.zzd(z1);
        this.zze = v5;
        this.zzf = s1;
        this.zzg = v2;
        this.zzh = zzam0;
        this.zzi = v3;
        this.zzj = zzbw0;
        this.zzk = z;
    }

    final zzil zza(zzbw zzbw0) {
        return new zzil(this.getMessage(), this.getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzbw0, this.zzc, this.zzk);
    }

    public static zzil zzb(Throwable throwable0, String s, int v, zzam zzam0, int v1, boolean z, int v2) {
        return zzam0 == null ? new zzil(1, throwable0, null, v2, s, v, null, 4, z) : new zzil(1, throwable0, null, v2, s, v, zzam0, v1, z);
    }

    public static zzil zzc(IOException iOException0, int v) {
        return new zzil(0, iOException0, v);
    }

    public static zzil zzd(RuntimeException runtimeException0, int v) {
        return new zzil(2, runtimeException0, v);
    }
}

