package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcsw implements zzcaz {
    private final zzbbg zzbop;
    private final zzdkx zzfyh;
    private final zzdvt<zzbzt> zzgmk;
    private final zzbfq zzgml;
    private final Context zzvr;

    private zzcsw(Context context, zzbbg zzbbgVar, zzdvt<zzbzt> zzdvtVar, zzdkx zzdkxVar, zzbfq zzbfqVar) {
        this.zzvr = context;
        this.zzbop = zzbbgVar;
        this.zzgmk = zzdvtVar;
        this.zzfyh = zzdkxVar;
        this.zzgml = zzbfqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zza(boolean z, Context context) {
        this.zzgml.zzax(true);
        com.google.android.gms.ads.internal.zzp.zzkp();
        com.google.android.gms.ads.internal.zzi zziVar = new com.google.android.gms.ads.internal.zzi(false, zzayh.zzbc(this.zzvr), false, 0.0f, -1, z, this.zzfyh.zzfnp, false);
        com.google.android.gms.ads.internal.zzp.zzko();
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((zzut) null, ((zzbzt) zzdvl.zzb(this.zzgmk)).zzagd(), (com.google.android.gms.ads.internal.overlay.zzt) null, this.zzgml, this.zzfyh.zzhaw, this.zzbop, this.zzfyh.zzdrx, zziVar, this.zzfyh.zzhao.zzdos, this.zzfyh.zzhao.zzdou), true);
    }
}
