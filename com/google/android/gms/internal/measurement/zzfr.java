package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import jeb.synthetic.TWR;

public class zzfr {
    public interface zza {
        Map zza(int arg1);
    }

    public interface zzb {
    }

    public static final Uri zza;
    public static final Pattern zzb;
    public static final Pattern zzc;
    private static final Uri zzd;
    private static final AtomicBoolean zze;
    private static ContentResolver zzf;
    private static zzb zzg;
    private static HashMap zzh;
    private static final HashMap zzi;
    private static final HashMap zzj;
    private static final HashMap zzk;
    private static final HashMap zzl;
    private static Object zzm;
    private static boolean zzn;
    private static String[] zzo;

    static {
        zzfr.zza = Uri.parse("content://com.google.android.gsf.gservices");
        zzfr.zzd = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        zzfr.zzb = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        zzfr.zzc = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        zzfr.zze = new AtomicBoolean();
        zzfr.zzf = null;
        zzfr.zzg = null;
        zzfr.zzi = new HashMap(16, 1.0f);
        zzfr.zzj = new HashMap(16, 1.0f);
        zzfr.zzk = new HashMap(16, 1.0f);
        zzfr.zzl = new HashMap(16, 1.0f);
        zzfr.zzo = new String[0];
    }

    public static String zza(ContentResolver contentResolver0, String s, String s1) {
        Object object0;
        String s5;
        synchronized(zzfr.class) {
            String s2 = null;
            if(zzfr.zzh == null) {
                zzfr.zze.set(false);
                zzfr.zzh = new HashMap(16, 1.0f);
                zzfr.zzm = new Object();
                zzfr.zzn = false;
                zzfu zzfu0 = new zzfu(null);
                contentResolver0.registerContentObserver(zzfr.zza, true, zzfu0);
            }
            else if(zzfr.zze.getAndSet(false)) {
                zzfr.zzh.clear();
                zzfr.zzi.clear();
                zzfr.zzj.clear();
                zzfr.zzk.clear();
                zzfr.zzl.clear();
                zzfr.zzm = new Object();
                zzfr.zzn = false;
            }
            object0 = zzfr.zzm;
            if(zzfr.zzh.containsKey(s)) {
                String s3 = (String)zzfr.zzh.get(s);
                if(s3 != null) {
                    s2 = s3;
                }
                return s2;
            }
            String[] arr_s = zzfr.zzo;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(s.startsWith(arr_s[v1])) {
                    if(!zzfr.zzn) {
                        HashMap hashMap0 = (HashMap)zzfr.zza(contentResolver0, zzfr.zzo, new zzft());
                        if(hashMap0 != null) {
                            if(!hashMap0.isEmpty()) {
                                Set set0 = hashMap0.keySet();
                                set0.removeAll(zzfr.zzi.keySet());
                                set0.removeAll(zzfr.zzj.keySet());
                                set0.removeAll(zzfr.zzk.keySet());
                                set0.removeAll(zzfr.zzl.keySet());
                            }
                            if(!hashMap0.isEmpty()) {
                                if(zzfr.zzh.isEmpty()) {
                                    zzfr.zzh = hashMap0;
                                }
                                else {
                                    zzfr.zzh.putAll(hashMap0);
                                }
                            }
                            zzfr.zzn = true;
                        }
                        if(zzfr.zzh.containsKey(s)) {
                            String s4 = (String)zzfr.zzh.get(s);
                            if(s4 != null) {
                                s2 = s4;
                            }
                            return s2;
                        }
                    }
                    return null;
                }
            }
        }
        Cursor cursor0 = contentResolver0.query(zzfr.zza, null, null, new String[]{s}, null);
        if(cursor0 == null) {
            return null;
        }
        try {
            if(!cursor0.moveToFirst()) {
                zzfr.zza(object0, s, null);
                goto label_64;
            }
            goto label_66;
        }
        catch(Throwable throwable0) {
            goto label_69;
        }
    label_64:
        cursor0.close();
        return null;
        try {
        label_66:
            s5 = cursor0.getString(1);
        }
        catch(Throwable throwable0) {
        label_69:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        if(s5 != null && s5.equals(null)) {
            s5 = null;
        }
        zzfr.zza(object0, s, s5);
        return s5 == null ? null : s5;
    }

    private static Map zza(ContentResolver contentResolver0, String[] arr_s, zza zzfr$zza0) {
        Cursor cursor0 = contentResolver0.query(zzfr.zzd, null, null, arr_s, null);
        if(cursor0 == null) {
            return null;
        }
        Map map0 = zzfr$zza0.zza(cursor0.getCount());
        while(true) {
            try {
                if(!cursor0.moveToNext()) {
                    break;
                }
                map0.put(cursor0.getString(0), cursor0.getString(1));
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        }
        cursor0.close();
        return map0;
    }

    private static void zza(Object object0, String s, String s1) {
        synchronized(zzfr.class) {
            if(object0 == zzfr.zzm) {
                zzfr.zzh.put(s, s1);
            }
        }
    }
}

