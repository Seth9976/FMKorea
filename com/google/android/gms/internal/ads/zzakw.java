package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class zzakw {
    public static long zza(ByteBuffer byteBuffer0) {
        zzakw.zzg(byteBuffer0);
        return zzakw.zze(byteBuffer0, byteBuffer0.position() + 16);
    }

    public static long zzb(ByteBuffer byteBuffer0) {
        zzakw.zzg(byteBuffer0);
        return zzakw.zze(byteBuffer0, byteBuffer0.position() + 12);
    }

    static Pair zzc(RandomAccessFile randomAccessFile0) {
        if(randomAccessFile0.length() < 22L) {
            return null;
        }
        Pair pair0 = zzakw.zzf(randomAccessFile0, 0);
        return pair0 == null ? zzakw.zzf(randomAccessFile0, 0xFFFF) : pair0;
    }

    public static void zzd(ByteBuffer byteBuffer0, long v) {
        zzakw.zzg(byteBuffer0);
        int v1 = byteBuffer0.position();
        if(v < 0L || v > 0xFFFFFFFFL) {
            throw new IllegalArgumentException("uint32 value of out range: " + v);
        }
        byteBuffer0.putInt(byteBuffer0.position() + (v1 + 16), ((int)v));
    }

    private static long zze(ByteBuffer byteBuffer0, int v) {
        return ((long)byteBuffer0.getInt(v)) & 0xFFFFFFFFL;
    }

    private static Pair zzf(RandomAccessFile randomAccessFile0, int v) {
        long v1 = randomAccessFile0.length();
        if(Long.compare(v1, 22L) < 0) {
            return null;
        }
        int v2 = -1;
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(((int)Math.min(v, v1 - 22L)) + 22);
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        long v3 = v1 - ((long)byteBuffer0.capacity());
        randomAccessFile0.seek(v3);
        randomAccessFile0.readFully(byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.capacity());
        zzakw.zzg(byteBuffer0);
        int v4 = byteBuffer0.capacity();
        if(v4 >= 22) {
            int v5 = Math.min(v4 - 22, 0xFFFF);
            for(int v6 = 0; v6 < v5; ++v6) {
                int v7 = v4 - 22 - v6;
                if(byteBuffer0.getInt(v7) == 101010256 && ((char)byteBuffer0.getShort(v7 + 20)) == v6) {
                    v2 = v7;
                    break;
                }
            }
        }
        if(v2 == -1) {
            return null;
        }
        byteBuffer0.position(v2);
        ByteBuffer byteBuffer1 = byteBuffer0.slice();
        byteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBuffer1, ((long)(v3 + ((long)v2))));
    }

    private static void zzg(ByteBuffer byteBuffer0) {
        if(byteBuffer0.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}

