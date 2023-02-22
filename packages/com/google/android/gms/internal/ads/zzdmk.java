package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdmk implements zzaxq, zzbsz {
    private final zzaxv zzdxp;
    private final HashSet<zzaxj> zzhdd = new HashSet<>();
    private final Context zzvr;

    public zzdmk(Context context, zzaxv zzaxvVar) {
        this.zzvr = context;
        this.zzdxp = zzaxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final synchronized void zzg(zzuw zzuwVar) {
        if (zzuwVar.errorCode != 3) {
            this.zzdxp.zzb(this.zzhdd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxq
    public final synchronized void zza(HashSet<zzaxj> hashSet) {
        this.zzhdd.clear();
        this.zzhdd.addAll(hashSet);
    }

    public final Bundle zzatb() {
        return this.zzdxp.zza(this.zzvr, this);
    }
}
