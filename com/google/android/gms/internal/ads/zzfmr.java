package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;

public final class zzfmr {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfmr(Context context0, int v) {
        this.zzc = context0.getSharedPreferences("pcvmspf", 0);
        File file0 = context0.getDir("pccache", 0);
        zzfms.zza(file0, false);
        this.zzb = file0;
        File file1 = context0.getDir("tmppccache", 0);
        zzfms.zza(file1, true);
        this.zza = file1;
        this.zzd = v;
    }

    // 去混淆评级： 中等(123)
    public final boolean zza(zzatr zzatr0, zzfmx zzfmx0) {
        zzatr0.zzf().zzA();
        zzatr0.zze().zzA();
        return false;
    }

    final zzatu zzb(int v) {
        String s = v == 1 ? this.zzc.getString(this.zzf(), null) : this.zzc.getString(this.zze(), null);
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            byte[] arr_b = Hex.stringToBytes(s);
            zzatu zzatu0 = zzatu.zzh(zzgqi.zzv(arr_b, 0, arr_b.length));
            File file0 = zzfms.zzb("", "pcam.jar", this.zzd());
            if(!file0.exists()) {
                file0 = zzfms.zzb("", "pcam", this.zzd());
            }
            File file1 = zzfms.zzb("", "pcbc", this.zzd());
            if(file0.exists() && file1.exists()) {
                return zzatu0;
            }
        }
        catch(zzgsc unused_ex) {
        }
        return null;
    }

    public final zzfmq zzc(int v) {
        zzatu zzatu0 = this.zzb(1);
        if(zzatu0 == null) {
            return null;
        }
        File file0 = zzfms.zzb("", "pcam.jar", this.zzd());
        if(!file0.exists()) {
            file0 = zzfms.zzb("", "pcam", this.zzd());
        }
        File file1 = zzfms.zzb("", "pcopt", this.zzd());
        return new zzfmq(zzatu0, file0, zzfms.zzb("", "pcbc", this.zzd()), file1);
    }

    private final File zzd() {
        File file0 = new File(this.zzb, Integer.toString(this.zzd - 1));
        if(!file0.exists()) {
            file0.mkdir();
        }
        return file0;
    }

    private final String zze() {
        return "FBAMTD" + (this.zzd - 1);
    }

    private final String zzf() {
        return "LATMTD" + (this.zzd - 1);
    }
}

