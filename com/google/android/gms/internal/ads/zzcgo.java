package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzcgo {
    private static final Pattern zza;
    private static final Pattern zzb;

    static {
        zzcgo.zza = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
        zzcgo.zzb = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);
    }

    public static String zza(String s, String[] arr_s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        Matcher matcher0 = zzcgo.zza.matcher(s);
        int v = 0;
        if(matcher0.find()) {
            int v1 = matcher0.end();
            stringBuilder0.append(s.substring(0, v1));
            while(v <= 0) {
                String s1 = arr_s[v];
                if(s1 != null) {
                    stringBuilder0.append(s1);
                }
                ++v;
            }
            stringBuilder0.append(s.substring(v1));
            return stringBuilder0.toString();
        }
        if(!zzcgo.zzb.matcher(s).find()) {
            while(v <= 0) {
                String s2 = arr_s[v];
                if(s2 != null) {
                    stringBuilder0.append(s2);
                }
                ++v;
            }
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }
}

