package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class zzbuk implements Runnable {
    public final OutputStream zza;
    public final byte[] zzb;

    public zzbuk(OutputStream outputStream0, byte[] arr_b) {
        this.zza = outputStream0;
        this.zzb = arr_b;
    }

    @Override
    public final void run() {
        DataOutputStream dataOutputStream0;
        OutputStream outputStream0;
        try {
            try {
                outputStream0 = this.zza;
                dataOutputStream0 = null;
                dataOutputStream0 = new DataOutputStream(outputStream0);
                dataOutputStream0.writeInt(this.zzb.length);
                dataOutputStream0.write(this.zzb);
                goto label_20;
            }
            catch(IOException iOException0) {
            }
            zzcaa.zzh("Error transporting the ad response", iOException0);
            zzt.zzo().zzu(iOException0, "LargeParcelTeleporter.pipeData.1");
            if(dataOutputStream0 == null) {
                goto label_10;
            }
            goto label_12;
        }
        catch(Throwable throwable0) {
            goto label_15;
        }
    label_10:
        IOUtils.closeQuietly(outputStream0);
        return;
    label_12:
        IOUtils.closeQuietly(dataOutputStream0);
        return;
    label_15:
        if(dataOutputStream0 == null) {
            IOUtils.closeQuietly(outputStream0);
        }
        else {
            IOUtils.closeQuietly(dataOutputStream0);
        }
        throw throwable0;
    label_20:
        IOUtils.closeQuietly(dataOutputStream0);
    }
}

