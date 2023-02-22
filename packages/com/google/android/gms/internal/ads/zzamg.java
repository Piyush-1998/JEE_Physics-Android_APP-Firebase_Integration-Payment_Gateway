package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzamg<I, O> implements zzduv<I, O> {
    private final zzalo<O> zzdhy;
    private final zzaln<I> zzdhz;
    private final String zzdia;
    private final zzdvt<zzali> zzdif;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamg(zzdvt<zzali> zzdvtVar, String str, zzaln<I> zzalnVar, zzalo<O> zzaloVar) {
        this.zzdif = zzdvtVar;
        this.zzdia = str;
        this.zzdhz = zzalnVar;
        this.zzdhy = zzaloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzduv
    public final zzdvt<O> zzf(final I i) throws Exception {
        return zzdvl.zzb(this.zzdif, new zzduv(this, i) { // from class: com.google.android.gms.internal.ads.zzamf
            private final zzamg zzdii;
            private final Object zzdij;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdii = this;
                this.zzdij = i;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzdii.zza(this.zzdij, (zzali) obj);
            }
        }, zzbbi.zzedz);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(Object obj, zzali zzaliVar) throws Exception {
        zzbbq zzbbqVar = new zzbbq();
        com.google.android.gms.ads.internal.zzp.zzkp();
        String zzxo = zzayh.zzxo();
        zzagp.zzdem.zza(zzxo, new zzami(this, zzbbqVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", zzxo);
        jSONObject.put("args", this.zzdhz.zzj(obj));
        zzaliVar.zza(this.zzdia, jSONObject);
        return zzbbqVar;
    }
}
