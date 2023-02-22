package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzacb<T> extends zzaca<T> {
    public static zzaca<Boolean> zzg(String str, boolean z) {
        return new zzacb(str, true, zzacc.zzczc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Ljava/lang/Integer;)V */
    public zzacb(String str, Object obj, int i) {
        super(str, obj, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final T get() {
        if (!zzadb.zzdcd.get()) {
            throw new IllegalStateException("Striped code is accessed: 54c42518-856a-44fb-aae0-cd6676d514e5");
        }
        return (T) super.get();
    }
}
