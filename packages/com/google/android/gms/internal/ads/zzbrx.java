package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbrx implements zzbtp, zzbuj {
    private final zzaqs zzboi;
    private final zzdkx zzfpf;
    private final Context zzvr;

    public zzbrx(Context context, zzdkx zzdkxVar, zzaqs zzaqsVar) {
        this.zzvr = context;
        this.zzfpf = zzdkxVar;
        this.zzboi = zzaqsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzbz(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzca(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void onAdLoaded() {
        if (this.zzfpf.zzhbb == null || !this.zzfpf.zzhbb.zzdpd) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!this.zzfpf.zzhbb.zzdpe.isEmpty()) {
            arrayList.add(this.zzfpf.zzhbb.zzdpe);
        }
        this.zzboi.zza(this.zzvr, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzcb(Context context) {
        this.zzboi.detach();
    }
}
