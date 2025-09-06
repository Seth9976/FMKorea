package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzamx implements zzamy {
    final ThreadLocal zza;
    private static final Logger zzb;

    static {
        zzamx.zzb = Logger.getLogger("com.google.android.gms.internal.ads.zzamx");
    }

    public zzamx() {
        this.zza = new zzamw(this);
    }

    public abstract zzanb zza(String arg1, byte[] arg2, String arg3);

    @Override  // com.google.android.gms.internal.ads.zzamy
    public final zzanb zzb(zzgyf zzgyf0, zzanc zzanc0) {
        long v3;
        String s;
        long v = zzgyf0.zzb();
        ((ByteBuffer)this.zza.get()).rewind().limit(8);
        int v1;
        while((v1 = zzgyf0.zza(((ByteBuffer)this.zza.get()))) != 8) {
            if(v1 < 0) {
                zzgyf0.zze(v);
                throw new EOFException();
            }
        }
        ((ByteBuffer)this.zza.get()).rewind();
        long v2 = zzana.zze(((ByteBuffer)this.zza.get()));
        byte[] arr_b = null;
        if(Long.compare(v2, 8L) < 0 && v2 > 1L) {
            zzamx.zzb.logp(Level.SEVERE, "com.coremedia.iso.AbstractBoxParser", "parseBox", "Plausibility check failed: size < 8 (size = " + v2 + "). Stop parsing!");
            return null;
        }
        ByteBuffer byteBuffer0 = (ByteBuffer)this.zza.get();
        byte[] arr_b1 = new byte[4];
        byteBuffer0.get(arr_b1);
        try {
            s = new String(arr_b1, "ISO-8859-1");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
        if(Long.compare(v2, 1L) == 0) {
            ((ByteBuffer)this.zza.get()).limit(16);
            zzgyf0.zza(((ByteBuffer)this.zza.get()));
            ((ByteBuffer)this.zza.get()).position(8);
            v3 = zzana.zzf(((ByteBuffer)this.zza.get())) - 16L;
        }
        else {
            v3 = v2 == 0L ? zzgyf0.zzc() - zzgyf0.zzb() : v2 - 8L;
        }
        if("uuid".equals(s)) {
            ((ByteBuffer)this.zza.get()).limit(((ByteBuffer)this.zza.get()).limit() + 16);
            zzgyf0.zza(((ByteBuffer)this.zza.get()));
            arr_b = new byte[16];
            for(int v4 = ((ByteBuffer)this.zza.get()).position() - 16; v4 < ((ByteBuffer)this.zza.get()).position(); ++v4) {
                int v5 = ((ByteBuffer)this.zza.get()).position();
                arr_b[v4 - (v5 - 16)] = ((ByteBuffer)this.zza.get()).get(v4);
            }
            v3 += -16L;
        }
        zzanb zzanb0 = this.zza(s, arr_b, (zzanc0 instanceof zzanb ? ((zzanb)zzanc0).zza() : ""));
        zzanb0.zzc(zzanc0);
        ((ByteBuffer)this.zza.get()).rewind();
        zzanb0.zzb(zzgyf0, ((ByteBuffer)this.zza.get()), v3, this);
        return zzanb0;
    }
}

