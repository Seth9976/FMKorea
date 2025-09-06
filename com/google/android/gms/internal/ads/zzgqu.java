package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzgqu extends IOException {
    zzgqu() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzgqu(String s, Throwable throwable0) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + s, throwable0);
    }

    zzgqu(Throwable throwable0) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable0);
    }
}

