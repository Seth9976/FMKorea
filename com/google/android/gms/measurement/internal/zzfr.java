package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzoc;

public final class zzfr extends zzic {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzft zzd;
    private final zzft zze;
    private final zzft zzf;
    private final zzft zzg;
    private final zzft zzh;
    private final zzft zzi;
    private final zzft zzj;
    private final zzft zzk;
    private final zzft zzl;

    zzfr(zzhf zzhf0) {
        super(zzhf0);
        this.zza = '\u0000';
        this.zzb = -1L;
        this.zzd = new zzft(this, 6, false, false);
        this.zze = new zzft(this, 6, true, false);
        this.zzf = new zzft(this, 6, false, true);
        this.zzg = new zzft(this, 5, false, false);
        this.zzh = new zzft(this, 5, true, false);
        this.zzi = new zzft(this, 5, false, true);
        this.zzj = new zzft(this, 4, false, false);
        this.zzk = new zzft(this, 3, false, false);
        this.zzl = new zzft(this, 2, false, false);
    }

    protected static Object zza(String s) {
        return s == null ? null : new zzfw(s);
    }

    private static String zza(boolean z, Object object0) {
        String s = "";
        if(object0 == null) {
            return "";
        }
        if(object0 instanceof Integer) {
            object0 = (long)(((int)(((Integer)object0))));
        }
        if(object0 instanceof Long) {
            if(!z) {
                return String.valueOf(object0);
            }
            if(Math.abs(((long)(((Long)object0)))) < 100L) {
                return String.valueOf(object0);
            }
            if(String.valueOf(object0).charAt(0) == 45) {
                s = "-";
            }
            String s1 = String.valueOf(Math.abs(((long)(((Long)object0)))));
            return s + Math.round(Math.pow(10.0, s1.length() - 1)) + "..." + s + Math.round(Math.pow(10.0, s1.length()) - 1.0);
        }
        if(object0 instanceof Boolean) {
            return String.valueOf(object0);
        }
        if(object0 instanceof Throwable) {
            StringBuilder stringBuilder0 = new StringBuilder((z ? ((Throwable)object0).getClass().getName() : ((Throwable)object0).toString()));
            String s2 = zzfr.zzb(zzhf.class.getCanonicalName());
            StackTraceElement[] arr_stackTraceElement = ((Throwable)object0).getStackTrace();
            for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                if(!stackTraceElement0.isNativeMethod()) {
                    String s3 = stackTraceElement0.getClassName();
                    if(s3 != null && zzfr.zzb(s3).equals(s2)) {
                        stringBuilder0.append(": ");
                        stringBuilder0.append(stackTraceElement0);
                        return stringBuilder0.toString();
                    }
                }
            }
            return stringBuilder0.toString();
        }
        if(object0 instanceof zzfw) {
            return zzfw.zza(((zzfw)object0));
        }
        return z ? "-" : String.valueOf(object0);
    }

    static String zza(boolean z, String s, Object object0, Object object1, Object object2) {
        String s1 = "";
        if(s == null) {
            s = "";
        }
        String s2 = zzfr.zza(z, object0);
        String s3 = zzfr.zza(z, object1);
        String s4 = zzfr.zza(z, object2);
        StringBuilder stringBuilder0 = new StringBuilder();
        if(!TextUtils.isEmpty(s)) {
            stringBuilder0.append(s);
            s1 = ": ";
        }
        String s5 = ", ";
        if(!TextUtils.isEmpty(s2)) {
            stringBuilder0.append(s1);
            stringBuilder0.append(s2);
            s1 = ", ";
        }
        if(TextUtils.isEmpty(s3)) {
            s5 = s1;
        }
        else {
            stringBuilder0.append(s1);
            stringBuilder0.append(s3);
        }
        if(!TextUtils.isEmpty(s4)) {
            stringBuilder0.append(s5);
            stringBuilder0.append(s4);
        }
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final Context zza() {
        return super.zza();
    }

    protected final void zza(int v, String s) {
        Log.println(v, this.zzy(), s);
    }

    protected final void zza(int v, boolean z, boolean z1, String s, Object object0, Object object1, Object object2) {
        if(!z && this.zza(v)) {
            this.zza(v, zzfr.zza(false, s, object0, object1, object2));
        }
        if(!z1 && v >= 5) {
            Preconditions.checkNotNull(s);
            zzgy zzgy0 = this.zzu.zzo();
            if(zzgy0 == null) {
                this.zza(6, "Scheduler not set. Not logging error/warn");
                return;
            }
            if(!zzgy0.zzae()) {
                this.zza(6, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if(v < 0) {
                v = 0;
            }
            if(v >= 9) {
                v = 8;
            }
            zzgy0.zzb(new zzfu(this, v, s, object0, object1, object2));
        }
    }

    protected final boolean zza(int v) {
        return Log.isLoggable(this.zzy(), v);
    }

    private static String zzb(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        int v = s.lastIndexOf(46);
        if(v == -1) {
            return !zzoc.zza() || !((Boolean)zzbi.zzcb.zza(null)).booleanValue() ? s : "";
        }
        return s.substring(0, v);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final Clock zzb() {
        return super.zzb();
    }

    public final zzft zzc() {
        return this.zzk;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
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

    public final zzft zzg() {
        return this.zzd;
    }

    public final zzft zzh() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfq zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfr zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgd zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgy zzl() {
        return super.zzl();
    }

    public final zzft zzm() {
        return this.zze;
    }

    public final zzft zzn() {
        return this.zzj;
    }

    @Override  // com.google.android.gms.measurement.internal.zzic
    protected final boolean zzo() {
        return false;
    }

    public final zzft zzp() {
        return this.zzl;
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

    public final zzft zzu() {
        return this.zzg;
    }

    public final zzft zzv() {
        return this.zzi;
    }

    public final zzft zzw() {
        return this.zzh;
    }

    public final String zzx() {
        if(this.zzk().zzb == null) {
            return null;
        }
        Pair pair0 = this.zzk().zzb.zza();
        return pair0 == null || pair0 == zzgd.zza ? null : pair0.second + ":" + ((String)pair0.first);
    }

    private final String zzy() {
        synchronized(this) {
            if(this.zzc == null) {
                this.zzc = this.zzu.zzw() == null ? "FA" : this.zzu.zzw();
            }
            Preconditions.checkNotNull(this.zzc);
            return this.zzc;
        }
    }
}

