package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zzamw extends ThreadLocal {
    zzamw(zzamx zzamx0) {
    }

    @Override
    protected final Object initialValue() {
        return ByteBuffer.allocate(0x20);
    }
}

