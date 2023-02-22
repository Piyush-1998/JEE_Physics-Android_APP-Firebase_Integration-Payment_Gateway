package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaxm extends zzaxu {
    private final /* synthetic */ zzaxk zzdym;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxm(zzaxk zzaxkVar) {
        this.zzdym = zzaxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxu
    public final void zzuy() {
        Context context;
        zzbbg zzbbgVar;
        Object obj;
        zzaba zzabaVar;
        context = this.zzdym.zzvr;
        zzbbgVar = this.zzdym.zzbpa;
        zzaax zzaaxVar = new zzaax(context, zzbbgVar.zzbra);
        obj = this.zzdym.lock;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzp.zzky();
                zzabaVar = this.zzdym.zzdxz;
                zzabc.zza(zzabaVar, zzaaxVar);
            } catch (IllegalArgumentException e) {
                zzaxy.zzd("Cannot config CSI reporter.", e);
            }
        }
    }
}
