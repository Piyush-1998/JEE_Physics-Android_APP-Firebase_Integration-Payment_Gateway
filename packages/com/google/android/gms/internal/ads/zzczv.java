package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczv implements zzdek<Bundle> {
    private final String zzacx;
    private final zzvj zzbpb;
    private final float zzbrw;
    private final boolean zzchp;
    private final int zzdng;
    private final int zzdnh;
    private final String zzgsm;
    private final String zzgsn;
    private final boolean zzgso;

    public zzczv(zzvj zzvjVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        Preconditions.checkNotNull(zzvjVar, "the adSize must not be null");
        this.zzbpb = zzvjVar;
        this.zzacx = str;
        this.zzchp = z;
        this.zzgsm = str2;
        this.zzbrw = f;
        this.zzdng = i;
        this.zzdnh = i2;
        this.zzgsn = str3;
        this.zzgso = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        String str;
        zzvj[] zzvjVarArr;
        Bundle bundle2 = bundle;
        zzdlu.zza(bundle2, "smart_w", "full", this.zzbpb.width == -1);
        zzdlu.zza(bundle2, "smart_h", "auto", this.zzbpb.height == -2);
        zzdlu.zza(bundle2, "ene", (Boolean) true, this.zzbpb.zzchq);
        zzdlu.zza(bundle2, "rafmt", "102", this.zzbpb.zzcht);
        zzdlu.zza(bundle2, "rafmt", "103", this.zzbpb.zzchu);
        zzdlu.zza(bundle2, "inline_adaptive_slot", (Boolean) true, this.zzgso);
        zzdlu.zza(bundle2, "format", this.zzacx);
        zzdlu.zza(bundle2, "fluid", "height", this.zzchp);
        zzdlu.zza(bundle2, "sz", this.zzgsm, !TextUtils.isEmpty(str));
        bundle2.putFloat("u_sd", this.zzbrw);
        bundle2.putInt("sw", this.zzdng);
        bundle2.putInt("sh", this.zzdnh);
        String str2 = this.zzgsn;
        zzdlu.zza(bundle2, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (this.zzbpb.zzcho == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.zzbpb.height);
            bundle3.putInt("width", this.zzbpb.width);
            bundle3.putBoolean("is_fluid_height", this.zzbpb.zzchp);
            arrayList.add(bundle3);
        } else {
            for (zzvj zzvjVar : this.zzbpb.zzcho) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", zzvjVar.zzchp);
                bundle4.putInt("height", zzvjVar.height);
                bundle4.putInt("width", zzvjVar.width);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
