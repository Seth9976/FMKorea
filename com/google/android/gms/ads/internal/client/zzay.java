package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbrz;
import com.google.android.gms.internal.ads.zzbwi;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcag;
import java.util.Random;

public final class zzay {
    private static final zzay zza;
    private final zzbzt zzb;
    private final zzaw zzc;
    private final String zzd;
    private final zzcag zze;
    private final Random zzf;

    static {
        zzay.zza = new zzay();
    }

    protected zzay() {
        zzbzt zzbzt0 = new zzbzt();
        zzaw zzaw0 = new zzaw(new zzk(), new zzi(), new zzeq(), new zzbgv(), new zzbwi(), new zzbrz(), new zzbgw());
        zzcag zzcag0 = new zzcag(0, 233012000, true, false, false);
        Random random0 = new Random();
        super();
        this.zzb = zzbzt0;
        this.zzc = zzaw0;
        this.zzd = "4976529917638836135";
        this.zze = zzcag0;
        this.zzf = random0;
    }

    public static zzaw zza() {
        return zzay.zza.zzc;
    }

    public static zzbzt zzb() {
        return zzay.zza.zzb;
    }

    public static zzcag zzc() {
        return zzay.zza.zze;
    }

    public static String zzd() {
        return zzay.zza.zzd;
    }

    public static Random zze() {
        return zzay.zza.zzf;
    }
}

