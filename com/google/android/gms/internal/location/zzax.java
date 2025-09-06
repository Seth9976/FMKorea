package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzax extends zzba {
    final boolean zza;

    zzax(zzbb zzbb0, GoogleApiClient googleApiClient0, boolean z) {
        this.zza = z;
        super(googleApiClient0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) {
        if(this.zza) {
            ((zzdz)api$AnyClient0).zzy(zzbb.zza(this));
            return;
        }
        ((zzdz)api$AnyClient0).zzz(zzbb.zza(this));
    }
}

