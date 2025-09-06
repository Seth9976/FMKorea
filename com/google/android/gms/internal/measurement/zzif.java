package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

final class zzif implements zzlc {
    private final zzib zza;
    private int zzb;
    private int zzc;
    private int zzd;

    private zzif(zzib zzib0) {
        this.zzd = 0;
        zzib zzib1 = (zzib)zziz.zza(zzib0, "input");
        this.zza = zzib1;
        zzib1.zzc = this;
    }

    public static zzif zza(zzib zzib0) {
        zzif zzif0 = zzib0.zzc;
        return zzif0 == null ? new zzif(zzib0) : zzif0;
    }

    private final Object zza(zzlb zzlb0, zzik zzik0) {
        Object object0 = zzlb0.zza();
        this.zzc(object0, zzlb0, zzik0);
        zzlb0.zzc(object0);
        return object0;
    }

    private final Object zza(zzmn zzmn0, Class class0, zzik zzik0) {
        switch(zzie.zza[zzmn0.ordinal()]) {
            case 1: {
                return Boolean.valueOf(this.zzs());
            }
            case 2: {
                return this.zzp();
            }
            case 3: {
                return this.zza();
            }
            case 4: {
                return this.zze();
            }
            case 5: {
                return this.zzf();
            }
            case 6: {
                return this.zzk();
            }
            case 7: {
                return this.zzb();
            }
            case 8: {
                return this.zzg();
            }
            case 9: {
                return this.zzl();
            }
            case 10: {
                this.zzb(2);
                return this.zzb(zzkx.zza().zza(class0), zzik0);
            }
            case 11: {
                return this.zzh();
            }
            case 12: {
                return this.zzm();
            }
            case 13: {
                return this.zzi();
            }
            case 14: {
                return this.zzn();
            }
            case 15: {
                return this.zzr();
            }
            case 16: {
                return this.zzj();
            }
            case 17: {
                return this.zzo();
            }
            default: {
                throw new IllegalArgumentException("unsupported field type.");
            }
        }
    }

    private final void zza(int v) {
        if(this.zza.zzc() != v) {
            throw zzji.zzh();
        }
    }

    private final void zza(List list0, boolean z) {
        int v1;
        int v;
        if((this.zzb & 7) != 2) {
            throw zzji.zza();
        }
        if(list0 instanceof zzjp && !z) {
            do {
                ((zzjp)list0).zza(this.zzp());
                if(this.zza.zzt()) {
                    return;
                }
                v = this.zza.zzi();
            }
            while(v == this.zzb);
            this.zzd = v;
            return;
        }
        do {
            list0.add((z ? this.zzr() : this.zzq()));
            if(this.zza.zzt()) {
                return;
            }
            v1 = this.zza.zzi();
        }
        while(v1 == this.zzb);
        this.zzd = v1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final double zza() {
        this.zzb(1);
        return this.zza.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zza(Object object0, zzlb zzlb0, zzik zzik0) {
        this.zzb(3);
        this.zzc(object0, zzlb0, zzik0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zza(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzhk) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzhk)list0).zza(this.zza.zzu());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzhk)list0).zza(this.zza.zzu());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzji.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(Boolean.valueOf(this.zza.zzu()));
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(Boolean.valueOf(this.zza.zzu()));
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzji.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    @Deprecated
    public final void zza(List list0, zzlb zzlb0, zzik zzik0) {
        int v = this.zzb;
        if((v & 7) != 3) {
            throw zzji.zza();
        }
        while(true) {
            list0.add(this.zza(zzlb0, zzik0));
            if(this.zza.zzt() || this.zzd != 0) {
                break;
            }
            int v1 = this.zza.zzi();
            if(v1 != v) {
                this.zzd = v1;
                return;
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zza(Map map0, zzke zzke0, zzik zzik0) {
        this.zzb(2);
        int v = this.zza.zzj();
        int v1 = this.zza.zza(v);
        Object object0 = zzke0.zzb;
        Object object1 = zzke0.zzd;
        try {
        alab1:
            while(true) {
                while(true) {
                    int v3 = this.zzc();
                    if(v3 == 0x7FFFFFFF || this.zza.zzt()) {
                        break alab1;
                    }
                    try {
                        switch(v3) {
                            case 1: {
                                object0 = this.zza(zzke0.zza, null, null);
                                continue;
                            }
                            case 2: {
                                goto label_14;
                            }
                            default: {
                                if(this.zzt()) {
                                    continue;
                                }
                            }
                        }
                        throw new zzji("Unable to parse map entry.");
                    label_14:
                        Class class0 = zzke0.zzd.getClass();
                        object1 = this.zza(zzke0.zzc, class0, zzik0);
                        continue;
                    }
                    catch(zzjh unused_ex) {
                    }
                    break;
                }
                if(!this.zzt()) {
                    throw new zzji("Unable to parse map entry.");
                }
            }
            map0.put(object0, object1);
        }
        finally {
            this.zza.zzc(v1);
        }
    }

    private final Object zzb(zzlb zzlb0, zzik zzik0) {
        Object object0 = zzlb0.zza();
        this.zzd(object0, zzlb0, zzik0);
        zzlb0.zzc(object0);
        return object0;
    }

    private final void zzb(int v) {
        if((this.zzb & 7) != v) {
            throw zzji.zza();
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final float zzb() {
        this.zzb(5);
        return this.zza.zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzb(Object object0, zzlb zzlb0, zzik zzik0) {
        this.zzb(2);
        this.zzd(object0, zzlb0, zzik0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzb(List list0) {
        int v;
        if((this.zzb & 7) != 2) {
            throw zzji.zza();
        }
        do {
            list0.add(this.zzp());
            if(this.zza.zzt()) {
                return;
            }
            v = this.zza.zzi();
        }
        while(v == this.zzb);
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzb(List list0, zzlb zzlb0, zzik zzik0) {
        int v = this.zzb;
        if((v & 7) != 2) {
            throw zzji.zza();
        }
        while(true) {
            list0.add(this.zzb(zzlb0, zzik0));
            if(this.zza.zzt() || this.zzd != 0) {
                break;
            }
            int v1 = this.zza.zzi();
            if(v1 != v) {
                this.zzd = v1;
                return;
            }
        }
    }

    private static void zzc(int v) {
        if((v & 3) != 0) {
            throw zzji.zzg();
        }
    }

    private final void zzc(Object object0, zzlb zzlb0, zzik zzik0) {
        int v1;
        try {
            v1 = this.zzc;
            this.zzc = this.zzb >>> 3 << 3 | 4;
            zzlb0.zza(object0, this, zzik0);
            if(this.zzb == this.zzc) {
                return;
            }
        }
        finally {
            this.zzc = v1;
        }
        throw zzji.zzg();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final int zzc() {
        int v = this.zzd;
        if(v != 0) {
            this.zzb = v;
            this.zzd = 0;
            return this.zzb == 0 || this.zzb == this.zzc ? 0x7FFFFFFF : this.zzb >>> 3;
        }
        this.zzb = this.zza.zzi();
        return this.zzb == 0 || this.zzb == this.zzc ? 0x7FFFFFFF : this.zzb >>> 3;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzc(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzii) {
            switch(this.zzb & 7) {
                case 1: {
                    do {
                        ((zzii)list0).zza(this.zza.zza());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    zzif.zzd(v1);
                    int v2 = this.zza.zzc();
                    do {
                        ((zzii)list0).zza(this.zza.zza());
                    }
                    while(this.zza.zzc() < v2 + v1);
                    return;
                }
                default: {
                    throw zzji.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 1: {
                do {
                    list0.add(this.zza.zza());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                zzif.zzd(v4);
                int v5 = this.zza.zzc();
                do {
                    list0.add(this.zza.zza());
                }
                while(this.zza.zzc() < v5 + v4);
                return;
            }
            default: {
                throw zzji.zza();
            }
        }
    }

    private static void zzd(int v) {
        if((v & 7) != 0) {
            throw zzji.zzg();
        }
    }

    private final void zzd(Object object0, zzlb zzlb0, zzik zzik0) {
        int v = this.zza.zzj();
        zzib zzib0 = this.zza;
        if(zzib0.zza >= zzib0.zzb) {
            throw new zzji("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int v1 = zzib0.zza(v);
        ++this.zza.zza;
        zzlb0.zza(object0, this, zzik0);
        this.zza.zzb(0);
        --this.zza.zza;
        this.zza.zzc(v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final int zzd() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzd(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzja) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzja)list0).zzd(this.zza.zzd());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzja)list0).zzd(this.zza.zzd());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzji.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzd());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzd());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzji.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final int zze() {
        this.zzb(0);
        return this.zza.zzd();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zze(List list0) {
        int v5;
        int v2;
        if(list0 instanceof zzja) {
            switch(this.zzb & 7) {
                case 2: {
                    int v = this.zza.zzj();
                    zzif.zzc(v);
                    int v1 = this.zza.zzc();
                    do {
                        ((zzja)list0).zzd(this.zza.zze());
                    }
                    while(this.zza.zzc() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzji.zza();
                }
            }
            do {
                ((zzja)list0).zzd(this.zza.zze());
                if(this.zza.zzt()) {
                    return;
                }
                v2 = this.zza.zzi();
            }
            while(v2 == this.zzb);
            this.zzd = v2;
            return;
        }
        switch(this.zzb & 7) {
            case 2: {
                int v3 = this.zza.zzj();
                zzif.zzc(v3);
                int v4 = this.zza.zzc();
                do {
                    list0.add(this.zza.zze());
                }
                while(this.zza.zzc() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzji.zza();
            }
        }
        do {
            list0.add(this.zza.zze());
            if(this.zza.zzt()) {
                return;
            }
            v5 = this.zza.zzi();
        }
        while(v5 == this.zzb);
        this.zzd = v5;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final int zzf() {
        this.zzb(5);
        return this.zza.zze();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzf(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzjy) {
            switch(this.zzb & 7) {
                case 1: {
                    do {
                        ((zzjy)list0).zza(this.zza.zzk());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    zzif.zzd(v1);
                    int v2 = this.zza.zzc();
                    do {
                        ((zzjy)list0).zza(this.zza.zzk());
                    }
                    while(this.zza.zzc() < v2 + v1);
                    return;
                }
                default: {
                    throw zzji.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 1: {
                do {
                    list0.add(this.zza.zzk());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                zzif.zzd(v4);
                int v5 = this.zza.zzc();
                do {
                    list0.add(this.zza.zzk());
                }
                while(this.zza.zzc() < v5 + v4);
                return;
            }
            default: {
                throw zzji.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final int zzg() {
        this.zzb(0);
        return this.zza.zzf();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzg(List list0) {
        int v5;
        int v2;
        if(list0 instanceof zziw) {
            switch(this.zzb & 7) {
                case 2: {
                    int v = this.zza.zzj();
                    zzif.zzc(v);
                    int v1 = this.zza.zzc();
                    do {
                        ((zziw)list0).zza(this.zza.zzb());
                    }
                    while(this.zza.zzc() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzji.zza();
                }
            }
            do {
                ((zziw)list0).zza(this.zza.zzb());
                if(this.zza.zzt()) {
                    return;
                }
                v2 = this.zza.zzi();
            }
            while(v2 == this.zzb);
            this.zzd = v2;
            return;
        }
        switch(this.zzb & 7) {
            case 2: {
                int v3 = this.zza.zzj();
                zzif.zzc(v3);
                int v4 = this.zza.zzc();
                do {
                    list0.add(this.zza.zzb());
                }
                while(this.zza.zzc() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzji.zza();
            }
        }
        do {
            list0.add(this.zza.zzb());
            if(this.zza.zzt()) {
                return;
            }
            v5 = this.zza.zzi();
        }
        while(v5 == this.zzb);
        this.zzd = v5;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final int zzh() {
        this.zzb(5);
        return this.zza.zzg();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzh(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzja) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzja)list0).zzd(this.zza.zzf());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzja)list0).zzd(this.zza.zzf());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzji.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzf());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzf());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzji.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final int zzi() {
        this.zzb(0);
        return this.zza.zzh();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzi(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzjy) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzjy)list0).zza(this.zza.zzl());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzjy)list0).zza(this.zza.zzl());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzji.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzl());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzl());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzji.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final int zzj() {
        this.zzb(0);
        return this.zza.zzj();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzj(List list0) {
        int v5;
        int v2;
        if(list0 instanceof zzja) {
            switch(this.zzb & 7) {
                case 2: {
                    int v = this.zza.zzj();
                    zzif.zzc(v);
                    int v1 = this.zza.zzc();
                    do {
                        ((zzja)list0).zzd(this.zza.zzg());
                    }
                    while(this.zza.zzc() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzji.zza();
                }
            }
            do {
                ((zzja)list0).zzd(this.zza.zzg());
                if(this.zza.zzt()) {
                    return;
                }
                v2 = this.zza.zzi();
            }
            while(v2 == this.zzb);
            this.zzd = v2;
            return;
        }
        switch(this.zzb & 7) {
            case 2: {
                int v3 = this.zza.zzj();
                zzif.zzc(v3);
                int v4 = this.zza.zzc();
                do {
                    list0.add(this.zza.zzg());
                }
                while(this.zza.zzc() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzji.zza();
            }
        }
        do {
            list0.add(this.zza.zzg());
            if(this.zza.zzt()) {
                return;
            }
            v5 = this.zza.zzi();
        }
        while(v5 == this.zzb);
        this.zzd = v5;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final long zzk() {
        this.zzb(1);
        return this.zza.zzk();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzk(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzjy) {
            switch(this.zzb & 7) {
                case 1: {
                    do {
                        ((zzjy)list0).zza(this.zza.zzn());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    zzif.zzd(v1);
                    int v2 = this.zza.zzc();
                    do {
                        ((zzjy)list0).zza(this.zza.zzn());
                    }
                    while(this.zza.zzc() < v2 + v1);
                    return;
                }
                default: {
                    throw zzji.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 1: {
                do {
                    list0.add(this.zza.zzn());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                zzif.zzd(v4);
                int v5 = this.zza.zzc();
                do {
                    list0.add(this.zza.zzn());
                }
                while(this.zza.zzc() < v5 + v4);
                return;
            }
            default: {
                throw zzji.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final long zzl() {
        this.zzb(0);
        return this.zza.zzl();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzl(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzja) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzja)list0).zzd(this.zza.zzh());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzja)list0).zzd(this.zza.zzh());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzji.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzh());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzh());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzji.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final long zzm() {
        this.zzb(1);
        return this.zza.zzn();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzm(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzjy) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzjy)list0).zza(this.zza.zzo());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzjy)list0).zza(this.zza.zzo());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzji.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzo());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzo());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzji.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final long zzn() {
        this.zzb(0);
        return this.zza.zzo();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzn(List list0) {
        this.zza(list0, false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final long zzo() {
        this.zzb(0);
        return this.zza.zzp();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzo(List list0) {
        this.zza(list0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final zzhm zzp() {
        this.zzb(2);
        return this.zza.zzq();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzp(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzja) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzja)list0).zzd(this.zza.zzj());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzja)list0).zzd(this.zza.zzj());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzji.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzj());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzj());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzji.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final String zzq() {
        this.zzb(2);
        return this.zza.zzr();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final void zzq(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzjy) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzjy)list0).zza(this.zza.zzp());
                        if(this.zza.zzt()) {
                            return;
                        }
                        v = this.zza.zzi();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzj();
                    int v2 = this.zza.zzc() + v1;
                    do {
                        ((zzjy)list0).zza(this.zza.zzp());
                    }
                    while(this.zza.zzc() < v2);
                    this.zza(v2);
                    return;
                }
                default: {
                    throw zzji.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzp());
                    if(this.zza.zzt()) {
                        return;
                    }
                    v3 = this.zza.zzi();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzj();
                int v5 = this.zza.zzc() + v4;
                do {
                    list0.add(this.zza.zzp());
                }
                while(this.zza.zzc() < v5);
                this.zza(v5);
                return;
            }
            default: {
                throw zzji.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final String zzr() {
        this.zzb(2);
        return this.zza.zzs();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final boolean zzs() {
        this.zzb(0);
        return this.zza.zzu();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlc
    public final boolean zzt() {
        if(!this.zza.zzt()) {
            return this.zzb == this.zzc ? false : this.zza.zzd(this.zzb);
        }
        return false;
    }
}

