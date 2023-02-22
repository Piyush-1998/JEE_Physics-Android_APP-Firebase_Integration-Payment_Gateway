package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzabh {
    private final Map<String, zzabi> zzcyl = new HashMap();
    private final zzabk zzcym;

    public zzabh(zzabk zzabkVar) {
        this.zzcym = zzabkVar;
    }

    public final void zza(String str, zzabi zzabiVar) {
        this.zzcyl.put(str, zzabiVar);
    }

    public final void zzb(String str, String str2, long j) {
        zzabk zzabkVar = this.zzcym;
        zzabi zzabiVar = this.zzcyl.get(str2);
        String[] strArr = {str};
        if (zzabkVar != null && zzabiVar != null) {
            zzabkVar.zza(zzabiVar, j, strArr);
        }
        Map<String, zzabi> map = this.zzcyl;
        zzabk zzabkVar2 = this.zzcym;
        map.put(str, zzabkVar2 == null ? null : zzabkVar2.zzex(j));
    }

    public final zzabk zzrm() {
        return this.zzcym;
    }
}
