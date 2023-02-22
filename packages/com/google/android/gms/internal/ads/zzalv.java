package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzalv<I, O> implements zzalm<I, O> {
    private final zzakk zzdhx;
    private final zzalo<O> zzdhy;
    private final zzaln<I> zzdhz;
    private final String zzdia;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalv(zzakk zzakkVar, String str, zzaln<I> zzalnVar, zzalo<O> zzaloVar) {
        this.zzdhx = zzakkVar;
        this.zzdia = str;
        this.zzdhz = zzalnVar;
        this.zzdhy = zzaloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final zzdvt<O> zzi(I i) {
        zzbbq zzbbqVar = new zzbbq();
        zzakx zzb = this.zzdhx.zzb((zzeg) null);
        zzb.zza(new zzaly(this, zzb, i, zzbbqVar), new zzalx(this, zzbbqVar, zzb));
        return zzbbqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzakx zzakxVar, zzali zzaliVar, I i, zzbbq<O> zzbbqVar) {
        try {
            com.google.android.gms.ads.internal.zzp.zzkp();
            String zzxo = zzayh.zzxo();
            zzagp.zzdem.zza(zzxo, new zzama(this, zzakxVar, zzbbqVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", zzxo);
            jSONObject.put("args", this.zzdhz.zzj(i));
            zzaliVar.zza(this.zzdia, jSONObject);
        } catch (Exception e) {
            try {
                zzbbqVar.setException(e);
                zzaxy.zzc("Unable to invokeJavascript", e);
            } finally {
                zzakxVar.release();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzduv
    public final zzdvt<O> zzf(I i) throws Exception {
        return zzi(i);
    }
}
