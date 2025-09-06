package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzqd;

public final class zzmn extends zzml {
    zzmn(zzmp zzmp0) {
        super(zzmp0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzmz g_() {
        return super.g_();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return super.zza();
    }

    public final zzmq zza(String s) {
        if(zzqd.zza() && this.zze().zza(zzbi.zzbu)) {
            this.zzj().zzp().zza("sgtm feature flag enabled.");
            zzh zzh0 = this.zzh().zzd(s);
            if(zzh0 == null) {
                return new zzmq(this.zzb(s));
            }
            if(zzh0.zzam()) {
                this.zzj().zzp().zza("sgtm upload enabled in manifest.");
                boolean z = this.zzm().zzc(zzh0.zzx()) == null;
            }
        }
        return new zzmq(this.zzb(s));
    }

    private final String zzb(String s) {
        String s1 = this.zzm().zzf(s);
        if(!TextUtils.isEmpty(s1)) {
            Uri uri0 = Uri.parse("https://app-measurement.com/a");
            Uri.Builder uri$Builder0 = uri0.buildUpon();
            uri$Builder0.authority(s1 + "." + uri0.getAuthority());
            return uri$Builder0.build().toString();
        }
        return "https://app-measurement.com/a";
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return super.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzae zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzaf zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzba zzf() {
        return super.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzt zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzao zzh() {
        return super.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfq zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzfr zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgd zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzgy zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzgp zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzls zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzmn zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zznd zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzt() {
        super.zzt();
    }
}

