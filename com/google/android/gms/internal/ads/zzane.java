package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

public final class zzane extends zzgyc {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzgym zzm;
    private long zzn;

    public zzane() {
        super("mvhd");
        this.zzk = 1.0;
        this.zzl = 1.0f;
        this.zzm = zzgym.zza;
    }

    @Override
    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zza + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzgya
    public final void zzf(ByteBuffer byteBuffer0) {
        this.zzi(byteBuffer0);
        if(this.zzh() == 1) {
            this.zza = zzgyh.zza(zzana.zzf(byteBuffer0));
            this.zzh = zzgyh.zza(zzana.zzf(byteBuffer0));
            this.zzi = zzana.zze(byteBuffer0);
            this.zzj = zzana.zzf(byteBuffer0);
        }
        else {
            this.zza = zzgyh.zza(zzana.zze(byteBuffer0));
            this.zzh = zzgyh.zza(zzana.zze(byteBuffer0));
            this.zzi = zzana.zze(byteBuffer0);
            this.zzj = zzana.zze(byteBuffer0);
        }
        this.zzk = zzana.zzb(byteBuffer0);
        byte[] arr_b = new byte[2];
        byteBuffer0.get(arr_b);
        this.zzl = ((float)(((short)(arr_b[1] & 0xFF | ((short)(0xFF00 & arr_b[0] << 8)))))) / 256.0f;
        zzana.zzd(byteBuffer0);
        zzana.zze(byteBuffer0);
        zzana.zze(byteBuffer0);
        double f = zzana.zzb(byteBuffer0);
        double f1 = zzana.zzb(byteBuffer0);
        double f2 = zzana.zza(byteBuffer0);
        double f3 = zzana.zzb(byteBuffer0);
        double f4 = zzana.zzb(byteBuffer0);
        double f5 = zzana.zza(byteBuffer0);
        double f6 = zzana.zzb(byteBuffer0);
        double f7 = zzana.zzb(byteBuffer0);
        this.zzm = new zzgym(f, f1, f3, f4, f2, f5, zzana.zza(byteBuffer0), f6, f7);
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        this.zzn = zzana.zze(byteBuffer0);
    }
}

