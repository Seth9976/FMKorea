package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class zzasq extends zzatm {
    public zzasq(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1) {
        super(zzary0, "9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", zzanv0, v, 24);
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    public final Object call() {
        this.zzl();
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        if(!this.zzb.zzq()) {
            synchronized(this.zze) {
                String s = (String)this.zzf.invoke(null, this.zzb.zzb());
                this.zze.zzs(s);
            }
            return;
        }
        this.zzc();
    }

    private final void zzc() {
        AdvertisingIdClient advertisingIdClient0 = this.zzb.zzh();
        if(advertisingIdClient0 == null) {
            return;
        }
        try {
            Info advertisingIdClient$Info0 = advertisingIdClient0.getInfo();
            String s = advertisingIdClient$Info0.getId();
            if(s != null && s.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uUID0 = UUID.fromString(s);
                byte[] arr_b = new byte[16];
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
                byteBuffer0.putLong(uUID0.getMostSignificantBits());
                byteBuffer0.putLong(uUID0.getLeastSignificantBits());
                s = zzapi.zza(arr_b, true);
            }
            if(s != null) {
                synchronized(this.zze) {
                    this.zze.zzs(s);
                    this.zze.zzr(advertisingIdClient$Info0.isLimitAdTrackingEnabled());
                    this.zze.zzab(6);
                }
            }
        }
        catch(IOException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    public final Void zzl() {
        if(this.zzb.zzr()) {
            super.zzl();
            return null;
        }
        if(this.zzb.zzq()) {
            this.zzc();
        }
        return null;
    }
}

