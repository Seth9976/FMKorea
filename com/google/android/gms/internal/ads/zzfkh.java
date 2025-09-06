package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzfkh {
    private final HashMap zza;
    private final HashMap zzb;
    private final HashMap zzc;
    private final HashSet zzd;
    private final HashSet zze;
    private final HashSet zzf;
    private final HashMap zzg;
    private final Map zzh;
    private boolean zzi;

    public zzfkh() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashSet();
        this.zze = new HashSet();
        this.zzf = new HashSet();
        this.zzg = new HashMap();
        this.zzh = new WeakHashMap();
    }

    public final View zza(String s) {
        return (View)this.zzc.get(s);
    }

    public final zzfkg zzb(View view0) {
        zzfkg zzfkg0 = (zzfkg)this.zzb.get(view0);
        if(zzfkg0 != null) {
            this.zzb.remove(view0);
        }
        return zzfkg0;
    }

    public final String zzc(String s) {
        return (String)this.zzg.get(s);
    }

    public final String zzd(View view0) {
        if(this.zza.size() == 0) {
            return null;
        }
        String s = (String)this.zza.get(view0);
        if(s != null) {
            this.zza.remove(view0);
        }
        return s;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzi = false;
    }

    public final void zzh() {
        this.zzi = true;
    }

    public final void zzi() {
        String s1;
        Boolean boolean0;
        zzfjh zzfjh0 = zzfjh.zza();
        if(zzfjh0 != null) {
            for(Object object0: zzfjh0.zzb()) {
                zzfit zzfit0 = (zzfit)object0;
                View view0 = zzfit0.zzf();
                if(zzfit0.zzj()) {
                    String s = zzfit0.zzh();
                    if(view0 == null) {
                        this.zzf.add(s);
                        this.zzg.put(s, "noAdView");
                    }
                    else {
                        if(view0.isAttachedToWindow()) {
                            if(view0.hasWindowFocus()) {
                                this.zzh.remove(view0);
                            }
                            else {
                                if(this.zzh.containsKey(view0)) {
                                    boolean0 = (Boolean)this.zzh.get(view0);
                                }
                                else {
                                    this.zzh.put(view0, Boolean.FALSE);
                                    boolean0 = Boolean.FALSE;
                                }
                                if(boolean0.booleanValue()) {
                                    s1 = "noWindowFocus";
                                    goto label_41;
                                }
                            }
                            HashSet hashSet0 = new HashSet();
                            View view1 = view0;
                            while(true) {
                                if(view1 != null) {
                                    String s2 = zzfkf.zzb(view1);
                                    if(s2 == null) {
                                        hashSet0.add(view1);
                                        ViewParent viewParent0 = view1.getParent();
                                        view1 = viewParent0 instanceof View ? ((View)viewParent0) : null;
                                        continue;
                                    }
                                    else {
                                        s1 = s2;
                                        break;
                                    }
                                }
                                this.zzd.addAll(hashSet0);
                                s1 = null;
                                break;
                            }
                        }
                        else {
                            s1 = "notAttached";
                        }
                    label_41:
                        if(s1 == null) {
                            this.zze.add(s);
                            this.zza.put(view0, s);
                            for(Object object1: zzfit0.zzi()) {
                                zzfjk zzfjk0 = (zzfjk)object1;
                                View view2 = (View)zzfjk0.zzb().get();
                                if(view2 != null) {
                                    zzfkg zzfkg0 = (zzfkg)this.zzb.get(view2);
                                    if(zzfkg0 == null) {
                                        zzfkg zzfkg1 = new zzfkg(zzfjk0, zzfit0.zzh());
                                        this.zzb.put(view2, zzfkg1);
                                    }
                                    else {
                                        zzfkg0.zzc(zzfit0.zzh());
                                    }
                                }
                            }
                        }
                        else {
                            if(s1 == "noWindowFocus") {
                                continue;
                            }
                            this.zzf.add(s);
                            this.zzc.put(s, view0);
                            this.zzg.put(s, s1);
                        }
                    }
                }
            }
        }
    }

    public final boolean zzj(View view0) {
        if(this.zzh.containsKey(view0)) {
            this.zzh.put(view0, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public final int zzk(View view0) {
        if(this.zzd.contains(view0)) {
            return 1;
        }
        return this.zzi ? 2 : 3;
    }
}

