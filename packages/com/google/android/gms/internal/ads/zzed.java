package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzed extends zzdy {
    public static zzed zzb(String str, Context context, boolean z) {
        return zzb(str, context, false, zzcw.zznj);
    }

    public static zzed zzb(String str, Context context, boolean z, int i) {
        zza(context, z);
        zza(str, context, z, i);
        return new zzed(context, str, z, i);
    }

    private zzed(Context context, String str, boolean z, int i) {
        super(context, str, z, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdy
    public final List<Callable<Void>> zza(zzex zzexVar, Context context, zzcf.zza.C0008zza c0008zza, zzby.zza zzaVar) {
        if (zzexVar.zzcg() == null || !this.zzxj) {
            return super.zza(zzexVar, context, c0008zza, zzaVar);
        }
        int zzbu = zzexVar.zzbu();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zza(zzexVar, context, c0008zza, zzaVar));
        arrayList.add(new zzfr(zzexVar, "mLW4WfBtN0b1ZboDT/Xcg0iQ140V7G6lHXVBVeBNgLy2jqsT86h2d5npN9bwHugA", "7PTXHfesCwrygeE6a5SpFPYapA+6N5AjzCxH/Yeev9s=", c0008zza, zzbu, 24));
        return arrayList;
    }
}
