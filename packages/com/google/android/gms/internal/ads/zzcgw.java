package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcgw extends zzaer {
    private final Context zzaai;
    private final zzccv zzfvt;
    private zzcco zzfyz;
    private zzcdr zzgch;

    public zzcgw(Context context, zzccv zzccvVar, zzcdr zzcdrVar, zzcco zzccoVar) {
        this.zzaai = context;
        this.zzfvt = zzccvVar;
        this.zzgch = zzcdrVar;
        this.zzfyz = zzccoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final IObjectWrapper zzsg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final String zzcx(String str) {
        return this.zzfvt.zzalx().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzadw zzcy(String str) {
        return this.zzfvt.zzalv().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final List<String> getAvailableAssetNames() {
        SimpleArrayMap<String, zzadi> zzalv = this.zzfvt.zzalv();
        SimpleArrayMap<String, String> zzalx = this.zzfvt.zzalx();
        String[] strArr = new String[zzalv.size() + zzalx.size()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzalv.size()) {
            strArr[i3] = zzalv.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < zzalx.size()) {
            strArr[i3] = zzalx.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final String getCustomTemplateId() {
        return this.zzfvt.getCustomTemplateId();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void performClick(String str) {
        zzcco zzccoVar = this.zzfyz;
        if (zzccoVar != null) {
            zzccoVar.zzfz(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void recordImpression() {
        zzcco zzccoVar = this.zzfyz;
        if (zzccoVar != null) {
            zzccoVar.zzalc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzyg getVideoController() {
        return this.zzfvt.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void destroy() {
        zzcco zzccoVar = this.zzfyz;
        if (zzccoVar != null) {
            zzccoVar.destroy();
        }
        this.zzfyz = null;
        this.zzgch = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final IObjectWrapper zzsl() {
        return ObjectWrapper.wrap(this.zzaai);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzp(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (unwrap instanceof ViewGroup) {
            zzcdr zzcdrVar = this.zzgch;
            if (zzcdrVar != null && zzcdrVar.zza((ViewGroup) unwrap)) {
                this.zzfvt.zzals().zza(new zzcgv(this));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzsm() {
        zzcco zzccoVar = this.zzfyz;
        return (zzccoVar == null || zzccoVar.zzalj()) && this.zzfvt.zzalt() != null && this.zzfvt.zzals() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzsn() {
        IObjectWrapper zzalu = this.zzfvt.zzalu();
        if (zzalu != null) {
            com.google.android.gms.ads.internal.zzp.zzle().zzab(zzalu);
            return true;
        }
        zzaxy.zzfe("Trying to start OMID session before creation.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzcco zzccoVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzfvt.zzalu() == null || (zzccoVar = this.zzfyz) == null) {
            return;
        }
        zzccoVar.zzaa((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void zzso() {
        String zzalw = this.zzfvt.zzalw();
        if ("Google".equals(zzalw)) {
            zzaxy.zzfe("Illegal argument specified for omid partner name.");
            return;
        }
        zzcco zzccoVar = this.zzfyz;
        if (zzccoVar != null) {
            zzccoVar.zzh(zzalw, false);
        }
    }
}
