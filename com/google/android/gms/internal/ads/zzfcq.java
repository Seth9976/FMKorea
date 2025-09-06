package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class zzfcq {
    private final Pattern zza;

    public zzfcq() {
        Pattern pattern0 = null;
        try {
            pattern0 = Pattern.compile(((String)zzba.zzc().zzb(zzbbr.zzgL)));
        }
        catch(PatternSyntaxException unused_ex) {
        }
        this.zza = pattern0;
    }

    public final String zza(String s) {
        Pattern pattern0 = this.zza;
        if(pattern0 != null && s != null) {
            Matcher matcher0 = pattern0.matcher(s);
            return matcher0.find() ? matcher0.group() : null;
        }
        return null;
    }
}

