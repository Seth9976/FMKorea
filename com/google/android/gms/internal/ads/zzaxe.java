package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public final class zzaxe {
    private final zzaxk zza;
    private final zzayt zzb;
    private final boolean zzc;

    private zzaxe() {
        this.zzb = zzayu.zzd();
        this.zzc = false;
        this.zza = new zzaxk();
    }

    public zzaxe(zzaxk zzaxk0) {
        this.zzb = zzayu.zzd();
        this.zza = zzaxk0;
        this.zzc = ((Boolean)zzba.zzc().zzb(zzbbr.zzeL)).booleanValue();
    }

    public static zzaxe zza() {
        return new zzaxe();
    }

    public final void zzb(zzaxd zzaxd0) {
        synchronized(this) {
            if(this.zzc) {
                try {
                    zzaxd0.zza(this.zzb);
                }
                catch(NullPointerException nullPointerException0) {
                    zzt.zzo().zzu(nullPointerException0, "AdMobClearcutLogger.modify");
                }
            }
        }
    }

    public final void zzc(int v) {
        synchronized(this) {
            if(!this.zzc) {
                return;
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzeM)).booleanValue()) {
                this.zze(v);
                return;
            }
            this.zzf(v);
        }
    }

    private final String zzd(int v) {
        Object[] arr_object;
        synchronized(this) {
            arr_object = new Object[]{"", zzt.zzB().elapsedRealtime(), ((int)(v - 1)), Base64.encodeToString(((zzayu)this.zzb.zzal()).zzax(), 3)};
        }
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", arr_object);
    }

    private final void zze(int v) {
        FileOutputStream fileOutputStream0;
        synchronized(this) {
            File file0 = Environment.getExternalStorageDirectory();
            if(file0 == null) {
                return;
            }
            File file1 = new File(file0, "clearcut_events.txt");
            try {
                fileOutputStream0 = new FileOutputStream(file1, true);
            }
            catch(FileNotFoundException unused_ex) {
                zze.zza("Could not find file for Clearcut");
                return;
            }
            try {
                try {
                    fileOutputStream0.write(this.zzd(v).getBytes());
                    goto label_25;
                }
                catch(IOException unused_ex) {
                }
                zze.zza("Could not write Clearcut to file.");
            }
            catch(Throwable throwable0) {
                goto label_20;
            }
            try {
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
                try {
                    zze.zza("Could not close Clearcut output stream.");
                }
                catch(FileNotFoundException unused_ex) {
                    zze.zza("Could not find file for Clearcut");
                }
            }
            return;
            try {
            label_20:
                fileOutputStream0.close();
                throw throwable0;
            }
            catch(IOException unused_ex) {
                try {
                    zze.zza("Could not close Clearcut output stream.");
                    throw throwable0;
                }
                catch(FileNotFoundException unused_ex) {
                    zze.zza("Could not find file for Clearcut");
                    return;
                }
            }
            try {
            label_25:
                fileOutputStream0.close();
                return;
            }
            catch(IOException unused_ex) {
                try {
                    zze.zza("Could not close Clearcut output stream.");
                    return;
                }
                catch(FileNotFoundException unused_ex) {
                }
            }
            zze.zza("Could not find file for Clearcut");
        }
    }

    private final void zzf(int v) {
        synchronized(this) {
            this.zzb.zzd();
            List list0 = zzs.zzd();
            this.zzb.zzc(list0);
            byte[] arr_b = ((zzayu)this.zzb.zzal()).zzax();
            zzaxj zzaxj0 = new zzaxj(this.zza, arr_b, null);
            zzaxj0.zza(v - 1);
            zzaxj0.zzc();
            zze.zza(("Logging Event with event code : " + Integer.toString(v - 1, 10)));
        }
    }
}

