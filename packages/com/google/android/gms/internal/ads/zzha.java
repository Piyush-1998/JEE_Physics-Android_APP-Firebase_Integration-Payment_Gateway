package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzha {
    public static final int CHANNEL_OUT_7POINT1_SURROUND;
    public static final UUID UUID_NIL;
    private static final UUID zzadx;
    private static final UUID zzady;
    private static final UUID zzadz;

    public static long zzdm(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }

    public static long zzdn(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j * 1000;
    }

    static {
        CHANNEL_OUT_7POINT1_SURROUND = zzpq.SDK_INT < 23 ? PointerIconCompat.TYPE_GRAB : 6396;
        UUID_NIL = new UUID(0L, 0L);
        zzadx = new UUID(1186680826959645954L, -5988876978535335093L);
        zzady = new UUID(-1301668207276963122L, -6645017420763422227L);
        zzadz = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
