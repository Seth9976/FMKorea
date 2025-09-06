package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzapm {
    static boolean zza = false;
    static final CountDownLatch zzb;
    public static final int zzc;
    private static MessageDigest zzd;
    private static final Object zze;
    private static final Object zzf;

    static {
        zzapm.zze = new Object();
        zzapm.zzf = new Object();
        zzapm.zzb = new CountDownLatch(1);
    }

    static String zza(byte[] arr_b, String s) {
        Vector vector0 = zzapm.zzb(arr_b, 0xFF);
        if(vector0 != null && !vector0.isEmpty()) {
            zzape zzape0 = zzapf.zza();
            int v = vector0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                zzape0.zza(zzgqi.zzv(zzapm.zzg(((byte[])vector0.get(v1)), s, false), 0, 0x100));
            }
            byte[] arr_b1 = zzapm.zze(arr_b);
            zzape0.zzb(zzgqi.zzv(arr_b1, 0, arr_b1.length));
            return zzapi.zza(((zzapf)zzape0.zzal()).zzax(), true);
        }
        return zzapi.zza(zzapm.zzg(zzapm.zzf(0x1000).zzax(), s, true), true);
    }

    static Vector zzb(byte[] arr_b, int v) {
        if(arr_b.length <= 0) {
            return null;
        }
        int v1 = arr_b.length + 0xFE;
        Vector vector0 = new Vector();
        for(int v2 = 0; v2 < v1 / 0xFF; ++v2) {
            try {
                vector0.add(Arrays.copyOfRange(arr_b, v2 * 0xFF, (arr_b.length - v2 * 0xFF <= 0xFF ? arr_b.length : v2 * 0xFF + 0xFF)));
            }
            catch(IndexOutOfBoundsException unused_ex) {
                return null;
            }
        }
        return vector0;
    }

    static void zzc(MessageDigest messageDigest0) {
        zzapm.zzd = messageDigest0;
    }

    static void zzd() {
        synchronized(zzapm.zzf) {
            if(!zzapm.zza) {
                zzapm.zza = true;
                new Thread(new zzapl(null)).start();
            }
        }
    }

    public static byte[] zze(byte[] arr_b) {
        synchronized(zzapm.zze) {
            zzapm.zzd();
            MessageDigest messageDigest0 = null;
            try {
                if(zzapm.zzb.await(2L, TimeUnit.SECONDS)) {
                    MessageDigest messageDigest1 = zzapm.zzd;
                    if(messageDigest1 != null) {
                        messageDigest0 = messageDigest1;
                    }
                }
            }
            catch(InterruptedException unused_ex) {
            }
            if(messageDigest0 != null) {
                messageDigest0.reset();
                messageDigest0.update(arr_b);
                return zzapm.zzd.digest();
            }
        }
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    static zzaos zzf(int v) {
        zzanv zzanv0 = zzaos.zza();
        zzanv0.zzD(0x1000L);
        return (zzaos)zzanv0.zzal();
    }

    private static byte[] zzg(byte[] arr_b, String s, boolean z) {
        byte[] arr_b2;
        if(arr_b.length > (z ? 0xEF : 0xFF)) {
            arr_b = zzapm.zzf(0x1000).zzax();
        }
        if(arr_b.length < (z ? 0xEF : 0xFF)) {
            byte[] arr_b1 = new byte[(z ? 0xEF : 0xFF) - arr_b.length];
            new SecureRandom().nextBytes(arr_b1);
            arr_b2 = ByteBuffer.allocate((z ? 0xEF : 0xFF) + 1).put(((byte)arr_b.length)).put(arr_b).put(arr_b1).array();
        }
        else {
            arr_b2 = ByteBuffer.allocate((z ? 0xEF : 0xFF) + 1).put(((byte)arr_b.length)).put(arr_b).array();
        }
        if(z) {
            byte[] arr_b3 = zzapm.zze(arr_b2);
            arr_b2 = ByteBuffer.allocate(0x100).put(arr_b3).put(arr_b2).array();
        }
        byte[] arr_b4 = new byte[0x100];
        zzapn[] arr_zzapn = new zzaqm().zzcG;
        for(int v = 0; v < 12; ++v) {
            arr_zzapn[v].zza(arr_b2, arr_b4);
        }
        if(s != null && s.length() > 0) {
            if(s.length() > 0x20) {
                s = s.substring(0, 0x20);
            }
            new zzapg(s.getBytes("UTF-8")).zza(arr_b4);
        }
        return arr_b4;
    }
}

