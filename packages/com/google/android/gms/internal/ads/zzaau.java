package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaau implements zzadc {
    private final /* synthetic */ zzaap zzcxy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaau(zzaap zzaapVar) {
        this.zzcxy = zzaapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final Boolean zzf(String str, boolean z) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zzcxy.zzcld;
        return Boolean.valueOf(sharedPreferences.getBoolean(str, z));
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final Long getLong(String str, long j) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zzcxy.zzcld;
            return Long.valueOf(sharedPreferences2.getLong(str, j));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zzcxy.zzcld;
            return Long.valueOf(sharedPreferences.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final Double zza(String str, double d) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zzcxy.zzcld;
        return Double.valueOf(sharedPreferences.getFloat(str, (float) d));
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final String get(String str, String str2) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zzcxy.zzcld;
        return sharedPreferences.getString(str, str2);
    }
}
