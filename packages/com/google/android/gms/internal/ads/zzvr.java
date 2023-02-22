package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class zzvr {
    private final zzva zzcia;
    private final zzvb zzcib;
    private final zzzd zzcic;
    private final zzaga zzcid;
    private final zzatx zzcie;
    private final zzavb zzcif;
    private final zzaqj zzcig;
    private final zzafz zzcih;

    public zzvr(zzva zzvaVar, zzvb zzvbVar, zzzd zzzdVar, zzaga zzagaVar, zzatx zzatxVar, zzavb zzavbVar, zzaqj zzaqjVar, zzafz zzafzVar) {
        this.zzcia = zzvaVar;
        this.zzcib = zzvbVar;
        this.zzcic = zzzdVar;
        this.zzcid = zzagaVar;
        this.zzcie = zzatxVar;
        this.zzcif = zzavbVar;
        this.zzcig = zzaqjVar;
        this.zzcih = zzafzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzwe.zzpq().zza(context, zzwe.zzpw().zzbra, "gmob-apps", bundle, true);
    }

    public final zzwu zza(Context context, zzvj zzvjVar, String str, zzamu zzamuVar) {
        return new zzvx(this, context, zzvjVar, str, zzamuVar).zzd(context, false);
    }

    public final zzwr zzb(Context context, String str, zzamu zzamuVar) {
        return new zzvy(this, context, str, zzamuVar).zzd(context, false);
    }

    public final zzaea zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return new zzwa(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzaed zza(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return new zzwd(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzaul zzc(Context context, String str, zzamu zzamuVar) {
        return new zzvt(this, context, str, zzamuVar).zzd(context, false);
    }

    public final zzaql zzb(Activity activity) {
        zzvs zzvsVar = new zzvs(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzbbd.zzfc("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return zzvsVar.zzd(activity, z);
    }

    public final zzawu zza(Context context, zzamu zzamuVar) {
        return new zzvv(this, context, zzamuVar).zzd(context, false);
    }
}
