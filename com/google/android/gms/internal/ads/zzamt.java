package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class zzamt extends zzalp {
    private final Object zza;
    private final zzalu zzb;

    public zzamt(int v, String s, zzalu zzalu0, zzalt zzalt0) {
        super(v, s, zzalt0);
        this.zza = new Object();
        this.zzb = zzalu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzalp
    protected final zzalv zzh(zzall zzall0) {
        try {
            byte[] arr_b = zzall0.zzb;
            Map map0 = zzall0.zzc;
            String s = "ISO-8859-1";
            if(map0 != null) {
                String s1 = (String)map0.get("Content-Type");
                if(s1 != null) {
                    String[] arr_s = s1.split(";", 0);
                    int v = 1;
                    while(v < arr_s.length) {
                        String[] arr_s1 = arr_s[v].trim().split("=", 0);
                        if(arr_s1.length != 2 || !arr_s1[0].equals("charset")) {
                            ++v;
                        }
                        else {
                            s = arr_s1[1];
                            if(true) {
                                break;
                            }
                        }
                    }
                }
            }
            return zzalv.zzb(new String(arr_b, s), zzamm.zzb(zzall0));
        }
        catch(UnsupportedEncodingException unused_ex) {
            return zzalv.zzb(new String(zzall0.zzb), zzamm.zzb(zzall0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzalp
    protected void zzo(Object object0) {
        this.zzz(((String)object0));
    }

    protected void zzz(String s) {
        synchronized(this.zza) {
        }
        this.zzb.zza(s);
    }
}

