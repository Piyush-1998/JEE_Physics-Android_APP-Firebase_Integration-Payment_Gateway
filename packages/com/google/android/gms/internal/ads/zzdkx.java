package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.nonagon.transaction.omid.OmidSettings;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdkx {
    public final String zzagt;
    public final boolean zzboz;
    public final List<String> zzdis;
    public final List<String> zzdit;
    public final String zzdiy;
    public final boolean zzdjf;
    public final boolean zzdjg;
    public final boolean zzdjh;
    public final String zzdjo;
    public final String zzdjz;
    public final String zzdka;
    public final String zzdln;
    public final List<String> zzdru;
    public final String zzdrx;
    public final String zzdsa;
    public final zzaue zzdsh;
    public final List<String> zzdsi;
    public final List<String> zzdsj;
    public final boolean zzdsr;
    public final boolean zzdsu;
    public final boolean zzdsv;
    public final boolean zzduo;
    public final boolean zzent;
    public final String zzeqb;
    public final int zzfnn;
    public final boolean zzfno;
    public final boolean zzfnp;
    public final String zzfsp;
    public final List<String> zzhaf;
    public final int zzhag;
    public final int zzhah;
    public final List<String> zzhai;
    public final List<String> zzhaj;
    public final List<String> zzhak;
    public final List<String> zzhal;
    public final int zzham;
    public final List<zzdkw> zzhan;
    public final zzdlb zzhao;
    public final List<String> zzhap;
    public final List<zzdkw> zzhaq;
    public final JSONObject zzhar;
    public final zzavt zzhas;
    public final JSONObject zzhat;
    public final JSONObject zzhau;
    public final boolean zzhav;
    public final int zzhaw;
    public final int zzhax;
    public final OmidSettings zzhay;
    public final int zzhaz;
    public final boolean zzhba;
    public final zzaqq zzhbb;
    public final zzvl zzhbc;
    public final String zzhbd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdkx(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<zzdkw> list;
        char c;
        List<String> list2;
        List<String> emptyList = Collections.emptyList();
        List<String> emptyList2 = Collections.emptyList();
        List<String> emptyList3 = Collections.emptyList();
        List<String> emptyList4 = Collections.emptyList();
        List<String> emptyList5 = Collections.emptyList();
        Collections.emptyList();
        List<String> emptyList6 = Collections.emptyList();
        List<String> emptyList7 = Collections.emptyList();
        List<String> emptyList8 = Collections.emptyList();
        List<String> emptyList9 = Collections.emptyList();
        List<String> emptyList10 = Collections.emptyList();
        List<zzdkw> emptyList11 = Collections.emptyList();
        List<String> emptyList12 = Collections.emptyList();
        List<zzdkw> emptyList13 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        JSONObject jSONObject5 = jSONObject;
        JSONObject jSONObject6 = jSONObject2;
        JSONObject jSONObject7 = jSONObject3;
        JSONObject jSONObject8 = jSONObject4;
        zzaue zzaueVar = null;
        zzdlb zzdlbVar = null;
        zzavt zzavtVar = null;
        zzaqq zzaqqVar = null;
        zzvl zzvlVar = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i4 = -1;
        int i5 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i6 = 0;
        boolean z11 = false;
        int i7 = -1;
        boolean z12 = false;
        boolean z13 = true;
        List<String> list3 = emptyList12;
        List<zzdkw> list4 = emptyList13;
        List<String> list5 = emptyList10;
        List<zzdkw> list6 = emptyList11;
        List<String> list7 = emptyList8;
        List<String> list8 = emptyList9;
        List<String> list9 = emptyList6;
        List<String> list10 = emptyList7;
        List<String> list11 = emptyList4;
        List<String> list12 = emptyList5;
        List<String> list13 = emptyList2;
        List<String> list14 = emptyList3;
        List<String> list15 = emptyList;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str12 = nextName == null ? "" : nextName;
            switch (str12.hashCode()) {
                case -1980587809:
                    list = list4;
                    if (str12.equals("debug_signals")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1965512151:
                    list = list4;
                    if (str12.equals("omid_settings")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case -1812055556:
                    list = list4;
                    if (str12.equals("play_prewarm_options")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case -1620470467:
                    list = list4;
                    if (str12.equals("backend_query_id")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case -1440104884:
                    list = list4;
                    if (str12.equals("is_custom_close_blocked")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case -1439500848:
                    list = list4;
                    if (str12.equals("orientation")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case -1428969291:
                    list = list4;
                    if (str12.equals("enable_omid")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case -1403779768:
                    list = list4;
                    if (str12.equals("showable_impression_type")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case -1360811658:
                    list = list4;
                    if (str12.equals("ad_sizes")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1306015996:
                    list = list4;
                    if (str12.equals("adapters")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1303332046:
                    list = list4;
                    if (str12.equals("test_mode_enabled")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case -1289032093:
                    list = list4;
                    if (str12.equals("extras")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case -1240082064:
                    list = list4;
                    if (str12.equals("ad_event_value")) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case -1234181075:
                    list = list4;
                    if (str12.equals("allow_pub_rendered_attribution")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case -1181000426:
                    list = list4;
                    if (str12.equals("is_augmented_reality_ad")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case -1168140544:
                    list = list4;
                    if (str12.equals("presentation_error_urls")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1152230954:
                    list = list4;
                    if (str12.equals("ad_type")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146534047:
                    list = list4;
                    if (str12.equals("is_scroll_aware")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case -1115838944:
                    list = list4;
                    if (str12.equals("fill_urls")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1081936678:
                    list = list4;
                    if (str12.equals("allocation_id")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -1078050970:
                    list = list4;
                    if (str12.equals("video_complete_urls")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1051269058:
                    list = list4;
                    if (str12.equals("active_view")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -982608540:
                    list = list4;
                    if (str12.equals("valid_from_timestamp")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -776859333:
                    list = list4;
                    if (str12.equals("click_urls")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -544216775:
                    list = list4;
                    if (str12.equals("safe_browsing")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -437057161:
                    list = list4;
                    if (str12.equals("imp_urls")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -404326515:
                    list = list4;
                    if (str12.equals("render_timeout_ms")) {
                        c = '&';
                        break;
                    }
                    c = 65535;
                    break;
                case -397704715:
                    list = list4;
                    if (str12.equals("ad_close_time_ms")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case -369773488:
                    list = list4;
                    if (str12.equals("is_close_button_enabled")) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case -213424028:
                    list = list4;
                    if (str12.equals("watermark")) {
                        c = '/';
                        break;
                    }
                    c = 65535;
                    break;
                case -29338502:
                    list = list4;
                    if (str12.equals("allow_custom_click_gesture")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 3107:
                    list = list4;
                    if (str12.equals("ad")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    list = list4;
                    if (str12.equals("id")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 3076010:
                    list = list4;
                    if (str12.equals("data")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 63195984:
                    list = list4;
                    if (str12.equals("render_test_label")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 107433883:
                    list = list4;
                    if (str12.equals("qdata")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 230323073:
                    list = list4;
                    if (str12.equals("ad_load_urls")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 418392395:
                    list = list4;
                    if (str12.equals("is_closable_area_disabled")) {
                        c = '$';
                        break;
                    }
                    c = 65535;
                    break;
                case 549176928:
                    list = list4;
                    if (str12.equals("presentation_error_timeout_ms")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 597473788:
                    list = list4;
                    if (str12.equals("debug_dialog_string")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 673261304:
                    list = list4;
                    if (str12.equals("reward_granted_urls")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 754887508:
                    list = list4;
                    if (str12.equals("container_sizes")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 791122864:
                    list = list4;
                    if (str12.equals("impression_type")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1010584092:
                    list = list4;
                    if (str12.equals("transaction_id")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1100650276:
                    list = list4;
                    if (str12.equals("rewards")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1321720943:
                    list = list4;
                    if (str12.equals("allow_pub_owned_ad_view")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 1637553475:
                    list = list4;
                    if (str12.equals("bid_response")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case 1638957285:
                    list = list4;
                    if (str12.equals("video_start_urls")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1688341040:
                    list = list4;
                    if (str12.equals("video_reward_urls")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1799285870:
                    list = list4;
                    if (str12.equals("use_third_party_container_height")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case 1839650832:
                    list = list4;
                    if (str12.equals("renderers")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1875425491:
                    list = list4;
                    if (str12.equals("is_analytics_logging_enabled")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case 2068142375:
                    list = list4;
                    if (str12.equals("rule_line_external_id")) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case 2072888499:
                    list = list4;
                    if (str12.equals("manual_tracking_urls")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    list = list4;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    list2 = list3;
                    list15 = zzbab.zza(jsonReader);
                    list3 = list2;
                    break;
                case 1:
                    list2 = list3;
                    String nextString = jsonReader.nextString();
                    if ("banner".equals(nextString)) {
                        i = 1;
                    } else if ("interstitial".equals(nextString)) {
                        i = 2;
                    } else if ("native_express".equals(nextString)) {
                        i = 3;
                    } else if ("native".equals(nextString)) {
                        i = 4;
                    } else {
                        i = "rewarded".equals(nextString) ? 5 : 0;
                    }
                    list3 = list2;
                    break;
                case 2:
                    list2 = list3;
                    list13 = zzbab.zza(jsonReader);
                    list3 = list2;
                    break;
                case 3:
                    list2 = list3;
                    list14 = zzbab.zza(jsonReader);
                    list3 = list2;
                    break;
                case 4:
                    list2 = list3;
                    list11 = zzbab.zza(jsonReader);
                    list3 = list2;
                    break;
                case 5:
                    list2 = list3;
                    int nextInt = jsonReader.nextInt();
                    i2 = (nextInt == 0 || nextInt == 1) ? nextInt : 0;
                    list3 = list2;
                    break;
                case 6:
                    list2 = list3;
                    list12 = zzbab.zza(jsonReader);
                    list3 = list2;
                    break;
                case 7:
                    list2 = list3;
                    zzbab.zza(jsonReader);
                    list3 = list2;
                    break;
                case '\b':
                    list2 = list3;
                    list9 = zzbab.zza(jsonReader);
                    list3 = list2;
                    break;
                case '\t':
                    list2 = list3;
                    list10 = zzbab.zza(jsonReader);
                    list3 = list2;
                    break;
                case '\n':
                    list2 = list3;
                    str = jsonReader.nextString();
                    list3 = list2;
                    break;
                case 11:
                    list2 = list3;
                    str2 = jsonReader.nextString();
                    list3 = list2;
                    break;
                case '\f':
                    list2 = list3;
                    zzaueVar = zzaue.zza(zzbab.zzd(jsonReader));
                    list3 = list2;
                    break;
                case '\r':
                    list2 = list3;
                    list7 = zzbab.zza(jsonReader);
                    list3 = list2;
                    break;
                case 14:
                    list2 = list3;
                    list8 = zzbab.zza(jsonReader);
                    list3 = list2;
                    break;
                case 15:
                    list2 = list3;
                    list5 = zzbab.zza(jsonReader);
                    list3 = list2;
                    break;
                case 16:
                    list2 = list3;
                    i3 = jsonReader.nextInt();
                    list3 = list2;
                    break;
                case 17:
                    list2 = list3;
                    list6 = zzdkw.zze(jsonReader);
                    list3 = list2;
                    break;
                case 18:
                    list2 = list3;
                    zzdlbVar = new zzdlb(jsonReader);
                    list3 = list2;
                    break;
                case 19:
                    list4 = zzdkw.zze(jsonReader);
                    continue;
                case 20:
                    list3 = zzbab.zza(jsonReader);
                    break;
                case 21:
                    str3 = jsonReader.nextString();
                    break;
                case 22:
                    jSONObject5 = zzbab.zzc(jsonReader);
                    break;
                case 23:
                    str4 = jsonReader.nextString();
                    break;
                case 24:
                    str5 = jsonReader.nextString();
                    break;
                case 25:
                    str6 = zzbab.zzc(jsonReader).toString();
                    break;
                case 26:
                    zzavtVar = zzavt.zzg(zzbab.zzc(jsonReader));
                    break;
                case 27:
                    str7 = jsonReader.nextString();
                    break;
                case 28:
                    jSONObject6 = zzbab.zzc(jsonReader);
                    break;
                case 29:
                    jSONObject7 = zzbab.zzc(jsonReader);
                    break;
                case 30:
                    z = jsonReader.nextBoolean();
                    break;
                case 31:
                    z2 = jsonReader.nextBoolean();
                    break;
                case ' ':
                    z3 = jsonReader.nextBoolean();
                    break;
                case '!':
                    z4 = jsonReader.nextBoolean();
                    break;
                case '\"':
                    z5 = jsonReader.nextBoolean();
                    break;
                case '#':
                    z6 = jsonReader.nextBoolean();
                    break;
                case '$':
                    z7 = jsonReader.nextBoolean();
                    break;
                case '%':
                    list2 = list3;
                    String nextString2 = jsonReader.nextString();
                    if ("landscape".equalsIgnoreCase(nextString2)) {
                        com.google.android.gms.ads.internal.zzp.zzkr();
                        i4 = 6;
                    } else if ("portrait".equalsIgnoreCase(nextString2)) {
                        com.google.android.gms.ads.internal.zzp.zzkr();
                        i4 = 7;
                    } else {
                        i4 = -1;
                    }
                    list3 = list2;
                    break;
                case '&':
                    i5 = jsonReader.nextInt();
                    break;
                case '\'':
                    z8 = jsonReader.nextBoolean();
                    break;
                case '(':
                    str8 = jsonReader.nextString();
                    break;
                case ')':
                    jSONObject8 = zzbab.zzc(jsonReader);
                    break;
                case '*':
                    z9 = jsonReader.nextBoolean();
                    break;
                case '+':
                    z10 = jsonReader.nextBoolean();
                    break;
                case ',':
                    i6 = jsonReader.nextInt();
                    break;
                case '-':
                    z11 = jsonReader.nextBoolean();
                    break;
                case '.':
                    i7 = jsonReader.nextInt();
                    break;
                case '/':
                    str9 = jsonReader.nextString();
                    break;
                case '0':
                    str10 = jsonReader.nextString();
                    break;
                case '1':
                    z12 = jsonReader.nextBoolean();
                    break;
                case '2':
                    JSONObject zzc = zzbab.zzc(jsonReader);
                    if (zzc == null) {
                        list2 = list3;
                        zzaqqVar = null;
                    } else {
                        list2 = list3;
                        zzaqqVar = new zzaqq(zzc.optBoolean("enable_prewarming", false), zzc.optString("prefetch_url", ""));
                    }
                    list3 = list2;
                    break;
                case '3':
                    z13 = jsonReader.nextBoolean();
                    break;
                case '4':
                    zzvlVar = zzvl.zza(zzbab.zzc(jsonReader));
                    break;
                case '5':
                    str11 = jsonReader.nextString();
                    break;
                default:
                    list2 = list3;
                    jsonReader.skipValue();
                    list3 = list2;
                    break;
            }
            list4 = list;
        }
        jsonReader.endObject();
        this.zzhaf = list15;
        this.zzhag = i;
        this.zzdis = list13;
        this.zzdit = list14;
        this.zzhai = list11;
        this.zzhah = i2;
        this.zzdsi = list12;
        this.zzdsj = list9;
        this.zzhaj = list10;
        this.zzdjz = str;
        this.zzdka = str2;
        this.zzdsh = zzaueVar;
        this.zzhak = list7;
        this.zzhal = list8;
        this.zzdru = list5;
        this.zzham = i3;
        this.zzhan = list6;
        this.zzhao = zzdlbVar;
        this.zzhap = list3;
        this.zzhaq = list4;
        this.zzdjo = str3;
        this.zzhar = jSONObject5;
        this.zzagt = str4;
        this.zzdiy = str5;
        this.zzdsa = str6;
        this.zzhas = zzavtVar;
        this.zzdrx = str7;
        this.zzhat = jSONObject6;
        this.zzhau = jSONObject7;
        this.zzdjf = z;
        this.zzdjg = z2;
        this.zzdjh = z3;
        this.zzduo = z4;
        this.zzhav = z5;
        this.zzfnp = z6;
        this.zzboz = z7;
        this.zzhaw = i4;
        this.zzhax = i5;
        this.zzdsr = z8;
        this.zzeqb = str8;
        this.zzhay = new OmidSettings(jSONObject8);
        this.zzdsu = z9;
        this.zzdsv = z10;
        this.zzhaz = i6;
        this.zzent = z11;
        this.zzdln = str9;
        this.zzfnn = i7;
        this.zzfsp = str10;
        this.zzhba = z12;
        this.zzhbb = zzaqqVar;
        this.zzfno = z13;
        this.zzhbc = zzvlVar;
        this.zzhbd = str11;
    }
}
