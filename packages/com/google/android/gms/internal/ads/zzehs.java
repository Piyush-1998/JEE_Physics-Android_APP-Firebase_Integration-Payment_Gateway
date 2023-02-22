package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzehs implements zzeia {
    private zzeia[] zzihs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzehs(zzeia... zzeiaVarArr) {
        this.zzihs = zzeiaVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzeia
    public final boolean zze(Class<?> cls) {
        for (zzeia zzeiaVar : this.zzihs) {
            if (zzeiaVar.zze(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeia
    public final zzehx zzf(Class<?> cls) {
        zzeia[] zzeiaVarArr;
        for (zzeia zzeiaVar : this.zzihs) {
            if (zzeiaVar.zze(cls)) {
                return zzeiaVar.zzf(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
