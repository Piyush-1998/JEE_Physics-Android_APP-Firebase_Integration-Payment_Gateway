package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdmm {
    private final Context zzaai;
    private final zzbbg zzbop;
    private final zzaxk zzbps;
    private final Map<String, zzdmo> zzhde = new HashMap();

    public zzdmm(Context context, zzbbg zzbbgVar, zzaxk zzaxkVar) {
        this.zzaai = context;
        this.zzbop = zzbbgVar;
        this.zzbps = zzaxkVar;
    }

    public final zzdmo zzgv(String str) {
        if (str == null) {
            return zzatc();
        }
        if (this.zzhde.containsKey(str)) {
            return this.zzhde.get(str);
        }
        zzdmo zzgw = zzgw(str);
        this.zzhde.put(str, zzgw);
        return zzgw;
    }

    private final zzdmo zzatc() {
        return new zzdmo(this.zzaai, this.zzbps.zzwj(), this.zzbps.zzwl());
    }

    private final zzdmo zzgw(String str) {
        zzatg zzaa = zzatg.zzaa(this.zzaai);
        try {
            zzaa.setAppPackageName(str);
            zzayd zzaydVar = new zzayd();
            zzaydVar.zza(this.zzaai, str, false);
            zzaye zzayeVar = new zzaye(this.zzbps.zzwj(), zzaydVar);
            return new zzdmo(zzaa, zzayeVar, new zzaxv(zzbat.zzyo(), zzayeVar));
        } catch (PackageManager.NameNotFoundException unused) {
            return zzatc();
        }
    }
}
