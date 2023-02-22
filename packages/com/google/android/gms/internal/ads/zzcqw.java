package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zztw;
import com.google.firebase.database.core.ServerValues;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcqw implements zzdvi<Bundle> {
    private final /* synthetic */ boolean zzgkt;
    final /* synthetic */ zzcqt zzgku;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcqw(zzcqt zzcqtVar, boolean z) {
        this.zzgku = zzcqtVar;
        this.zzgkt = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        zzaxy.zzfc("Failed to get signals bundle");
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(Bundle bundle) {
        final ArrayList zzm;
        final zztw.zzo.zzb zzl;
        final zztw.zzm zzk;
        zzcqk zzcqkVar;
        Bundle bundle2 = bundle;
        zzcqt zzcqtVar = this.zzgku;
        zzm = zzcqt.zzm(bundle2);
        zzcqt zzcqtVar2 = this.zzgku;
        zzl = zzcqt.zzl(bundle2);
        zzk = this.zzgku.zzk(bundle2);
        zzcqkVar = this.zzgku.zzgkl;
        final boolean z = this.zzgkt;
        zzcqkVar.zza(new zzdoq(this, z, zzm, zzk, zzl) { // from class: com.google.android.gms.internal.ads.zzcqv
            private final boolean zzegf;
            private final zzcqw zzgkp;
            private final ArrayList zzgkq;
            private final zztw.zzm zzgkr;
            private final zztw.zzo.zzb zzgks;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgkp = this;
                this.zzegf = z;
                this.zzgkq = zzm;
                this.zzgkr = zzk;
                this.zzgks = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzdoq
            public final Object apply(Object obj) {
                byte[] zza;
                zzcqw zzcqwVar = this.zzgkp;
                boolean z2 = this.zzegf;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                zza = zzcqwVar.zzgku.zza(z2, this.zzgkq, this.zzgkr, this.zzgks);
                ContentValues contentValues = new ContentValues();
                contentValues.put(ServerValues.NAME_OP_TIMESTAMP, Long.valueOf(com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis()));
                contentValues.put("serialized_proto_data", zza);
                sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
                if (!z2) {
                    sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
                }
                return null;
            }
        });
    }
}
