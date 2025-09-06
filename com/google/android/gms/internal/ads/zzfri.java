package com.google.android.gms.internal.ads;

public final class zzfri {
    public static int zza(int v, int v1, String s) {
        String s1;
        if(v >= 0 && v < v1) {
            return v;
        }
        if(v >= 0) {
            if(v1 < 0) {
                throw new IllegalArgumentException("negative size: " + v1);
            }
            s1 = zzfrx.zzb("%s (%s) must be less than size (%s)", new Object[]{"index", v, v1});
        }
        else {
            s1 = zzfrx.zzb("%s (%s) must not be negative", new Object[]{"index", v});
        }
        throw new IndexOutOfBoundsException(s1);
    }

    public static int zzb(int v, int v1, String s) {
        if(v < 0 || v > v1) {
            throw new IndexOutOfBoundsException(zzfri.zzk(v, v1, "index"));
        }
        return v;
    }

    public static Object zzc(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException(((String)object1));
        }
        return object0;
    }

    public static Object zzd(Object object0, String s, Object object1) {
        if(object0 == null) {
            throw new NullPointerException(zzfrx.zzb(s, new Object[]{object1}));
        }
        return object0;
    }

    public static void zze(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(((String)object0));
        }
    }

    public static void zzg(boolean z, String s, long v) {
        if(!z) {
            throw new IllegalArgumentException(zzfrx.zzb(s, new Object[]{v}));
        }
    }

    public static void zzh(int v, int v1, int v2) {
        String s;
        if(v >= 0 && v1 >= v && v1 <= v2) {
            return;
        }
        if(v < 0 || v > v2) {
            s = zzfri.zzk(v, v2, "start index");
        }
        else if(v1 >= 0 && v1 <= v2) {
            s = zzfrx.zzb("end index (%s) must not be less than start index (%s)", new Object[]{v1, v});
        }
        else {
            s = zzfri.zzk(v1, v2, "end index");
        }
        throw new IndexOutOfBoundsException(s);
    }

    public static void zzi(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }

    public static void zzj(boolean z, Object object0) {
        if(!z) {
            throw new IllegalStateException(((String)object0));
        }
    }

    private static String zzk(int v, int v1, String s) {
        if(v < 0) {
            return zzfrx.zzb("%s (%s) must not be negative", new Object[]{s, v});
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("negative size: " + v1);
        }
        return zzfrx.zzb("%s (%s) must not be greater than size (%s)", new Object[]{s, v, v1});
    }
}

