package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcdr {
    private final Executor executor;
    private final zzadm zzdla;
    private final zzaya zzdza;
    private final Executor zzfmk;
    private final zzdln zzfqn;
    private final zzccv zzfvt;
    private final zzccz zzfwz;
    private final zzccu zzfxh;
    private final zzcdz zzfzh;
    private final zzceh zzfzi;

    public zzcdr(zzaya zzayaVar, zzdln zzdlnVar, zzccz zzcczVar, zzccv zzccvVar, zzcdz zzcdzVar, zzceh zzcehVar, Executor executor, Executor executor2, zzccu zzccuVar) {
        this.zzdza = zzayaVar;
        this.zzfqn = zzdlnVar;
        this.zzdla = zzdlnVar.zzdla;
        this.zzfwz = zzcczVar;
        this.zzfvt = zzccvVar;
        this.zzfzh = zzcdzVar;
        this.zzfzi = zzcehVar;
        this.zzfmk = executor;
        this.executor = executor2;
        this.zzfxh = zzccuVar;
    }

    public final void zza(final zzcep zzcepVar) {
        this.zzfmk.execute(new Runnable(this, zzcepVar) { // from class: com.google.android.gms.internal.ads.zzcdu
            private final zzcdr zzfzk;
            private final zzcep zzfzm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfzk = this;
                this.zzfzm = zzcepVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfzk.zze(this.zzfzm);
            }
        });
    }

    private static void zza(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        }
    }

    public final void zzc(zzcep zzcepVar) {
        if (zzcepVar == null || this.zzfzh == null || zzcepVar.zzams() == null || !this.zzfwz.zzalz()) {
            return;
        }
        try {
            zzcepVar.zzams().addView(this.zzfzh.zzamy());
        } catch (zzbgc e) {
            zzaxy.zza("web view can not be obtained", e);
        }
    }

    public final void zzd(zzcep zzcepVar) {
        if (zzcepVar == null) {
            return;
        }
        Context context = zzcepVar.zzahq().getContext();
        if (zzbah.zza(this.zzfwz.zzfyh)) {
            if (!(context instanceof Activity)) {
                zzaxy.zzef("Activity context is needed for policy validator.");
            } else if (this.zzfzi == null || zzcepVar.zzams() == null) {
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.zzfzi.zza(zzcepVar.zzams(), windowManager), zzbah.zzyg());
                } catch (zzbgc e) {
                    zzaxy.zza("web view can not be obtained", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(zzcep zzcepVar, String[] strArr) {
        Map<String, WeakReference<View>> zzamp = zzcepVar.zzamp();
        if (zzamp == null) {
            return false;
        }
        for (String str : strArr) {
            if (zzamp.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean zza(ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        View zzalr = this.zzfvt.zzalr();
        if (zzalr == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzalr.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzalr.getParent()).removeView(zzalr);
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcru)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzalr, layoutParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.zzfvt.zzalr() != null) {
            if (2 == this.zzfvt.zzaln() || 1 == this.zzfvt.zzaln()) {
                this.zzdza.zza(this.zzfqn.zzhbv, String.valueOf(this.zzfvt.zzaln()), z);
            } else if (6 == this.zzfvt.zzaln()) {
                this.zzdza.zza(this.zzfqn.zzhbv, "2", z);
                this.zzdza.zza(this.zzfqn.zzhbv, "1", z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcep zzcepVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        IObjectWrapper zzsd;
        Drawable drawable;
        int i = 0;
        if (this.zzfwz.zzamb() || this.zzfwz.zzama()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
            for (int i2 = 0; i2 < 2; i2++) {
                View zzgf = zzcepVar.zzgf(strArr[i2]);
                if (zzgf != null && (zzgf instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzgf;
                    break;
                }
            }
        }
        viewGroup = null;
        boolean z = viewGroup != null;
        Context context = zzcepVar.zzahq().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.zzfvt.zzalo() != null) {
            view = this.zzfvt.zzalo();
            zzadm zzadmVar = this.zzdla;
            if (zzadmVar != null && !z) {
                zza(layoutParams, zzadmVar.zzbnm);
                view.setLayoutParams(layoutParams);
            }
        } else if (this.zzfvt.zzsi() instanceof zzadd) {
            zzadd zzaddVar = (zzadd) this.zzfvt.zzsi();
            if (!z) {
                zza(layoutParams, zzaddVar.zzsb());
            }
            View zzadgVar = new zzadg(context, zzaddVar, layoutParams);
            zzadgVar.setContentDescription((CharSequence) zzwe.zzpu().zzd(zzaat.zzcrr));
            view = zzadgVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (z) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                AdChoicesView adChoicesView = new AdChoicesView(zzcepVar.zzahq().getContext());
                adChoicesView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                adChoicesView.addView(view);
                FrameLayout zzams = zzcepVar.zzams();
                if (zzams != null) {
                    zzams.addView(adChoicesView);
                }
            }
            zzcepVar.zza(zzcepVar.zzamr(), view, true);
        }
        String[] strArr2 = zzcdp.zzfyv;
        int length = strArr2.length;
        while (true) {
            if (i >= length) {
                viewGroup2 = null;
                break;
            }
            View zzgf2 = zzcepVar.zzgf(strArr2[i]);
            if (zzgf2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzgf2;
                break;
            }
            i++;
        }
        this.executor.execute(new Runnable(this, viewGroup2) { // from class: com.google.android.gms.internal.ads.zzcdt
            private final zzcdr zzfzk;
            private final ViewGroup zzfzl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfzk = this;
                this.zzfzl = viewGroup2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfzk.zzb(this.zzfzl);
            }
        });
        if (viewGroup2 != null) {
            if (zza(viewGroup2)) {
                if (this.zzfvt.zzals() != null) {
                    this.zzfvt.zzals().zza(new zzcdw(this, zzcepVar, viewGroup2));
                    return;
                }
                return;
            }
            viewGroup2.removeAllViews();
            View zzahq = zzcepVar.zzahq();
            Context context2 = zzahq != null ? zzahq.getContext() : null;
            if (context2 != null) {
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcrq)).booleanValue()) {
                    zzadr zzss = this.zzfxh.zzss();
                    if (zzss == null) {
                        return;
                    }
                    try {
                        zzsd = zzss.zzsf();
                    } catch (RemoteException unused) {
                        zzaxy.zzfe("Could not get main image drawable");
                        return;
                    }
                } else {
                    zzadw zzalp = this.zzfvt.zzalp();
                    if (zzalp == null) {
                        return;
                    }
                    try {
                        zzsd = zzalp.zzsd();
                    } catch (RemoteException unused2) {
                        zzaxy.zzfe("Could not get drawable from image");
                        return;
                    }
                }
                if (zzsd == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzsd)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                IObjectWrapper zzamu = zzcepVar != null ? zzcepVar.zzamu() : null;
                if (zzamu == null || !((Boolean) zzwe.zzpu().zzd(zzaat.zzcvw)).booleanValue()) {
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                } else {
                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzamu));
                }
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            }
        }
    }
}
