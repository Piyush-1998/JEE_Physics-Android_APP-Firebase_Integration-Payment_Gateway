package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcvz implements com.google.android.gms.ads.internal.zzg {
    private final zzbyw zzfoe;
    private final zzbtl zzfvu;
    private final zzbst zzfvv;
    private final zzbma zzfvw;
    private final zzbyr zzfvy;
    private AtomicBoolean zzgou = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvz(zzbst zzbstVar, zzbtl zzbtlVar, zzbyw zzbywVar, zzbyr zzbyrVar, zzbma zzbmaVar) {
        this.zzfvv = zzbstVar;
        this.zzfvu = zzbtlVar;
        this.zzfoe = zzbywVar;
        this.zzfvy = zzbyrVar;
        this.zzfvw = zzbmaVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzh(View view) {
        if (this.zzgou.compareAndSet(false, true)) {
            this.zzfvw.onAdImpression();
            this.zzfvy.zzv(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzka() {
        if (this.zzgou.get()) {
            this.zzfvv.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzkb() {
        if (this.zzgou.get()) {
            this.zzfvu.onAdImpression();
            this.zzfoe.zzaki();
        }
    }
}
