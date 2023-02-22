package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzabc {
    public static void zza(zzaba zzabaVar, zzaax zzaaxVar) {
        if (zzaaxVar.getContext() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzaaxVar.zzls())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzabaVar.zza(zzaaxVar.getContext(), zzaaxVar.zzls(), zzaaxVar.zzrh(), zzaaxVar.zzri());
    }
}
