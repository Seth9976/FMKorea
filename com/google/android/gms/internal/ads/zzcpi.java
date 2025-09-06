package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcpi implements zzauf {
    private zzcfi zza;
    private final Executor zzb;
    private final zzcou zzc;
    private final Clock zzd;
    private boolean zze;
    private boolean zzf;
    private final zzcox zzg;

    public zzcpi(Executor executor0, zzcou zzcou0, Clock clock0) {
        this.zze = false;
        this.zzf = false;
        this.zzg = new zzcox();
        this.zzb = executor0;
        this.zzc = zzcou0;
        this.zzd = clock0;
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        this.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaue0) {
        this.zzg.zza = this.zzf ? false : zzaue0.zzj;
        this.zzg.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzaue0;
        if(this.zze) {
            this.zzg();
        }
    }

    // 检测为 Lambda 实现
    final void zzd(JSONObject jSONObject0) [...]

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcfi zzcfi0) {
        this.zza = zzcfi0;
    }

    private final void zzg() {
        try {
            JSONObject jSONObject0 = this.zzc.zza(this.zzg);
            if(this.zza != null) {
                zzcph zzcph0 = () -> this.zza.zzl("AFMA_updateActiveView", jSONObject0);
                this.zzb.execute(zzcph0);
            }
        }
        catch(JSONException jSONException0) {
            zze.zzb("Failed to call video active view js", jSONException0);
        }
    }
}

