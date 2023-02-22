package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzceu implements zzcdd {
    private final zzbbg zzbpa;
    private final zzdkx zzfpf;
    private final zzdln zzfqn;
    private final zzbtl zzfvu;
    private final zzbst zzfvv;
    private boolean zzfvz = false;
    private boolean zzfwc = false;
    private final zzand zzgaq;
    private final zzani zzgar;
    private final zzanj zzgas;
    private final Context zzvr;

    public zzceu(zzand zzandVar, zzani zzaniVar, zzanj zzanjVar, zzbtl zzbtlVar, zzbst zzbstVar, Context context, zzdkx zzdkxVar, zzbbg zzbbgVar, zzdln zzdlnVar) {
        this.zzgaq = zzandVar;
        this.zzgar = zzaniVar;
        this.zzgas = zzanjVar;
        this.zzfvu = zzbtlVar;
        this.zzfvv = zzbstVar;
        this.zzvr = context;
        this.zzfpf = zzdkxVar;
        this.zzbpa = zzbbgVar;
        this.zzfqn = zzdlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void cancelUnconfirmedClick() {
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void destroy() {
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void setClickConfirmingView(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(zzafr zzafrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzalc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzale() {
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzfz(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzg(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzh(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final boolean zzi(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            HashMap<String, View> zzb = zzb(map);
            HashMap<String, View> zzb2 = zzb(map2);
            if (this.zzgas != null) {
                this.zzgas.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
            } else if (this.zzgaq != null) {
                this.zzgaq.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzgaq.zzv(wrap);
            } else if (this.zzgar != null) {
                this.zzgar.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzgar.zzv(wrap);
            }
        } catch (RemoteException e) {
            zzaxy.zzd("Failed to call trackView", e);
        }
    }

    private static HashMap<String, View> zzb(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    hashMap.put(entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(View view, Map<String, WeakReference<View>> map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            if (this.zzgas != null) {
                this.zzgas.zzw(wrap);
            } else if (this.zzgaq != null) {
                this.zzgaq.zzw(wrap);
            } else if (this.zzgar != null) {
                this.zzgar.zzw(wrap);
            }
        } catch (RemoteException e) {
            zzaxy.zzd("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.zzfwc && this.zzfpf.zzdjh) {
            return;
        }
        zzad(view);
    }

    private final void zzad(View view) {
        try {
            if (this.zzgas != null && !this.zzgas.getOverrideClickHandling()) {
                this.zzgas.zzu(ObjectWrapper.wrap(view));
                this.zzfvv.onAdClicked();
            } else if (this.zzgaq != null && !this.zzgaq.getOverrideClickHandling()) {
                this.zzgaq.zzu(ObjectWrapper.wrap(view));
                this.zzfvv.onAdClicked();
            } else if (this.zzgar == null || this.zzgar.getOverrideClickHandling()) {
            } else {
                this.zzgar.zzu(ObjectWrapper.wrap(view));
                this.zzfvv.onAdClicked();
            }
        } catch (RemoteException e) {
            zzaxy.zzd("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzfwc) {
            zzaxy.zzfe("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzfpf.zzdjh) {
            zzaxy.zzfe("Custom click reporting for 3p ads failed. Ad unit id not whitelisted.");
        } else {
            zzad(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzsr() {
        this.zzfwc = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final boolean isCustomClickGestureEnabled() {
        return this.zzfpf.zzdjh;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.zzfvz && this.zzfpf.zzhat != null) {
                this.zzfvz |= com.google.android.gms.ads.internal.zzp.zzkz().zzb(this.zzvr, this.zzbpa.zzbra, this.zzfpf.zzhat.toString(), this.zzfqn.zzhbv);
            }
            if (this.zzgas != null && !this.zzgas.getOverrideImpressionRecording()) {
                this.zzgas.recordImpression();
                this.zzfvu.onAdImpression();
            } else if (this.zzgaq != null && !this.zzgaq.getOverrideImpressionRecording()) {
                this.zzgaq.recordImpression();
                this.zzfvu.onAdImpression();
            } else if (this.zzgar == null || this.zzgar.getOverrideImpressionRecording()) {
            } else {
                this.zzgar.recordImpression();
                this.zzfvu.onAdImpression();
            }
        } catch (RemoteException e) {
            zzaxy.zzd("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(zzxv zzxvVar) {
        zzaxy.zzfe("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(zzxr zzxrVar) {
        zzaxy.zzfe("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzald() {
        zzaxy.zzfe("Mute This Ad is not supported for 3rd party ads");
    }
}
