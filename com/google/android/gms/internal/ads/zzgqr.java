package com.google.android.gms.internal.ads;

import java.util.List;

final class zzgqr implements zzgtl {
    private final zzgqq zza;
    private int zzb;
    private int zzc;
    private int zzd;

    private zzgqr(zzgqq zzgqq0) {
        this.zzd = 0;
        this.zza = zzgqq0;
        zzgqq0.zzc = this;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzA(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzgsp) {
            switch(this.zzb & 7) {
                case 1: {
                    do {
                        ((zzgsp)list0).zzg(this.zza.zzo());
                        if(this.zza.zzC()) {
                            return;
                        }
                        v = this.zza.zzm();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzn();
                    zzgqr.zzU(v1);
                    int v2 = this.zza.zzd();
                    do {
                        ((zzgsp)list0).zzg(this.zza.zzo());
                    }
                    while(this.zza.zzd() < v2 + v1);
                    return;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 1: {
                do {
                    list0.add(this.zza.zzo());
                    if(this.zza.zzC()) {
                        return;
                    }
                    v3 = this.zza.zzm();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzn();
                zzgqr.zzU(v4);
                int v5 = this.zza.zzd();
                do {
                    list0.add(this.zza.zzo());
                }
                while(this.zza.zzd() < v5 + v4);
                return;
            }
            default: {
                throw zzgsc.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzB(List list0) {
        int v5;
        int v2;
        if(list0 instanceof zzgrj) {
            switch(this.zzb & 7) {
                case 2: {
                    int v = this.zza.zzn();
                    zzgqr.zzT(v);
                    int v1 = this.zza.zzd();
                    do {
                        ((zzgrj)list0).zze(this.zza.zzc());
                    }
                    while(this.zza.zzd() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
            do {
                ((zzgrj)list0).zze(this.zza.zzc());
                if(this.zza.zzC()) {
                    return;
                }
                v2 = this.zza.zzm();
            }
            while(v2 == this.zzb);
            this.zzd = v2;
            return;
        }
        switch(this.zzb & 7) {
            case 2: {
                int v3 = this.zza.zzn();
                zzgqr.zzT(v3);
                int v4 = this.zza.zzd();
                do {
                    list0.add(this.zza.zzc());
                }
                while(this.zza.zzd() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzgsc.zza();
            }
        }
        do {
            list0.add(this.zza.zzc());
            if(this.zza.zzC()) {
                return;
            }
            v5 = this.zza.zzm();
        }
        while(v5 == this.zzb);
        this.zzd = v5;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    @Deprecated
    public final void zzC(List list0, zzgtt zzgtt0, zzgrc zzgrc0) {
        int v = this.zzb;
        if((v & 7) != 3) {
            throw zzgsc.zza();
        }
        while(true) {
            Object object0 = zzgtt0.zze();
            this.zzP(object0, zzgtt0, zzgrc0);
            zzgtt0.zzf(object0);
            list0.add(object0);
            if(this.zza.zzC() || this.zzd != 0) {
                break;
            }
            int v1 = this.zza.zzm();
            if(v1 != v) {
                this.zzd = v1;
                return;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzD(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzgrr) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzgrr)list0).zzh(this.zza.zzh());
                        if(this.zza.zzC()) {
                            return;
                        }
                        v = this.zza.zzm();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzn();
                    int v2 = this.zza.zzd() + v1;
                    do {
                        ((zzgrr)list0).zzh(this.zza.zzh());
                    }
                    while(this.zza.zzd() < v2);
                    this.zzR(v2);
                    return;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzh());
                    if(this.zza.zzC()) {
                        return;
                    }
                    v3 = this.zza.zzm();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzn();
                int v5 = this.zza.zzd() + v4;
                do {
                    list0.add(this.zza.zzh());
                }
                while(this.zza.zzd() < v5);
                this.zzR(v5);
                return;
            }
            default: {
                throw zzgsc.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzE(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzgsp) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzgsp)list0).zzg(this.zza.zzp());
                        if(this.zza.zzC()) {
                            return;
                        }
                        v = this.zza.zzm();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzn();
                    int v2 = this.zza.zzd() + v1;
                    do {
                        ((zzgsp)list0).zzg(this.zza.zzp());
                    }
                    while(this.zza.zzd() < v2);
                    this.zzR(v2);
                    return;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzp());
                    if(this.zza.zzC()) {
                        return;
                    }
                    v3 = this.zza.zzm();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzn();
                int v5 = this.zza.zzd() + v4;
                do {
                    list0.add(this.zza.zzp());
                }
                while(this.zza.zzd() < v5);
                this.zzR(v5);
                return;
            }
            default: {
                throw zzgsc.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzF(List list0, zzgtt zzgtt0, zzgrc zzgrc0) {
        int v = this.zzb;
        if((v & 7) != 2) {
            throw zzgsc.zza();
        }
        while(true) {
            Object object0 = zzgtt0.zze();
            this.zzQ(object0, zzgtt0, zzgrc0);
            zzgtt0.zzf(object0);
            list0.add(object0);
            if(this.zza.zzC() || this.zzd != 0) {
                break;
            }
            int v1 = this.zza.zzm();
            if(v1 != v) {
                this.zzd = v1;
                return;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzG(List list0) {
        int v5;
        int v2;
        if(list0 instanceof zzgrr) {
            switch(this.zzb & 7) {
                case 2: {
                    int v = this.zza.zzn();
                    zzgqr.zzT(v);
                    int v1 = this.zza.zzd();
                    do {
                        ((zzgrr)list0).zzh(this.zza.zzk());
                    }
                    while(this.zza.zzd() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
            do {
                ((zzgrr)list0).zzh(this.zza.zzk());
                if(this.zza.zzC()) {
                    return;
                }
                v2 = this.zza.zzm();
            }
            while(v2 == this.zzb);
            this.zzd = v2;
            return;
        }
        switch(this.zzb & 7) {
            case 2: {
                int v3 = this.zza.zzn();
                zzgqr.zzT(v3);
                int v4 = this.zza.zzd();
                do {
                    list0.add(this.zza.zzk());
                }
                while(this.zza.zzd() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzgsc.zza();
            }
        }
        do {
            list0.add(this.zza.zzk());
            if(this.zza.zzC()) {
                return;
            }
            v5 = this.zza.zzm();
        }
        while(v5 == this.zzb);
        this.zzd = v5;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzH(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzgsp) {
            switch(this.zzb & 7) {
                case 1: {
                    do {
                        ((zzgsp)list0).zzg(this.zza.zzt());
                        if(this.zza.zzC()) {
                            return;
                        }
                        v = this.zza.zzm();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzn();
                    zzgqr.zzU(v1);
                    int v2 = this.zza.zzd();
                    do {
                        ((zzgsp)list0).zzg(this.zza.zzt());
                    }
                    while(this.zza.zzd() < v2 + v1);
                    return;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 1: {
                do {
                    list0.add(this.zza.zzt());
                    if(this.zza.zzC()) {
                        return;
                    }
                    v3 = this.zza.zzm();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzn();
                zzgqr.zzU(v4);
                int v5 = this.zza.zzd();
                do {
                    list0.add(this.zza.zzt());
                }
                while(this.zza.zzd() < v5 + v4);
                return;
            }
            default: {
                throw zzgsc.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzI(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzgrr) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzgrr)list0).zzh(this.zza.zzl());
                        if(this.zza.zzC()) {
                            return;
                        }
                        v = this.zza.zzm();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzn();
                    int v2 = this.zza.zzd() + v1;
                    do {
                        ((zzgrr)list0).zzh(this.zza.zzl());
                    }
                    while(this.zza.zzd() < v2);
                    this.zzR(v2);
                    return;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzl());
                    if(this.zza.zzC()) {
                        return;
                    }
                    v3 = this.zza.zzm();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzn();
                int v5 = this.zza.zzd() + v4;
                do {
                    list0.add(this.zza.zzl());
                }
                while(this.zza.zzd() < v5);
                this.zzR(v5);
                return;
            }
            default: {
                throw zzgsc.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzJ(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzgsp) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzgsp)list0).zzg(this.zza.zzu());
                        if(this.zza.zzC()) {
                            return;
                        }
                        v = this.zza.zzm();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzn();
                    int v2 = this.zza.zzd() + v1;
                    do {
                        ((zzgsp)list0).zzg(this.zza.zzu());
                    }
                    while(this.zza.zzd() < v2);
                    this.zzR(v2);
                    return;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzu());
                    if(this.zza.zzC()) {
                        return;
                    }
                    v3 = this.zza.zzm();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzn();
                int v5 = this.zza.zzd() + v4;
                do {
                    list0.add(this.zza.zzu());
                }
                while(this.zza.zzd() < v5);
                this.zzR(v5);
                return;
            }
            default: {
                throw zzgsc.zza();
            }
        }
    }

    public final void zzK(List list0, boolean z) {
        int v1;
        int v;
        if((this.zzb & 7) != 2) {
            throw zzgsc.zza();
        }
        if(list0 instanceof zzgsi && !z) {
            do {
                ((zzgsi)list0).zzi(this.zzp());
                if(this.zza.zzC()) {
                    return;
                }
                v = this.zza.zzm();
            }
            while(v == this.zzb);
            this.zzd = v;
            return;
        }
        do {
            list0.add((z ? this.zzs() : this.zzr()));
            if(this.zza.zzC()) {
                return;
            }
            v1 = this.zza.zzm();
        }
        while(v1 == this.zzb);
        this.zzd = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzL(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzgrr) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzgrr)list0).zzh(this.zza.zzn());
                        if(this.zza.zzC()) {
                            return;
                        }
                        v = this.zza.zzm();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzn();
                    int v2 = this.zza.zzd() + v1;
                    do {
                        ((zzgrr)list0).zzh(this.zza.zzn());
                    }
                    while(this.zza.zzd() < v2);
                    this.zzR(v2);
                    return;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzn());
                    if(this.zza.zzC()) {
                        return;
                    }
                    v3 = this.zza.zzm();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzn();
                int v5 = this.zza.zzd() + v4;
                do {
                    list0.add(this.zza.zzn());
                }
                while(this.zza.zzd() < v5);
                this.zzR(v5);
                return;
            }
            default: {
                throw zzgsc.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzM(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzgsp) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzgsp)list0).zzg(this.zza.zzv());
                        if(this.zza.zzC()) {
                            return;
                        }
                        v = this.zza.zzm();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzn();
                    int v2 = this.zza.zzd() + v1;
                    do {
                        ((zzgsp)list0).zzg(this.zza.zzv());
                    }
                    while(this.zza.zzd() < v2);
                    this.zzR(v2);
                    return;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzv());
                    if(this.zza.zzC()) {
                        return;
                    }
                    v3 = this.zza.zzm();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzn();
                int v5 = this.zza.zzd() + v4;
                do {
                    list0.add(this.zza.zzv());
                }
                while(this.zza.zzd() < v5);
                this.zzR(v5);
                return;
            }
            default: {
                throw zzgsc.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final boolean zzN() {
        this.zzS(0);
        return this.zza.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final boolean zzO() {
        if(!this.zza.zzC()) {
            return this.zzb == this.zzc ? false : this.zza.zzE(this.zzb);
        }
        return false;
    }

    private final void zzP(Object object0, zzgtt zzgtt0, zzgrc zzgrc0) {
        int v1;
        try {
            v1 = this.zzc;
            this.zzc = this.zzb >>> 3 << 3 | 4;
            zzgtt0.zzh(object0, this, zzgrc0);
            if(this.zzb == this.zzc) {
                return;
            }
        }
        finally {
            this.zzc = v1;
        }
        throw zzgsc.zzg();
    }

    private final void zzQ(Object object0, zzgtt zzgtt0, zzgrc zzgrc0) {
        int v = this.zza.zzn();
        zzgqq zzgqq0 = this.zza;
        if(zzgqq0.zza >= zzgqq0.zzb) {
            throw new zzgsc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int v1 = zzgqq0.zze(v);
        ++this.zza.zza;
        zzgtt0.zzh(object0, this, zzgrc0);
        this.zza.zzz(0);
        --this.zza.zza;
        this.zza.zzA(v1);
    }

    private final void zzR(int v) {
        if(this.zza.zzd() != v) {
            throw zzgsc.zzj();
        }
    }

    private final void zzS(int v) {
        if((this.zzb & 7) != v) {
            throw zzgsc.zza();
        }
    }

    private static final void zzT(int v) {
        if((v & 3) != 0) {
            throw zzgsc.zzg();
        }
    }

    private static final void zzU(int v) {
        if((v & 7) != 0) {
            throw zzgsc.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final double zza() {
        this.zzS(1);
        return this.zza.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final float zzb() {
        this.zzS(5);
        return this.zza.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final int zzc() {
        int v = this.zzd;
        if(v != 0) {
            this.zzb = v;
            this.zzd = 0;
            return v == 0 || v == this.zzc ? 0x7FFFFFFF : v >>> 3;
        }
        v = this.zza.zzm();
        this.zzb = v;
        return v == 0 || v == this.zzc ? 0x7FFFFFFF : v >>> 3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final int zzd() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final int zze() {
        this.zzS(0);
        return this.zza.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final int zzf() {
        this.zzS(5);
        return this.zza.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final int zzg() {
        this.zzS(0);
        return this.zza.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final int zzh() {
        this.zzS(5);
        return this.zza.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final int zzi() {
        this.zzS(0);
        return this.zza.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final int zzj() {
        this.zzS(0);
        return this.zza.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final long zzk() {
        this.zzS(1);
        return this.zza.zzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final long zzl() {
        this.zzS(0);
        return this.zza.zzp();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final long zzm() {
        this.zzS(1);
        return this.zza.zzt();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final long zzn() {
        this.zzS(0);
        return this.zza.zzu();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final long zzo() {
        this.zzS(0);
        return this.zza.zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final zzgqi zzp() {
        this.zzS(2);
        return this.zza.zzw();
    }

    public static zzgqr zzq(zzgqq zzgqq0) {
        zzgqr zzgqr0 = zzgqq0.zzc;
        return zzgqr0 == null ? new zzgqr(zzgqq0) : zzgqr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final String zzr() {
        this.zzS(2);
        return this.zza.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final String zzs() {
        this.zzS(2);
        return this.zza.zzy();
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzt(Object object0, zzgtt zzgtt0, zzgrc zzgrc0) {
        this.zzS(3);
        this.zzP(object0, zzgtt0, zzgrc0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzu(Object object0, zzgtt zzgtt0, zzgrc zzgrc0) {
        this.zzS(2);
        this.zzQ(object0, zzgtt0, zzgrc0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzv(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzgpw) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzgpw)list0).zze(this.zza.zzD());
                        if(this.zza.zzC()) {
                            return;
                        }
                        v = this.zza.zzm();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzn();
                    int v2 = this.zza.zzd() + v1;
                    do {
                        ((zzgpw)list0).zze(this.zza.zzD());
                    }
                    while(this.zza.zzd() < v2);
                    this.zzR(v2);
                    return;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(Boolean.valueOf(this.zza.zzD()));
                    if(this.zza.zzC()) {
                        return;
                    }
                    v3 = this.zza.zzm();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzn();
                int v5 = this.zza.zzd() + v4;
                do {
                    list0.add(Boolean.valueOf(this.zza.zzD()));
                }
                while(this.zza.zzd() < v5);
                this.zzR(v5);
                return;
            }
            default: {
                throw zzgsc.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzw(List list0) {
        int v;
        if((this.zzb & 7) != 2) {
            throw zzgsc.zza();
        }
        do {
            list0.add(this.zzp());
            if(this.zza.zzC()) {
                return;
            }
            v = this.zza.zzm();
        }
        while(v == this.zzb);
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzx(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzgqz) {
            switch(this.zzb & 7) {
                case 1: {
                    do {
                        ((zzgqz)list0).zze(this.zza.zzb());
                        if(this.zza.zzC()) {
                            return;
                        }
                        v = this.zza.zzm();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzn();
                    zzgqr.zzU(v1);
                    int v2 = this.zza.zzd();
                    do {
                        ((zzgqz)list0).zze(this.zza.zzb());
                    }
                    while(this.zza.zzd() < v2 + v1);
                    return;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 1: {
                do {
                    list0.add(this.zza.zzb());
                    if(this.zza.zzC()) {
                        return;
                    }
                    v3 = this.zza.zzm();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzn();
                zzgqr.zzU(v4);
                int v5 = this.zza.zzd();
                do {
                    list0.add(this.zza.zzb());
                }
                while(this.zza.zzd() < v5 + v4);
                return;
            }
            default: {
                throw zzgsc.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzy(List list0) {
        int v3;
        int v;
        if(list0 instanceof zzgrr) {
            switch(this.zzb & 7) {
                case 0: {
                    do {
                        ((zzgrr)list0).zzh(this.zza.zzf());
                        if(this.zza.zzC()) {
                            return;
                        }
                        v = this.zza.zzm();
                    }
                    while(v == this.zzb);
                    this.zzd = v;
                    return;
                }
                case 2: {
                    int v1 = this.zza.zzn();
                    int v2 = this.zza.zzd() + v1;
                    do {
                        ((zzgrr)list0).zzh(this.zza.zzf());
                    }
                    while(this.zza.zzd() < v2);
                    this.zzR(v2);
                    return;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
        }
        switch(this.zzb & 7) {
            case 0: {
                do {
                    list0.add(this.zza.zzf());
                    if(this.zza.zzC()) {
                        return;
                    }
                    v3 = this.zza.zzm();
                }
                while(v3 == this.zzb);
                this.zzd = v3;
                return;
            }
            case 2: {
                int v4 = this.zza.zzn();
                int v5 = this.zza.zzd() + v4;
                do {
                    list0.add(this.zza.zzf());
                }
                while(this.zza.zzd() < v5);
                this.zzR(v5);
                return;
            }
            default: {
                throw zzgsc.zza();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgtl
    public final void zzz(List list0) {
        int v5;
        int v2;
        if(list0 instanceof zzgrr) {
            switch(this.zzb & 7) {
                case 2: {
                    int v = this.zza.zzn();
                    zzgqr.zzT(v);
                    int v1 = this.zza.zzd();
                    do {
                        ((zzgrr)list0).zzh(this.zza.zzg());
                    }
                    while(this.zza.zzd() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzgsc.zza();
                }
            }
            do {
                ((zzgrr)list0).zzh(this.zza.zzg());
                if(this.zza.zzC()) {
                    return;
                }
                v2 = this.zza.zzm();
            }
            while(v2 == this.zzb);
            this.zzd = v2;
            return;
        }
        switch(this.zzb & 7) {
            case 2: {
                int v3 = this.zza.zzn();
                zzgqr.zzT(v3);
                int v4 = this.zza.zzd();
                do {
                    list0.add(this.zza.zzg());
                }
                while(this.zza.zzd() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzgsc.zza();
            }
        }
        do {
            list0.add(this.zza.zzg());
            if(this.zza.zzC()) {
                return;
            }
            v5 = this.zza.zzm();
        }
        while(v5 == this.zzb);
        this.zzd = v5;
    }
}

