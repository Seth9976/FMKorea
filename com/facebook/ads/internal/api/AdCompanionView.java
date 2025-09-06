package com.facebook.ads.internal.api;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

public class AdCompanionView extends AdComponentFrameLayout {
    private AdCompanionViewApi f;

    public AdCompanionView(Context context0) {
        super(context0);
        this.initializeSelf(context0);
    }

    public AdCompanionView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.initializeSelf(context0);
    }

    public AdCompanionView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.initializeSelf(context0);
    }

    public AdCompanionViewApi getAdCompanionViewApi() {
        return this.f;
    }

    private void initializeSelf(Context context0) {
        AdCompanionViewApi adCompanionViewApi0 = DynamicLoaderFactory.makeLoader(context0).createAdCompanionViewApi();
        this.f = adCompanionViewApi0;
        this.attachAdComponentViewApi(adCompanionViewApi0);
        this.f.initialize(this);
    }
}

