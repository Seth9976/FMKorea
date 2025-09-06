package com.google.android.gms.measurement.internal;

import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfi.zze;
import com.google.android.gms.internal.measurement.zzfi.zzf;
import com.google.android.gms.internal.measurement.zzfi.zzg;
import com.google.android.gms.internal.measurement.zzfi.zzi.zza;
import com.google.android.gms.internal.measurement.zzfi.zzi;
import com.google.android.gms.internal.measurement.zzfi.zzj;
import com.google.android.gms.internal.measurement.zzfi.zzk;
import com.google.android.gms.internal.measurement.zzfi.zzn;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzps;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class zzkg extends zzmo {
    public zzkg(zzmp zzmp0) {
        super(zzmp0);
    }

    private static String zza(String s, String s1) {
        throw new SecurityException("This implementation should not be used.");
    }

    public final byte[] zza(zzbg zzbg0, String s) {
        long v2;
        zzbc zzbc1;
        zza zzfi$zzi$zza1;
        zzh zzh1;
        Bundle bundle1;
        com.google.android.gms.internal.measurement.zzfi.zzj.zza zzfi$zzj$zza2;
        Object object0;
        this.zzt();
        this.zzu.zzy();
        Preconditions.checkNotNull(zzbg0);
        Preconditions.checkNotEmpty(s);
        if(!this.zze().zze(s, zzbi.zzbc)) {
            this.zzj().zzc().zza("Generating ScionPayload disabled. packageName", s);
            return new byte[0];
        }
        if(!"_iap".equals(zzbg0.zza) && !"_iapx".equals(zzbg0.zza)) {
            this.zzj().zzc().zza("Generating a payload for this event is not available. package_name, event_name", s, zzbg0.zza);
            return null;
        }
        zza zzfi$zzi$zza0 = zzi.zzb();
        this.zzh().zzp();
        try {
            zzh zzh0 = this.zzh().zzd(s);
            if(zzh0 == null) {
                this.zzj().zzc().zza("Log and bundle not available. package_name", s);
                return new byte[0];
            }
            if(!zzh0.zzak()) {
                this.zzj().zzc().zza("Log and bundle disabled. package_name", s);
                return new byte[0];
            }
            com.google.android.gms.internal.measurement.zzfi.zzj.zza zzfi$zzj$zza0 = zzj.zzu().zzg(1).zzp("android");
            if(!TextUtils.isEmpty(zzh0.zzx())) {
                zzfi$zzj$zza0.zzb(zzh0.zzx());
            }
            if(!TextUtils.isEmpty(zzh0.zzz())) {
                zzfi$zzj$zza0.zzd(((String)Preconditions.checkNotNull(zzh0.zzz())));
            }
            if(!TextUtils.isEmpty(zzh0.zzaa())) {
                zzfi$zzj$zza0.zze(((String)Preconditions.checkNotNull(zzh0.zzaa())));
            }
            if(zzh0.zzc() != 0xFFFFFFFF80000000L) {
                zzfi$zzj$zza0.zze(((int)zzh0.zzc()));
            }
            zzfi$zzj$zza0.zzf(zzh0.zzo()).zzd(zzh0.zzm());
            String s1 = zzh0.zzac();
            String s2 = zzh0.zzv();
            if(!TextUtils.isEmpty(s1)) {
                zzfi$zzj$zza0.zzm(s1);
            }
            else if(!TextUtils.isEmpty(s2)) {
                zzfi$zzj$zza0.zza(s2);
            }
            zzfi$zzj$zza0.zzj(zzh0.zzt());
            zzih zzih0 = this.zzf.zzb(s);
            zzfi$zzj$zza0.zzc(zzh0.zzl());
            if(this.zzu.zzac() && this.zze().zzk("") && zzih0.zzg() && !TextUtils.isEmpty(null)) {
                zzfi$zzj$zza0.zzj(null);
            }
            zzfi$zzj$zza0.zzg(zzih0.zze());
            if(zzih0.zzg() && zzh0.zzaj()) {
                Pair pair0 = this.zzn().zza(zzh0.zzx(), zzih0);
                if(zzh0.zzaj() && pair0 != null && !TextUtils.isEmpty(((CharSequence)pair0.first))) {
                    try {
                        zzfi$zzj$zza0.zzq(zzkg.zza(((String)pair0.first), Long.toString(zzbg0.zzd)));
                        object0 = pair0.second;
                    }
                    catch(SecurityException securityException0) {
                        this.zzj().zzc().zza("Resettable device id encryption failed", securityException0.getMessage());
                        return new byte[0];
                    }
                    if(object0 != null) {
                        zzfi$zzj$zza0.zzc(((Boolean)object0).booleanValue());
                    }
                }
            }
            this.zzf().zzab();
            com.google.android.gms.internal.measurement.zzfi.zzj.zza zzfi$zzj$zza1 = zzfi$zzj$zza0.zzi(Build.MODEL);
            this.zzf().zzab();
            zzfi$zzj$zza1.zzo(Build.VERSION.RELEASE).zzi(((int)this.zzf().zzg())).zzs(this.zzf().zzh());
            try {
                if(zzih0.zzh() && zzh0.zzy() != null) {
                    zzfi$zzj$zza0.zzc(zzkg.zza(((String)Preconditions.checkNotNull(zzh0.zzy())), Long.toString(zzbg0.zzd)));
                }
            }
            catch(SecurityException securityException1) {
                this.zzj().zzc().zza("app instance id encryption failed", securityException1.getMessage());
                return new byte[0];
            }
            if(!TextUtils.isEmpty(zzh0.zzab())) {
                zzfi$zzj$zza0.zzl(((String)Preconditions.checkNotNull(zzh0.zzab())));
            }
            zzne zzne0 = null;
            String s3 = zzh0.zzx();
            List list0 = this.zzh().zzi(s3);
            for(Object object1: list0) {
                zzne zzne1 = (zzne)object1;
                if("_lte".equals(zzne1.zzc)) {
                    zzne0 = zzne1;
                    break;
                }
            }
            if(zzne0 == null || zzne0.zze == null) {
                zzne zzne2 = new zzne(s3, "auto", "_lte", this.zzb().currentTimeMillis(), 0L);
                list0.add(zzne2);
                this.zzh().zza(zzne2);
            }
            zzn[] arr_zzfi$zzn = new zzn[list0.size()];
            for(int v = 0; v < list0.size(); ++v) {
                com.google.android.gms.internal.measurement.zzfi.zzn.zza zzfi$zzn$zza0 = zzn.zze().zza(((zzne)list0.get(v)).zzc).zzb(((zzne)list0.get(v)).zzd);
                this.g_().zza(zzfi$zzn$zza0, ((zzne)list0.get(v)).zze);
                arr_zzfi$zzn[v] = (zzn)(((zzix)zzfi$zzn$zza0.zzab()));
            }
            zzfi$zzj$zza0.zze(Arrays.asList(arr_zzfi$zzn));
            this.g_().zza(zzfi$zzj$zza0);
            if(zznp.zza() && this.zze().zza(zzbi.zzcm)) {
                this.zzf.zza(zzh0, zzfi$zzj$zza0);
            }
            zzfv zzfv0 = zzfv.zza(zzbg0);
            this.zzq().zza(zzfv0.zzb, this.zzh().zzc(s));
            this.zzq().zza(zzfv0, this.zze().zzd(s));
            Bundle bundle0 = zzfv0.zzb;
            bundle0.putLong("_c", 1L);
            this.zzj().zzc().zza("Marking in-app purchase as real-time");
            bundle0.putLong("_r", 1L);
            bundle0.putString("_o", zzbg0.zzc);
            if(this.zzq().zzf("")) {
                this.zzq().zza(bundle0, "_dbg", 1L);
                this.zzq().zza(bundle0, "_r", 1L);
            }
            zzbc zzbc0 = this.zzh().zzd(s, zzbg0.zza);
            if(zzbc0 == null) {
                zzfi$zzj$zza2 = zzfi$zzj$zza0;
                bundle1 = bundle0;
                zzh1 = zzh0;
                zzfi$zzi$zza1 = zzfi$zzi$zza0;
                zzbc1 = new zzbc(s, zzbg0.zza, 0L, 0L, zzbg0.zzd, 0L, null, null, null, null);
                v2 = 0L;
            }
            else {
                zzfi$zzj$zza2 = zzfi$zzj$zza0;
                bundle1 = bundle0;
                zzh1 = zzh0;
                zzfi$zzi$zza1 = zzfi$zzi$zza0;
                zzbc zzbc2 = zzbc0.zza(zzbg0.zzd);
                v2 = zzbc0.zzf;
                zzbc1 = zzbc2;
            }
            this.zzh().zza(zzbc1);
            zzaz zzaz0 = new zzaz(this.zzu, zzbg0.zzc, s, zzbg0.zza, zzbg0.zzd, v2, bundle1);
            com.google.android.gms.internal.measurement.zzfi.zze.zza zzfi$zze$zza0 = zze.zze().zzb(zzaz0.zzc).zza(zzaz0.zzb).zza(zzaz0.zzd);
            for(Object object2: zzaz0.zze) {
                com.google.android.gms.internal.measurement.zzfi.zzg.zza zzfi$zzg$zza0 = zzg.zze().zza(((String)object2));
                Object object3 = zzaz0.zze.zzc(((String)object2));
                if(object3 != null) {
                    this.g_().zza(zzfi$zzg$zza0, object3);
                    zzfi$zze$zza0.zza(zzfi$zzg$zza0);
                }
            }
            zzfi$zzj$zza2.zza(zzfi$zze$zza0).zza(zzk.zza().zza(zzf.zza().zza(zzbc1.zzc).zza(zzbg0.zza)));
            zzfi$zzj$zza2.zza(this.zzg().zza(zzh1.zzx(), Collections.emptyList(), zzfi$zzj$zza2.zzx(), zzfi$zze$zza0.zzc(), zzfi$zze$zza0.zzc()));
            if(zzfi$zze$zza0.zzg()) {
                zzfi$zzj$zza2.zzi(zzfi$zze$zza0.zzc()).zze(zzfi$zze$zza0.zzc());
            }
            long v3 = zzh1.zzp();
            int v4 = Long.compare(v3, 0L);
            if(v4 != 0) {
                zzfi$zzj$zza2.zzg(v3);
            }
            long v5 = zzh1.zzr();
            if(v5 != 0L) {
                zzfi$zzj$zza2.zzh(v5);
            }
            else if(v4 != 0) {
                zzfi$zzj$zza2.zzh(v3);
            }
            String s4 = zzh1.zzaf();
            if(zzps.zza() && this.zze().zze(s, zzbi.zzbt) && s4 != null) {
                zzfi$zzj$zza2.zzr(s4);
            }
            zzh1.zzai();
            zzfi$zzj$zza2.zzf(((int)zzh1.zzq())).zzl(82001L).zzk(this.zzb().currentTimeMillis()).zzd(true);
            if(this.zze().zza(zzbi.zzbw)) {
                this.zzf.zza("", zzfi$zzj$zza2);
            }
            zzfi$zzi$zza1.zza(zzfi$zzj$zza2);
            zzh1.zzp(zzfi$zzj$zza2.zzd());
            zzh1.zzn(zzfi$zzj$zza2.zzc());
            this.zzh().zza(zzh1);
            this.zzh().zzw();
        }
        finally {
            this.zzh().zzu();
        }
        try {
            return this.g_().zzb(((zzi)(((zzix)zzfi$zzi$zza1.zzab()))).zzbv());
        }
        catch(IOException iOException0) {
            this.zzj().zzg().zza("Data loss. Failed to bundle and serialize. appId", zzfr.zza(s), iOException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzmo
    protected final boolean zzc() {
        return false;
    }
}

