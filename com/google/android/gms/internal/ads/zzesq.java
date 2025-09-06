package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

final class zzesq implements zzesj {
    private final zzfyo zza;
    private final Context zzb;

    public zzesq(zzfyo zzfyo0, Context context0) {
        this.zza = zzfyo0;
        this.zzb = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 38;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzesp zzesp0 = () -> {
            String s4;
            boolean z2;
            String s3;
            String s2;
            PackageManager packageManager0 = this.zzb.getPackageManager();
            Locale locale0 = Locale.getDefault();
            ResolveInfo resolveInfo0 = zzesq.zzd(packageManager0, "geo:0,0?q=donuts");
            ResolveInfo resolveInfo1 = zzesq.zzd(packageManager0, "http://www.google.com");
            String s = locale0.getCountry();
            boolean z = DeviceProperties.isLatchsky(this.zzb);
            boolean z1 = DeviceProperties.isSidewinder(this.zzb);
            String s1 = locale0.getLanguage();
            ArrayList arrayList0 = new ArrayList();
            if(Build.VERSION.SDK_INT >= 24) {
                LocaleList localeList0 = LocaleList.getDefault();
                for(int v = 0; v < localeList0.size(); ++v) {
                    arrayList0.add(localeList0.get(v).getLanguage());
                }
            }
            Context context0 = this.zzb;
            ResolveInfo resolveInfo2 = zzesq.zzd(packageManager0, "market://details?id=com.google.android.gms.ads");
            if(resolveInfo2 == null) {
                s2 = null;
            }
            else {
                ActivityInfo activityInfo0 = resolveInfo2.activityInfo;
                if(activityInfo0 == null) {
                    s2 = null;
                }
                else {
                    try {
                        PackageInfo packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(activityInfo0.packageName, 0);
                        s2 = packageInfo0 == null ? null : packageInfo0.versionCode + "." + activityInfo0.packageName;
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                        s2 = null;
                    }
                }
            }
            try {
                PackageInfo packageInfo1 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 0x80);
                s3 = null;
                if(packageInfo1 != null) {
                    s3 = packageInfo1.versionCode + "." + packageInfo1.packageName;
                }
            }
            catch(Exception unused_ex) {
            }
            Context context1 = this.zzb;
            if(packageManager0 == null) {
                z2 = false;
                s4 = s3;
            }
            else {
                z2 = false;
                s4 = s3;
                Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveInfo3 = packageManager0.resolveActivity(intent0, 0);
                List list0 = packageManager0.queryIntentActivities(intent0, 0x10000);
                if(list0 != null && resolveInfo3 != null) {
                    for(int v1 = 0; v1 < list0.size(); ++v1) {
                        ResolveInfo resolveInfo4 = (ResolveInfo)list0.get(v1);
                        if(resolveInfo3.activityInfo.name.equals(resolveInfo4.activityInfo.name)) {
                            z2 = resolveInfo3.activityInfo.packageName.equals(zzgzh.zza(context1));
                            break;
                        }
                    }
                }
            }
            long v2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes();
            boolean z3 = true;
            boolean z4 = ((Boolean)zzba.zzc().zzb(zzbbr.zzkh)).booleanValue() && zzs.zzy(this.zzb);
            if(resolveInfo0 == null) {
                z3 = false;
            }
            return new zzeso(z3, resolveInfo1 != null, s, false, z, z1, s1, arrayList0, s2, s4, "google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys", z2, Build.MODEL, v2 / 0x400L, z4);
        };
        return this.zza.zzb(zzesp0);
    }

    // 检测为 Lambda 实现
    final zzeso zzc() [...]

    private static ResolveInfo zzd(PackageManager packageManager0, String s) {
        return packageManager0.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0x10000);
    }
}

