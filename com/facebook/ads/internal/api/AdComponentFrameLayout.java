package com.facebook.ads.internal.api;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
public abstract class AdComponentFrameLayout extends FrameLayout implements AdComponentView {
    class a implements AdComponentViewParentApi {
        final AdComponentFrameLayout f;

        @Override  // com.facebook.ads.internal.api.AdComponentView
        public void addView(View view0) {
            AdComponentFrameLayout.this.super.addView(view0);
        }

        @Override  // com.facebook.ads.internal.api.AdComponentView
        public void addView(View view0, int v) {
            AdComponentFrameLayout.this.super.addView(view0, v);
        }

        @Override  // com.facebook.ads.internal.api.AdComponentView
        public void addView(View view0, int v, int v1) {
            AdComponentFrameLayout.this.super.addView(view0, v, v1);
        }

        @Override  // com.facebook.ads.internal.api.AdComponentView
        public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            AdComponentFrameLayout.this.super.addView(view0, v, viewGroup$LayoutParams0);
        }

        @Override  // com.facebook.ads.internal.api.AdComponentView
        public void addView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            AdComponentFrameLayout.this.super.addView(view0, viewGroup$LayoutParams0);
        }

        @Override  // com.facebook.ads.internal.api.AdComponentViewParentApi
        public void bringChildToFront(View view0) {
            AdComponentFrameLayout.this.super.bringChildToFront(view0);
        }

        @Override  // com.facebook.ads.internal.api.AdComponentViewParentApi
        public void onAttachedToWindow() {
            AdComponentFrameLayout.this.super.onAttachedToWindow();
        }

        @Override  // com.facebook.ads.internal.api.AdComponentViewParentApi
        public void onDetachedFromWindow() {
            AdComponentFrameLayout.this.super.onDetachedFromWindow();
        }

        @Override  // com.facebook.ads.internal.api.AdComponentViewParentApi
        public void onMeasure(int v, int v1) {
            AdComponentFrameLayout.this.super.onMeasure(v, v1);
        }

        @Override  // com.facebook.ads.internal.api.AdComponentViewParentApi
        public void onVisibilityChanged(View view0, int v) {
            AdComponentFrameLayout.this.super.onVisibilityChanged(view0, v);
        }

        @Override  // com.facebook.ads.internal.api.AdComponentView
        public void onWindowFocusChanged(boolean z) {
            AdComponentFrameLayout.this.super.onWindowFocusChanged(z);
        }

        @Override  // com.facebook.ads.internal.api.AdComponentView
        public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            AdComponentFrameLayout.this.super.setLayoutParams(viewGroup$LayoutParams0);
        }

        @Override  // com.facebook.ads.internal.api.AdComponentViewParentApi
        public void setMeasuredDimension(int v, int v1) {
            AdComponentFrameLayout.this.super.setMeasuredDimension(v, v1);
        }
    }

    private AdComponentViewApi mAdComponentViewApi;
    private final AdComponentViewParentApi mAdComponentViewParentApi;

    public AdComponentFrameLayout(Context context0) {
        super(context0);
        this.mAdComponentViewParentApi = new a(this);
    }

    public AdComponentFrameLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.mAdComponentViewParentApi = new a(this);
    }

    public AdComponentFrameLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.mAdComponentViewParentApi = new a(this);
    }

    public AdComponentFrameLayout(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.mAdComponentViewParentApi = new a(this);
    }

    @Override  // com.facebook.ads.internal.api.AdComponentView, android.view.ViewGroup
    public void addView(View view0) {
        AdComponentViewApi adComponentViewApi0 = this.mAdComponentViewApi;
        if(adComponentViewApi0 != null) {
            adComponentViewApi0.addView(view0);
            return;
        }
        super.addView(view0);
    }

    @Override  // com.facebook.ads.internal.api.AdComponentView, android.view.ViewGroup
    public void addView(View view0, int v) {
        AdComponentViewApi adComponentViewApi0 = this.mAdComponentViewApi;
        if(adComponentViewApi0 != null) {
            adComponentViewApi0.addView(view0, v);
            return;
        }
        super.addView(view0, v);
    }

    @Override  // com.facebook.ads.internal.api.AdComponentView, android.view.ViewGroup
    public void addView(View view0, int v, int v1) {
        AdComponentViewApi adComponentViewApi0 = this.mAdComponentViewApi;
        if(adComponentViewApi0 != null) {
            adComponentViewApi0.addView(view0, v, v1);
            return;
        }
        super.addView(view0, v, v1);
    }

    @Override  // com.facebook.ads.internal.api.AdComponentView, android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        AdComponentViewApi adComponentViewApi0 = this.mAdComponentViewApi;
        if(adComponentViewApi0 != null) {
            adComponentViewApi0.addView(view0, v, viewGroup$LayoutParams0);
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // com.facebook.ads.internal.api.AdComponentView, android.view.ViewGroup
    public void addView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        AdComponentViewApi adComponentViewApi0 = this.mAdComponentViewApi;
        if(adComponentViewApi0 != null) {
            adComponentViewApi0.addView(view0, viewGroup$LayoutParams0);
            return;
        }
        super.addView(view0, viewGroup$LayoutParams0);
    }

    protected void attachAdComponentViewApi(AdComponentViewApiProvider adComponentViewApiProvider0) {
        if(DynamicLoaderFactory.isFallbackMode()) {
            return;
        }
        if(this.mAdComponentViewApi != null) {
            throw new IllegalStateException("AdComponentViewApi can\'t be attached more then once.");
        }
        adComponentViewApiProvider0.getAdComponentViewApi().onAttachedToView(this, this.mAdComponentViewParentApi);
        this.mAdComponentViewApi = adComponentViewApiProvider0.getAdComponentViewApi();
    }

    @Override  // android.view.ViewGroup
    @SuppressLint({"MissingSuperCall"})
    protected void onAttachedToWindow() {
        AdComponentViewApi adComponentViewApi0 = this.mAdComponentViewApi;
        if(adComponentViewApi0 != null) {
            adComponentViewApi0.onAttachedToWindow();
            return;
        }
        super.onAttachedToWindow();
    }

    @Override  // android.view.ViewGroup
    @SuppressLint({"MissingSuperCall"})
    protected void onDetachedFromWindow() {
        AdComponentViewApi adComponentViewApi0 = this.mAdComponentViewApi;
        if(adComponentViewApi0 != null) {
            adComponentViewApi0.onDetachedFromWindow();
            return;
        }
        super.onDetachedFromWindow();
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        AdComponentViewApi adComponentViewApi0 = this.mAdComponentViewApi;
        if(adComponentViewApi0 != null) {
            adComponentViewApi0.onMeasure(v, v1);
            return;
        }
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(View view0, int v) {
        AdComponentViewApi adComponentViewApi0 = this.mAdComponentViewApi;
        if(adComponentViewApi0 != null) {
            adComponentViewApi0.onVisibilityChanged(view0, v);
            return;
        }
        super.onVisibilityChanged(view0, v);
    }

    @Override  // com.facebook.ads.internal.api.AdComponentView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        AdComponentViewApi adComponentViewApi0 = this.mAdComponentViewApi;
        if(adComponentViewApi0 != null) {
            adComponentViewApi0.onWindowFocusChanged(z);
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override  // com.facebook.ads.internal.api.AdComponentView, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        AdComponentViewApi adComponentViewApi0 = this.mAdComponentViewApi;
        if(adComponentViewApi0 != null) {
            adComponentViewApi0.setLayoutParams(viewGroup$LayoutParams0);
            return;
        }
        super.setLayoutParams(viewGroup$LayoutParams0);
    }
}

