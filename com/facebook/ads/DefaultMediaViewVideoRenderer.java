package com.facebook.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
public final class DefaultMediaViewVideoRenderer extends MediaViewVideoRenderer {
    private DefaultMediaViewVideoRendererApi mDefaultMediaViewVideoRendererApi;

    public DefaultMediaViewVideoRenderer(Context context0) {
        super(context0);
        this.initializeSelf(context0);
    }

    public DefaultMediaViewVideoRenderer(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.initializeSelf(context0);
    }

    public DefaultMediaViewVideoRenderer(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.initializeSelf(context0);
    }

    @TargetApi(21)
    public DefaultMediaViewVideoRenderer(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.initializeSelf(context0);
    }

    private void initializeSelf(Context context0) {
        DefaultMediaViewVideoRendererApi defaultMediaViewVideoRendererApi0 = DynamicLoaderFactory.makeLoader(context0).createDefaultMediaViewVideoRendererApi();
        this.mDefaultMediaViewVideoRendererApi = defaultMediaViewVideoRendererApi0;
        defaultMediaViewVideoRendererApi0.initialize(context0, this, this.getMediaViewVideoRendererApi(), 0);
    }

    @Override  // com.facebook.ads.MediaViewVideoRenderer
    public void onPrepared() {
        super.onPrepared();
        this.mDefaultMediaViewVideoRendererApi.onPrepared();
    }
}

