package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcco extends zzbpd {
    private final zzbbg zzbpa;
    private final zzeg zzenn;
    private final Executor zzfmk;
    private final zzcdg zzfod;
    private final zzavy zzfpr;
    private final zzcxh zzftk;
    private final zzccv zzfvt;
    private final zzcdd zzfwx;
    private final zzcdr zzfwy;
    private final zzccz zzfwz;
    private final zzeli<zzcgu> zzfxa;
    private final zzeli<zzcgs> zzfxb;
    private final zzeli<zzcgx> zzfxc;
    private final zzeli<zzcgo> zzfxd;
    private final zzeli<zzcgw> zzfxe;
    private zzcep zzfxf;
    private boolean zzfxg;
    private final zzccu zzfxh;
    private final Context zzvr;

    public zzcco(zzbpg zzbpgVar, Executor executor, zzccv zzccvVar, zzcdd zzcddVar, zzcdr zzcdrVar, zzccz zzcczVar, zzcdg zzcdgVar, zzeli<zzcgu> zzeliVar, zzeli<zzcgs> zzeliVar2, zzeli<zzcgx> zzeliVar3, zzeli<zzcgo> zzeliVar4, zzeli<zzcgw> zzeliVar5, zzavy zzavyVar, zzeg zzegVar, zzbbg zzbbgVar, Context context, zzccu zzccuVar, zzcxh zzcxhVar) {
        super(zzbpgVar);
        this.zzfmk = executor;
        this.zzfvt = zzccvVar;
        this.zzfwx = zzcddVar;
        this.zzfwy = zzcdrVar;
        this.zzfwz = zzcczVar;
        this.zzfod = zzcdgVar;
        this.zzfxa = zzeliVar;
        this.zzfxb = zzeliVar2;
        this.zzfxc = zzeliVar3;
        this.zzfxd = zzeliVar4;
        this.zzfxe = zzeliVar5;
        this.zzfpr = zzavyVar;
        this.zzenn = zzegVar;
        this.zzbpa = zzbbgVar;
        this.zzvr = context;
        this.zzfxh = zzccuVar;
        this.zzftk = zzcxhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzahw() {
        this.zzfmk.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzccn
            private final zzcco zzfww;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfww = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfww.zzalm();
            }
        });
        if (this.zzfvt.zzaln() != 7) {
            Executor executor = this.zzfmk;
            zzcdd zzcddVar = this.zzfwx;
            zzcddVar.getClass();
            executor.execute(zzccq.zza(zzcddVar));
        }
        super.zzahw();
    }

    public final synchronized void zzfz(String str) {
        this.zzfwx.zzfz(str);
    }

    public final synchronized void zzalc() {
        if (this.zzfxg) {
            return;
        }
        this.zzfwx.zzalc();
    }

    public final synchronized void zzg(Bundle bundle) {
        this.zzfwx.zzg(bundle);
    }

    public final synchronized boolean zzi(Bundle bundle) {
        if (this.zzfxg) {
            return true;
        }
        boolean zzi = this.zzfwx.zzi(bundle);
        this.zzfxg = zzi;
        return zzi;
    }

    public final synchronized void zzh(Bundle bundle) {
        this.zzfwx.zzh(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final synchronized void destroy() {
        this.zzfmk.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzccp
            private final zzcco zzfww;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfww = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfww.zzall();
            }
        });
        super.destroy();
    }

    public final synchronized void zza(zzcep zzcepVar) {
        zzdw zzca;
        this.zzfxf = zzcepVar;
        this.zzfwy.zza(zzcepVar);
        this.zzfwx.zza(zzcepVar.zzahq(), zzcepVar.zzamp(), zzcepVar.zzamq(), zzcepVar, zzcepVar);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqn)).booleanValue() && (zzca = this.zzenn.zzca()) != null) {
            zzca.zzb(zzcepVar.zzahq());
        }
        if (zzcepVar.zzamt() != null) {
            zzcepVar.zzamt().zza(this.zzfpr);
        }
    }

    public final synchronized void zzb(zzcep zzcepVar) {
        this.zzfwx.zza(zzcepVar.zzahq(), zzcepVar.zzamo());
        if (zzcepVar.zzams() != null) {
            zzcepVar.zzams().setClickable(false);
            zzcepVar.zzams().removeAllViews();
        }
        if (zzcepVar.zzamt() != null) {
            zzcepVar.zzamt().zzb(this.zzfpr);
        }
        this.zzfxf = null;
    }

    public final synchronized void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        this.zzfwy.zzc(this.zzfxf);
        this.zzfwx.zza(view, view2, map, map2, z);
    }

    public final synchronized void zza(View view, MotionEvent motionEvent, View view2) {
        this.zzfwx.zza(view, motionEvent, view2);
    }

    public final synchronized void zzb(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.zzfxg) {
            return;
        }
        if (z) {
            this.zzfwy.zzd(this.zzfxf);
            this.zzfwx.zza(view, map, map2);
            this.zzfxg = true;
            return;
        }
        if (!z) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcrv)).booleanValue() && map != null) {
                for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                    View view2 = entry.getValue().get();
                    if (view2 != null && zzz(view2)) {
                        this.zzfwy.zzd(this.zzfxf);
                        this.zzfwx.zza(view, map, map2);
                        this.zzfxg = true;
                        return;
                    }
                }
            }
        }
    }

    public final synchronized void setClickConfirmingView(View view) {
        this.zzfwx.setClickConfirmingView(view);
    }

    public final synchronized void zza(zzafr zzafrVar) {
        this.zzfwx.zza(zzafrVar);
    }

    public final synchronized void cancelUnconfirmedClick() {
        this.zzfwx.cancelUnconfirmedClick();
    }

    public final synchronized void zza(zzxv zzxvVar) {
        this.zzfwx.zza(zzxvVar);
    }

    public final synchronized void zza(zzxr zzxrVar) {
        this.zzfwx.zza(zzxrVar);
    }

    public final synchronized void zzsr() {
        this.zzfwx.zzsr();
    }

    public final synchronized void recordCustomClickGesture() {
        if (this.zzfxf == null) {
            zzaxy.zzef("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z = this.zzfxf instanceof zzcdq;
        this.zzfmk.execute(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzccs
            private final boolean zzegf;
            private final zzcco zzfww;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfww = this;
                this.zzegf = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfww.zzbj(this.zzegf);
            }
        });
    }

    public final synchronized boolean isCustomClickGestureEnabled() {
        return this.zzfwx.isCustomClickGestureEnabled();
    }

    public static boolean zzz(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    public final boolean zzali() {
        return this.zzfwz.zzama();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzccz r0 = r10.zzfwz
            boolean r0 = r0.zzalj()
            if (r0 != 0) goto L9
            return
        L9:
            com.google.android.gms.internal.ads.zzccv r0 = r10.zzfvt
            com.google.android.gms.internal.ads.zzbfq r0 = r0.zzalt()
            com.google.android.gms.internal.ads.zzccv r1 = r10.zzfvt
            com.google.android.gms.internal.ads.zzbfq r1 = r1.zzals()
            if (r0 != 0) goto L1a
            if (r1 != 0) goto L1a
            return
        L1a:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            r4 = 1
            goto L21
        L20:
            r4 = 0
        L21:
            if (r1 == 0) goto L24
            goto L25
        L24:
            r2 = 0
        L25:
            r3 = 0
            if (r4 == 0) goto L2a
        L28:
            r8 = r3
            goto L32
        L2a:
            if (r2 == 0) goto L30
            java.lang.String r3 = "javascript"
            r0 = r1
            goto L28
        L30:
            r0 = r3
            r8 = r0
        L32:
            android.webkit.WebView r3 = r0.getWebView()
            if (r3 != 0) goto L39
            return
        L39:
            com.google.android.gms.internal.ads.zzaqi r3 = com.google.android.gms.ads.internal.zzp.zzle()
            android.content.Context r4 = r10.zzvr
            boolean r3 = r3.zzp(r4)
            if (r3 == 0) goto L97
            com.google.android.gms.internal.ads.zzbbg r3 = r10.zzbpa
            int r3 = r3.zzedq
            com.google.android.gms.internal.ads.zzbbg r4 = r10.zzbpa
            int r4 = r4.zzedr
            r5 = 23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r3)
            java.lang.String r3 = "."
            r6.append(r3)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.google.android.gms.internal.ads.zzaqi r3 = com.google.android.gms.ads.internal.zzp.zzle()
            android.webkit.WebView r5 = r0.getWebView()
            java.lang.String r6 = ""
            java.lang.String r7 = "javascript"
            r9 = r11
            com.google.android.gms.dynamic.IObjectWrapper r11 = r3.zza(r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L77
            return
        L77:
            com.google.android.gms.internal.ads.zzccv r3 = r10.zzfvt
            r3.zzas(r11)
            r0.zzap(r11)
            if (r2 == 0) goto L8e
            android.view.View r0 = r1.getView()
            if (r0 == 0) goto L8e
            com.google.android.gms.internal.ads.zzaqi r1 = com.google.android.gms.ads.internal.zzp.zzle()
            r1.zza(r11, r0)
        L8e:
            if (r12 == 0) goto L97
            com.google.android.gms.internal.ads.zzaqi r12 = com.google.android.gms.ads.internal.zzp.zzle()
            r12.zzab(r11)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcco.zzh(java.lang.String, boolean):void");
    }

    public final boolean zzalj() {
        return this.zzfwz.zzalj();
    }

    public final void zzaa(View view) {
        IObjectWrapper zzalu = this.zzfvt.zzalu();
        boolean z = this.zzfvt.zzalt() != null;
        if (!this.zzfwz.zzalj() || zzalu == null || !z || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzle().zza(zzalu, view);
    }

    public final void zzab(View view) {
        IObjectWrapper zzalu = this.zzfvt.zzalu();
        if (!this.zzfwz.zzalj() || zzalu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzle().zzb(zzalu, view);
    }

    public final zzccu zzalk() {
        return this.zzfxh;
    }

    public final synchronized void zza(zzya zzyaVar) {
        this.zzftk.zzb(zzyaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzbj(boolean z) {
        this.zzfwx.zza(this.zzfxf.zzahq(), this.zzfxf.zzamo(), this.zzfxf.zzamp(), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzall() {
        this.zzfwx.destroy();
        this.zzfvt.destroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzalm() {
        try {
            int zzaln = this.zzfvt.zzaln();
            if (zzaln == 1) {
                if (this.zzfod.zzamc() != null) {
                    zzh("Google", true);
                    this.zzfod.zzamc().zza(this.zzfxa.get());
                }
            } else if (zzaln == 2) {
                if (this.zzfod.zzamd() != null) {
                    zzh("Google", true);
                    this.zzfod.zzamd().zza(this.zzfxb.get());
                }
            } else if (zzaln == 3) {
                if (this.zzfod.zzgd(this.zzfvt.getCustomTemplateId()) != null) {
                    if (this.zzfvt.zzals() != null) {
                        zzh("Google", true);
                    }
                    this.zzfod.zzgd(this.zzfvt.getCustomTemplateId()).zza(this.zzfxe.get());
                }
            } else if (zzaln == 6) {
                if (this.zzfod.zzame() != null) {
                    zzh("Google", true);
                    this.zzfod.zzame().zza(this.zzfxc.get());
                }
            } else if (zzaln == 7) {
                if (this.zzfod.zzamg() != null) {
                    this.zzfod.zzamg().zza(this.zzfxd.get());
                }
            } else {
                zzaxy.zzfc("Wrong native template id!");
            }
        } catch (RemoteException e) {
            zzaxy.zzc("RemoteException when notifyAdLoad is called", e);
        }
    }
}
