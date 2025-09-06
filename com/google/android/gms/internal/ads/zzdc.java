package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class zzdc {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfud zzh;
    private final zzfud zzi;
    private final int zzj;
    private final int zzk;
    private final zzfud zzl;
    private zzfud zzm;
    private int zzn;
    private final HashMap zzo;
    private final HashSet zzp;

    @Deprecated
    public zzdc() {
        this.zza = 0x7FFFFFFF;
        this.zzb = 0x7FFFFFFF;
        this.zzc = 0x7FFFFFFF;
        this.zzd = 0x7FFFFFFF;
        this.zze = 0x7FFFFFFF;
        this.zzf = 0x7FFFFFFF;
        this.zzg = true;
        this.zzh = zzfud.zzl();
        this.zzi = zzfud.zzl();
        this.zzj = 0x7FFFFFFF;
        this.zzk = 0x7FFFFFFF;
        this.zzl = zzfud.zzl();
        this.zzm = zzfud.zzl();
        this.zzn = 0;
        this.zzo = new HashMap();
        this.zzp = new HashSet();
    }

    protected zzdc(zzdd zzdd0) {
        this.zza = 0x7FFFFFFF;
        this.zzb = 0x7FFFFFFF;
        this.zzc = 0x7FFFFFFF;
        this.zzd = 0x7FFFFFFF;
        this.zze = zzdd0.zzl;
        this.zzf = zzdd0.zzm;
        this.zzg = zzdd0.zzn;
        this.zzh = zzdd0.zzo;
        this.zzi = zzdd0.zzq;
        this.zzj = 0x7FFFFFFF;
        this.zzk = 0x7FFFFFFF;
        this.zzl = zzdd0.zzu;
        this.zzm = zzdd0.zzw;
        this.zzn = zzdd0.zzx;
        this.zzp = new HashSet(zzdd0.zzD);
        this.zzo = new HashMap(zzdd0.zzC);
    }

    public final zzdc zzd(Context context0) {
        if(zzfk.zza >= 23 || Looper.myLooper() != null) {
            CaptioningManager captioningManager0 = (CaptioningManager)context0.getSystemService("captioning");
            if(captioningManager0 != null && captioningManager0.isEnabled()) {
                this.zzn = 0x440;
                Locale locale0 = captioningManager0.getLocale();
                if(locale0 != null) {
                    this.zzm = zzfud.zzm(zzfk.zzy(locale0));
                }
            }
        }
        return this;
    }

    public zzdc zze(int v, int v1, boolean z) {
        this.zze = v;
        this.zzf = v1;
        this.zzg = true;
        return this;
    }
}

