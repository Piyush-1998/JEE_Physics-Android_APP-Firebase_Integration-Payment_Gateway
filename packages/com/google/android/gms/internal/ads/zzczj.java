package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczj implements zzdek<Bundle> {
    private final zzvj zzbpb;
    private final List<Parcelable> zzgsg;
    private final Context zzvr;

    public zzczj(Context context, zzvj zzvjVar, List<Parcelable> list) {
        this.zzvr = context;
        this.zzbpb = zzvjVar;
        this.zzgsg = list;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (zzacq.zzdbc.get().booleanValue()) {
            Bundle bundle3 = new Bundle();
            com.google.android.gms.ads.internal.zzp.zzkp();
            bundle3.putString("activity", zzayh.zzau(this.zzvr));
            Bundle bundle4 = new Bundle();
            bundle4.putInt("width", this.zzbpb.width);
            bundle4.putInt("height", this.zzbpb.height);
            bundle3.putBundle("size", bundle4);
            if (this.zzgsg.size() > 0) {
                List<Parcelable> list = this.zzgsg;
                bundle3.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle2.putBundle("view_hierarchy", bundle3);
        }
    }
}
