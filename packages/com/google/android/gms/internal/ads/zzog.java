package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzog {
    private zzof zzbhr;

    public abstract zzoi zza(zzhw[] zzhwVarArr, zznp zznpVar) throws zzhd;

    public abstract void zzd(Object obj);

    public final void zza(zzof zzofVar) {
        this.zzbhr = zzofVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void invalidate() {
        zzof zzofVar = this.zzbhr;
        if (zzofVar != null) {
            zzofVar.zzeq();
        }
    }
}
