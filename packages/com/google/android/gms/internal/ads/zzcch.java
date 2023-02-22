package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcch implements zzelo<zzqo> {
    private final zzelx<zzbbg> zzfnd;
    private final zzelx<String> zzfne;

    public zzcch(zzelx<zzbbg> zzelxVar, zzelx<String> zzelxVar2) {
        this.zzfnd = zzelxVar;
        this.zzfne = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        com.google.android.gms.ads.internal.zzp.zzkp();
        return (zzqo) zzelu.zza(new zzqo(zzayh.zzxo(), this.zzfnd.get(), this.zzfne.get(), new JSONObject(), false, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}
