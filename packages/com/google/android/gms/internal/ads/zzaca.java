package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class zzaca<T> {
    private final T zzckv;
    private final String zzcn;
    private final int zzczb;

    public static zzaca<Boolean> zzg(String str, boolean z) {
        return new zzaca<>(str, Boolean.valueOf(z), zzacc.zzczc);
    }

    public static zzaca<Long> zzb(String str, long j) {
        return new zzaca<>(str, Long.valueOf(j), zzacc.zzczd);
    }

    public static zzaca<Double> zzb(String str, double d) {
        return new zzaca<>(str, Double.valueOf(d), zzacc.zzcze);
    }

    public static zzaca<String> zzi(String str, String str2) {
        return new zzaca<>(str, str2, zzacc.zzczf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Ljava/lang/Integer;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public zzaca(String str, Object obj, int i) {
        this.zzcn = str;
        this.zzckv = obj;
        this.zzczb = i;
    }

    public T get() {
        zzadc zzrx = zzadb.zzrx();
        if (zzrx == null) {
            throw new IllegalStateException("Flag is not initialized.");
        }
        int i = zzabz.zzcza[this.zzczb - 1];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return (T) zzrx.get(this.zzcn, (String) this.zzckv);
                    }
                    throw new IllegalStateException();
                }
                return (T) zzrx.zza(this.zzcn, ((Double) this.zzckv).doubleValue());
            }
            return (T) zzrx.getLong(this.zzcn, ((Long) this.zzckv).longValue());
        }
        return (T) zzrx.zzf(this.zzcn, ((Boolean) this.zzckv).booleanValue());
    }
}
