package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class zzflb implements Continuation {
    public final zzanh zza;
    public final int zzb;

    public zzflb(zzanh zzanh0, int v) {
        this.zza = zzanh0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        zzanh zzanh0 = this.zza;
        int v = this.zzb;
        if(task0.isSuccessful()) {
            zzfnd zzfnd0 = ((zzfne)task0.getResult()).zza(((zzanl)zzanh0.zzal()).zzax());
            zzfnd0.zza(v);
            zzfnd0.zzc();
            return true;
        }
        return false;
    }
}

