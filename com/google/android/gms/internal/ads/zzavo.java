package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

public final class zzavo {
    static long zza(long v, int v1) {
        if(v1 == 1) {
            return v;
        }
        return (v1 & 1) == 0 ? zzavo.zza(v * v % 0x4000FFFFL, v1 >> 1) % 0x4000FFFFL : v * (zzavo.zza(v * v % 0x4000FFFFL, v1 >> 1) % 0x4000FFFFL) % 0x4000FFFFL;
    }

    static String zzb(String[] arr_s, int v, int v1) {
        int v2 = v1 + v;
        if(arr_s.length < v2) {
            zzcaa.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        while(v < v2 - 1) {
            stringBuilder0.append(arr_s[v]);
            stringBuilder0.append(' ');
            ++v;
        }
        stringBuilder0.append(arr_s[v2 - 1]);
        return stringBuilder0.toString();
    }

    public static void zzc(String[] arr_s, int v, int v1, PriorityQueue priorityQueue0) {
        if(arr_s.length < 6) {
            zzavo.zzd(v, zzavo.zze(arr_s, 0, arr_s.length), zzavo.zzb(arr_s, 0, arr_s.length), arr_s.length, priorityQueue0);
            return;
        }
        long v2 = zzavo.zze(arr_s, 0, 6);
        zzavo.zzd(v, v2, zzavo.zzb(arr_s, 0, 6), 6, priorityQueue0);
        for(int v3 = 1; v3 < arr_s.length - 5; ++v3) {
            int v4 = zzavk.zza(arr_s[v3 - 1]);
            long v5 = (long)zzavk.zza(arr_s[v3 + 5]);
            String s = zzavo.zzb(arr_s, v3, 6);
            v2 = ((v2 + 0x4000FFFFL - zzavo.zza(0x1001FFFL, 5) * ((((long)v4) + 0x7FFFFFFFL) % 0x4000FFFFL) % 0x4000FFFFL) % 0x4000FFFFL * 0x1001FFFL % 0x4000FFFFL + (v5 + 0x7FFFFFFFL) % 0x4000FFFFL) % 0x4000FFFFL;
            zzavo.zzd(v, v2, s, arr_s.length, priorityQueue0);
        }
    }

    static void zzd(int v, long v1, String s, int v2, PriorityQueue priorityQueue0) {
        zzavn zzavn0 = new zzavn(v1, s, v2);
        if(priorityQueue0.size() == v && (((zzavn)priorityQueue0.peek()).zzc > zzavn0.zzc || ((zzavn)priorityQueue0.peek()).zza > zzavn0.zza)) {
            return;
        }
        if(priorityQueue0.contains(zzavn0)) {
            return;
        }
        priorityQueue0.add(zzavn0);
        if(priorityQueue0.size() > v) {
            priorityQueue0.poll();
        }
    }

    private static long zze(String[] arr_s, int v, int v1) {
        long v2 = (((long)zzavk.zza(arr_s[0])) + 0x7FFFFFFFL) % 0x4000FFFFL;
        for(int v3 = 1; v3 < v1; ++v3) {
            v2 = (v2 * 0x1001FFFL % 0x4000FFFFL + (((long)zzavk.zza(arr_s[v3])) + 0x7FFFFFFFL) % 0x4000FFFFL) % 0x4000FFFFL;
        }
        return v2;
    }
}

