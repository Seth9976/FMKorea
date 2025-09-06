package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class zzamm {
    public static long zza(String s) {
        try {
            return zzamm.zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(s).getTime();
        }
        catch(ParseException parseException0) {
            if(!"0".equals(s) && !"-1".equals(s)) {
                zzamb.zzc(parseException0, "Unable to parse dateStr: %s, falling back to 0", new Object[]{s});
                return 0L;
            }
            zzamb.zzd("Unable to parse dateStr: %s, falling back to 0", new Object[]{s});
            return 0L;
        }
    }

    public static zzaky zzb(zzall zzall0) {
        long v8;
        long v4;
        long v3;
        boolean z;
        long v = System.currentTimeMillis();
        Map map0 = zzall0.zzc;
        if(map0 == null) {
            return null;
        }
        String s = (String)map0.get("Date");
        long v1 = s == null ? 0L : zzamm.zza(s);
        String s1 = (String)map0.get("Cache-Control");
        int v2 = 0;
        if(s1 == null) {
            z = false;
            v3 = 0L;
            v4 = 0L;
        }
        else {
            String[] arr_s = s1.split(",", 0);
            z = false;
            v3 = 0L;
            v4 = 0L;
            while(v2 < arr_s.length) {
                String s2 = arr_s[v2].trim();
                if(!s2.equals("no-cache") && !s2.equals("no-store")) {
                    if(s2.startsWith("max-age=")) {
                        try {
                            v4 = Long.parseLong(s2.substring(8));
                            ++v2;
                            continue;
                        label_19:
                            if(s2.startsWith("stale-while-revalidate=")) {
                                v3 = Long.parseLong(s2.substring(23));
                            }
                            else if(s2.equals("must-revalidate") || s2.equals("proxy-revalidate")) {
                                z = true;
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                    else {
                        goto label_19;
                    }
                    ++v2;
                    continue;
                }
                return null;
            }
            v2 = 1;
        }
        String s3 = (String)map0.get("Expires");
        long v5 = s3 == null ? 0L : zzamm.zza(s3);
        String s4 = (String)map0.get("Last-Modified");
        long v6 = s4 == null ? 0L : zzamm.zza(s4);
        long v7 = 0L;
        String s5 = (String)map0.get("ETag");
        if(v2 != 0) {
            v8 = v + v4 * 1000L;
            v7 = z ? v8 : v3 * 1000L + v8;
        }
        else if(v1 <= 0L || v5 < v1) {
            v8 = 0L;
        }
        else {
            v8 = v + (v5 - v1);
            v7 = v8;
        }
        zzaky zzaky0 = new zzaky();
        zzaky0.zza = zzall0.zzb;
        zzaky0.zzb = s5;
        zzaky0.zzf = v8;
        zzaky0.zze = v7;
        zzaky0.zzc = v1;
        zzaky0.zzd = v6;
        zzaky0.zzg = map0;
        zzaky0.zzh = zzall0.zzd;
        return zzaky0;
    }

    static String zzc(long v) {
        return zzamm.zzd("EEE, dd MMM yyyy HH:mm:ss \'GMT\'").format(new Date(v));
    }

    private static SimpleDateFormat zzd(String s) {
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(s, Locale.US);
        simpleDateFormat0.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat0;
    }
}

