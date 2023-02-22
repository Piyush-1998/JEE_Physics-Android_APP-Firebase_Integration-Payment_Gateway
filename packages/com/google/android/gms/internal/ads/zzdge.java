package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdge implements zzden<zzdgf> {
    List<String> zzdqh;
    private zzdvw zzgay;
    zzaaf zzgwn;

    public zzdge(zzaaf zzaafVar, zzdvw zzdvwVar, List<String> list) {
        this.zzgwn = zzaafVar;
        this.zzgay = zzdvwVar;
        this.zzdqh = list;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdgf> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdgh
            private final zzdge zzgwo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgwo = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdge zzdgeVar = this.zzgwo;
                return new zzdgf(zzdgeVar.zzgwn.zzf(zzdgeVar.zzdqh));
            }
        });
    }
}
