package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzew.zzd.zzb;
import com.google.android.gms.internal.measurement.zzew.zzd;
import com.google.android.gms.internal.measurement.zzew.zzf.zza;
import com.google.android.gms.internal.measurement.zzew.zzf;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

abstract class zzac {
    String zza;
    int zzb;
    Boolean zzc;
    Boolean zzd;
    Long zze;
    Long zzf;

    zzac(String s, int v) {
        this.zza = s;
        this.zzb = v;
    }

    static Boolean zza(double f, zzd zzew$zzd0) {
        try {
            return zzac.zza(new BigDecimal(f), zzew$zzd0, Math.ulp(f));
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    static Boolean zza(long v, zzd zzew$zzd0) {
        try {
            return zzac.zza(new BigDecimal(v), zzew$zzd0, 0.0);
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    static Boolean zza(Boolean boolean0, boolean z) {
        if(boolean0 == null) {
            return null;
        }
        return boolean0.booleanValue() == z ? false : true;
    }

    static Boolean zza(String s, zzd zzew$zzd0) {
        if(!zzmz.zzb(s)) {
            return null;
        }
        try {
            return zzac.zza(new BigDecimal(s), zzew$zzd0, 0.0);
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    private static Boolean zza(String s, zza zzew$zzf$zza0, boolean z, String s1, List list0, String s2, zzfr zzfr0) {
        if(s == null) {
            return null;
        }
        if(zzew$zzf$zza0 == zza.zzg) {
            if(list0 == null || list0.isEmpty()) {
                return null;
            }
        }
        else if(s1 == null) {
            return null;
        }
        if(!z && zzew$zzf$zza0 != zza.zzb) {
            s = s.toUpperCase(Locale.ENGLISH);
        }
        switch(zzw.zza[zzew$zzf$zza0.ordinal()]) {
            case 1: {
                if(s2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(s2, (z ? 0 : 66)).matcher(s).matches());
                }
                catch(PatternSyntaxException unused_ex) {
                    if(zzfr0 != null) {
                        zzfr0.zzu().zza("Invalid regular expression in REGEXP audience filter. expression", s2);
                    }
                    return null;
                }
            }
            case 2: {
                return Boolean.valueOf(s.startsWith(s1));
            }
            case 3: {
                return Boolean.valueOf(s.endsWith(s1));
            }
            case 4: {
                return Boolean.valueOf(s.contains(s1));
            }
            case 5: {
                return Boolean.valueOf(s.equals(s1));
            }
            case 6: {
                return list0 == null ? null : Boolean.valueOf(list0.contains(s));
            }
            default: {
                return null;
            }
        }
    }

    static Boolean zza(String s, zzf zzew$zzf0, zzfr zzfr0) {
        Preconditions.checkNotNull(zzew$zzf0);
        if(s == null) {
            return null;
        }
        if(zzew$zzf0.zzj() && zzew$zzf0.zzb() != zza.zza) {
            if(zzew$zzf0.zzb() == zza.zzg) {
                if(zzew$zzf0.zza() == 0) {
                    return null;
                }
            }
            else if(!zzew$zzf0.zzi()) {
                return null;
            }
            zza zzew$zzf$zza0 = zzew$zzf0.zzb();
            boolean z = zzew$zzf0.zzg();
            if(zzew$zzf0.zza() == 0) {
                return zzew$zzf$zza0 == zza.zzb ? zzac.zza(s, zzew$zzf$zza0, z, "", null, "", zzfr0) : zzac.zza(s, zzew$zzf$zza0, z, "", null, null, zzfr0);
            }
            List list0 = zzew$zzf0.zzf();
            if(z) {
                return zzew$zzf$zza0 == zza.zzb ? zzac.zza(s, zzew$zzf$zza0, true, "", list0, "", zzfr0) : zzac.zza(s, zzew$zzf$zza0, true, "", list0, null, zzfr0);
            }
            ArrayList arrayList0 = new ArrayList(list0.size());
            for(Object object0: list0) {
                arrayList0.add(((String)object0).toUpperCase(Locale.ENGLISH));
            }
            list0 = Collections.unmodifiableList(arrayList0);
            return zzew$zzf$zza0 == zza.zzb ? zzac.zza(s, zzew$zzf$zza0, false, "", list0, "", zzfr0) : zzac.zza(s, zzew$zzf$zza0, false, "", list0, null, zzfr0);
        }
        return null;
    }

    // 去混淆评级： 低(26)
    private static Boolean zza(BigDecimal bigDecimal0, zzd zzew$zzd0, double f) {
        Preconditions.checkNotNull(zzew$zzd0);
        if(zzew$zzd0.zzh() && zzew$zzd0.zza() != zzb.zza) {
            zzb zzew$zzd$zzb0 = zzb.zze;
            if(zzew$zzd0.zza() == zzew$zzd$zzb0) {
                if(!zzew$zzd0.zzl() || !zzew$zzd0.zzk()) {
                    return null;
                }
            }
            else if(!zzew$zzd0.zzi()) {
                return null;
            }
            return zzew$zzd0.zza() == zzew$zzd$zzb0 ? null : null;
        }
        return null;
    }

    abstract int zza();

    abstract boolean zzb();

    abstract boolean zzc();
}

