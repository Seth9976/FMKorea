package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.util.Clock;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import jeb.synthetic.TWR;

public final class zzfy extends zzmo {
    public zzfy(zzmp zzmp0) {
        super(zzmp0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzmz g_() {
        return super.g_();
    }

    static byte[] zza(zzfy zzfy0, HttpURLConnection httpURLConnection0) {
        return zzfy.zza(httpURLConnection0);
    }

    private static byte[] zza(HttpURLConnection httpURLConnection0) {
        byte[] arr_b1;
        InputStream inputStream0 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            inputStream0 = httpURLConnection0.getInputStream();
            byte[] arr_b = new byte[0x400];
            int v;
            while((v = inputStream0.read(arr_b)) > 0) {
                byteArrayOutputStream0.write(arr_b, 0, v);
            }
            arr_b1 = byteArrayOutputStream0.toByteArray();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(inputStream0, throwable0);
            throw throwable0;
        }
        inputStream0.close();
        return arr_b1;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return super.zza();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return super.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zzmo
    protected final boolean zzc() {
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzae zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzaf zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzba zzf() {
        return super.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzt zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzao zzh() {
        return super.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfq zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzfr zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgd zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzgy zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzgp zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzls zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzmn zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zznd zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzt() {
        super.zzt();
    }

    public final boolean zzu() {
        this.zzak();
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.zza().getSystemService("connectivity");
        NetworkInfo networkInfo0 = null;
        if(connectivityManager0 != null) {
            try {
                networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            }
            catch(SecurityException unused_ex) {
            }
        }
        return networkInfo0 != null && networkInfo0.isConnected();
    }
}

