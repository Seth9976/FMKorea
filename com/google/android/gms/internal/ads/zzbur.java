package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

public final class zzbur {
    private int zzA;
    private final String zzB;
    private boolean zzC;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private double zzm;
    private boolean zzn;
    private String zzo;
    private String zzp;
    private final boolean zzq;
    private final boolean zzr;
    private final String zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final String zzw;
    private final String zzx;
    private float zzy;
    private int zzz;

    public zzbur(Context context0) {
        String s1;
        PackageManager packageManager0 = context0.getPackageManager();
        zzbbr.zza(context0);
        this.zzc(context0);
        this.zze(context0);
        this.zzd(context0);
        Locale locale0 = Locale.getDefault();
        boolean z = true;
        this.zzq = zzbur.zzb(packageManager0, "geo:0,0?q=donuts") != null;
        if(zzbur.zzb(packageManager0, "http://www.google.com") == null) {
            z = false;
        }
        this.zzr = z;
        this.zzs = locale0.getCountry();
        this.zzt = false;
        this.zzu = DeviceProperties.isLatchsky(context0);
        this.zzv = DeviceProperties.isSidewinder(context0);
        this.zzw = locale0.getLanguage();
        ResolveInfo resolveInfo0 = zzbur.zzb(packageManager0, "market://details?id=com.google.android.gms.ads");
        String s = null;
        if(resolveInfo0 == null) {
            s1 = null;
        }
        else {
            ActivityInfo activityInfo0 = resolveInfo0.activityInfo;
            if(activityInfo0 == null) {
                s1 = null;
            }
            else {
                try {
                    PackageInfo packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(activityInfo0.packageName, 0);
                    s1 = packageInfo0 == null ? null : packageInfo0.versionCode + "." + activityInfo0.packageName;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    s1 = null;
                }
            }
        }
        try {
            this.zzx = s1;
            PackageInfo packageInfo1 = Wrappers.packageManager(context0).getPackageInfo("com.android.vending", 0x80);
            if(packageInfo1 != null) {
                s = packageInfo1.versionCode + "." + packageInfo1.packageName;
            }
        }
        catch(Exception unused_ex) {
        }
        this.zzB = s;
        Resources resources0 = context0.getResources();
        if(resources0 == null) {
            return;
        }
        DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
        if(displayMetrics0 == null) {
            return;
        }
        this.zzy = displayMetrics0.density;
        this.zzz = displayMetrics0.widthPixels;
        this.zzA = displayMetrics0.heightPixels;
    }

    public zzbur(Context context0, zzbus zzbus0) {
        zzbbr.zza(context0);
        this.zzc(context0);
        this.zze(context0);
        this.zzd(context0);
        this.zzo = "google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys";
        this.zzp = Build.DEVICE;
        this.zzC = zzbcs.zzg(context0);
        this.zzq = zzbus0.zza;
        this.zzr = zzbus0.zzb;
        this.zzs = zzbus0.zzd;
        this.zzt = zzbus0.zze;
        this.zzu = zzbus0.zzf;
        this.zzv = zzbus0.zzg;
        this.zzw = zzbus0.zzh;
        this.zzx = zzbus0.zzi;
        this.zzB = zzbus0.zzj;
        this.zzy = zzbus0.zzm;
        this.zzz = zzbus0.zzn;
        this.zzA = zzbus0.zzo;
    }

    public final zzbus zza() {
        return new zzbus(this.zza, this.zzq, this.zzr, this.zzg, this.zzs, this.zzt, this.zzu, this.zzv, this.zzb, this.zzc, this.zzw, this.zzx, this.zzB, this.zzd, this.zzh, this.zzi, this.zzj, this.zze, this.zzf, this.zzy, this.zzz, this.zzA, this.zzm, this.zzn, this.zzk, this.zzl, this.zzo, this.zzC, this.zzp);
    }

    private static ResolveInfo zzb(PackageManager packageManager0, String s) {
        try {
            return packageManager0.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0x10000);
        }
        catch(Throwable throwable0) {
            zzt.zzo().zzu(throwable0, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void zzc(Context context0) {
        AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
        if(audioManager0 != null) {
            try {
                this.zza = audioManager0.getMode();
                this.zzb = audioManager0.isMusicActive();
                this.zzc = audioManager0.isSpeakerphoneOn();
                this.zzd = audioManager0.getStreamVolume(3);
                this.zze = audioManager0.getRingerMode();
                this.zzf = audioManager0.getStreamVolume(2);
                return;
            }
            catch(Throwable throwable0) {
                zzt.zzo().zzu(throwable0, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zza = -2;
        this.zzb = false;
        this.zzc = false;
        this.zzd = 0;
        this.zze = 2;
        this.zzf = 0;
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final void zzd(Context context0) {
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intent0 = !((Boolean)zzba.zzc().zzb(zzbbr.zzjT)).booleanValue() || Build.VERSION.SDK_INT < 33 ? context0.registerReceiver(null, intentFilter0) : context0.registerReceiver(null, intentFilter0, 4);
        boolean z = false;
        if(intent0 != null) {
            int v = intent0.getIntExtra("status", -1);
            this.zzm = (double)(((float)intent0.getIntExtra("level", -1)) / ((float)intent0.getIntExtra("scale", -1)));
            if(v == 2 || v == 5) {
                z = true;
            }
            this.zzn = z;
            return;
        }
        this.zzm = -1.0;
        this.zzn = false;
    }

    private final void zze(Context context0) {
        TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
        this.zzg = telephonyManager0.getNetworkOperator();
        this.zzi = ((Boolean)zzba.zzc().zzb(zzbbr.zzig)).booleanValue() ? 0 : telephonyManager0.getNetworkType();
        this.zzj = telephonyManager0.getPhoneType();
        this.zzh = -2;
        this.zzk = false;
        this.zzl = -1;
        if(zzs.zzx(context0, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            if(networkInfo0 == null) {
                this.zzh = -1;
            }
            else {
                this.zzh = networkInfo0.getType();
                this.zzl = networkInfo0.getDetailedState().ordinal();
            }
            this.zzk = connectivityManager0.isActiveNetworkMetered();
        }
    }
}

