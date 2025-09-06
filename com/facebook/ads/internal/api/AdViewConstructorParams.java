package com.facebook.ads.internal.api;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;

@Keep
public class AdViewConstructorParams {
    public static final int CONTEXT = 0;
    public static final int CONTEXT_ATTRS = 1;
    public static final int CONTEXT_ATTRS_STYLE_ATTR = 2;
    public static final int CONTEXT_ATTRS_STYLE_ATTR_STYLE_RES = 3;
    private final AttributeSet mAttributeSet;
    private final Context mContext;
    private final int mDefStyleAttr;
    private final int mDefStyleRes;
    private final int mInitializationType;

    public AdViewConstructorParams(Context context0) {
        this.mInitializationType = 0;
        this.mContext = context0;
        this.mAttributeSet = null;
        this.mDefStyleAttr = 0;
        this.mDefStyleRes = 0;
    }

    public AdViewConstructorParams(Context context0, AttributeSet attributeSet0) {
        this.mInitializationType = 1;
        this.mContext = context0;
        this.mAttributeSet = attributeSet0;
        this.mDefStyleAttr = 0;
        this.mDefStyleRes = 0;
    }

    public AdViewConstructorParams(Context context0, AttributeSet attributeSet0, int v) {
        this.mInitializationType = 2;
        this.mContext = context0;
        this.mAttributeSet = attributeSet0;
        this.mDefStyleAttr = v;
        this.mDefStyleRes = 0;
    }

    public AdViewConstructorParams(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.mInitializationType = 3;
        this.mContext = context0;
        this.mAttributeSet = attributeSet0;
        this.mDefStyleAttr = v;
        this.mDefStyleRes = v1;
    }

    public AttributeSet getAttributeSet() {
        return this.mAttributeSet;
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getDefStyleAttr() {
        return this.mDefStyleAttr;
    }

    public int getDefStyleRes() {
        return this.mDefStyleRes;
    }

    public int getInitializationType() {
        return this.mInitializationType;
    }
}

