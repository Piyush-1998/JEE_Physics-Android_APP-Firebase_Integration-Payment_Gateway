package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzalu {
    private static final zzazm<zzajx> zzdhv = new zzalt();
    private static final zzazm<zzajx> zzdhw = new zzalw();
    private final zzakk zzdhx;

    public zzalu(Context context, zzbbg zzbbgVar, String str) {
        this.zzdhx = new zzakk(context, zzbbgVar, str, zzdhv, zzdhw);
    }

    public final <I, O> zzalm<I, O> zza(String str, zzaln<I> zzalnVar, zzalo<O> zzaloVar) {
        return new zzalv(this.zzdhx, str, zzalnVar, zzaloVar);
    }

    public final zzalz zztl() {
        return new zzalz(this.zzdhx);
    }
}
