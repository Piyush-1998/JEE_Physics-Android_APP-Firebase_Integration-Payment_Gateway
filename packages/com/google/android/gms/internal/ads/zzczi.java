package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczi implements zzden<zzczj> {
    private final zzdln zzfqn;
    private final zzdvw zzgse;
    private final View zzgsf;
    private final Context zzvr;

    public zzczi(zzdvw zzdvwVar, Context context, zzdln zzdlnVar, ViewGroup viewGroup) {
        this.zzgse = zzdvwVar;
        this.zzvr = context;
        this.zzfqn = zzdlnVar;
        this.zzgsf = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzczj> zzaqs() {
        return this.zzgse.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzczl
            private final zzczi zzgsi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsi = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgsi.zzaqt();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzczj zzaqt() throws Exception {
        Context context = this.zzvr;
        zzvj zzvjVar = this.zzfqn.zzbpb;
        ArrayList arrayList = new ArrayList();
        View view = this.zzgsf;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzczj(context, zzvjVar, arrayList);
    }
}
