package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import androidx.core.content.a;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class zzba extends zzic {
    private long zza;
    private String zzb;
    private AccountManager zzc;
    private Boolean zzd;
    private long zze;

    zzba(zzhf zzhf0) {
        super(zzhf0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final Context zza() {
        return super.zza();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final Clock zzb() {
        return super.zzb();
    }

    final long zzc() {
        this.zzt();
        return this.zze;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
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

    public final long zzg() {
        this.zzab();
        return this.zza;
    }

    public final String zzh() {
        this.zzab();
        return this.zzb;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfq zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfr zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgd zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgy zzl() {
        return super.zzl();
    }

    final void zzm() {
        this.zzt();
        this.zzd = null;
        this.zze = 0L;
    }

    final boolean zzn() {
        this.zzt();
        long v = this.zzb().currentTimeMillis();
        if(Long.compare(v - this.zze, 86400000L) > 0) {
            this.zzd = null;
        }
        Boolean boolean0 = this.zzd;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        if(a.checkSelfPermission(this.zza(), "android.permission.GET_ACCOUNTS") != 0) {
            this.zzj().zzw().zza("Permission error checking for dasher/unicorn accounts");
            this.zze = v;
            this.zzd = Boolean.FALSE;
            return false;
        }
        if(this.zzc == null) {
            this.zzc = AccountManager.get(this.zza());
        }
        try {
            Account[] arr_account = (Account[])this.zzc.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            if(arr_account != null && arr_account.length > 0) {
                this.zzd = Boolean.TRUE;
                this.zze = v;
                return true;
            }
            Account[] arr_account1 = (Account[])this.zzc.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if(arr_account1 != null && arr_account1.length > 0) {
                this.zzd = Boolean.TRUE;
                this.zze = v;
                return true;
            }
        }
        catch(AuthenticatorException | IOException | OperationCanceledException authenticatorException0) {
            this.zzj().zzm().zza("Exception checking account types", authenticatorException0);
        }
        this.zze = v;
        this.zzd = Boolean.FALSE;
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzic
    protected final boolean zzo() {
        Calendar calendar0 = Calendar.getInstance();
        this.zza = TimeUnit.MINUTES.convert(((long)(calendar0.get(15) + calendar0.get(16))), TimeUnit.MILLISECONDS);
        Locale locale0 = Locale.getDefault();
        String s = locale0.getLanguage();
        Locale locale1 = Locale.ENGLISH;
        this.zzb = s.toLowerCase(locale1) + "-" + locale0.getCountry().toLowerCase(locale1);
        return false;
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
}

