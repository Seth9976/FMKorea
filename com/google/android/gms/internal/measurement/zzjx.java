package com.google.android.gms.internal.measurement;

final class zzjx implements zzle {
    private static final zzkk zza;
    private final zzkk zzb;

    static {
        zzjx.zza = new zzka();
    }

    public zzjx() {
        this(new zzkc(new zzkk[]{zziy.zza(), zzjx.zza()}));
    }

    private zzjx(zzkk zzkk0) {
        this.zzb = (zzkk)zziz.zza(zzkk0, "messageInfoFactory");
    }

    private static zzkk zza() {
        try {
            return (zzkk)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        }
        catch(Exception unused_ex) {
            return zzjx.zza;
        }
    }

    private static boolean zza(zzkh zzkh0) {
        return zzjz.zza[zzkh0.zzb().ordinal()] != 1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzle
    public final zzlb zza(Class class0) {
        zzld.zza(class0);
        zzkh zzkh0 = this.zzb.zza(class0);
        boolean z = zzkh0.zzc();
        Class class1 = zzix.class;
        if(z) {
            return class1.isAssignableFrom(class0) ? zzkp.zza(zzld.zzb(), zzin.zzb(), zzkh0.zza()) : zzkp.zza(zzld.zza(), zzin.zza(), zzkh0.zza());
        }
        if(class1.isAssignableFrom(class0)) {
            return zzjx.zza(zzkh0) ? zzkn.zza(class0, zzkh0, zzkt.zzb(), zzjs.zzb(), zzld.zzb(), zzin.zzb(), zzki.zzb()) : zzkn.zza(class0, zzkh0, zzkt.zzb(), zzjs.zzb(), zzld.zzb(), null, zzki.zzb());
        }
        return zzjx.zza(zzkh0) ? zzkn.zza(class0, zzkh0, zzkt.zza(), zzjs.zza(), zzld.zza(), zzin.zza(), zzki.zza()) : zzkn.zza(class0, zzkh0, zzkt.zza(), zzjs.zza(), zzld.zza(), null, zzki.zza());
    }
}

