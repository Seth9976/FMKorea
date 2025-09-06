package com.google.android.gms.internal.ads;

import java.util.List;

final class zzgqy {
    private final zzgqx zza;

    private zzgqy(zzgqx zzgqx0) {
        this.zza = zzgqx0;
        zzgqx0.zze = this;
    }

    public final void zzA(int v, int v1) {
        this.zza.zzr(v, v1 >> 0x1F ^ v1 + v1);
    }

    public final void zzB(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                int v4 = (int)(((Integer)list0.get(v2)));
                v3 += zzgqx.zzA(v4 >> 0x1F ^ v4 + v4);
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                int v5 = (int)(((Integer)list0.get(v1)));
                this.zza.zzs(v5 >> 0x1F ^ v5 + v5);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v6 = (int)(((Integer)list0.get(v1)));
            this.zza.zzr(v, v6 >> 0x1F ^ v6 + v6);
            ++v1;
        }
    }

    public final void zzC(int v, long v1) {
        this.zza.zzt(v, v1 >> 0x3F ^ v1 + v1);
    }

    public final void zzD(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                long v4 = (long)(((Long)list0.get(v2)));
                v3 += zzgqx.zzB(v4 >> 0x3F ^ v4 + v4);
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                long v5 = (long)(((Long)list0.get(v1)));
                this.zza.zzu(v5 >> 0x3F ^ v5 + v5);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v6 = (long)(((Long)list0.get(v1)));
            this.zza.zzt(v, v6 >> 0x3F ^ v6 + v6);
            ++v1;
        }
    }

    @Deprecated
    public final void zzE(int v) {
        this.zza.zzq(v, 3);
    }

    public final void zzF(int v, String s) {
        this.zza.zzo(v, s);
    }

    public final void zzG(int v, List list0) {
        int v1 = 0;
        if(list0 instanceof zzgsi) {
            while(v1 < list0.size()) {
                Object object0 = ((zzgsi)list0).zzf(v1);
                if(object0 instanceof String) {
                    this.zza.zzo(v, ((String)object0));
                }
                else {
                    this.zza.zzL(v, ((zzgqi)object0));
                }
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            String s = (String)list0.get(v1);
            this.zza.zzo(v, s);
            ++v1;
        }
    }

    public final void zzH(int v, int v1) {
        this.zza.zzr(v, v1);
    }

    public final void zzI(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzgqx.zzA(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zzs(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zzr(v, v5);
            ++v1;
        }
    }

    public final void zzJ(int v, long v1) {
        this.zza.zzt(v, v1);
    }

    public final void zzK(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzgqx.zzB(((long)(((Long)list0.get(v2)))));
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zzu(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zzt(v, v5);
            ++v1;
        }
    }

    public static zzgqy zza(zzgqx zzgqx0) {
        zzgqy zzgqy0 = zzgqx0.zze;
        return zzgqy0 == null ? new zzgqy(zzgqx0) : zzgqy0;
    }

    public final void zzb(int v, boolean z) {
        this.zza.zzK(v, z);
    }

    public final void zzc(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Boolean)list0.get(v2)).booleanValue();
                ++v3;
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                boolean z1 = ((Boolean)list0.get(v1)).booleanValue();
                this.zza.zzJ(((byte)z1));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            boolean z2 = ((Boolean)list0.get(v1)).booleanValue();
            this.zza.zzK(v, z2);
            ++v1;
        }
    }

    public final void zzd(int v, zzgqi zzgqi0) {
        this.zza.zzL(v, zzgqi0);
    }

    public final void zze(int v, List list0) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            zzgqi zzgqi0 = (zzgqi)list0.get(v1);
            this.zza.zzL(v, zzgqi0);
        }
    }

    public final void zzf(int v, double f) {
        this.zza.zzj(v, Double.doubleToRawLongBits(f));
    }

    public final void zzg(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Double)list0.get(v2)).doubleValue();
                v3 += 8;
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                long v4 = Double.doubleToRawLongBits(((double)(((Double)list0.get(v1)))));
                this.zza.zzk(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = Double.doubleToRawLongBits(((double)(((Double)list0.get(v1)))));
            this.zza.zzj(v, v5);
            ++v1;
        }
    }

    @Deprecated
    public final void zzh(int v) {
        this.zza.zzq(v, 4);
    }

    public final void zzi(int v, int v1) {
        this.zza.zzl(v, v1);
    }

    public final void zzj(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzgqx.zzx(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zzm(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zzl(v, v5);
            ++v1;
        }
    }

    public final void zzk(int v, int v1) {
        this.zza.zzh(v, v1);
    }

    public final void zzl(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Integer)list0.get(v2)).intValue();
                v3 += 4;
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zzi(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zzh(v, v5);
            ++v1;
        }
    }

    public final void zzm(int v, long v1) {
        this.zza.zzj(v, v1);
    }

    public final void zzn(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Long)list0.get(v2)).longValue();
                v3 += 8;
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zzk(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zzj(v, v5);
            ++v1;
        }
    }

    public final void zzo(int v, float f) {
        this.zza.zzh(v, Float.floatToRawIntBits(f));
    }

    public final void zzp(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Float)list0.get(v2)).floatValue();
                v3 += 4;
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                int v4 = Float.floatToRawIntBits(((float)(((Float)list0.get(v1)))));
                this.zza.zzi(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = Float.floatToRawIntBits(((float)(((Float)list0.get(v1)))));
            this.zza.zzh(v, v5);
            ++v1;
        }
    }

    public final void zzq(int v, Object object0, zzgtt zzgtt0) {
        this.zza.zzq(v, 3);
        zzgtt0.zzm(((zzgta)object0), this.zza.zze);
        this.zza.zzq(v, 4);
    }

    public final void zzr(int v, int v1) {
        this.zza.zzl(v, v1);
    }

    public final void zzs(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzgqx.zzx(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zzm(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zzl(v, v5);
            ++v1;
        }
    }

    public final void zzt(int v, long v1) {
        this.zza.zzt(v, v1);
    }

    public final void zzu(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzgqx.zzB(((long)(((Long)list0.get(v2)))));
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zzu(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zzt(v, v5);
            ++v1;
        }
    }

    public final void zzv(int v, Object object0, zzgtt zzgtt0) {
        this.zza.zzn(v, ((zzgta)object0), zzgtt0);
    }

    public final void zzw(int v, int v1) {
        this.zza.zzh(v, v1);
    }

    public final void zzx(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Integer)list0.get(v2)).intValue();
                v3 += 4;
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zzi(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zzh(v, v5);
            ++v1;
        }
    }

    public final void zzy(int v, long v1) {
        this.zza.zzj(v, v1);
    }

    public final void zzz(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzq(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Long)list0.get(v2)).longValue();
                v3 += 8;
            }
            this.zza.zzs(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zzk(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zzj(v, v5);
            ++v1;
        }
    }
}

