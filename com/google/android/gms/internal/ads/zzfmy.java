package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

public final class zzfmy {
    private static final Object zza;
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfmf zze;
    private boolean zzf;

    static {
        zzfmy.zza = new Object();
    }

    public zzfmy(Context context0, int v, zzfmf zzfmf0, boolean z) {
        this.zzf = false;
        this.zzb = context0;
        this.zzd = Integer.toString(v - 1);
        this.zzc = context0.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfmf0;
        this.zzf = z;
    }

    public final boolean zza(zzatr zzatr0) {
        long v = System.currentTimeMillis();
        synchronized(zzfmy.zza) {
            if(!zzfms.zze(new File(this.zze(""), "pcbc"), zzatr0.zze().zzA())) {
                this.zzi(4020, v);
                return false;
            }
            String s = zzfmy.zzf(zzatr0);
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc.edit();
            sharedPreferences$Editor0.putString(this.zzh(), s);
            boolean z = sharedPreferences$Editor0.commit();
            if(z) {
                this.zzi(5015, v);
            }
            else {
                this.zzi(0xFB5, v);
            }
            return z;
        }
    }

    public final boolean zzb(zzatr zzatr0, zzfmx zzfmx0) {
        long v1 = System.currentTimeMillis();
        synchronized(zzfmy.zza) {
            if(this.zzk(1) != null) {
                this.zzi(0xFAE, v1);
                return false;
            }
            String s = "1";
            String s1 = "1";
            long v3 = System.currentTimeMillis();
            File file0 = this.zze("");
            if(file0.exists()) {
                if(!file0.isDirectory()) {
                    s1 = "0";
                }
                this.zzj(0xFB7, v3, "d:" + s1 + ",f:" + (file0.isFile() ? "1" : "0"));
                this.zzi(0xFAF, v3);
            }
            else if(!file0.mkdirs()) {
                if(!file0.canWrite()) {
                    s = "0";
                }
                this.zzj(0xFB8, v3, "cw:" + s);
                this.zzi(0xFAF, v3);
                return false;
            }
            File file1 = this.zze("");
            File file2 = new File(file1, "pcam.jar");
            File file3 = new File(file1, "pcbc");
            if(!zzfms.zze(file2, zzatr0.zzf().zzA())) {
                this.zzi(0xFB0, v1);
                return false;
            }
            if(!zzfms.zze(file3, zzatr0.zze().zzA())) {
                this.zzi(0xFB1, v1);
                return false;
            }
            if(zzfmx0 != null && !zzfmx0.zza(file2)) {
                this.zzi(0xFB2, v1);
                zzfms.zzd(file1);
                return false;
            }
            String s2 = zzfmy.zzf(zzatr0);
            long v4 = System.currentTimeMillis();
            String s3 = this.zzc.getString(this.zzh(), null);
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc.edit();
            sharedPreferences$Editor0.putString(this.zzh(), s2);
            if(s3 != null) {
                sharedPreferences$Editor0.putString(this.zzg(), s3);
            }
            if(!sharedPreferences$Editor0.commit()) {
                this.zzi(0xFB3, v4);
                return false;
            }
            HashSet hashSet0 = new HashSet();
            if(this.zzk(1) != null) {
                hashSet0.add("");
            }
            if(this.zzk(2) != null) {
                hashSet0.add("");
            }
            File[] arr_file = new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles();
            for(int v = 0; v < arr_file.length; ++v) {
                File file4 = arr_file[v];
                if(!hashSet0.contains(file4.getName())) {
                    zzfms.zzd(file4);
                }
            }
            this.zzi(5014, v1);
            return true;
        }
    }

    public final zzfmq zzc(int v) {
        File file3;
        File file2;
        File file1;
        zzatu zzatu0;
        long v1 = System.currentTimeMillis();
        synchronized(zzfmy.zza) {
            zzatu0 = this.zzk(1);
            if(zzatu0 == null) {
                this.zzi(0xFB6, v1);
                return null;
            }
            File file0 = this.zze("");
            file1 = new File(file0, "pcam.jar");
            if(!file1.exists()) {
                file1 = new File(file0, "pcam");
            }
            file2 = new File(file0, "pcbc");
            file3 = new File(file0, "pcopt");
            this.zzi(5016, v1);
        }
        return new zzfmq(zzatu0, file1, file2, file3);
    }

    public final boolean zzd(int v) {
        long v1 = System.currentTimeMillis();
        synchronized(zzfmy.zza) {
            if(this.zzk(1) == null) {
                this.zzi(0xFB9, v1);
                return false;
            }
            File file0 = this.zze("");
            if(!new File(file0, "pcam.jar").exists()) {
                this.zzi(0xFBA, v1);
                return false;
            }
            if(!new File(file0, "pcbc").exists()) {
                this.zzi(0xFBB, v1);
                return false;
            }
            this.zzi(5019, v1);
            return true;
        }
    }

    private final File zze(String s) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), s);
    }

    private static String zzf(zzatr zzatr0) {
        zzatt zzatt0 = zzatu.zze();
        zzatt0.zze("");
        zzatt0.zza("");
        zzatt0.zzb(zzatr0.zzd().zza());
        zzatt0.zzd(zzatr0.zzd().zzd());
        zzatt0.zzc(zzatr0.zzd().zzc());
        return Hex.bytesToStringLowercase(((zzatu)zzatt0.zzal()).zzax());
    }

    private final String zzg() {
        return "FBAMTD" + this.zzd;
    }

    private final String zzh() {
        return "LATMTD" + this.zzd;
    }

    private final void zzi(int v, long v1) {
        this.zze.zza(v, v1);
    }

    private final void zzj(int v, long v1, String s) {
        this.zze.zzb(v, v1, s);
    }

    private final zzatu zzk(int v) {
        long v1;
        String s = v == 1 ? this.zzc.getString(this.zzh(), null) : this.zzc.getString(this.zzg(), null);
        if(s == null) {
            return null;
        }
        try {
            v1 = System.currentTimeMillis();
            byte[] arr_b = Hex.stringToBytes(s);
            return zzatu.zzi(zzgqi.zzv(arr_b, 0, arr_b.length), (this.zzf ? zzgrc.zza() : zzgrc.zzb()));
        }
        catch(zzgsc unused_ex) {
            this.zzi(2029, v1);
            return null;
        }
        catch(NullPointerException unused_ex) {
            return null;
        }
        catch(RuntimeException unused_ex) {
            this.zzi(0x7F0, v1);
            return null;
        }
    }
}

