package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzcty<AdT> implements zzcre<AdT> {
    protected abstract zzdvt<AdT> zza(zzdln zzdlnVar, Bundle bundle);

    @Override // com.google.android.gms.internal.ads.zzcre
    public final boolean zza(zzdlj zzdljVar, zzdkx zzdkxVar) {
        return !TextUtils.isEmpty(zzdkxVar.zzhar.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzdvt<AdT> zzb(zzdlj zzdljVar, zzdkx zzdkxVar) {
        String optString = zzdkxVar.zzhar.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzdln zzdlnVar = zzdljVar.zzhbp.zzfqn;
        zzdlp zzgt = new zzdlp().zzc(zzdlnVar).zzgt(optString);
        Bundle zzn = zzn(zzdlnVar.zzhbu.zzchc);
        Bundle zzn2 = zzn(zzn.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzn2.putInt("gw", 1);
        String optString2 = zzdkxVar.zzhar.optString("mad_hac", null);
        if (optString2 != null) {
            zzn2.putString("mad_hac", optString2);
        }
        String optString3 = zzdkxVar.zzhar.optString("adJson", null);
        if (optString3 != null) {
            zzn2.putString("_ad", optString3);
        }
        zzn2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzdkxVar.zzhau.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzdkxVar.zzhau.optString(next, null);
            if (next != null) {
                zzn2.putString(next, optString4);
            }
        }
        zzn.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzn2);
        zzdln zzasu = zzgt.zzh(new zzvc(zzdlnVar.zzhbu.versionCode, zzdlnVar.zzhbu.zzcgv, zzn2, zzdlnVar.zzhbu.zzcgw, zzdlnVar.zzhbu.zzcgx, zzdlnVar.zzhbu.zzcgy, zzdlnVar.zzhbu.zzadj, zzdlnVar.zzhbu.zzbnu, zzdlnVar.zzhbu.zzcgz, zzdlnVar.zzhbu.zzcha, zzdlnVar.zzhbu.zznb, zzdlnVar.zzhbu.zzchb, zzn, zzdlnVar.zzhbu.zzchd, zzdlnVar.zzhbu.zzche, zzdlnVar.zzhbu.zzchf, zzdlnVar.zzhbu.zzchg, zzdlnVar.zzhbu.zzchh, zzdlnVar.zzhbu.zzchi, zzdlnVar.zzhbu.zzadk, zzdlnVar.zzhbu.zzadl, zzdlnVar.zzhbu.zzchj)).zzasu();
        Bundle bundle = new Bundle();
        zzdkz zzdkzVar = zzdljVar.zzhbq.zzhbn;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzdkzVar.zzdiv));
        bundle2.putInt("refresh_interval", zzdkzVar.zzhbe);
        bundle2.putString("gws_query_id", zzdkzVar.zzdsg);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzdljVar.zzhbp.zzfqn.zzhbv;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzdkxVar.zzdjo);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzdkxVar.zzdis));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzdkxVar.zzdit));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzdkxVar.zzdru));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzdkxVar.zzhak));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzdkxVar.zzdsi));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzdkxVar.zzdsj));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzdkxVar.zzhaj));
        bundle3.putString("transaction_id", zzdkxVar.zzdjz);
        bundle3.putString("valid_from_timestamp", zzdkxVar.zzdka);
        bundle3.putBoolean("is_closable_area_disabled", zzdkxVar.zzboz);
        if (zzdkxVar.zzdsh != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzdkxVar.zzdsh.zzdva);
            bundle4.putString("rb_type", zzdkxVar.zzdsh.type);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zza(zzasu, bundle);
    }

    private static Bundle zzn(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }
}
