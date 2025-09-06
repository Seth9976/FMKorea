package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class zzadh extends zzadj {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzadh() {
        super(new zzaba());
        this.zzb = 0x8000000000000001L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    @Override  // com.google.android.gms.internal.ads.zzadj
    protected final boolean zza(zzfb zzfb0) {
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzadj
    protected final boolean zzb(zzfb zzfb0, long v) {
        if(zzfb0.zzl() != 2) {
            return false;
        }
        if(!"onMetaData".equals(zzadh.zzi(zzfb0))) {
            return false;
        }
        if(zzfb0.zza() == 0 || zzfb0.zzl() != 8) {
            return false;
        }
        HashMap hashMap0 = zzadh.zzj(zzfb0);
        Object object0 = hashMap0.get("duration");
        if(object0 instanceof Double) {
            double f = (double)(((Double)object0));
            if(f > 0.0) {
                this.zzb = (long)(f * 1000000.0);
            }
        }
        Object object1 = hashMap0.get("keyframes");
        if(object1 instanceof Map) {
            Object object2 = ((Map)object1).get("filepositions");
            Object object3 = ((Map)object1).get("times");
            if(object2 instanceof List && object3 instanceof List) {
                int v1 = ((List)object3).size();
                this.zzc = new long[v1];
                this.zzd = new long[v1];
                int v2 = 0;
                while(v2 < v1) {
                    Object object4 = ((List)object2).get(v2);
                    Object object5 = ((List)object3).get(v2);
                    if(object5 instanceof Double && object4 instanceof Double) {
                        this.zzc[v2] = (long)(((double)(((Double)object5))) * 1000000.0);
                        this.zzd[v2] = ((Double)object4).longValue();
                        ++v2;
                    }
                    else {
                        this.zzc = new long[0];
                        this.zzd = new long[0];
                        if(true) {
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }

    private static Double zzg(zzfb zzfb0) {
        return Double.longBitsToDouble(zzfb0.zzs());
    }

    private static Object zzh(zzfb zzfb0, int v) {
        int v1 = 0;
        switch(v) {
            case 0: {
                return zzadh.zzg(zzfb0);
            }
            case 1: {
                if(zzfb0.zzl() == 1) {
                    v1 = 1;
                }
                return Boolean.valueOf(((boolean)v1));
            }
            case 2: {
                return zzadh.zzi(zzfb0);
            }
            case 3: {
                HashMap hashMap0 = new HashMap();
                while(true) {
                    String s = zzadh.zzi(zzfb0);
                    int v2 = zzfb0.zzl();
                    if(v2 == 9) {
                        break;
                    }
                    Object object0 = zzadh.zzh(zzfb0, v2);
                    if(object0 != null) {
                        hashMap0.put(s, object0);
                    }
                }
                return hashMap0;
            }
            case 8: {
                return zzadh.zzj(zzfb0);
            }
            case 10: {
                int v3 = zzfb0.zzo();
                ArrayList arrayList0 = new ArrayList(v3);
                while(v1 < v3) {
                    Object object1 = zzadh.zzh(zzfb0, zzfb0.zzl());
                    if(object1 != null) {
                        arrayList0.add(object1);
                    }
                    ++v1;
                }
                return arrayList0;
            }
            case 11: {
                Date date0 = new Date(((long)(((double)zzadh.zzg(zzfb0)))));
                zzfb0.zzH(2);
                return date0;
            }
            default: {
                return null;
            }
        }
    }

    private static String zzi(zzfb zzfb0) {
        int v = zzfb0.zzp();
        zzfb0.zzH(v);
        return new String(zzfb0.zzI(), zzfb0.zzc(), v);
    }

    private static HashMap zzj(zzfb zzfb0) {
        int v = zzfb0.zzo();
        HashMap hashMap0 = new HashMap(v);
        for(int v1 = 0; v1 < v; ++v1) {
            String s = zzadh.zzi(zzfb0);
            Object object0 = zzadh.zzh(zzfb0, zzfb0.zzl());
            if(object0 != null) {
                hashMap0.put(s, object0);
            }
        }
        return hashMap0;
    }
}

