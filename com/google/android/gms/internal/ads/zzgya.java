package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class zzgya implements zzanb {
    private static final zzgyl zza;
    protected final String zzb;
    boolean zzc;
    boolean zzd;
    long zze;
    long zzf;
    zzgyf zzg;
    private zzanc zzh;
    private ByteBuffer zzi;
    private ByteBuffer zzj;

    static {
        zzgya.zza = zzgyl.zzb(zzgya.class);
    }

    protected zzgya(String s) {
        this.zzf = -1L;
        this.zzj = null;
        this.zzb = s;
        this.zzd = true;
        this.zzc = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzanb
    public final String zza() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzanb
    public final void zzb(zzgyf zzgyf0, ByteBuffer byteBuffer0, long v, zzamy zzamy0) {
        this.zze = zzgyf0.zzb();
        byteBuffer0.remaining();
        this.zzf = v;
        this.zzg = zzgyf0;
        zzgyf0.zze(zzgyf0.zzb() + v);
        this.zzd = false;
        this.zzc = false;
        this.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzanb
    public final void zzc(zzanc zzanc0) {
        this.zzh = zzanc0;
    }

    private final void zzd() {
        synchronized(this) {
            if(!this.zzd) {
                try {
                    zzgya.zza.zza((this.zzb.length() == 0 ? new String("mem mapping ") : "mem mapping " + this.zzb));
                    this.zzi = this.zzg.zzd(this.zze, this.zzf);
                    this.zzd = true;
                    return;
                }
                catch(IOException iOException0) {
                }
                throw new RuntimeException(iOException0);
            }
        }
    }

    protected abstract void zzf(ByteBuffer arg1);

    public final void zzg() {
        synchronized(this) {
            this.zzd();
            zzgya.zza.zza((this.zzb.length() == 0 ? new String("parsing details of ") : "parsing details of " + this.zzb));
            ByteBuffer byteBuffer0 = this.zzi;
            if(byteBuffer0 != null) {
                this.zzc = true;
                byteBuffer0.rewind();
                this.zzf(byteBuffer0);
                if(byteBuffer0.remaining() > 0) {
                    this.zzj = byteBuffer0.slice();
                }
                this.zzi = null;
            }
        }
    }
}

