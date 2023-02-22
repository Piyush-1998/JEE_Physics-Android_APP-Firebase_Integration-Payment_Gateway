package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcij {
    private final zzavu zzboc;
    private final zzeg zzenn;
    private final Executor zzfmk;
    private final zzbtu zzfqj;
    private final zzbur zzfvb;
    private final zzbst zzfvv;
    private final zzbma zzfvw;
    private final zzbyr zzfvy;
    private final zzbui zzgcs;
    private final zzbws zzgct;
    private final com.google.android.gms.ads.internal.zza zzgdh;
    private final zzbto zzgdi;
    private final zzbwl zzgdj;

    public zzcij(zzbst zzbstVar, zzbtu zzbtuVar, zzbui zzbuiVar, zzbur zzburVar, zzbws zzbwsVar, Executor executor, zzbyr zzbyrVar, zzbma zzbmaVar, com.google.android.gms.ads.internal.zza zzaVar, zzbto zzbtoVar, zzavu zzavuVar, zzeg zzegVar, zzbwl zzbwlVar) {
        this.zzfvv = zzbstVar;
        this.zzfqj = zzbtuVar;
        this.zzgcs = zzbuiVar;
        this.zzfvb = zzburVar;
        this.zzgct = zzbwsVar;
        this.zzfmk = executor;
        this.zzfvy = zzbyrVar;
        this.zzfvw = zzbmaVar;
        this.zzgdh = zzaVar;
        this.zzgdi = zzbtoVar;
        this.zzboc = zzavuVar;
        this.zzenn = zzegVar;
        this.zzgdj = zzbwlVar;
    }

    public final void zzb(final zzbfq zzbfqVar, boolean z) {
        zzdw zzca;
        zzbfqVar.zzabe().zza(new zzut(this) { // from class: com.google.android.gms.internal.ads.zzcim
            private final zzcij zzgdl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgdl = this;
            }

            @Override // com.google.android.gms.internal.ads.zzut
            public final void onAdClicked() {
                this.zzgdl.zzano();
            }
        }, this.zzgcs, this.zzfvb, new zzagn(this) { // from class: com.google.android.gms.internal.ads.zzcil
            private final zzcij zzgdl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgdl = this;
            }

            @Override // com.google.android.gms.internal.ads.zzagn
            public final void onAppEvent(String str, String str2) {
                this.zzgdl.zzp(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzt(this) { // from class: com.google.android.gms.internal.ads.zzcio
            private final zzcij zzgdl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgdl = this;
            }

            @Override // com.google.android.gms.ads.internal.overlay.zzt
            public final void zzuz() {
                this.zzgdl.zzann();
            }
        }, z, null, this.zzgdh, new zzcit(this), this.zzboc);
        zzbfqVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.google.android.gms.internal.ads.zzcin
            private final zzcij zzgdl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgdl = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.zzgdl.zza(view, motionEvent);
            }
        });
        zzbfqVar.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.gms.internal.ads.zzciq
            private final zzcij zzgdl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgdl = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.zzgdl.zzae(view);
            }
        });
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqn)).booleanValue() && (zzca = this.zzenn.zzca()) != null) {
            zzca.zzb(zzbfqVar.getView());
        }
        this.zzfvy.zza(zzbfqVar, this.zzfmk);
        this.zzfvy.zza(new zzqu(zzbfqVar) { // from class: com.google.android.gms.internal.ads.zzcip
            private final zzbfq zzepi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzepi = zzbfqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzqu
            public final void zza(zzqr zzqrVar) {
                this.zzepi.zzabe().zza(zzqrVar.zzbrq.left, zzqrVar.zzbrq.top, false);
            }
        }, this.zzfmk);
        this.zzfvy.zzv(zzbfqVar.getView());
        zzbfqVar.zza("/trackActiveViewUnit", new zzahf(this, zzbfqVar) { // from class: com.google.android.gms.internal.ads.zzcis
            private final zzbfq zzgak;
            private final zzcij zzgdl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgdl = this;
                this.zzgak = zzbfqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzahf
            public final void zza(Object obj, Map map) {
                this.zzgdl.zza(this.zzgak, (zzbfq) obj, map);
            }
        });
        this.zzfvw.zzo(zzbfqVar);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnx)).booleanValue()) {
            return;
        }
        zzbto zzbtoVar = this.zzgdi;
        zzbfqVar.getClass();
        zzbtoVar.zza(zzcir.zzn(zzbfqVar), this.zzfmk);
    }

    public static zzdvt<?> zza(zzbfq zzbfqVar, String str, String str2) {
        final zzbbq zzbbqVar = new zzbbq();
        zzbfqVar.zzabe().zza(new zzbhf(zzbbqVar) { // from class: com.google.android.gms.internal.ads.zzciu
            private final zzbbq zzbvp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbvp = zzbbqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbhf
            public final void zzak(boolean z) {
                zzbbq zzbbqVar2 = this.zzbvp;
                if (z) {
                    zzbbqVar2.set(null);
                } else {
                    zzbbqVar2.setException(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zzbfqVar.zzb(str, str2, null);
        return zzbbqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbfq zzbfqVar, zzbfq zzbfqVar2, Map map) {
        this.zzfvw.zzf(zzbfqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzae(View view) {
        this.zzgdh.recordClick();
        zzavu zzavuVar = this.zzboc;
        if (zzavuVar != null) {
            zzavuVar.zzvp();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ boolean zza(View view, MotionEvent motionEvent) {
        this.zzgdh.recordClick();
        zzavu zzavuVar = this.zzboc;
        if (zzavuVar != null) {
            zzavuVar.zzvp();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzann() {
        this.zzfqj.onAdLeftApplication();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str, String str2) {
        this.zzgct.onAppEvent(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzano() {
        this.zzfvv.onAdClicked();
    }
}
