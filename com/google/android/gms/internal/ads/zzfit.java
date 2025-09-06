package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

public final class zzfit extends zzfip {
    private static final Pattern zza;
    private final zzfir zzb;
    private final zzfiq zzc;
    private final List zzd;
    private zzfkv zze;
    private zzfju zzf;
    private boolean zzg;
    private boolean zzh;
    private final String zzi;

    static {
        zzfit.zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    zzfit(zzfiq zzfiq0, zzfir zzfir0) {
        this.zzd = new ArrayList();
        this.zzg = false;
        this.zzh = false;
        this.zzc = zzfiq0;
        this.zzb = zzfir0;
        this.zzi = "802ea517-e3b1-40e8-bccd-0e731d338866";
        this.zzk(null);
        this.zzf = zzfir0.zzd() == zzfis.zza || zzfir0.zzd() == zzfis.zzc ? new zzfjv(zzfir0.zza()) : new zzfjx(zzfir0.zzi(), null);
        this.zzf.zzk();
        zzfjh.zza().zzd(this);
        zzfjn.zza().zzd(this.zzf.zza(), zzfiq0.zzb());
    }

    @Override  // com.google.android.gms.internal.ads.zzfip
    public final void zzb(View view0, zzfiw zzfiw0, String s) {
        if(!this.zzh) {
            if(!zzfit.zza.matcher("Ad overlay").matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
            zzfjk zzfjk0 = null;
            for(Object object0: this.zzd) {
                zzfjk zzfjk1 = (zzfjk)object0;
                if(zzfjk1.zzb().get() == view0) {
                    zzfjk0 = zzfjk1;
                    break;
                }
            }
            if(zzfjk0 == null) {
                zzfjk zzfjk2 = new zzfjk(view0, zzfiw0, "Ad overlay");
                this.zzd.add(zzfjk2);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfip
    public final void zzc() {
        if(this.zzh) {
            return;
        }
        this.zze.clear();
        if(!this.zzh) {
            this.zzd.clear();
        }
        this.zzh = true;
        zzfjn.zza().zzc(this.zzf.zza());
        zzfjh.zza().zze(this);
        this.zzf.zzc();
        this.zzf = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfip
    public final void zzd(View view0) {
        if(this.zzh) {
            return;
        }
        if(this.zzf() == view0) {
            return;
        }
        this.zzk(view0);
        this.zzf.zzb();
        Collection collection0 = zzfjh.zza().zzc();
        if(collection0 != null && !collection0.isEmpty()) {
            for(Object object0: collection0) {
                zzfit zzfit0 = (zzfit)object0;
                if(zzfit0 != this && zzfit0.zzf() == view0) {
                    zzfit0.zze.clear();
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfip
    public final void zze() {
        if(this.zzg) {
            return;
        }
        this.zzg = true;
        zzfjh.zza().zzf(this);
        float f = zzfjo.zzb().zza();
        this.zzf.zzi(f);
        this.zzf.zze(zzfjf.zza().zzb());
        this.zzf.zzg(this, this.zzb);
    }

    public final View zzf() {
        return (View)this.zze.get();
    }

    public final zzfju zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    // 去混淆评级： 低(20)
    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }

    private final void zzk(View view0) {
        this.zze = new zzfkv(view0);
    }
}

