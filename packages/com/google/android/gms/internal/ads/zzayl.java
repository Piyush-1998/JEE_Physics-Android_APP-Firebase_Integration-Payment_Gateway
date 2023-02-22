package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzayl implements zzbau {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzeao;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayl(zzayh zzayhVar, Context context, String str) {
        this.val$context = context;
        this.zzeao = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzes(String str) {
        com.google.android.gms.ads.internal.zzp.zzkp();
        zzayh.zzb(this.val$context, this.zzeao, str);
    }
}
