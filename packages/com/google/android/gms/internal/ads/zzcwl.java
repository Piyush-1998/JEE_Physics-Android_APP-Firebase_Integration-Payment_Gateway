package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcwl implements zzcwf<zzbzr> {
    private final zzcar zzglr;
    private final Context zzvr;

    public zzcwl(Context context, zzcar zzcarVar) {
        this.zzvr = context;
        this.zzglr = zzcarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwf
    public final /* synthetic */ zzbzr zza(zzdlj zzdljVar, zzdkx zzdkxVar, View view, zzcwm zzcwmVar) {
        zzbzt zza = this.zzglr.zza(new zzbpt(zzdljVar, zzdkxVar, null), new zzcwn(this, zzcwo.zzgpg));
        zzcwmVar.zza(new zzcwq(this, zza));
        return zza.zzagb();
    }
}
