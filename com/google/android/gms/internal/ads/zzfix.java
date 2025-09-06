package com.google.android.gms.internal.ads;

public enum zzfix {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    private final String zzj;

    private zzfix(String s1) {
        this.zzj = s1;
    }

    @Override
    public final String toString() {
        return this.zzj;
    }
}

