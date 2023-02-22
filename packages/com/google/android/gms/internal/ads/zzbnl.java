package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzbnl {
    private final View view;
    private final zzbfq zzdgc;
    private final zzdkw zzfnm;
    private final zzbpe zzfoc;

    public zzbnl(View view, zzbfq zzbfqVar, zzbpe zzbpeVar, zzdkw zzdkwVar) {
        this.view = view;
        this.zzdgc = zzbfqVar;
        this.zzfoc = zzbpeVar;
        this.zzfnm = zzdkwVar;
    }

    public final zzbfq zzahe() {
        return this.zzdgc;
    }

    public final View zzahq() {
        return this.view;
    }

    public final zzbpe zzahy() {
        return this.zzfoc;
    }

    public final zzdkw zzahz() {
        return this.zzfnm;
    }

    public zzbue zza(Set<zzbys<zzbuj>> set) {
        return new zzbue(set);
    }
}
