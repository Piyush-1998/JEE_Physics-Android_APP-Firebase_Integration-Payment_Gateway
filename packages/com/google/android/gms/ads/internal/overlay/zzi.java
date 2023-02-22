package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzbfq;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzi {
    public final int index;
    public final ViewGroup parent;
    public final ViewGroup.LayoutParams zzdok;
    public final Context zzvr;

    public zzi(zzbfq zzbfqVar) throws zzg {
        this.zzdok = zzbfqVar.getLayoutParams();
        ViewParent parent = zzbfqVar.getParent();
        this.zzvr = zzbfqVar.zzaaz();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.parent = viewGroup;
            this.index = viewGroup.indexOfChild(zzbfqVar.getView());
            this.parent.removeView(zzbfqVar.getView());
            zzbfqVar.zzax(true);
            return;
        }
        throw new zzg("Could not get the parent of the WebView for an overlay.");
    }
}
