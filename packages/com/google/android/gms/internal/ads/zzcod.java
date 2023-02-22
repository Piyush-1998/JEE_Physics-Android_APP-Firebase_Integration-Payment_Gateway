package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcod {
    private final Executor executor;
    private final zzdln zzfqn;
    private final zzbbg zzghx;
    private final Context zzvr;

    public zzcod(Context context, zzbbg zzbbgVar, zzdln zzdlnVar, Executor executor) {
        this.zzvr = context;
        this.zzghx = zzbbgVar;
        this.zzfqn = zzdlnVar;
        this.executor = executor;
    }

    public final zzdvt<zzdlj> zzapk() {
        final zzalm zza = com.google.android.gms.ads.internal.zzp.zzlc().zzb(this.zzvr, this.zzghx).zza("google.afma.response.normalize", zzalp.zzdhs, zzalp.zzdhs);
        final zzuu zzuuVar = this.zzfqn.zzhbu.zzchi;
        return zzdvl.zzb(zzdvl.zzb(zzdvl.zzb(zzdvl.zzaf(""), new zzduv(this, zzuuVar) { // from class: com.google.android.gms.internal.ads.zzcog
            private final zzcod zzghz;
            private final zzuu zzgia;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghz = this;
                this.zzgia = zzuuVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                zzuu zzuuVar2 = this.zzgia;
                String str = (String) obj;
                String str2 = zzuuVar2.zzcgo;
                String str3 = zzuuVar2.zzcgp;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("headers", new JSONObject());
                jSONObject3.put("body", str2);
                jSONObject2.put("base_url", "");
                jSONObject2.put("signals", new JSONObject(str3));
                jSONObject.put("request", jSONObject2);
                jSONObject.put("response", jSONObject3);
                jSONObject.put("flags", new JSONObject());
                return zzdvl.zzaf(jSONObject);
            }
        }, this.executor), new zzduv(zza) { // from class: com.google.android.gms.internal.ads.zzcof
            private final zzalm zzghy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghy = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzghy.zzi((JSONObject) obj);
            }
        }, this.executor), new zzduv(this) { // from class: com.google.android.gms.internal.ads.zzcoi
            private final zzcod zzghz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghz = this;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzghz.zzo((JSONObject) obj);
            }
        }, this.executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzo(JSONObject jSONObject) throws Exception {
        return zzdvl.zzaf(new zzdlj(new zzdle(this.zzfqn), zzdlh.zza(new StringReader(jSONObject.toString()))));
    }
}
