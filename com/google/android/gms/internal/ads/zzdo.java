package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class zzdo {
    private final zzfud zza;
    private final List zzb;
    private ByteBuffer[] zzc;
    private zzdp zzd;
    private zzdp zze;
    private boolean zzf;

    public zzdo(zzfud zzfud0) {
        this.zza = zzfud0;
        this.zzb = new ArrayList();
        this.zzc = new ByteBuffer[0];
        this.zzd = zzdp.zza;
        this.zze = zzdp.zza;
        this.zzf = false;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzdo)) {
            return false;
        }
        if(this.zza.size() == ((zzdo)object0).zza.size()) {
            for(int v = 0; v < this.zza.size(); ++v) {
                if(this.zza.get(v) != ((zzdo)object0).zza.get(v)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdp zza(zzdp zzdp0) {
        if(zzdp0.equals(zzdp.zza)) {
            throw new zzdq("Unhandled input format:", zzdp0);
        }
        for(int v = 0; v < this.zza.size(); ++v) {
            zzdr zzdr0 = (zzdr)this.zza.get(v);
            zzdp zzdp1 = zzdr0.zza(zzdp0);
            if(zzdr0.zzg()) {
                zzdy.zzf(!zzdp1.equals(zzdp.zza));
                zzdp0 = zzdp1;
            }
        }
        this.zze = zzdp0;
        return zzdp0;
    }

    public final ByteBuffer zzb() {
        if(!this.zzh()) {
            return zzdr.zza;
        }
        ByteBuffer byteBuffer0 = this.zzc[this.zzi()];
        if(!byteBuffer0.hasRemaining()) {
            this.zzj(zzdr.zza);
        }
        return byteBuffer0;
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for(int v1 = 0; v1 < this.zza.size(); ++v1) {
            zzdr zzdr0 = (zzdr)this.zza.get(v1);
            zzdr0.zzc();
            if(zzdr0.zzg()) {
                this.zzb.add(zzdr0);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for(int v = 0; v <= this.zzi(); ++v) {
            ByteBuffer[] arr_byteBuffer = this.zzc;
            arr_byteBuffer[v] = ((zzdr)this.zzb.get(v)).zzb();
        }
    }

    public final void zzd() {
        if(this.zzh() && !this.zzf) {
            this.zzf = true;
            ((zzdr)this.zzb.get(0)).zzd();
        }
    }

    public final void zze(ByteBuffer byteBuffer0) {
        if(this.zzh() && !this.zzf) {
            this.zzj(byteBuffer0);
        }
    }

    public final void zzf() {
        for(int v = 0; v < this.zza.size(); ++v) {
            zzdr zzdr0 = (zzdr)this.zza.get(v);
            zzdr0.zzc();
            zzdr0.zzf();
        }
        this.zzc = new ByteBuffer[0];
        this.zzd = zzdp.zza;
        this.zze = zzdp.zza;
        this.zzf = false;
    }

    // 去混淆评级： 低(30)
    public final boolean zzg() {
        return this.zzf && ((zzdr)this.zzb.get(this.zzi())).zzh() && !this.zzc[this.zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer1;
        do {
            int v1 = 0;
            for(int v = 0; v <= this.zzi(); ++v) {
                if(!this.zzc[v].hasRemaining()) {
                    zzdr zzdr0 = (zzdr)this.zzb.get(v);
                    if(!zzdr0.zzh()) {
                        if(v > 0) {
                            byteBuffer1 = this.zzc[v - 1];
                        }
                        else {
                            byteBuffer1 = byteBuffer0.hasRemaining() ? byteBuffer0 : zzdr.zza;
                        }
                        zzdr0.zze(byteBuffer1);
                        ByteBuffer[] arr_byteBuffer = this.zzc;
                        arr_byteBuffer[v] = zzdr0.zzb();
                        v1 |= (this.zzc[v].hasRemaining() ? 1 : 0);
                    }
                    else if(!this.zzc[v].hasRemaining() && v < this.zzi()) {
                        ((zzdr)this.zzb.get(v + 1)).zzd();
                    }
                }
            }
        }
        while(v1 != 0);
    }
}

