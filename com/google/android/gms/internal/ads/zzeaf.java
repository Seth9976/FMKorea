package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzeaf implements zzffh {
    private static final Pattern zza;
    private final String zzb;
    private final zzfhg zzc;
    private final zzfhr zzd;

    static {
        zzeaf.zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    }

    public zzeaf(String s, zzfhr zzfhr0, zzfhg zzfhg0) {
        this.zzb = s;
        this.zzd = zzfhr0;
        this.zzc = zzfhg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzffh
    public final Object zza(Object object0) {
        zzdve zzdve0;
        String s2;
        int v = ((zzeae)object0).zza.optInt("http_timeout_millis", 60000);
        zzbuq zzbuq0 = ((zzeae)object0).zzb;
        String s = "";
        if(zzbuq0.zza() == -2) {
            HashMap hashMap0 = new HashMap();
            if(((zzeae)object0).zzb.zzh() && !TextUtils.isEmpty(this.zzb)) {
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzaM)).booleanValue()) {
                    String s1 = this.zzb;
                    if(TextUtils.isEmpty(s1)) {
                        s2 = "";
                    }
                    else {
                        Matcher matcher0 = zzeaf.zza.matcher(s1);
                        s2 = "";
                        while(matcher0.find()) {
                            String s3 = matcher0.group(1);
                            if(s3 != null && (s3.toLowerCase(Locale.ROOT).startsWith("id=") || s3.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if(!TextUtils.isEmpty(s2)) {
                                    s2 = s2 + "; ";
                                }
                                s2 = s2 + s3;
                            }
                        }
                    }
                    if(!TextUtils.isEmpty(s2)) {
                        hashMap0.put("Cookie", s2);
                    }
                }
                else {
                    hashMap0.put("Cookie", this.zzb);
                }
            }
            if(((zzeae)object0).zzb.zzi()) {
                zzeag.zza(hashMap0, ((zzeae)object0).zza);
            }
            if(((zzeae)object0).zzb != null && !TextUtils.isEmpty(((zzeae)object0).zzb.zzd())) {
                s = ((zzeae)object0).zzb.zzd();
            }
            this.zzc.zzf(true);
            this.zzd.zza(this.zzc);
            String s4 = ((zzeae)object0).zzb.zze();
            boolean z = ((zzeae)object0).zzb.zzi();
            return new zzeaa(s4, v, hashMap0, s.getBytes(zzfqu.zzc), "", z);
        }
        if(zzbuq0.zza() == 1) {
            if(zzbuq0.zzf() != null) {
                s = TextUtils.join(", ", zzbuq0.zzf());
                zzcaa.zzg(s);
            }
            zzdve0 = new zzdve(2, "Error building request URL: " + s);
        }
        else {
            zzdve0 = new zzdve(1);
        }
        this.zzc.zzg(zzdve0);
        this.zzc.zzf(false);
        this.zzd.zza(this.zzc);
        throw zzdve0;
    }
}

