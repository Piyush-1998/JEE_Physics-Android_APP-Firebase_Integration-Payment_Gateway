package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbma implements com.google.android.gms.ads.internal.overlay.zzo, zzbtm, zzbtp, zzqu {
    private final Clock zzbpw;
    private final zzblr zzfmg;
    private final zzbly zzfmh;
    private final zzamg<JSONObject, JSONObject> zzfmj;
    private final Executor zzfmk;
    private final Set<zzbfq> zzfmi = new HashSet();
    private final AtomicBoolean zzfml = new AtomicBoolean(false);
    private final zzbmc zzfmm = new zzbmc();
    private boolean zzfmn = false;
    private WeakReference<?> zzfmo = new WeakReference<>(this);

    public zzbma(zzalz zzalzVar, zzbly zzblyVar, Executor executor, zzblr zzblrVar, Clock clock) {
        this.zzfmg = zzblrVar;
        this.zzfmj = zzalzVar.zzb("google.afma.activeView.handleUpdate", zzalp.zzdhs, zzalp.zzdhs);
        this.zzfmh = zzblyVar;
        this.zzfmk = executor;
        this.zzbpw = clock;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzui() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzuj() {
    }

    public final synchronized void zzagy() {
        if (!(this.zzfmo.get() != null)) {
            zzaha();
            return;
        }
        if (!this.zzfmn && this.zzfml.get()) {
            try {
                this.zzfmm.timestamp = this.zzbpw.elapsedRealtime();
                final JSONObject zzj = this.zzfmh.zzj(this.zzfmm);
                for (final zzbfq zzbfqVar : this.zzfmi) {
                    this.zzfmk.execute(new Runnable(zzbfqVar, zzj) { // from class: com.google.android.gms.internal.ads.zzblz
                        private final zzbfq zzepi;
                        private final JSONObject zzfmf;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzepi = zzbfqVar;
                            this.zzfmf = zzj;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzepi.zza("AFMA_updateActiveView", this.zzfmf);
                        }
                    });
                }
                zzbbm.zzb(this.zzfmj.zzf(zzj), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                zzaxy.zza("Failed to call ActiveViewJS", e);
            }
        }
    }

    private final void zzagz() {
        for (zzbfq zzbfqVar : this.zzfmi) {
            this.zzfmg.zze(zzbfqVar);
        }
        this.zzfmg.zzagx();
    }

    public final synchronized void zzaha() {
        zzagz();
        this.zzfmn = true;
    }

    public final synchronized void zzf(zzbfq zzbfqVar) {
        this.zzfmi.add(zzbfqVar);
        this.zzfmg.zzd(zzbfqVar);
    }

    public final void zzo(Object obj) {
        this.zzfmo = new WeakReference<>(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzqu
    public final synchronized void zza(zzqr zzqrVar) {
        this.zzfmm.zzbrk = zzqrVar.zzbrk;
        this.zzfmm.zzfmw = zzqrVar;
        zzagy();
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final synchronized void zzbz(Context context) {
        this.zzfmm.zzfmt = true;
        zzagy();
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final synchronized void zzca(Context context) {
        this.zzfmm.zzfmt = false;
        zzagy();
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final synchronized void zzcb(Context context) {
        this.zzfmm.zzfmv = "u";
        zzagy();
        zzagz();
        this.zzfmn = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onPause() {
        this.zzfmm.zzfmt = true;
        zzagy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onResume() {
        this.zzfmm.zzfmt = false;
        zzagy();
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final synchronized void onAdImpression() {
        if (this.zzfml.compareAndSet(false, true)) {
            this.zzfmg.zza(this);
            zzagy();
        }
    }
}
