package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcou implements zzbvj {
    private final zzawb zzbqm;
    private final Context zzvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcou(Context context, zzawb zzawbVar) {
        this.zzvr = context;
        this.zzbqm = zzawbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzd(zzasp zzaspVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzb(zzdlj zzdljVar) {
        if (TextUtils.isEmpty(zzdljVar.zzhbq.zzhbn.zzdst)) {
            return;
        }
        this.zzbqm.zza(this.zzvr, zzdljVar.zzhbp.zzfqn.zzhbu);
        this.zzbqm.zzk(this.zzvr, zzdljVar.zzhbq.zzhbn.zzdst);
    }
}
