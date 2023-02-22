package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczn implements zzdek<Bundle> {
    private final zzdln zzfqn;

    public zzczn(zzdln zzdlnVar) {
        Preconditions.checkNotNull(zzdlnVar, "the targeting must not be null");
        this.zzfqn = zzdlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzvc zzvcVar = this.zzfqn.zzhbu;
        bundle2.putString("slotname", this.zzfqn.zzhbv);
        int i = zzczm.zzgdc[this.zzfqn.zzhcb.zzhbf - 1];
        if (i == 1) {
            bundle2.putBoolean("is_new_rewarded", true);
        } else if (i == 2) {
            bundle2.putBoolean("is_rewarded_interstitial", true);
        }
        zzdlu.zza(bundle2, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzvcVar.zzcgv)), zzvcVar.zzcgv != -1);
        zzdlu.zza(bundle2, "extras", zzvcVar.extras);
        zzdlu.zza(bundle2, "cust_gender", Integer.valueOf(zzvcVar.zzcgw), zzvcVar.zzcgw != -1);
        zzdlu.zza(bundle2, "kw", zzvcVar.zzcgx);
        zzdlu.zza(bundle2, "tag_for_child_directed_treatment", Integer.valueOf(zzvcVar.zzadj), zzvcVar.zzadj != -1);
        if (zzvcVar.zzcgy) {
            bundle2.putBoolean("test_request", zzvcVar.zzcgy);
        }
        zzdlu.zza(bundle2, "d_imp_hdr", (Integer) 1, zzvcVar.versionCode >= 2 && zzvcVar.zzbnu);
        zzdlu.zza(bundle2, "ppid", zzvcVar.zzcgz, zzvcVar.versionCode >= 2 && !TextUtils.isEmpty(zzvcVar.zzcgz));
        if (zzvcVar.zznb != null) {
            Location location = zzvcVar.zznb;
            Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
            Long valueOf2 = Long.valueOf(location.getTime() * 1000);
            Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
            Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", valueOf.floatValue());
            bundle3.putLong("lat", valueOf3.longValue());
            bundle3.putLong("long", valueOf4.longValue());
            bundle3.putLong("time", valueOf2.longValue());
            bundle2.putBundle("uule", bundle3);
        }
        zzdlu.zza(bundle2, ImagesContract.URL, zzvcVar.zzchb);
        zzdlu.zza(bundle2, "neighboring_content_urls", zzvcVar.zzchj);
        zzdlu.zza(bundle2, "custom_targeting", zzvcVar.zzchd);
        zzdlu.zza(bundle2, "category_exclusions", zzvcVar.zzche);
        zzdlu.zza(bundle2, "request_agent", zzvcVar.zzchf);
        zzdlu.zza(bundle2, "request_pkg", zzvcVar.zzchg);
        zzdlu.zza(bundle2, "is_designed_for_families", Boolean.valueOf(zzvcVar.zzchh), zzvcVar.versionCode >= 7);
        if (zzvcVar.versionCode >= 8) {
            zzdlu.zza(bundle2, "tag_for_under_age_of_consent", Integer.valueOf(zzvcVar.zzadk), zzvcVar.zzadk != -1);
            zzdlu.zza(bundle2, "max_ad_content_rating", zzvcVar.zzadl);
        }
    }
}
