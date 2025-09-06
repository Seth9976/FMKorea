package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

public final class zzwp extends zzdc {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;

    @Deprecated
    public zzwp() {
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        this.zzv();
    }

    public zzwp(Context context0) {
        super.zzd(context0);
        Point point0 = zzfk.zzs(context0);
        this.zze(point0.x, point0.y, true);
        this.zzg = new SparseArray();
        this.zzh = new SparseBooleanArray();
        this.zzv();
    }

    zzwp(zzwr zzwr0, zzwo zzwo0) {
        super(zzwr0);
        this.zza = zzwr0.zzH;
        this.zzb = zzwr0.zzJ;
        this.zzc = zzwr0.zzL;
        this.zzd = zzwr0.zzQ;
        this.zze = zzwr0.zzR;
        this.zzf = zzwr0.zzT;
        SparseArray sparseArray0 = zzwr.zza(zzwr0);
        SparseArray sparseArray1 = new SparseArray();
        for(int v = 0; v < sparseArray0.size(); ++v) {
            sparseArray1.put(sparseArray0.keyAt(v), new HashMap(((Map)sparseArray0.valueAt(v))));
        }
        this.zzg = sparseArray1;
        this.zzh = zzwr.zzb(zzwr0).clone();
    }

    @Override  // com.google.android.gms.internal.ads.zzdc
    public final zzdc zze(int v, int v1, boolean z) {
        super.zze(v, v1, true);
        return this;
    }

    public final zzwp zzo(int v, boolean z) {
        if(this.zzh.get(v) == z) {
            return this;
        }
        if(z) {
            this.zzh.put(v, true);
            return this;
        }
        this.zzh.delete(v);
        return this;
    }

    private final void zzv() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
    }
}

