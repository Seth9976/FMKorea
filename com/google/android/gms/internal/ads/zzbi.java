package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

public final class zzbi {
    public static final zzn zza;
    public final Uri zzb;
    public final String zzc;
    public final zzbb zzd;
    public final zzaq zze;
    public final List zzf;
    public final String zzg;
    public final zzfud zzh;
    @Deprecated
    public final List zzi;
    public final Object zzj;
    private static final String zzk;
    private static final String zzl;
    private static final String zzm;
    private static final String zzn;
    private static final String zzo;
    private static final String zzp;
    private static final String zzq;

    static {
        zzbi.zzk = "0";
        zzbi.zzl = "1";
        zzbi.zzm = "2";
        zzbi.zzn = "3";
        zzbi.zzo = "4";
        zzbi.zzp = "5";
        zzbi.zzq = "6";
        zzbi.zza = zzbg.zza;
    }

    zzbi(Uri uri0, String s, zzbb zzbb0, zzaq zzaq0, List list0, String s1, zzfud zzfud0, Object object0, zzbh zzbh0) {
        this.zzb = uri0;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = list0;
        this.zzg = null;
        this.zzh = zzfud0;
        zzfua zzfua0 = new zzfua();
        if(zzfud0.size() <= 0) {
            this.zzi = zzfua0.zzi();
            this.zzj = null;
            return;
        }
        zzbn zzbn0 = (zzbn)zzfud0.get(0);
        throw null;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzbi ? this.zzb.equals(((zzbi)object0).zzb) && zzfk.zzD(null, null) && zzfk.zzD(null, null) && zzfk.zzD(null, null) && this.zzf.equals(((zzbi)object0).zzf) && zzfk.zzD(null, null) && this.zzh.equals(((zzbi)object0).zzh) && zzfk.zzD(null, null) : false;
    }

    @Override
    public final int hashCode() {
        return ((this.zzb.hashCode() * 0xE1781 + this.zzf.hashCode()) * 961 + this.zzh.hashCode()) * 0x1F;
    }
}

