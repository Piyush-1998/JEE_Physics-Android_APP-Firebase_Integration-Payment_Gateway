package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzyo {
    private final int zzadj;
    private final int zzadk;
    private final String zzadl;
    private final boolean zzbnu;
    private final int zzcgw;
    private final String zzcgz;
    private final String zzchb;
    private final Bundle zzchd;
    private final String zzchf;
    private final boolean zzchh;
    private final List<String> zzchj;
    private final Bundle zzcjc;
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> zzcjd;
    private final SearchAdRequest zzcje;
    private final Set<String> zzcjf;
    private final Set<String> zzcjg;
    private final AdInfo zzcjh;
    private final Date zzmx;
    private final Set<String> zzmz;
    private final Location zznb;

    public zzyo(zzyr zzyrVar) {
        this(zzyrVar, null);
    }

    public zzyo(zzyr zzyrVar, SearchAdRequest searchAdRequest) {
        this.zzmx = zzyr.zza(zzyrVar);
        this.zzchb = zzyr.zzb(zzyrVar);
        this.zzchj = zzyr.zzc(zzyrVar);
        this.zzcgw = zzyr.zzd(zzyrVar);
        this.zzmz = Collections.unmodifiableSet(zzyr.zze(zzyrVar));
        this.zznb = zzyr.zzf(zzyrVar);
        this.zzbnu = zzyr.zzg(zzyrVar);
        this.zzcjc = zzyr.zzh(zzyrVar);
        this.zzcjd = Collections.unmodifiableMap(zzyr.zzi(zzyrVar));
        this.zzcgz = zzyr.zzj(zzyrVar);
        this.zzchf = zzyr.zzk(zzyrVar);
        this.zzcje = searchAdRequest;
        this.zzadj = zzyr.zzl(zzyrVar);
        this.zzcjf = Collections.unmodifiableSet(zzyr.zzm(zzyrVar));
        this.zzchd = zzyr.zzn(zzyrVar);
        this.zzcjg = Collections.unmodifiableSet(zzyr.zzo(zzyrVar));
        this.zzchh = zzyr.zzp(zzyrVar);
        this.zzcjh = zzyr.zzq(zzyrVar);
        this.zzadk = zzyr.zzr(zzyrVar);
        this.zzadl = zzyr.zzs(zzyrVar);
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zzmx;
    }

    public final String getContentUrl() {
        return this.zzchb;
    }

    public final List<String> zzqk() {
        return new ArrayList(this.zzchj);
    }

    @Deprecated
    public final int getGender() {
        return this.zzcgw;
    }

    public final Set<String> getKeywords() {
        return this.zzmz;
    }

    public final Location getLocation() {
        return this.zznb;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbnu;
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzcjd.get(cls);
    }

    public final Bundle getNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls) {
        return this.zzcjc.getBundle(cls.getName());
    }

    public final Bundle getCustomEventExtrasBundle(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.zzcjc.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final String getPublisherProvidedId() {
        return this.zzcgz;
    }

    public final String zzql() {
        return this.zzchf;
    }

    public final SearchAdRequest zzqm() {
        return this.zzcje;
    }

    public final boolean isTestDevice(Context context) {
        RequestConfiguration requestConfiguration = zzyv.zzqt().getRequestConfiguration();
        zzwe.zzpq();
        String zzbm = zzbat.zzbm(context);
        return this.zzcjf.contains(zzbm) || requestConfiguration.getTestDeviceIds().contains(zzbm);
    }

    public final Map<Class<? extends NetworkExtras>, NetworkExtras> zzqn() {
        return this.zzcjd;
    }

    public final Bundle zzqo() {
        return this.zzcjc;
    }

    public final int zzqp() {
        return this.zzadj;
    }

    public final Bundle getCustomTargeting() {
        return this.zzchd;
    }

    public final Set<String> zzqq() {
        return this.zzcjg;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzchh;
    }

    public final AdInfo zzqr() {
        return this.zzcjh;
    }

    public final int zzqs() {
        return this.zzadk;
    }

    public final String getMaxAdContentRating() {
        return this.zzadl;
    }
}
