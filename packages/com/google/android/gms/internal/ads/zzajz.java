package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzajz implements zzajs, zzajx {
    private final zzbfq zzdgc;
    private final Context zzvr;

    public zzajz(Context context, zzbbg zzbbgVar, zzeg zzegVar, com.google.android.gms.ads.internal.zzb zzbVar) throws zzbgc {
        this.zzvr = context;
        com.google.android.gms.ads.internal.zzp.zzkq();
        zzbfq zza = zzbfy.zza(context, zzbhj.zzacu(), "", false, false, zzegVar, null, zzbbgVar, null, null, null, zzto.zzmy(), null, false);
        this.zzdgc = zza;
        zza.getView().setWillNotDraw(true);
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final void zza(String str, Map map) {
        zzajr.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzakh
    public final void zza(String str, JSONObject jSONObject) {
        zzajr.zza(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzajs, com.google.android.gms.internal.ads.zzajk
    public final void zzb(String str, JSONObject jSONObject) {
        zzajr.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zzj(String str, String str2) {
        zzajr.zza(this, str, str2);
    }

    private static void runOnUiThread(Runnable runnable) {
        zzwe.zzpq();
        if (zzbat.zzyn()) {
            runnable.run();
        } else {
            zzayh.zzeaj.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajs, com.google.android.gms.internal.ads.zzakh
    public final void zzdc(final String str) {
        runOnUiThread(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzakc
            private final String zzdft;
            private final zzajz zzdge;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdge = this;
                this.zzdft = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdge.zzdh(this.zzdft);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzcz(String str) {
        runOnUiThread(new zzakd(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str)));
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzda(String str) {
        runOnUiThread(new zzakg(this, str));
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzdb(String str) {
        runOnUiThread(new zzakf(this, str));
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final void zza(String str, zzahf<? super zzali> zzahfVar) {
        this.zzdgc.zza(str, new zzaki(this, zzahfVar));
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final void zzb(String str, final zzahf<? super zzali> zzahfVar) {
        this.zzdgc.zza(str, new Predicate(zzahfVar) { // from class: com.google.android.gms.internal.ads.zzakb
            private final zzahf zzdgd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdgd = zzahfVar;
            }

            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzahf zzahfVar2;
                zzahf zzahfVar3 = this.zzdgd;
                zzahf zzahfVar4 = (zzahf) obj;
                if (zzahfVar4 instanceof zzaki) {
                    zzahfVar2 = ((zzaki) zzahfVar4).zzdgj;
                    return zzahfVar2.equals(zzahfVar3);
                }
                return false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zza(zzaka zzakaVar) {
        zzbhc zzabe = this.zzdgc.zzabe();
        zzakaVar.getClass();
        zzabe.zza(zzake.zzb(zzakaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final zzalh zztd() {
        return new zzalk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void destroy() {
        this.zzdgc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final boolean isDestroyed() {
        return this.zzdgc.isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzdh(String str) {
        this.zzdgc.zzdc(str);
    }
}
