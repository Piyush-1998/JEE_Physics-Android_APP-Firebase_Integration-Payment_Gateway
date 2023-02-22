package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzekj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzavl implements zzavu {
    private static List<Future<Void>> zzdvs = Collections.synchronizedList(new ArrayList());
    private final zzavt zzdsm;
    private final zzekj.zzb.zza zzdvt;
    private final LinkedHashMap<String, zzekj.zzb.zzh.C0018zzb> zzdvu;
    private final zzavw zzdvx;
    private boolean zzdvy;
    private final zzavz zzdvz;
    private final Context zzvr;
    private final List<String> zzdvv = new ArrayList();
    private final List<String> zzdvw = new ArrayList();
    private final Object lock = new Object();
    private HashSet<String> zzdwa = new HashSet<>();
    private boolean zzdwb = false;
    private boolean zzdwc = false;
    private boolean zzdwd = false;

    public zzavl(Context context, zzbbg zzbbgVar, zzavt zzavtVar, String str, zzavw zzavwVar) {
        Preconditions.checkNotNull(zzavtVar, "SafeBrowsing config is not present.");
        this.zzvr = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzdvu = new LinkedHashMap<>();
        this.zzdvx = zzavwVar;
        this.zzdsm = zzavtVar;
        for (String str2 : zzavtVar.zzdwl) {
            this.zzdwa.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzdwa.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzekj.zzb.zza zzbiq = zzekj.zzb.zzbiq();
        zzbiq.zza(zzekj.zzb.zzg.OCTAGON_AD);
        zzbiq.zzhy(str);
        zzbiq.zzhz(str);
        zzekj.zzb.C0014zzb.zza zzbis = zzekj.zzb.C0014zzb.zzbis();
        if (this.zzdsm.zzdwh != null) {
            zzbis.zzic(this.zzdsm.zzdwh);
        }
        zzbiq.zza((zzekj.zzb.C0014zzb) ((zzegp) zzbis.zzbfx()));
        zzekj.zzb.zzi.zza zzbx = zzekj.zzb.zzi.zzbjg().zzbx(Wrappers.packageManager(this.zzvr).isCallerInstantApp());
        if (zzbbgVar.zzbra != null) {
            zzbx.zzij(zzbbgVar.zzbra);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzvr);
        if (apkVersion > 0) {
            zzbx.zzfu(apkVersion);
        }
        zzbiq.zza((zzekj.zzb.zzi) ((zzegp) zzbx.zzbfx()));
        this.zzdvt = zzbiq;
        this.zzdvz = new zzavz(this.zzvr, this.zzdsm.zzdwo, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Void zzee(String str) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final zzavt zzvn() {
        return this.zzdsm;
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final void zzea(String str) {
        synchronized (this.lock) {
            if (str == null) {
                this.zzdvt.zzbio();
            } else {
                this.zzdvt.zzia(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final boolean zzvo() {
        return PlatformVersion.isAtLeastKitKat() && this.zzdsm.zzdwj && !this.zzdwc;
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final void zzl(View view) {
        if (this.zzdsm.zzdwj && !this.zzdwc) {
            com.google.android.gms.ads.internal.zzp.zzkp();
            final Bitmap zzn = zzayh.zzn(view);
            if (zzn == null) {
                zzavv.zzef("Failed to capture the webview bitmap.");
                return;
            }
            this.zzdwc = true;
            zzayh.zzc(new Runnable(this, zzn) { // from class: com.google.android.gms.internal.ads.zzavk
                private final zzavl zzdvq;
                private final Bitmap zzdvr;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdvq = this;
                    this.zzdvr = zzn;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzdvq.zza(this.zzdvr);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final void zza(String str, Map<String, String> map, int i) {
        synchronized (this.lock) {
            if (i == 3) {
                this.zzdwd = true;
            }
            if (this.zzdvu.containsKey(str)) {
                if (i == 3) {
                    this.zzdvu.get(str).zzb(zzekj.zzb.zzh.zza.zzhw(i));
                }
                return;
            }
            zzekj.zzb.zzh.C0018zzb zzbje = zzekj.zzb.zzh.zzbje();
            zzekj.zzb.zzh.zza zzhw = zzekj.zzb.zzh.zza.zzhw(i);
            if (zzhw != null) {
                zzbje.zzb(zzhw);
            }
            zzbje.zzhx(this.zzdvu.size());
            zzbje.zzih(str);
            zzekj.zzb.zzd.zza zzbiw = zzekj.zzb.zzd.zzbiw();
            if (this.zzdwa.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : "";
                    String value = entry.getValue() != null ? entry.getValue() : "";
                    if (this.zzdwa.contains(key.toLowerCase(Locale.ENGLISH))) {
                        zzbiw.zza((zzekj.zzb.zzc) ((zzegp) zzekj.zzb.zzc.zzbiu().zzan(zzeff.zzhu(key)).zzao(zzeff.zzhu(value)).zzbfx()));
                    }
                }
            }
            zzbje.zzb((zzekj.zzb.zzd) ((zzegp) zzbiw.zzbfx()));
            this.zzdvu.put(str, zzbje);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzeb(String str) {
        synchronized (this.lock) {
            this.zzdvv.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzec(String str) {
        synchronized (this.lock) {
            this.zzdvw.add(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final String[] zza(String[] strArr) {
        return (String[]) this.zzdvz.zzb(strArr).toArray(new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final void zzvp() {
        this.zzdwb = true;
    }

    private final zzekj.zzb.zzh.C0018zzb zzed(String str) {
        zzekj.zzb.zzh.C0018zzb c0018zzb;
        synchronized (this.lock) {
            c0018zzb = this.zzdvu.get(str);
        }
        return c0018zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final void zzvq() {
        synchronized (this.lock) {
            zzdvt zzb = zzdvl.zzb(this.zzdvx.zza(this.zzvr, this.zzdvu.keySet()), new zzduv(this) { // from class: com.google.android.gms.internal.ads.zzavn
                private final zzavl zzdvq;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdvq = this;
                }

                @Override // com.google.android.gms.internal.ads.zzduv
                public final zzdvt zzf(Object obj) {
                    return this.zzdvq.zzi((Map) obj);
                }
            }, zzbbi.zzedz);
            zzdvt zza = zzdvl.zza(zzb, 10L, TimeUnit.SECONDS, zzbbi.zzedx);
            zzdvl.zza(zzb, new zzavo(this, zza), zzbbi.zzedz);
            zzdvs.add(zza);
        }
    }

    private final zzdvt<Void> zzvr() {
        zzdvt<Void> zzb;
        if (!((this.zzdvy && this.zzdsm.zzdwn) || (this.zzdwd && this.zzdsm.zzdwm) || (!this.zzdvy && this.zzdsm.zzdwk))) {
            return zzdvl.zzaf(null);
        }
        synchronized (this.lock) {
            for (zzekj.zzb.zzh.C0018zzb c0018zzb : this.zzdvu.values()) {
                this.zzdvt.zza((zzekj.zzb.zzh) ((zzegp) c0018zzb.zzbfx()));
            }
            this.zzdvt.zzm(this.zzdvv);
            this.zzdvt.zzn(this.zzdvw);
            if (zzavv.isEnabled()) {
                String url = this.zzdvt.getUrl();
                String zzbin = this.zzdvt.zzbin();
                StringBuilder sb = new StringBuilder(String.valueOf(url).length() + 53 + String.valueOf(zzbin).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(url);
                sb.append("\n  clickUrl: ");
                sb.append(zzbin);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzekj.zzb.zzh zzhVar : this.zzdvt.zzbim()) {
                    sb2.append("    [");
                    sb2.append(zzhVar.zzbjd());
                    sb2.append("] ");
                    sb2.append(zzhVar.getUrl());
                }
                zzavv.zzef(sb2.toString());
            }
            zzdvt<String> zza = new zzazt(this.zzvr).zza(1, this.zzdsm.zzdwi, null, ((zzekj.zzb) ((zzegp) this.zzdvt.zzbfx())).toByteArray());
            if (zzavv.isEnabled()) {
                zza.addListener(zzavm.zzdwe, zzbbi.zzedu);
            }
            zzb = zzdvl.zzb(zza, zzavp.zzdwg, zzbbi.zzedz);
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzi(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.lock) {
                            int length = optJSONArray.length();
                            zzekj.zzb.zzh.C0018zzb zzed = zzed(str);
                            if (zzed == null) {
                                String valueOf = String.valueOf(str);
                                zzavv.zzef(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzed.zzii(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zzdvy = (length > 0) | this.zzdvy;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (zzacu.zzdbp.get().booleanValue()) {
                    zzaxy.zzb("Failed to get SafeBrowsing metadata", e);
                }
                return zzdvl.immediateFailedFuture(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zzdvy) {
            synchronized (this.lock) {
                this.zzdvt.zza(zzekj.zzb.zzg.OCTAGON_AD_SB_MATCH);
            }
        }
        return zzvr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Bitmap bitmap) {
        zzefo zzbdm = zzeff.zzbdm();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzbdm);
        synchronized (this.lock) {
            this.zzdvt.zza((zzekj.zzb.zzf) ((zzegp) zzekj.zzb.zzf.zzbjb().zzaq(zzbdm.zzbda()).zzie("image/png").zza(zzekj.zzb.zzf.EnumC0017zzb.TYPE_CREATIVE).zzbfx()));
        }
    }
}
