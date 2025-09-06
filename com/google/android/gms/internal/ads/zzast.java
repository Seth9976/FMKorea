package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;

public final class zzast extends zzatm {
    private final Map zzi;
    private final View zzj;
    private final Context zzk;

    public zzast(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1, Map map0, View view0, Context context0) {
        super(zzary0, "7qOZVP58PfP3kLkbSBo98onihlohkIEpZC40FvE5nnCJ8ryn0NERK9JAnlww55zq", "SMfJnKfhfLLyTw7dzHC+3CXVRNFLWK4N2mQHKB3gm/o=", zzanv0, v, 85);
        this.zzi = map0;
        this.zzj = view0;
        this.zzk = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        long[] arr_v = {this.zzc(1), this.zzc(2)};
        long[] arr_v1 = (long[])this.zzf.invoke(null, arr_v, (this.zzk == null ? this.zzb.zzb() : this.zzk), this.zzj);
        long v = arr_v1[0];
        this.zzi.put(1, ((long)arr_v1[1]));
        long v1 = arr_v1[2];
        this.zzi.put(2, ((long)arr_v1[3]));
        synchronized(this.zze) {
            this.zze.zzv(v);
            this.zze.zzu(v1);
        }
    }

    private final long zzc(int v) {
        Integer integer0 = v;
        return this.zzi.containsKey(integer0) ? ((long)(((Long)this.zzi.get(integer0)))) : 0x8000000000000000L;
    }
}

