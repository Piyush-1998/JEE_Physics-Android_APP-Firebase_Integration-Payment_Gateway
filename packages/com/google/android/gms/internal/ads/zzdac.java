package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdac implements zzden<zzdaa> {
    private final String zzdpz;
    private final zzcji zzggg;
    private final zzdvw zzgse;

    public zzdac(String str, zzdvw zzdvwVar, zzcji zzcjiVar) {
        this.zzdpz = str;
        this.zzgse = zzdvwVar;
        this.zzggg = zzcjiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdaa> zzaqs() {
        if (new BigInteger(this.zzdpz).equals(BigInteger.ONE)) {
            if (!zzdsw.zzas((String) zzwe.zzpu().zzd(zzaat.zzcpq))) {
                return this.zzgse.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdaf
                    private final zzdac zzgsw;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgsw = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zzgsw.zzaqu();
                    }
                });
            }
        }
        return zzdvl.zzaf(new zzdaa(new Bundle()));
    }

    private static Bundle zzb(zzdlx zzdlxVar) {
        Bundle bundle = new Bundle();
        try {
            if (zzdlxVar.zztx() != null) {
                bundle.putString("sdk_version", zzdlxVar.zztx().toString());
            }
        } catch (zzdlr unused) {
        }
        try {
            if (zzdlxVar.zztw() != null) {
                bundle.putString("adapter_version", zzdlxVar.zztw().toString());
            }
        } catch (zzdlr unused2) {
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdaa zzaqu() throws Exception {
        List<String> asList = Arrays.asList(((String) zzwe.zzpu().zzd(zzaat.zzcpq)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                bundle.putBundle(str, zzb(this.zzggg.zzd(str, new JSONObject())));
            } catch (zzdlr unused) {
            }
        }
        return new zzdaa(bundle);
    }
}
