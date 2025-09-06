package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzflv {
    private final Context zza;
    private final Executor zzb;
    private final zzflc zzc;
    private final zzfle zzd;
    private final zzflu zze;
    private final zzflu zzf;
    private Task zzg;
    private Task zzh;

    zzflv(Context context0, Executor executor0, zzflc zzflc0, zzfle zzfle0, zzfls zzfls0, zzflt zzflt0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzflc0;
        this.zzd = zzfle0;
        this.zze = zzfls0;
        this.zzf = zzflt0;
    }

    public final zzaos zza() {
        return zzflv.zzg(this.zzg, this.zze.zza());
    }

    public final zzaos zzb() {
        return zzflv.zzg(this.zzh, this.zzf.zza());
    }

    // 检测为 Lambda 实现
    final zzaos zzc() [...]

    // 检测为 Lambda 实现
    final zzaos zzd() [...]

    public static zzflv zze(Context context0, Executor executor0, zzflc zzflc0, zzfle zzfle0) {
        zzflv zzflv0 = new zzflv(context0, executor0, zzflc0, zzfle0, new zzfls(), new zzflt());
        zzflv0.zzg = zzflv0.zzd.zzd() ? zzflv0.zzh(() -> {
            zzanv zzanv0 = zzaos.zza();
            Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(zzflv0.zza);
            String s = advertisingIdClient$Info0.getId();
            if(s != null && s.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uUID0 = UUID.fromString(s);
                byte[] arr_b = new byte[16];
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
                byteBuffer0.putLong(uUID0.getMostSignificantBits());
                byteBuffer0.putLong(uUID0.getLeastSignificantBits());
                s = Base64.encodeToString(arr_b, 11);
            }
            if(s != null) {
                zzanv0.zzs(s);
                zzanv0.zzr(advertisingIdClient$Info0.isLimitAdTrackingEnabled());
                zzanv0.zzab(6);
            }
            return (zzaos)zzanv0.zzal();
        }) : Tasks.forResult(zzflv0.zze.zza());
        zzflv0.zzh = zzflv0.zzh(() -> {
            PackageInfo packageInfo0 = zzflv0.zza.getPackageManager().getPackageInfo("com.fmkorea.m.fmk", 0);
            return zzflk.zza(zzflv0.zza, "com.fmkorea.m.fmk", Integer.toString(packageInfo0.versionCode));
        });
        return zzflv0;
    }

    // 检测为 Lambda 实现
    final void zzf(Exception exception0) [...]

    private static zzaos zzg(Task task0, zzaos zzaos0) {
        return task0.isSuccessful() ? ((zzaos)task0.getResult()) : zzaos0;
    }

    private final Task zzh(Callable callable0) {
        Task task0 = Tasks.call(this.zzb, callable0);
        zzflr zzflr0 = (Exception exception0) -> {
            if(exception0 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            this.zzc.zzc(2025, -1L, exception0);
        };
        return task0.addOnFailureListener(this.zzb, zzflr0);
    }
}

