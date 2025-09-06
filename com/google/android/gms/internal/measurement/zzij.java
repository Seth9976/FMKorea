package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

final class zzij implements zzmw {
    private final zzig zza;

    private zzij(zzig zzig0) {
        zzig zzig1 = (zzig)zziz.zza(zzig0, "output");
        this.zza = zzig1;
        zzig1.zza = this;
    }

    public static zzij zza(zzig zzig0) {
        zzij zzij0 = zzig0.zza;
        return zzij0 == null ? new zzij(zzig0) : zzij0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final int zza() {
        return zzmz.zza;
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    @Deprecated
    public final void zza(int v) {
        this.zza.zzc(v, 4);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int v, double f) {
        this.zza.zzb(v, f);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int v, float f) {
        this.zza.zzb(v, f);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int v, int v1) {
        this.zza.zzb(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int v, long v1) {
        this.zza.zza(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int v, zzhm zzhm0) {
        this.zza.zza(v, zzhm0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int v, zzke zzke0, Map map0) {
        for(Object object0: map0.entrySet()) {
            this.zza.zzc(v, 2);
            int v1 = zzkb.zza(zzke0, ((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
            this.zza.zzc(v1);
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            zzkb.zza(this.zza, zzke0, object1, object2);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int v, Object object0) {
        if(object0 instanceof zzhm) {
            this.zza.zzb(v, ((zzhm)object0));
            return;
        }
        this.zza.zza(v, ((zzkj)object0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int v, Object object0, zzlb zzlb0) {
        this.zza.zzc(v, 3);
        zzlb0.zza(((zzkj)object0), this.zza.zza);
        this.zza.zzc(v, 4);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int v, String s) {
        this.zza.zza(v, s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int v, List list0) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            zzhm zzhm0 = (zzhm)list0.get(v1);
            this.zza.zza(v, zzhm0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int v, List list0, zzlb zzlb0) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.zza(v, list0.get(v1), zzlb0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zza(((Boolean)list0.get(v2)).booleanValue());
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                boolean z1 = ((Boolean)list0.get(v1)).booleanValue();
                this.zza.zzb(z1);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            boolean z2 = ((Boolean)list0.get(v1)).booleanValue();
            this.zza.zza(v, z2);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zza(int v, boolean z) {
        this.zza.zza(v, z);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    @Deprecated
    public final void zzb(int v) {
        this.zza.zzc(v, 3);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzb(int v, int v1) {
        this.zza.zza(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzb(int v, long v1) {
        this.zza.zzb(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzb(int v, Object object0, zzlb zzlb0) {
        this.zza.zza(v, ((zzkj)object0), zzlb0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzb(int v, List list0) {
        int v1 = 0;
        if(list0 instanceof zzjp) {
            while(v1 < list0.size()) {
                Object object0 = ((zzjp)list0).zzb(v1);
                if(object0 instanceof String) {
                    this.zza.zza(v, ((String)object0));
                }
                else {
                    this.zza.zza(v, ((zzhm)object0));
                }
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            String s = (String)list0.get(v1);
            this.zza.zza(v, s);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzb(int v, List list0, zzlb zzlb0) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            this.zzb(v, list0.get(v1), zzlb0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzb(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zza(((double)(((Double)list0.get(v2)))));
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                double f = (double)(((Double)list0.get(v1)));
                this.zza.zzb(f);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            double f1 = (double)(((Double)list0.get(v1)));
            this.zza.zzb(v, f1);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzc(int v, int v1) {
        this.zza.zzb(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzc(int v, long v1) {
        this.zza.zza(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzc(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zzd(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zzb(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zzb(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzd(int v, int v1) {
        this.zza.zza(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzd(int v, long v1) {
        this.zza.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzd(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zze(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zza(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zza(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zze(int v, int v1) {
        this.zza.zzk(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zze(int v, long v1) {
        this.zza.zzb(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zze(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zzc(((long)(((Long)list0.get(v2)))));
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zza(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zza(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzf(int v, int v1) {
        this.zza.zzd(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzf(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zza(((float)(((Float)list0.get(v2)))));
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                float f = (float)(((Float)list0.get(v1)));
                this.zza.zzb(f);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            float f1 = (float)(((Float)list0.get(v1)));
            this.zza.zzb(v, f1);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzg(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zzf(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zzb(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zzb(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzh(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zzd(((long)(((Long)list0.get(v2)))));
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zzb(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zzb(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzi(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zzg(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zza(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zza(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzj(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zze(((long)(((Long)list0.get(v2)))));
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zza(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zza(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzk(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zzh(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zzk(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zzk(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzl(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zzf(((long)(((Long)list0.get(v2)))));
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zzh(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zzh(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzm(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zzj(((int)(((Integer)list0.get(v2)))));
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                int v4 = (int)(((Integer)list0.get(v1)));
                this.zza.zzc(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v5 = (int)(((Integer)list0.get(v1)));
            this.zza.zzd(v, v5);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzmw
    public final void zzn(int v, List list0, boolean z) {
        int v1 = 0;
        if(z) {
            this.zza.zzc(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzig.zzg(((long)(((Long)list0.get(v2)))));
            }
            this.zza.zzc(v3);
            while(v1 < list0.size()) {
                long v4 = (long)(((Long)list0.get(v1)));
                this.zza.zzb(v4);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v5 = (long)(((Long)list0.get(v1)));
            this.zza.zzb(v, v5);
            ++v1;
        }
    }
}

