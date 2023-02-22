package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzyr {
    private String zzadl;
    private String zzcgz;
    private String zzchb;
    private String zzchf;
    private boolean zzchh;
    private AdInfo zzcjh;
    private Date zzmx;
    private Location zznb;
    private final HashSet<String> zzcjp = new HashSet<>();
    private final Bundle zzcjc = new Bundle();
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> zzcjq = new HashMap<>();
    private final HashSet<String> zzcjr = new HashSet<>();
    private final Bundle zzchd = new Bundle();
    private final HashSet<String> zzcjs = new HashSet<>();
    private final List<String> zzchj = new ArrayList();
    private int zzcgw = -1;
    private boolean zzbnu = false;
    private int zzadj = -1;
    private int zzadk = -1;

    public final void zzcj(String str) {
        this.zzcjp.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void zza(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            zza(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.zzcjq.put(networkExtras.getClass(), networkExtras);
        }
    }

    public final void zza(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.zzcjc.putBundle(cls.getName(), bundle);
    }

    public final void zzb(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.zzcjc.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.zzcjc.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.zzcjc.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    public final void zzck(String str) {
        this.zzcjr.add(str);
    }

    public final void zzcl(String str) {
        this.zzcjr.remove(str);
    }

    @Deprecated
    public final void zza(Date date) {
        this.zzmx = date;
    }

    public final void zzcm(String str) {
        this.zzchb = str;
    }

    public final void zzc(List<String> list) {
        this.zzchj.clear();
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                zzbbd.zzfe("neighboring content URL should not be null or empty");
            } else {
                this.zzchj.add(str);
            }
        }
    }

    @Deprecated
    public final void zzda(int i) {
        this.zzcgw = i;
    }

    public final void zza(Location location) {
        this.zznb = location;
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzbnu = z;
    }

    public final void zzcn(String str) {
        this.zzcgz = str;
    }

    public final void zzco(String str) {
        this.zzchf = str;
    }

    @Deprecated
    public final void zzz(boolean z) {
        this.zzadj = z ? 1 : 0;
    }

    public final void zze(String str, String str2) {
        this.zzchd.putString(str, str2);
    }

    public final void zzcp(String str) {
        this.zzcjs.add(str);
    }

    @Deprecated
    public final void zzaa(boolean z) {
        this.zzchh = z;
    }

    public final void zza(AdInfo adInfo) {
        this.zzcjh = adInfo;
    }

    @Deprecated
    public final void zzdb(int i) {
        if (i == -1 || i == 0 || i == 1) {
            this.zzadk = i;
        }
    }

    @Deprecated
    public final void zzcq(String str) {
        if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
            this.zzadl = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Date zza(zzyr zzyrVar) {
        return zzyrVar.zzmx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzb(zzyr zzyrVar) {
        return zzyrVar.zzchb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List zzc(zzyr zzyrVar) {
        return zzyrVar.zzchj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzd(zzyr zzyrVar) {
        return zzyrVar.zzcgw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashSet zze(zzyr zzyrVar) {
        return zzyrVar.zzcjp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Location zzf(zzyr zzyrVar) {
        return zzyrVar.zznb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzg(zzyr zzyrVar) {
        return zzyrVar.zzbnu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle zzh(zzyr zzyrVar) {
        return zzyrVar.zzcjc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashMap zzi(zzyr zzyrVar) {
        return zzyrVar.zzcjq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzj(zzyr zzyrVar) {
        return zzyrVar.zzcgz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzk(zzyr zzyrVar) {
        return zzyrVar.zzchf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzl(zzyr zzyrVar) {
        return zzyrVar.zzadj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashSet zzm(zzyr zzyrVar) {
        return zzyrVar.zzcjr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle zzn(zzyr zzyrVar) {
        return zzyrVar.zzchd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashSet zzo(zzyr zzyrVar) {
        return zzyrVar.zzcjs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzp(zzyr zzyrVar) {
        return zzyrVar.zzchh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AdInfo zzq(zzyr zzyrVar) {
        return zzyrVar.zzcjh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzr(zzyr zzyrVar) {
        return zzyrVar.zzadk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzs(zzyr zzyrVar) {
        return zzyrVar.zzadl;
    }
}
