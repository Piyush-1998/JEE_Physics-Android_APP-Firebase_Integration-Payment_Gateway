package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdfl implements zzden<zzdfi> {
    private final String packageName;
    private final zzdvw zzgay;
    private final zzass zzgwb;
    private final Context zzvr;

    public zzdfl(zzass zzassVar, Context context, String str, zzdvw zzdvwVar) {
        this.zzgwb = zzassVar;
        this.zzvr = context;
        this.packageName = str;
        this.zzgay = zzdvwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdfi> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdfk
            private final zzdfl zzgwa;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgwa = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgwa.zzarl();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdfi zzarl() throws Exception {
        JSONObject jSONObject = new JSONObject();
        zzass zzassVar = this.zzgwb;
        if (zzassVar != null) {
            zzassVar.zza(this.zzvr, this.packageName, jSONObject);
        }
        return new zzdfi(jSONObject);
    }
}
