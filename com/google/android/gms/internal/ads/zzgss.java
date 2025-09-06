package com.google.android.gms.internal.ads;

final class zzgss implements zzgtu {
    private static final zzgsy zza;
    private final zzgsy zzb;

    static {
        zzgss.zza = new zzgsq();
    }

    public zzgss() {
        zzgsy zzgsy0;
        zzgrl zzgrl0;
        try {
            zzgrl0 = zzgrl.zza();
            zzgsy0 = (zzgsy)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        }
        catch(Exception unused_ex) {
            zzgsy0 = zzgss.zza;
        }
        zzgsr zzgsr0 = new zzgsr(new zzgsy[]{zzgrl0, zzgsy0});
        super();
        this.zzb = zzgsr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtu
    public final zzgtt zza(Class class0) {
        zzgtv.zzr(class0);
        zzgsx zzgsx0 = this.zzb.zzb(class0);
        boolean z = zzgsx0.zzb();
        Class class1 = zzgrq.class;
        if(z) {
            return class1.isAssignableFrom(class0) ? zzgte.zzc(zzgtv.zzn(), zzgrf.zzb(), zzgsx0.zza()) : zzgte.zzc(zzgtv.zzm(), zzgrf.zza(), zzgsx0.zza());
        }
        if(class1.isAssignableFrom(class0)) {
            return zzgss.zzb(zzgsx0) ? zzgtd.zzl(class0, zzgsx0, zzgtg.zzb(), zzgso.zze(), zzgtv.zzn(), zzgrf.zzb(), zzgsw.zzb()) : zzgtd.zzl(class0, zzgsx0, zzgtg.zzb(), zzgso.zze(), zzgtv.zzn(), null, zzgsw.zzb());
        }
        return zzgss.zzb(zzgsx0) ? zzgtd.zzl(class0, zzgsx0, zzgtg.zza(), zzgso.zzd(), zzgtv.zzm(), zzgrf.zza(), zzgsw.zza()) : zzgtd.zzl(class0, zzgsx0, zzgtg.zza(), zzgso.zzd(), zzgtv.zzm(), null, zzgsw.zza());
    }

    private static boolean zzb(zzgsx zzgsx0) {
        return zzgsx0.zzc() - 1 != 1;
    }
}

