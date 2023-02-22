package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.internal.ads.zzegp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class zzegc {
    private static volatile boolean zzick = false;
    private static boolean zzicl = true;
    private static volatile zzegc zzicm;
    private static volatile zzegc zzicn;
    private static final zzegc zzico = new zzegc(true);
    private final Map<zza, zzegp.zzf<?, ?>> zzicp;

    public static zzegc zzbex() {
        zzegc zzegcVar = zzicm;
        if (zzegcVar == null) {
            synchronized (zzegc.class) {
                zzegcVar = zzicm;
                if (zzegcVar == null) {
                    zzegcVar = zzico;
                    zzicm = zzegcVar;
                }
            }
        }
        return zzegcVar;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    static final class zza {
        private final int number;
        private final Object object;

        zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * SupportMenu.USER_MASK) + this.number;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                return this.object == zzaVar.object && this.number == zzaVar.number;
            }
            return false;
        }
    }

    public static zzegc zzbey() {
        zzegc zzegcVar = zzicn;
        if (zzegcVar != null) {
            return zzegcVar;
        }
        synchronized (zzegc.class) {
            zzegc zzegcVar2 = zzicn;
            if (zzegcVar2 != null) {
                return zzegcVar2;
            }
            zzegc zzc = zzegn.zzc(zzegc.class);
            zzicn = zzc;
            return zzc;
        }
    }

    public final <ContainingType extends zzehz> zzegp.zzf<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzegp.zzf<ContainingType, ?>) this.zzicp.get(new zza(containingtype, i));
    }

    zzegc() {
        this.zzicp = new HashMap();
    }

    private zzegc(boolean z) {
        this.zzicp = Collections.emptyMap();
    }
}
