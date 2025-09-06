package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

public final class zzahq implements zzabb {
    public static final zzabi zza;
    private zzabe zzb;
    private zzahy zzc;
    private boolean zzd;

    static {
        zzahq.zza = (Uri uri0, Map map0) -> new zzabb[]{new zzahq()};
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        zzdy.zzb(this.zzb);
        if(this.zzc == null) {
            if(!this.zze(zzabc0)) {
                throw zzcd.zza("Failed to determine bitstream type", null);
            }
            zzabc0.zzj();
        }
        if(!this.zzd) {
            zzace zzace0 = this.zzb.zzv(0, 1);
            this.zzb.zzC();
            this.zzc.zzh(this.zzb, zzace0);
            this.zzd = true;
        }
        return this.zzc.zze(zzabc0, zzabx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zzb = zzabe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        zzahy zzahy0 = this.zzc;
        if(zzahy0 != null) {
            zzahy0.zzj(v, v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        try {
            return this.zze(zzabc0);
        }
        catch(zzcd unused_ex) {
            return false;
        }
    }

    private final boolean zze(zzabc zzabc0) {
        zzahs zzahs0 = new zzahs();
        if(zzahs0.zzb(zzabc0, true) && (zzahs0.zza & 2) == 2) {
            int v = Math.min(zzahs0.zze, 8);
            zzfb zzfb0 = new zzfb(v);
            ((zzaar)zzabc0).zzm(zzfb0.zzI(), 0, v, false);
            zzfb0.zzG(0);
            if(zzfb0.zza() >= 5 && zzfb0.zzl() == 0x7F && zzfb0.zzt() == 1179402563L) {
                this.zzc = new zzaho();
                return true;
            }
            zzfb0.zzG(0);
            try {
                if(zzack.zzd(1, zzfb0, true)) {
                    this.zzc = new zzaia();
                    return true;
                }
            }
            catch(zzcd unused_ex) {
            }
            zzfb0.zzG(0);
            if(zzahu.zzd(zzfb0)) {
                this.zzc = new zzahu();
                return true;
            }
        }
        return false;
    }
}

