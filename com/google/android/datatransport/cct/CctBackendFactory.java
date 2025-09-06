package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import n1.d;
import n1.h;
import n1.m;

@Keep
public class CctBackendFactory implements d {
    @Override  // n1.d
    public m create(h h0) {
        return new com.google.android.datatransport.cct.d(h0.b(), h0.e(), h0.d());
    }
}

