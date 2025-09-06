package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzby;

public final class zzgm {
    final zzhf zza;

    zzgm(zzmp zzmp0) {
        this.zza = zzmp0.zzk();
    }

    final Bundle zza(String s, zzby zzby0) {
        this.zza.zzl().zzt();
        if(zzby0 == null) {
            this.zza.zzj().zzu().zza("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("package_name", s);
        try {
            Bundle bundle1 = zzby0.zza(bundle0);
            if(bundle1 == null) {
                this.zza.zzj().zzg().zza("Install Referrer Service returned a null response");
                return null;
            }
            return bundle1;
        }
        catch(Exception exception0) {
            this.zza.zzj().zzg().zza("Exception occurred while retrieving the Install Referrer", exception0.getMessage());
            return null;
        }
    }

    final boolean zza() {
        try {
            PackageManagerWrapper packageManagerWrapper0 = Wrappers.packageManager(this.zza.zza());
            if(packageManagerWrapper0 == null) {
                this.zza.zzj().zzp().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            return packageManagerWrapper0.getPackageInfo("com.android.vending", 0x80).versionCode >= 80837300;
        }
        catch(Exception exception0) {
        }
        this.zza.zzj().zzp().zza("Failed to retrieve Play Store version for Install Referrer", exception0);
        return false;
    }
}

