package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

public final class zzebw {
    private final zzaxe zza;
    private final Context zzb;
    private final zzeba zzc;
    private final zzcag zzd;
    private final String zze;
    private final zzfgo zzf;
    private final zzg zzg;

    public zzebw(Context context0, zzcag zzcag0, zzaxe zzaxe0, zzeba zzeba0, String s, zzfgo zzfgo0) {
        this.zzb = context0;
        this.zzd = zzcag0;
        this.zza = zzaxe0;
        this.zzc = zzeba0;
        this.zze = s;
        this.zzf = zzfgo0;
        this.zzg = zzt.zzo().zzh();
    }

    final Void zza(boolean z, SQLiteDatabase sQLiteDatabase0) {
        if(z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int v = 2;
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
            zzfgn zzfgn0 = zzfgn.zzb("oa_upload");
            zzfgn0.zza("oa_failed_reqs", String.valueOf(zzebp.zza(sQLiteDatabase0, 0)));
            zzfgn0.zza("oa_total_reqs", String.valueOf(zzebp.zza(sQLiteDatabase0, 1)));
            zzfgn0.zza("oa_upload_time", String.valueOf(zzt.zzB().currentTimeMillis()));
            zzfgn0.zza("oa_last_successful_time", String.valueOf(zzebp.zzb(sQLiteDatabase0, 2)));
            zzfgn0.zza("oa_session_id", (this.zzg.zzQ() ? "" : this.zze));
            this.zzf.zzb(zzfgn0);
            ArrayList arrayList0 = zzebp.zzc(sQLiteDatabase0);
            zzebw.zzc(sQLiteDatabase0, arrayList0);
            int v2 = arrayList0.size();
            for(int v1 = 0; v1 < v2; ++v1) {
                zzazn zzazn0 = (zzazn)arrayList0.get(v1);
                zzfgn zzfgn1 = zzfgn.zzb("oa_signals");
                zzfgn1.zza("oa_session_id", (this.zzg.zzQ() ? "" : this.zze));
                zzazi zzazi0 = zzazn0.zzf();
                String s = zzazi0.zzf() ? String.valueOf(zzazi0.zzh() - 1) : "-1";
                String s1 = zzfur.zzb(zzazn0.zzk(), (zzebv this) -> ((zzayc)object0).name()).toString();
                zzfgn1.zza("oa_sig_ts", String.valueOf(zzazn0.zze()));
                zzfgn1.zza("oa_sig_status", String.valueOf(zzazn0.zzw() - 1));
                zzfgn1.zza("oa_sig_resp_lat", String.valueOf(zzazn0.zzd()));
                zzfgn1.zza("oa_sig_render_lat", String.valueOf(zzazn0.zzc()));
                zzfgn1.zza("oa_sig_formats", s1);
                zzfgn1.zza("oa_sig_nw_type", s);
                zzfgn1.zza("oa_sig_wifi", String.valueOf(zzazn0.zzx() - 1));
                zzfgn1.zza("oa_sig_airplane", String.valueOf(zzazn0.zzt() - 1));
                zzfgn1.zza("oa_sig_data", String.valueOf(zzazn0.zzu() - 1));
                zzfgn1.zza("oa_sig_nw_resp", String.valueOf(zzazn0.zza()));
                zzfgn1.zza("oa_sig_offline", String.valueOf(zzazn0.zzv() - 1));
                zzfgn1.zza("oa_sig_nw_state", String.valueOf(zzazn0.zzj().zza()));
                if(zzazi0.zze() && zzazi0.zzf() && zzazi0.zzh() == 2) {
                    zzfgn1.zza("oa_sig_cell_type", String.valueOf(zzazi0.zzg() - 1));
                }
                this.zzf.zzb(zzfgn1);
            }
        }
        else {
            ArrayList arrayList1 = zzebp.zzc(sQLiteDatabase0);
            zzazo zzazo0 = zzazs.zza();
            zzazo0.zzb("com.fmkorea.m.fmk");
            zzazo0.zzd(Build.MODEL);
            zzazo0.zze(zzebp.zza(sQLiteDatabase0, 0));
            zzazo0.zza(arrayList1);
            zzazo0.zzg(zzebp.zza(sQLiteDatabase0, 1));
            zzazo0.zzc(zzebp.zza(sQLiteDatabase0, 3));
            zzazo0.zzh(zzt.zzB().currentTimeMillis());
            zzazo0.zzf(zzebp.zzb(sQLiteDatabase0, 2));
            zzazs zzazs0 = (zzazs)zzazo0.zzal();
            zzebw.zzc(sQLiteDatabase0, arrayList1);
            zzebt zzebt0 = new zzebt(zzazs0);
            this.zza.zzb(zzebt0);
            zzbad zzbad0 = zzbae.zza();
            zzbad0.zza(this.zzd.zzb);
            zzbad0.zzc(this.zzd.zzc);
            if(this.zzd.zzd) {
                v = 0;
            }
            zzbad0.zzb(v);
            zzebu zzebu0 = new zzebu(((zzbae)zzbad0.zzal()));
            this.zza.zzb(zzebu0);
            this.zza.zzc(10004);
        }
        zzebp.zzf(sQLiteDatabase0);
        return null;
    }

    public final void zzb(boolean z) {
        try {
            zzebs zzebs0 = new zzebs(this, z);
            this.zzc.zza(zzebs0);
        }
        catch(Exception exception0) {
            zzcaa.zzg(("Error in offline signals database startup: " + exception0.getMessage()));
        }
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase0, ArrayList arrayList0) {
        int v = arrayList0.size();
        long v2 = 0L;
        for(int v1 = 0; v1 < v; ++v1) {
            zzazn zzazn0 = (zzazn)arrayList0.get(v1);
            if(zzazn0.zzw() == 2 && zzazn0.zze() > v2) {
                v2 = zzazn0.zze();
            }
        }
        if(v2 != 0L) {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("value", v2);
            sQLiteDatabase0.update("offline_signal_statistics", contentValues0, "statistic_name = \'last_successful_request_time\'", null);
        }
    }
}

