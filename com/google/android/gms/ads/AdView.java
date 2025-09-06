package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Preconditions;

public final class AdView extends BaseAdView {
    public AdView(Context context0) {
        super(context0, 0);
        Preconditions.checkNotNull(context0, "Context cannot be null");
    }

    public AdView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0);
    }

    public AdView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v, 0);
    }

    public final VideoController zza() {
        return this.zza.zzf();
    }
}

