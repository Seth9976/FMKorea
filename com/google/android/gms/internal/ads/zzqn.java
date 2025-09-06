package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zzqn extends zzds {
    private static final int zzd;

    static {
        zzqn.zzd = 0x7FC00000;
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final void zze(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer1;
        int v = byteBuffer0.position();
        int v1 = byteBuffer0.limit();
        int v2 = v1 - v;
    alab1:
        switch(this.zzb.zzd) {
            case 0x20000000: {
                byteBuffer1 = this.zzj(v2 / 3 * 4);
                while(v < v1) {
                    zzqn.zzo((byteBuffer0.get(v) & 0xFF) << 8 | (byteBuffer0.get(v + 1) & 0xFF) << 16 | (byteBuffer0.get(v + 2) & 0xFF) << 24, byteBuffer1);
                    v += 3;
                }
                break;
            }
            case 0x30000000: {
                byteBuffer1 = this.zzj(v2);
                while(v < v1) {
                    zzqn.zzo(byteBuffer0.get(v) & 0xFF | (byteBuffer0.get(v + 1) & 0xFF) << 8 | (byteBuffer0.get(v + 2) & 0xFF) << 16 | (byteBuffer0.get(v + 3) & 0xFF) << 24, byteBuffer1);
                    v += 4;
                }
                break;
            }
            case 0x50000000: {
                byteBuffer1 = this.zzj(v2 / 3 * 4);
                while(v < v1) {
                    zzqn.zzo((byteBuffer0.get(v + 2) & 0xFF) << 8 | (byteBuffer0.get(v + 1) & 0xFF) << 16 | (byteBuffer0.get(v) & 0xFF) << 24, byteBuffer1);
                    v += 3;
                }
                break;
            }
            case 0x60000000: {
                byteBuffer1 = this.zzj(v2);
                while(true) {
                    if(v >= v1) {
                        break alab1;
                    }
                    zzqn.zzo(byteBuffer0.get(v + 3) & 0xFF | (byteBuffer0.get(v + 2) & 0xFF) << 8 | (byteBuffer0.get(v + 1) & 0xFF) << 16 | (byteBuffer0.get(v) & 0xFF) << 24, byteBuffer1);
                    v += 4;
                }
            }
            default: {
                throw new IllegalStateException();
            }
        }
        byteBuffer0.position(byteBuffer0.limit());
        byteBuffer1.flip();
    }

    @Override  // com.google.android.gms.internal.ads.zzds
    public final zzdp zzi(zzdp zzdp0) {
        int v = zzdp0.zzd;
        if(v != 0x20000000 && v != 0x30000000 && v != 0x50000000) {
            switch(v) {
                case 4: {
                    return zzdp.zza;
                }
                case 0x60000000: {
                    break;
                }
                default: {
                    throw new zzdq("Unhandled input format:", zzdp0);
                }
            }
        }
        return new zzdp(zzdp0.zzb, zzdp0.zzc, 4);
    }

    private static void zzo(int v, ByteBuffer byteBuffer0) {
        byteBuffer0.putInt((Float.floatToIntBits(((float)(((double)v) * 4.656613E-10))) == zzqn.zzd ? 0 : Float.floatToIntBits(((float)(((double)v) * 4.656613E-10)))));
    }
}

