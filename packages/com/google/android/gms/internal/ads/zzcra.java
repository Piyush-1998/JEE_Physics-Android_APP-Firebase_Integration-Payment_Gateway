package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.internal.ads.zztq;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcra {
    private zzbbg zzdpq;
    private zzcqk zzgkl;
    private zzto zzgkx;
    private Context zzvr;

    public zzcra(Context context, zzbbg zzbbgVar, zzto zztoVar, zzcqk zzcqkVar) {
        this.zzvr = context;
        this.zzdpq = zzbbgVar;
        this.zzgkx = zztoVar;
        this.zzgkl = zzcqkVar;
    }

    public final void zzapt() {
        try {
            this.zzgkl.zza(new zzdoq(this) { // from class: com.google.android.gms.internal.ads.zzcqz
                private final zzcra zzgkw;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgkw = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdoq
                public final Object apply(Object obj) {
                    return this.zzgkw.zzb((SQLiteDatabase) obj);
                }
            });
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzaxy.zzfc(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zzb(SQLiteDatabase sQLiteDatabase) throws Exception {
        ArrayList<zztw.zzo.zza> zza = zzcqx.zza(sQLiteDatabase);
        final zztw.zzo zzoVar = (zztw.zzo) ((zzegp) zztw.zzo.zzok().zzce(this.zzvr.getPackageName()).zzcf(Build.MODEL).zzco(zzcqx.zza(sQLiteDatabase, 0)).zzf(zza).zzcp(zzcqx.zza(sQLiteDatabase, 1)).zzev(com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis()).zzew(zzcqx.zzb(sQLiteDatabase, 2)).zzbfx());
        ArrayList<zztw.zzo.zza> arrayList = zza;
        int size = arrayList.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            zztw.zzo.zza zzaVar = arrayList.get(i);
            i++;
            zztw.zzo.zza zzaVar2 = zzaVar;
            if (zzaVar2.zzoh() == zzug.ENUM_TRUE && zzaVar2.getTimestamp() > j) {
                j = zzaVar2.getTimestamp();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        this.zzgkx.zza(new zztn(zzoVar) { // from class: com.google.android.gms.internal.ads.zzcrc
            private final zztw.zzo zzgkz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgkz = zzoVar;
            }

            @Override // com.google.android.gms.internal.ads.zztn
            public final void zza(zztw.zzi.zza zzaVar3) {
                zzaVar3.zza(this.zzgkz);
            }
        });
        final zztw.zzu zzuVar = (zztw.zzu) ((zzegp) zztw.zzu.zzor().zzcq(this.zzdpq.zzedq).zzcr(this.zzdpq.zzedr).zzcs(this.zzdpq.zzeds ? 0 : 2).zzbfx());
        this.zzgkx.zza(new zztn(zzuVar) { // from class: com.google.android.gms.internal.ads.zzcrb
            private final zztw.zzu zzgky;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgky = zzuVar;
            }

            @Override // com.google.android.gms.internal.ads.zztn
            public final void zza(zztw.zzi.zza zzaVar3) {
                zzaVar3.zza(zzaVar3.zznw().zzbfk().zza(this.zzgky));
            }
        });
        this.zzgkx.zza(zztq.zza.zzb.OFFLINE_UPLOAD);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues3, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
