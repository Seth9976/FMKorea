package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class zzfbe {
    public final String zzA;
    public final zzbwy zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfcd zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbsi zzae;
    public final zzs zzaf;
    public final String zzag;
    public final boolean zzah;
    public final JSONObject zzai;
    public final boolean zzaj;
    public final JSONObject zzak;
    public final boolean zzal;
    public final String zzam;
    public final boolean zzan;
    public final String zzao;
    public final String zzap;
    public final String zzaq;
    public final boolean zzar;
    public final int zzas;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzbvp zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzfbk zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    // This method was un-flattened
    zzfbe(JsonReader jsonReader0) {
        List list20;
        List list19;
        List list0 = Collections.emptyList();
        List list1 = Collections.emptyList();
        List list2 = Collections.emptyList();
        List list3 = Collections.emptyList();
        List list4 = Collections.emptyList();
        List list5 = Collections.emptyList();
        List list6 = Collections.emptyList();
        List list7 = Collections.emptyList();
        List list8 = Collections.emptyList();
        List list9 = Collections.emptyList();
        List list10 = Collections.emptyList();
        List list11 = Collections.emptyList();
        List list12 = Collections.emptyList();
        List list13 = Collections.emptyList();
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        jsonReader0.beginObject();
        JSONObject jSONObject6 = jSONObject1;
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        List list14 = zzfud.zzl();
        int v = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int v1 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int v2 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int v3 = 0;
        String s = "";
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        String s6 = "";
        String s7 = "";
        String s8 = "";
        String s9 = "";
        String s10 = "";
        String s11 = "";
        String s12 = "";
        String s13 = "";
        String s14 = "";
        String s15 = "";
        String s16 = "";
        zzfbk zzfbk0 = null;
        zzbwy zzbwy0 = null;
        zzbsi zzbsi0 = null;
        zzs zzs0 = null;
        String s17 = null;
        int v4 = -1;
        int v5 = -1;
        List list15 = list10;
        List list16 = list11;
        List list17 = list12;
        List list18 = list13;
        JSONObject jSONObject11 = jSONObject0;
        int v6 = 0;
        int v7 = 0;
        String s18 = "";
        String s19 = "";
        zzbvp zzbvp0 = null;
        while(jsonReader0.hasNext()) {
            String s20 = jsonReader0.nextName();
            String s21 = s20 == null ? "" : s20;
            switch(s21.hashCode()) {
                case 0x808DB56D: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("ad_source_instance_name")) {
                        if(((Boolean)zzbbr.zzgG.zzl()).booleanValue()) {
                            s12 = jsonReader0.nextString();
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        goto label_466;
                    }
                    break;
                }
                case 0x89F2A0DF: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("debug_signals")) {
                        jSONObject6 = zzbu.zzh(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case 0x8AD8AA29: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("omid_settings")) {
                        jSONObject8 = zzbu.zzh(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case 0x90744ED9: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("recursive_server_response_data")) {
                        s15 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case 0x9223AA05: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("is_consent")) {
                        z16 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 0x93FE39FC: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("play_prewarm_options")) {
                        zzbsi0 = zzbsi.zza(zzbu.zzh(jsonReader0));
                        goto label_466;
                    }
                    break;
                }
                case 0x9615F213: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("ad_source_name")) {
                        if(((Boolean)zzbbr.zzgG.zzl()).booleanValue()) {
                            s10 = jsonReader0.nextString();
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        goto label_466;
                    }
                    break;
                }
                case 0x9CE0CAC1: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("is_interscroller")) {
                        z11 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case -1620470467: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("backend_query_id")) {
                        s7 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case -1550155393: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("nofill_urls")) {
                        list8 = zzbu.zzd(jsonReader0);
                        list9 = list20;
                        continue;
                    }
                    break;
                }
                case -1440104884: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("is_custom_close_blocked")) {
                        z5 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 0xAA32F5D0: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("orientation")) {
                        v4 = zzfbe.zzd(jsonReader0.nextString());
                        goto label_466;
                    }
                    break;
                }
                case 0xAAD3A8B5: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("enable_omid")) {
                        z7 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case -1406227629: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("buffer_click_url_as_ready_to_ping")) {
                        z15 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 0xAC540548: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("showable_impression_type")) {
                        v2 = jsonReader0.nextInt();
                        goto label_466;
                    }
                    break;
                }
                case 0xAE04DC9B: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("ad_cover")) {
                        jSONObject9 = zzbu.zzh(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case -1360811658: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("ad_sizes")) {
                        list18 = zzfbf.zza(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case -1306015996: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("adapters")) {
                        list17 = zzbu.zzd(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case -1303332046: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("test_mode_enabled")) {
                        z4 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case -1289032093: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("extras")) {
                        jSONObject7 = zzbu.zzh(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case -1240082064: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("ad_event_value")) {
                        zzs0 = zzs.zza(zzbu.zzh(jsonReader0));
                        goto label_466;
                    }
                    break;
                }
                case 0xB66FE42D: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("allow_pub_rendered_attribution")) {
                        z = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 0xBA5F9700: {
                    list19 = list8;
                    if(s21.equals("presentation_error_urls")) {
                        list9 = zzbu.zzd(jsonReader0);
                        goto label_467;
                    }
                    else {
                        list20 = list9;
                        break;
                    }
                    goto label_213;
                }
                case -1152230954: {
                label_213:
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("ad_type")) {
                        v6 = zzfbe.zzb(jsonReader0.nextString());
                        goto label_466;
                    }
                    break;
                }
                case 0xBBA94761: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("is_scroll_aware")) {
                        z9 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 0xBD7DA620: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("fill_urls")) {
                        list7 = zzbu.zzd(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case 0xBF82F4DA: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("allocation_id")) {
                        s = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case -1078050970: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("video_complete_urls")) {
                        list6 = zzbu.zzd(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case -1051269058: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("active_view")) {
                        s3 = zzbu.zzh(jsonReader0).toString();
                        goto label_466;
                    }
                    break;
                }
                case -982608540: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("valid_from_timestamp")) {
                        s18 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case 0xC60F987D: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("ad_source_instance_id")) {
                        if(((Boolean)zzbbr.zzgG.zzl()).booleanValue()) {
                            s13 = jsonReader0.nextString();
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        goto label_466;
                    }
                    break;
                }
                case 0xD1B2113B: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("click_urls")) {
                        list1 = zzbu.zzd(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case 0xDF8FE939: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("safe_browsing")) {
                        zzbwy0 = zzbwy.zza(zzbu.zzh(jsonReader0));
                        goto label_466;
                    }
                    break;
                }
                case 0xE5F30977: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("imp_urls")) {
                        list2 = zzbu.zzd(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case -404433734: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("rtb_native_required_assets")) {
                        jSONObject10 = zzbu.zzh(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case -404326515: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("render_timeout_ms")) {
                        v1 = jsonReader0.nextInt();
                        goto label_466;
                    }
                    break;
                }
                case 0xE84B81F5: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("ad_close_time_ms")) {
                        v5 = jsonReader0.nextInt();
                        goto label_466;
                    }
                    break;
                }
                case -388807511: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("content_url")) {
                        s17 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case 0xE9F5B450: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("is_close_button_enabled")) {
                        jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 0xF347050C: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("force_disable_hardware_acceleration")) {
                        z14 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case -213424028: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("watermark")) {
                        s6 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case -180214626: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("native_required_asset_viewability")) {
                        z13 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 0xF6C8BE34: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("is_offline_ad")) {
                        z12 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 0xFE40547A: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("allow_custom_click_gesture")) {
                        z2 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 3107: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("ad")) {
                        zzfbk0 = new zzfbk(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case 0xD1B: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("id")) {
                        s1 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case 3076010: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("data")) {
                        jSONObject11 = zzbu.zzh(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case 0x23640CB: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("request_id")) {
                        s14 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case 0x3C44B50: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("render_test_label")) {
                        z3 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 0x6674F9B: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("qdata")) {
                        s2 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case 230323073: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("ad_load_urls")) {
                        list3 = zzbu.zzd(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case 0x18F0294B: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("is_closable_area_disabled")) {
                        z6 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 0x2052155C: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("consent_form_action_identifier")) {
                        v3 = jsonReader0.nextInt();
                        goto label_466;
                    }
                    break;
                }
                case 0x20BBC660: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("presentation_error_timeout_ms")) {
                        v = jsonReader0.nextInt();
                        goto label_466;
                    }
                    break;
                }
                case 0x239CB9FC: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("debug_dialog_string")) {
                        s4 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case 0x2CFEAB54: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("container_sizes")) {
                        list16 = zzfbf.zza(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case 0x2F2793B0: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("impression_type")) {
                        v7 = zzfbe.zzc(jsonReader0.nextInt());
                        goto label_466;
                    }
                    break;
                }
                case 1010584092: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("transaction_id")) {
                        s19 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case 1100650276: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("rewards")) {
                        zzbvp0 = zzbvp.zza(zzbu.zze(jsonReader0));
                        goto label_466;
                    }
                    break;
                }
                case 1141602460: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("adapter_response_info_key")) {
                        s16 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case 1186014765: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("cache_hit_urls")) {
                        list14 = zzbu.zzd(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case 0x4EC7DC6F: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("allow_pub_owned_ad_view")) {
                        z1 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 0x55AAC6A3: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("ad_source_id")) {
                        if(((Boolean)zzbbr.zzgG.zzl()).booleanValue()) {
                            s11 = jsonReader0.nextString();
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        goto label_466;
                    }
                    break;
                }
                case 0x619B1543: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("bid_response")) {
                        s5 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case 0x61B080E5: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("video_start_urls")) {
                        list4 = zzbu.zzd(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case 0x6483313F: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("ad_network_class_name")) {
                        s9 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case 0x64A20A30: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("video_reward_urls")) {
                        list5 = zzbu.zzd(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case 1799285870: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("use_third_party_container_height")) {
                        z10 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 0x6DA6D810: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("renderers")) {
                        list0 = zzbu.zzd(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                case 0x6FC8B8D3: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("is_analytics_logging_enabled")) {
                        z8 = jsonReader0.nextBoolean();
                        goto label_466;
                    }
                    break;
                }
                case 2068142375: {
                    list19 = list8;
                    list20 = list9;
                    if(s21.equals("rule_line_external_id")) {
                        s8 = jsonReader0.nextString();
                        goto label_466;
                    }
                    break;
                }
                case 2072888499: {
                    list20 = list9;
                    list19 = list8;
                    if(s21.equals("manual_tracking_urls")) {
                        list15 = zzbu.zzd(jsonReader0);
                        goto label_466;
                    }
                    break;
                }
                default: {
                    list19 = list8;
                    list20 = list9;
                }
            }
            jsonReader0.skipValue();
        label_466:
            list9 = list20;
        label_467:
            list8 = list19;
        }
        jsonReader0.endObject();
        this.zza = list0;
        this.zzb = v6;
        this.zzc = list1;
        this.zzd = list2;
        this.zzg = list3;
        this.zzf = v7;
        this.zzh = list4;
        this.zzi = list5;
        this.zzj = list6;
        this.zzk = s19;
        this.zzl = s18;
        this.zzm = zzbvp0;
        this.zzn = list7;
        this.zzo = list8;
        this.zzp = list9;
        this.zzq = list15;
        this.zzr = v;
        this.zzs = list16;
        this.zzt = zzfbk0;
        this.zzu = list17;
        this.zzv = list18;
        this.zzx = s;
        this.zzw = jSONObject11;
        this.zzy = s1;
        this.zzz = s2;
        this.zzA = s3;
        this.zzB = zzbwy0;
        this.zzC = s4;
        this.zzD = jSONObject6;
        this.zzE = jSONObject7;
        this.zzK = z;
        this.zzL = z1;
        this.zzM = z2;
        this.zzN = z3;
        this.zzO = z4;
        this.zzP = z5;
        this.zzQ = z6;
        this.zzR = v4;
        this.zzS = v1;
        this.zzU = z7;
        this.zzV = s5;
        this.zzW = new zzfcd(jSONObject8);
        this.zzX = z8;
        this.zzY = z9;
        this.zzZ = v2;
        this.zzaa = s6;
        this.zzab = v5;
        this.zzac = s7;
        this.zzad = z10;
        this.zzae = zzbsi0;
        this.zzaf = zzs0;
        this.zzag = s8;
        this.zzah = z11;
        this.zzai = jSONObject9;
        this.zzF = s9;
        this.zzG = s10;
        this.zzH = s11;
        this.zzI = s12;
        this.zzJ = s13;
        this.zzaj = z12;
        this.zzak = jSONObject10;
        this.zzal = z13;
        this.zzam = s17;
        this.zzan = z14;
        this.zze = list14;
        this.zzT = z15;
        this.zzao = s14;
        this.zzap = s15;
        this.zzaq = s16;
        this.zzar = z16;
        this.zzas = v3;
    }

    public static String zza(int v) {
        switch(v) {
            case 1: {
                return "BANNER";
            }
            case 2: {
                return "INTERSTITIAL";
            }
            case 3: {
                return "NATIVE_EXPRESS";
            }
            case 4: {
                return "NATIVE";
            }
            case 5: {
                return "REWARDED";
            }
            case 6: {
                return "APP_OPEN_AD";
            }
            case 7: {
                return "REWARDED_INTERSTITIAL";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    private static int zzb(String s) {
        if("banner".equals(s)) {
            return 1;
        }
        if("interstitial".equals(s)) {
            return 2;
        }
        if("native_express".equals(s)) {
            return 3;
        }
        if("native".equals(s)) {
            return 4;
        }
        if("rewarded".equals(s)) {
            return 5;
        }
        if("app_open_ad".equals(s)) {
            return 6;
        }
        return "rewarded_interstitial".equals(s) ? 7 : 0;
    }

    private static int zzc(int v) {
        return v == 0 || v == 1 || v == 3 ? v : 0;
    }

    private static final int zzd(String s) {
        if("landscape".equalsIgnoreCase(s)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(s) ? 7 : -1;
    }
}

