package com.google.android.gms.internal.ads;

final class zzgte implements zzgtt {
    private final zzgta zza;
    private final zzguk zzb;
    private final boolean zzc;
    private final zzgrd zzd;

    private zzgte(zzguk zzguk0, zzgrd zzgrd0, zzgta zzgta0) {
        this.zzb = zzguk0;
        this.zzc = zzgrd0.zzh(zzgta0);
        this.zzd = zzgrd0;
        this.zza = zzgta0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final int zza(Object object0) {
        Object object1 = this.zzb.zzd(object0);
        int v = this.zzb.zzb(object1);
        if(!this.zzc) {
            return v;
        }
        this.zzd.zza(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final int zzb(Object object0) {
        int v = this.zzb.zzd(object0).hashCode();
        if(!this.zzc) {
            return v;
        }
        this.zzd.zza(object0);
        throw null;
    }

    static zzgte zzc(zzguk zzguk0, zzgrd zzgrd0, zzgta zzgta0) {
        return new zzgte(zzguk0, zzgrd0, zzgta0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final Object zze() {
        zzgta zzgta0 = this.zza;
        return zzgta0 instanceof zzgrq ? ((zzgrq)zzgta0).zzaD() : zzgta0.zzaP().zzan();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final void zzf(Object object0) {
        this.zzb.zzm(object0);
        this.zzd.zze(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final void zzg(Object object0, Object object1) {
        zzgtv.zzq(this.zzb, object0, object1);
        if(!this.zzc) {
            return;
        }
        this.zzd.zza(object1);
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final void zzh(Object object0, zzgtl zzgtl0, zzgrc zzgrc0) {
        boolean z;
        zzguk zzguk0 = this.zzb;
        zzgrd zzgrd0 = this.zzd;
        Object object1 = zzguk0.zzc(object0);
        zzgrh zzgrh0 = zzgrd0.zzb(object0);
        while(true) {
            try {
            label_4:
                if(zzgtl0.zzc() == 0x7FFFFFFF) {
                    break;
                }
                int v = zzgtl0.zzd();
                if(v == 11) {
                    Object object2 = null;
                    int v1 = 0;
                    zzgqi zzgqi0 = null;
                    while(zzgtl0.zzc() != 0x7FFFFFFF) {
                        int v2 = zzgtl0.zzd();
                        if(v2 == 16) {
                            v1 = zzgtl0.zzj();
                            object2 = zzgrd0.zzc(zzgrc0, this.zza, v1);
                        }
                        else if(v2 == 26) {
                            if(object2 == null) {
                                zzgqi0 = zzgtl0.zzp();
                            }
                            else {
                                zzgrd0.zzf(zzgtl0, object2, zzgrc0, zzgrh0);
                            }
                        }
                        else if(!zzgtl0.zzO()) {
                            break;
                        }
                    }
                    if(zzgtl0.zzd() != 12) {
                        throw zzgsc.zzb();
                    }
                    if(zzgqi0 == null) {
                        goto label_4;
                    }
                    if(object2 == null) {
                        zzguk0.zzk(object1, v1, zzgqi0);
                    }
                    else {
                        zzgrd0.zzg(zzgqi0, object2, zzgrc0, zzgrh0);
                    }
                    goto label_4;
                }
                if((v & 7) == 2) {
                    Object object3 = zzgrd0.zzc(zzgrc0, this.zza, v >>> 3);
                    if(object3 == null) {
                        z = zzguk0.zzp(object1, zzgtl0);
                        goto label_43;
                    }
                    else {
                        zzgrd0.zzf(zzgtl0, object3, zzgrc0, zzgrh0);
                        goto label_4;
                    }
                    goto label_38;
                }
                else {
                label_38:
                    z = zzgtl0.zzO();
                }
            }
            catch(Throwable throwable0) {
                zzguk0.zzn(object0, object1);
                throw throwable0;
            }
        label_43:
            if(!z) {
                zzguk0.zzn(object0, object1);
                return;
            }
        }
        zzguk0.zzn(object0, object1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final void zzi(Object object0, byte[] arr_b, int v, int v1, zzgpu zzgpu0) {
        if(((zzgrq)object0).zzc == zzgul.zzc()) {
            ((zzgrq)object0).zzc = zzgul.zzf();
        }
        zzgrn zzgrn0 = (zzgrn)object0;
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final boolean zzj(Object object0, Object object1) {
        if(!this.zzb.zzd(object0).equals(this.zzb.zzd(object1))) {
            return false;
        }
        if(!this.zzc) {
            return true;
        }
        this.zzd.zza(object0);
        this.zzd.zza(object1);
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final boolean zzk(Object object0) {
        this.zzd.zza(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtt
    public final void zzm(Object object0, zzgqy zzgqy0) {
        this.zzd.zza(object0);
        throw null;
    }
}

