package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

public final class zzfcn {
    public zzfcn() {
        try {
            zzgau.zza();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            zze.zza(("Failed to Configure Aead. " + generalSecurityException0.toString()));
            zzt.zzo().zzu(generalSecurityException0, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgqf zzgqf0 = zzgqi.zzt();
        try {
            zzfzl.zzb(zzgad.zzc(zzfzw.zza("AES128_GCM").zza()), zzfzk.zzb(zzgqf0));
        }
        catch(GeneralSecurityException | IOException generalSecurityException0) {
            zze.zza(("Failed to generate key" + generalSecurityException0.toString()));
            zzt.zzo().zzu(generalSecurityException0, "CryptoUtils.generateKey");
        }
        String s = Base64.encodeToString(zzgqf0.zzb().zzA(), 11);
        zzgqf0.zzc();
        return s;
    }

    public static final String zzb(byte[] arr_b, byte[] arr_b1, String s, zzdrc zzdrc0) {
        zzgad zzgad0 = zzfcn.zzc(s);
        if(zzgad0 == null) {
            return null;
        }
        try {
            byte[] arr_b2 = ((zzfzi)zzgad0.zze(zzghg.zza(), zzfzi.class)).zza(arr_b, arr_b1);
            zzdrc0.zza().put("ds", "1");
            return new String(arr_b2, "UTF-8");
        }
        catch(GeneralSecurityException | UnsupportedEncodingException generalSecurityException0) {
            zze.zza(("Failed to decrypt " + generalSecurityException0.toString()));
            zzt.zzo().zzu(generalSecurityException0, "CryptoUtils.decrypt");
            zzdrc0.zza().put("dsf", generalSecurityException0.toString());
            return null;
        }
    }

    private static final zzgad zzc(String s) {
        try {
            return zzfzl.zza(zzfzj.zzb(Base64.decode(s, 11)));
        }
        catch(GeneralSecurityException | IOException generalSecurityException0) {
            zze.zza(("Failed to get keysethandle" + generalSecurityException0.toString()));
            zzt.zzo().zzu(generalSecurityException0, "CryptoUtils.getHandle");
            return null;
        }
    }
}

