package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzasm extends zzatm {
    private static final zzatn zzi;
    private final Context zzj;

    static {
        zzasm.zzi = new zzatn();
    }

    public zzasm(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1, Context context0, zzano zzano0) {
        super(zzary0, "p0JEft1H0Ux+/zQoofBGK8/hHhAdN3veKIjNmetX6I2+7J67s0tf2NBKaWy11XvI", "yaxGJhC1WxugM+8EfEc/xAIuDWtPkz77G//hU7f/vWw=", zzanv0, v, 27);
        this.zzj = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        zzapj zzapj2;
        AtomicReference atomicReference0 = zzasm.zzi.zza("com.fmkorea.m.fmk");
        synchronized(atomicReference0) {
            zzapj zzapj0 = (zzapj)atomicReference0.get();
            if(zzapj0 == null || zzasb.zzd(zzapj0.zza) || zzapj0.zza.equals("E") || zzapj0.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                Boolean boolean0 = (Boolean)zzba.zzc().zzb(zzbbr.zzci);
                String s = ((Boolean)zzba.zzc().zzb(zzbbr.zzch)).booleanValue() ? this.zzb() : null;
                if(boolean0.booleanValue() && this.zzb.zzp() && zzasb.zzd(s)) {
                    s = this.zzc();
                }
                zzapj zzapj1 = new zzapj(((String)this.zzf.invoke(null, this.zzj, Boolean.TRUE, s)));
                boolean z = !zzasb.zzd(zzapj1.zza) && !zzapj1.zza.equals("E");
                atomicReference0.set(zzapj1);
            }
            zzapj2 = (zzapj)atomicReference0.get();
        }
        synchronized(this.zze) {
            if(zzapj2 != null) {
                this.zze.zzx(zzapj2.zza);
                this.zze.zzX(zzapj2.zzb);
                this.zze.zzZ(zzapj2.zzc);
                this.zze.zzi(zzapj2.zzd);
                this.zze.zzw(zzapj2.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory0 = CertificateFactory.getInstance("X.509");
            byte[] arr_b = zzasb.zzf(((String)zzba.zzc().zzb(zzbbr.zzcj)));
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(certificateFactory0.generateCertificate(new ByteArrayInputStream(arr_b)));
            if(!Build.TYPE.equals("user")) {
                arrayList0.add(certificateFactory0.generateCertificate(new ByteArrayInputStream(zzasb.zzf(((String)zzba.zzc().zzb(zzbbr.zzck))))));
            }
            Context context0 = this.zzj;
            if(Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
                zzfyw zzfyw0 = zzfyw.zze();
                context0.getPackageManager().requestChecksums("com.fmkorea.m.fmk", false, 8, arrayList0, new zzato(zzfyw0));
                return (String)zzfyw0.get();
            }
        }
        catch(CertificateEncodingException | PackageManager.NameNotFoundException | ExecutionException | InterruptedException | CertificateException | NoClassDefFoundError unused_ex) {
        }
        return null;
    }

    private final String zzc() {
        try {
            if(this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaos zzaos0 = this.zzb.zzc();
            if(zzaos0 != null && zzaos0.zzaj()) {
                return "";
            }
        }
        catch(InterruptedException | ExecutionException unused_ex) {
        }
        return null;
    }
}

