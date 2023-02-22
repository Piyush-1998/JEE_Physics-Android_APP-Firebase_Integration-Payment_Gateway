package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaed;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzaql;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzatm;
import com.google.android.gms.internal.ads.zzaul;
import com.google.android.gms.internal.ads.zzawu;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbii;
import com.google.android.gms.internal.ads.zzcdp;
import com.google.android.gms.internal.ads.zzcdq;
import com.google.android.gms.internal.ads.zzcxb;
import com.google.android.gms.internal.ads.zzcxd;
import com.google.android.gms.internal.ads.zzcxo;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzwr;
import com.google.android.gms.internal.ads.zzwu;
import com.google.android.gms.internal.ads.zzxg;
import com.google.android.gms.internal.ads.zzxk;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class ClientApi extends zzxg {
    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzxk zzc(IObjectWrapper iObjectWrapper) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzaqw zzd(IObjectWrapper iObjectWrapper) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzwu zza(IObjectWrapper iObjectWrapper, zzvj zzvjVar, String str, zzamu zzamuVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzcxd(zzbii.zza(context, zzamuVar, i), context, zzvjVar, str);
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzwu zzb(IObjectWrapper iObjectWrapper, zzvj zzvjVar, String str, zzamu zzamuVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzcxo(zzbii.zza(context, zzamuVar, i), context, zzvjVar, str);
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzwr zza(IObjectWrapper iObjectWrapper, String str, zzamu zzamuVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzcxb(zzbii.zza(context, zzamuVar, i), context, str);
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzaea zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzcdp((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 202006000);
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzatm zza(IObjectWrapper iObjectWrapper, zzamu zzamuVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return zzbii.zza(context, zzamuVar, i).zzadw().zzby(context).zzaga().zzagf();
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzaql zzb(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(activity.getIntent());
        if (zzc == null) {
            return new zzr(activity);
        }
        int i = zzc.zzdow;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new zzu(activity, zzc);
                    }
                    return new zzr(activity);
                }
                return new zzz(activity);
            }
            return new zzx(activity);
        }
        return new zzs(activity);
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzxk zza(IObjectWrapper iObjectWrapper, int i) {
        return zzbii.zzf((Context) ObjectWrapper.unwrap(iObjectWrapper), i).zzadp();
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzwu zza(IObjectWrapper iObjectWrapper, zzvj zzvjVar, String str, int i) {
        return new zzj((Context) ObjectWrapper.unwrap(iObjectWrapper), zzvjVar, str, new zzbbg(202006000, i, true, false));
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzaed zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzcdq((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzaul zzb(IObjectWrapper iObjectWrapper, String str, zzamu zzamuVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return zzbii.zza(context, zzamuVar, i).zzadw().zzby(context).zzfw(str).zzaga().zzagg();
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzwu zzc(IObjectWrapper iObjectWrapper, zzvj zzvjVar, String str, zzamu zzamuVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return zzbii.zza(context, zzamuVar, i).zzads().zzfv(str).zzbx(context).zzafm().zzafq();
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final zzawu zzb(IObjectWrapper iObjectWrapper, zzamu zzamuVar, int i) {
        return zzbii.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzamuVar, i).zzady();
    }
}
