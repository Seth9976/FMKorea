package com.google.android.gms.internal.ads;

import android.net.Network;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class zzfnz extends zzfnn {
    private zzfry zza;
    private zzfry zzb;
    private zzfny zzc;
    private HttpURLConnection zzd;

    zzfnz() {
        this(() -> -1, () -> -1, null);
    }

    zzfnz(zzfry zzfry0, zzfry zzfry1, zzfny zzfny0) {
        this.zza = zzfry0;
        this.zzb = zzfry1;
        this.zzc = zzfny0;
    }

    @Override
    public void close() {
        zzfnz.zzs(this.zzd);
    }

    // 检测为 Lambda 实现
    static Integer zzf() [...]

    // 检测为 Lambda 实现
    static Integer zzg() [...]

    // 检测为 Lambda 实现
    static Integer zzh(int v) [...]

    // 检测为 Lambda 实现
    static Integer zzi(int v) [...]

    // 检测为 Lambda 实现
    static Integer zzj(int v) [...]

    // 检测为 Lambda 实现
    static Integer zzk(int v) [...]

    // 检测为 Lambda 实现
    static Integer zzl(int v) [...]

    public HttpURLConnection zzm() {
        ((Integer)this.zza.zza()).intValue();
        ((Integer)this.zzb.zza()).intValue();
        zzfny zzfny0 = this.zzc;
        zzfny0.getClass();
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)zzfny0.zza();
        this.zzd = httpURLConnection0;
        return httpURLConnection0;
    }

    public HttpURLConnection zzn(zzfny zzfny0, int v, int v1) {
        this.zza = () -> v;
        this.zzb = () -> v1;
        this.zzc = zzfny0;
        return this.zzm();
    }

    public HttpURLConnection zzo(Network network0, URL uRL0, int v, int v1) {
        this.zza = () -> v;
        this.zzb = () -> v1;
        this.zzc = () -> network0.openConnection(uRL0);
        return this.zzm();
    }

    // 检测为 Lambda 实现
    static URLConnection zzp(URL uRL0) [...]

    // 检测为 Lambda 实现
    static URLConnection zzq(Network network0, URL uRL0) [...]

    public URLConnection zzr(URL uRL0, int v) {
        this.zza = () -> v;
        this.zzc = () -> uRL0.openConnection();
        return this.zzm();
    }

    public static void zzs(HttpURLConnection httpURLConnection0) {
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
    }
}

