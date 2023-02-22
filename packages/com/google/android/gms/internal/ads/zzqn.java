package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.WeakHashMap;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzqn {
    private final Context zzaai;
    private final zzbbg zzbpa;
    private final zzakk zzbqw;
    private final Object lock = new Object();
    private final WeakHashMap<Object, Object> zzbqu = new WeakHashMap<>();
    private final ArrayList<Object> zzbqv = new ArrayList<>();

    public zzqn(Context context, zzbbg zzbbgVar) {
        this.zzaai = context.getApplicationContext();
        this.zzbpa = zzbbgVar;
        this.zzbqw = new zzakk(context.getApplicationContext(), zzbbgVar, (String) zzwe.zzpu().zzd(zzaat.zzclj));
    }
}
