package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

public final class zzaml implements zzakz {
    private final Map zza;
    private long zzb;
    private final zzamk zzc;
    private final int zzd;

    public zzaml(zzamk zzamk0, int v) {
        this.zza = new LinkedHashMap(16, 0.75f, true);
        this.zzb = 0L;
        this.zzc = zzamk0;
        this.zzd = 0x500000;
    }

    public zzaml(File file0, int v) {
        this.zza = new LinkedHashMap(16, 0.75f, true);
        this.zzb = 0L;
        this.zzc = new zzamh(this, file0);
        this.zzd = 0x1400000;
    }

    @Override  // com.google.android.gms.internal.ads.zzakz
    public final zzaky zza(String s) {
        zzaky zzaky0;
        zzami zzami1;
        zzamj zzamj0;
        synchronized(this) {
            zzami zzami0 = (zzami)this.zza.get(s);
            if(zzami0 == null) {
                return null;
            }
            File file0 = this.zzg(s);
            try {
                zzamj0 = new zzamj(new BufferedInputStream(new FileInputStream(file0)), file0.length());
            }
            catch(IOException iOException0) {
                zzamb.zza("%s: %s", new Object[]{file0.getAbsolutePath(), iOException0.toString()});
                this.zzi(s);
                return null;
            }
            try {
                zzami1 = zzami.zza(zzamj0);
                if(TextUtils.equals(s, zzami1.zzb)) {
                    byte[] arr_b = zzaml.zzm(zzamj0, zzamj0.zza());
                    zzaky0 = new zzaky();
                    zzaky0.zza = arr_b;
                    zzaky0.zzb = zzami0.zzc;
                    zzaky0.zzc = zzami0.zzd;
                    zzaky0.zzd = zzami0.zze;
                    zzaky0.zze = zzami0.zzf;
                    zzaky0.zzf = zzami0.zzg;
                    TreeMap treeMap0 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                    for(Object object0: zzami0.zzh) {
                        treeMap0.put(((zzalh)object0).zza(), ((zzalh)object0).zzb());
                    }
                    zzaky0.zzg = treeMap0;
                    zzaky0.zzh = Collections.unmodifiableList(zzami0.zzh);
                    goto label_28;
                }
                goto label_31;
            }
            catch(Throwable throwable0) {
                goto label_35;
            }
            try {
            label_28:
                zzamj0.close();
                return zzaky0;
            }
            catch(IOException iOException0) {
                zzamb.zza("%s: %s", new Object[]{file0.getAbsolutePath(), iOException0.toString()});
                this.zzi(s);
                return null;
            }
            try {
            label_31:
                zzamb.zza("%s: key=%s, found=%s", new Object[]{file0.getAbsolutePath(), s, zzami1.zzb});
                this.zzp(s);
                goto label_38;
            }
            catch(Throwable throwable0) {
                try {
                label_35:
                    zzamj0.close();
                    throw throwable0;
                label_38:
                    zzamj0.close();
                    return null;
                }
                catch(IOException iOException0) {
                }
            }
            zzamb.zza("%s: %s", new Object[]{file0.getAbsolutePath(), iOException0.toString()});
            this.zzi(s);
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzakz
    public final void zzb() {
        synchronized(this) {
            File file0 = this.zzc.zza();
            if(!file0.exists()) {
                if(!file0.mkdirs()) {
                    zzamb.zzb("Unable to create cache dir %s", new Object[]{file0.getAbsolutePath()});
                    return;
                }
                return;
            }
            File[] arr_file = file0.listFiles();
            if(arr_file != null) {
                for(int v = 0; v < arr_file.length; ++v) {
                    File file1 = arr_file[v];
                    try {
                        long v2 = file1.length();
                        zzamj zzamj0 = new zzamj(new BufferedInputStream(new FileInputStream(file1)), v2);
                        try {
                            zzami zzami0 = zzami.zza(zzamj0);
                            zzami0.zza = v2;
                            this.zzo(zzami0.zzb, zzami0);
                        }
                        catch(Throwable throwable0) {
                            zzamj0.close();
                            throw throwable0;
                        }
                        zzamj0.close();
                    }
                    catch(IOException unused_ex) {
                        file1.delete();
                    }
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzakz
    public final void zzc(String s, boolean z) {
        synchronized(this) {
            zzaky zzaky0 = this.zza(s);
            if(zzaky0 != null) {
                zzaky0.zzf = 0L;
                zzaky0.zze = 0L;
                this.zzd(s, zzaky0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzakz
    public final void zzd(String s, zzaky zzaky0) {
        long v4;
        zzami zzami0;
        BufferedOutputStream bufferedOutputStream0;
        synchronized(this) {
            if(Long.compare(this.zzb + ((long)zzaky0.zza.length), this.zzd) > 0 && ((float)zzaky0.zza.length) > ((float)this.zzd) * 0.9f) {
                return;
            }
            File file0 = this.zzg(s);
            try {
                bufferedOutputStream0 = new BufferedOutputStream(new FileOutputStream(file0));
                zzami0 = new zzami(s, zzaky0);
            }
            catch(IOException unused_ex) {
                goto label_67;
            }
            try {
                zzaml.zzj(bufferedOutputStream0, 0x20150306);
                zzaml.zzl(bufferedOutputStream0, zzami0.zzb);
                zzaml.zzl(bufferedOutputStream0, (zzami0.zzc == null ? "" : zzami0.zzc));
                zzaml.zzk(bufferedOutputStream0, zzami0.zzd);
                zzaml.zzk(bufferedOutputStream0, zzami0.zze);
                zzaml.zzk(bufferedOutputStream0, zzami0.zzf);
                zzaml.zzk(bufferedOutputStream0, zzami0.zzg);
                List list0 = zzami0.zzh;
                if(list0 == null) {
                    zzaml.zzj(bufferedOutputStream0, 0);
                }
                else {
                    zzaml.zzj(bufferedOutputStream0, list0.size());
                    for(Object object0: list0) {
                        zzaml.zzl(bufferedOutputStream0, ((zzalh)object0).zza());
                        zzaml.zzl(bufferedOutputStream0, ((zzalh)object0).zzb());
                    }
                }
                bufferedOutputStream0.flush();
                goto label_35;
            }
            catch(IOException iOException0) {
            }
            try {
                zzamb.zza("%s", new Object[]{iOException0.toString()});
                bufferedOutputStream0.close();
                zzamb.zza("Failed to write header for %s", new Object[]{file0.getAbsolutePath()});
                goto label_67;
            label_35:
                bufferedOutputStream0.write(zzaky0.zza);
                bufferedOutputStream0.close();
                zzami0.zza = file0.length();
                this.zzo(s, zzami0);
                if(this.zzb >= ((long)this.zzd)) {
                    if(zzamb.zzb) {
                        zzamb.zzd("Pruning old cache entries.", new Object[0]);
                    }
                    long v1 = this.zzb;
                    long v2 = SystemClock.elapsedRealtime();
                    int v3 = 0;
                    Iterator iterator1 = this.zza.entrySet().iterator();
                    while(true) {
                        if(!iterator1.hasNext()) {
                            v4 = v1;
                            break;
                        }
                        Object object1 = iterator1.next();
                        zzami zzami1 = (zzami)((Map.Entry)object1).getValue();
                        if(this.zzg(zzami1.zzb).delete()) {
                            v4 = v1;
                            this.zzb -= zzami1.zza;
                        }
                        else {
                            v4 = v1;
                            String s1 = zzaml.zzq(zzami1.zzb);
                            zzamb.zza("Could not delete cache entry for key=%s, filename=%s", new Object[]{zzami1.zzb, s1});
                        }
                        iterator1.remove();
                        ++v3;
                        if(((float)this.zzb) < ((float)this.zzd) * 0.9f) {
                            break;
                        }
                        v1 = v4;
                    }
                    if(zzamb.zzb) {
                        zzamb.zzd("pruned %d files, %d bytes, %d ms", new Object[]{v3, ((long)(this.zzb - v4)), ((long)(SystemClock.elapsedRealtime() - v2))});
                    }
                }
            }
            catch(IOException unused_ex) {
            label_67:
                if(!file0.delete()) {
                    zzamb.zza("Could not clean up file %s", new Object[]{file0.getAbsolutePath()});
                }
                if(!this.zzc.zza().exists()) {
                    zzamb.zza("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    this.zzb();
                }
            }
        }
    }

    static int zze(InputStream inputStream0) {
        int v = zzaml.zzn(inputStream0);
        int v1 = zzaml.zzn(inputStream0);
        int v2 = zzaml.zzn(inputStream0);
        return zzaml.zzn(inputStream0) << 24 | (v | v1 << 8 | v2 << 16);
    }

    static long zzf(InputStream inputStream0) {
        return ((long)zzaml.zzn(inputStream0)) & 0xFFL | (((long)zzaml.zzn(inputStream0)) & 0xFFL) << 8 | (((long)zzaml.zzn(inputStream0)) & 0xFFL) << 16 | (((long)zzaml.zzn(inputStream0)) & 0xFFL) << 24 | (((long)zzaml.zzn(inputStream0)) & 0xFFL) << 0x20 | (((long)zzaml.zzn(inputStream0)) & 0xFFL) << 40 | (((long)zzaml.zzn(inputStream0)) & 0xFFL) << 0x30 | (((long)zzaml.zzn(inputStream0)) & 0xFFL) << 56;
    }

    public final File zzg(String s) {
        return new File(this.zzc.zza(), zzaml.zzq(s));
    }

    static String zzh(zzamj zzamj0) {
        return new String(zzaml.zzm(zzamj0, zzaml.zzf(zzamj0)), "UTF-8");
    }

    public final void zzi(String s) {
        synchronized(this) {
            boolean z = this.zzg(s).delete();
            this.zzp(s);
            if(!z) {
                zzamb.zza("Could not delete cache entry for key=%s, filename=%s", new Object[]{s, zzaml.zzq(s)});
            }
        }
    }

    static void zzj(OutputStream outputStream0, int v) {
        outputStream0.write(v & 0xFF);
        outputStream0.write(v >> 8 & 0xFF);
        outputStream0.write(v >> 16 & 0xFF);
        outputStream0.write(v >> 24 & 0xFF);
    }

    static void zzk(OutputStream outputStream0, long v) {
        outputStream0.write(((int)(((byte)(((int)v))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 8)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 16)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 24)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 0x20)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 40)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 0x30)))))));
        outputStream0.write(((int)(((byte)(((int)(v >>> 56)))))));
    }

    static void zzl(OutputStream outputStream0, String s) {
        byte[] arr_b = s.getBytes("UTF-8");
        zzaml.zzk(outputStream0, ((long)arr_b.length));
        outputStream0.write(arr_b, 0, arr_b.length);
    }

    static byte[] zzm(zzamj zzamj0, long v) {
        long v1 = zzamj0.zza();
        if(Long.compare(v, 0L) < 0 || v > v1 || ((long)(((int)v))) != v) {
            throw new IOException("streamToBytes length=" + v + ", maxLength=" + v1);
        }
        byte[] arr_b = new byte[((int)v)];
        new DataInputStream(zzamj0).readFully(arr_b);
        return arr_b;
    }

    private static int zzn(InputStream inputStream0) {
        int v = inputStream0.read();
        if(v == -1) {
            throw new EOFException();
        }
        return v;
    }

    private final void zzo(String s, zzami zzami0) {
        if(this.zza.containsKey(s)) {
            zzami zzami1 = (zzami)this.zza.get(s);
            this.zzb += zzami0.zza - zzami1.zza;
        }
        else {
            this.zzb += zzami0.zza;
        }
        this.zza.put(s, zzami0);
    }

    private final void zzp(String s) {
        zzami zzami0 = (zzami)this.zza.remove(s);
        if(zzami0 != null) {
            this.zzb -= zzami0.zza;
        }
    }

    private static final String zzq(String s) {
        int v = s.length();
        return s.substring(0, v / 2).hashCode() + String.valueOf(s.substring(v / 2).hashCode());
    }
}

