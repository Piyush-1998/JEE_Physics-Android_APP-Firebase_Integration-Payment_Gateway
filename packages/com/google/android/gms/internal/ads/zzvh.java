package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzvh {
    public static final zzvh zzchm = new zzvh();

    protected zzvh() {
    }

    public static zzvc zza(Context context, zzyo zzyoVar) {
        Context context2;
        List list;
        zzuu zzuuVar;
        String str;
        Date birthday = zzyoVar.getBirthday();
        long time = birthday != null ? birthday.getTime() : -1L;
        String contentUrl = zzyoVar.getContentUrl();
        int gender = zzyoVar.getGender();
        Set<String> keywords = zzyoVar.getKeywords();
        if (keywords.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(keywords));
            context2 = context;
        }
        boolean isTestDevice = zzyoVar.isTestDevice(context2);
        Location location = zzyoVar.getLocation();
        Bundle networkExtrasBundle = zzyoVar.getNetworkExtrasBundle(AdMobAdapter.class);
        if (zzyoVar.zzqr() != null) {
            zzuuVar = new zzuu(zzyoVar.zzqr().getAdString(), zzwe.zzpy().containsKey(zzyoVar.zzqr().getQueryInfo()) ? zzwe.zzpy().get(zzyoVar.zzqr().getQueryInfo()) : "");
        } else {
            zzuuVar = null;
        }
        boolean manualImpressionsEnabled = zzyoVar.getManualImpressionsEnabled();
        String publisherProvidedId = zzyoVar.getPublisherProvidedId();
        SearchAdRequest zzqm = zzyoVar.zzqm();
        zzzy zzzyVar = zzqm != null ? new zzzy(zzqm) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzwe.zzpq();
            str = zzbat.zza(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean isDesignedForFamilies = zzyoVar.isDesignedForFamilies();
        RequestConfiguration requestConfiguration = zzyv.zzqt().getRequestConfiguration();
        return new zzvc(8, time, networkExtrasBundle, gender, list, isTestDevice, Math.max(zzyoVar.zzqp(), requestConfiguration.getTagForChildDirectedTreatment()), manualImpressionsEnabled, publisherProvidedId, zzzyVar, location, contentUrl, zzyoVar.zzqo(), zzyoVar.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzyoVar.zzqq())), zzyoVar.zzql(), str, isDesignedForFamilies, zzuuVar, Math.max(zzyoVar.zzqs(), requestConfiguration.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(zzyoVar.getMaxAdContentRating(), requestConfiguration.getMaxAdContentRating()), zzvg.zzchl), zzyoVar.zzqk());
    }

    public static zzatz zza(Context context, zzyo zzyoVar, String str) {
        return new zzatz(zza(context, zzyoVar), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ int zzd(String str, String str2) {
        return RequestConfiguration.zzadn.indexOf(str) - RequestConfiguration.zzadn.indexOf(str2);
    }
}
