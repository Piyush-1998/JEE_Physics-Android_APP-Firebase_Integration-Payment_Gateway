package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbmj implements zzqu {
    private final Clock zzbpw;
    private zzbfq zzdgc;
    private final zzbly zzfmh;
    private final Executor zzfmk;
    private boolean zzbvt = false;
    private boolean zzfnf = false;
    private zzbmc zzfmm = new zzbmc();

    public zzbmj(Executor executor, zzbly zzblyVar, Clock clock) {
        this.zzfmk = executor;
        this.zzfmh = zzblyVar;
        this.zzbpw = clock;
    }

    private final void zzahb() {
        try {
            final JSONObject zzj = this.zzfmh.zzj(this.zzfmm);
            if (this.zzdgc != null) {
                this.zzfmk.execute(new Runnable(this, zzj) { // from class: com.google.android.gms.internal.ads.zzbmm
                    private final JSONObject zzfmf;
                    private final zzbmj zzfng;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfng = this;
                        this.zzfmf = zzj;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzfng.zzi(this.zzfmf);
                    }
                });
            }
        } catch (JSONException e) {
            zzaxy.zza("Failed to call video active view js", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqu
    public final void zza(zzqr zzqrVar) {
        this.zzfmm.zzbrk = this.zzfnf ? false : zzqrVar.zzbrk;
        this.zzfmm.timestamp = this.zzbpw.elapsedRealtime();
        this.zzfmm.zzfmw = zzqrVar;
        if (this.zzbvt) {
            zzahb();
        }
    }

    public final void zzg(zzbfq zzbfqVar) {
        this.zzdgc = zzbfqVar;
    }

    public final void disable() {
        this.zzbvt = false;
    }

    public final void enable() {
        this.zzbvt = true;
        zzahb();
    }

    public final void zzbf(boolean z) {
        this.zzfnf = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(JSONObject jSONObject) {
        this.zzdgc.zza("AFMA_updateActiveView", jSONObject);
    }
}
