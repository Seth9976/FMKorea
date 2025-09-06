package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzkp implements zzlb {
    private final zzkj zza;
    private final zzma zzb;
    private final boolean zzc;
    private final zzim zzd;

    private zzkp(zzma zzma0, zzim zzim0, zzkj zzkj0) {
        this.zzb = zzma0;
        this.zzc = zzim0.zza(zzkj0);
        this.zzd = zzim0;
        this.zza = zzkj0;
    }

    static zzkp zza(zzma zzma0, zzim zzim0, zzkj zzkj0) {
        return new zzkp(zzma0, zzim0, zzkj0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final int zza(Object object0) {
        Object object1 = this.zzb.zzd(object0);
        int v = this.zzb.zzb(object1);
        return this.zzc ? v + this.zzd.zza(object0).zza() : v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final Object zza() {
        zzkj zzkj0 = this.zza;
        return zzkj0 instanceof zzix ? ((zzix)zzkj0).zzbz() : zzkj0.zzcd().zzac();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final void zza(Object object0, zzlc zzlc0, zzik zzik0) {
        boolean z;
        zzma zzma0 = this.zzb;
        zzim zzim0 = this.zzd;
        Object object1 = zzma0.zzc(object0);
        zziq zziq0 = zzim0.zzb(object0);
        while(true) {
            try {
                if(zzlc0.zzc() == 0x7FFFFFFF) {
                    break;
                }
                int v = zzlc0.zzd();
                if(v == 11) {
                    Object object2 = null;
                    int v1 = 0;
                    zzhm zzhm0 = null;
                    while(zzlc0.zzc() != 0x7FFFFFFF) {
                        int v2 = zzlc0.zzd();
                        if(v2 == 16) {
                            v1 = zzlc0.zzj();
                            object2 = zzim0.zza(zzik0, this.zza, v1);
                        }
                        else if(v2 == 26) {
                            if(object2 == null) {
                                zzhm0 = zzlc0.zzp();
                            }
                            else {
                                zzim0.zza(zzlc0, object2, zzik0, zziq0);
                            }
                        }
                        else if(!zzlc0.zzt()) {
                            break;
                        }
                    }
                    if(zzlc0.zzd() != 12) {
                        throw zzji.zzb();
                    }
                    if(zzhm0 == null) {
                    }
                    else if(object2 != null) {
                        zzim0.zza(zzhm0, object2, zzik0, zziq0);
                    }
                    else {
                        zzma0.zza(object1, v1, zzhm0);
                    }
                    z = true;
                }
                else if((v & 7) == 2) {
                    Object object3 = zzim0.zza(zzik0, this.zza, v >>> 3);
                    if(object3 == null) {
                        z = zzma0.zza(object1, zzlc0);
                    }
                    else {
                        zzim0.zza(zzlc0, object3, zzik0, zziq0);
                        z = true;
                    }
                }
                else {
                    z = zzlc0.zzt();
                }
            }
            catch(Throwable throwable0) {
                zzma0.zzb(object0, object1);
                throw throwable0;
            }
            if(!z) {
                zzma0.zzb(object0, object1);
                return;
            }
        }
        zzma0.zzb(object0, object1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final void zza(Object object0, zzmw zzmw0) {
        Iterator iterator0 = this.zzd.zza(object0).zzd();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object1;
            zzis zzis0 = (zzis)map$Entry0.getKey();
            if(zzis0.zzc() != zzmx.zzi || zzis0.zze() || zzis0.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if(map$Entry0 instanceof zzjm) {
                zzmw0.zza(zzis0.zza(), ((zzjm)map$Entry0).zza().zzc());
            }
            else {
                zzmw0.zza(zzis0.zza(), map$Entry0.getValue());
            }
        }
        Object object2 = this.zzb.zzd(object0);
        this.zzb.zza(object2, zzmw0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final void zza(Object object0, Object object1) {
        zzld.zza(this.zzb, object0, object1);
        if(this.zzc) {
            zzld.zza(this.zzd, object0, object1);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final void zza(Object object0, byte[] arr_b, int v, int v1, zzhl zzhl0) {
        zzlz zzlz0 = ((zzix)object0).zzb;
        if(zzlz0 == zzlz.zzc()) {
            zzlz0 = zzlz.zzd();
            ((zzix)object0).zzb = zzlz0;
        }
        ((zzd)object0).zza();
        zzf zzix$zzf0 = null;
        while(v < v1) {
            int v2 = zzhi.zzc(arr_b, v, zzhl0);
            int v3 = zzhl0.zza;
            if(v3 == 11) {
                int v4 = 0;
                zzhm zzhm0 = null;
                while(v2 < v1) {
                    v2 = zzhi.zzc(arr_b, v2, zzhl0);
                    int v5 = zzhl0.zza;
                    int v6 = v5 & 7;
                    switch(v5 >>> 3) {
                        case 2: {
                            if(v6 == 0) {
                                v2 = zzhi.zzc(arr_b, v2, zzhl0);
                                v4 = zzhl0.zza;
                                zzix$zzf0 = (zzf)this.zzd.zza(zzhl0.zzd, this.zza, v4);
                                continue;
                            }
                            break;
                        }
                        case 3: {
                            if(zzix$zzf0 != null) {
                                throw new NoSuchMethodError();
                            }
                            if(v6 == 2) {
                                v2 = zzhi.zza(arr_b, v2, zzhl0);
                                zzhm0 = (zzhm)zzhl0.zzc;
                                continue;
                            }
                        }
                    }
                    if(v5 == 12) {
                        break;
                    }
                    v2 = zzhi.zza(v5, arr_b, v2, v1, zzhl0);
                }
                if(zzhm0 != null) {
                    zzlz0.zza(v4 << 3 | 2, zzhm0);
                }
                v = v2;
            }
            else if((v3 & 7) == 2) {
                zzix$zzf0 = (zzf)this.zzd.zza(zzhl0.zzd, this.zza, v3 >>> 3);
                if(zzix$zzf0 != null) {
                    throw new NoSuchMethodError();
                }
                v = zzhi.zza(v3, arr_b, v2, v1, zzlz0, zzhl0);
            }
            else {
                v = zzhi.zza(v3, arr_b, v2, v1, zzhl0);
            }
        }
        if(v != v1) {
            throw zzji.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final int zzb(Object object0) {
        int v = this.zzb.zzd(object0).hashCode();
        return this.zzc ? v * 53 + this.zzd.zza(object0).hashCode() : v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final boolean zzb(Object object0, Object object1) {
        if(!this.zzb.zzd(object0).equals(this.zzb.zzd(object1))) {
            return false;
        }
        return this.zzc ? this.zzd.zza(object0).equals(this.zzd.zza(object1)) : true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final void zzc(Object object0) {
        this.zzb.zzf(object0);
        this.zzd.zzc(object0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlb
    public final boolean zzd(Object object0) {
        return this.zzd.zza(object0).zzg();
    }
}

