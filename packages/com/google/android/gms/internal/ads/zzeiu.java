package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeiu {
    private final ArrayDeque<zzeff> zziji;

    private zzeiu() {
        this.zziji = new ArrayDeque<>();
    }

    public final zzeff zzc(zzeff zzeffVar, zzeff zzeffVar2) {
        zzal(zzeffVar);
        zzal(zzeffVar2);
        zzeff pop = this.zziji.pop();
        while (!this.zziji.isEmpty()) {
            pop = new zzeis(this.zziji.pop(), pop, null);
        }
        return pop;
    }

    private final void zzal(zzeff zzeffVar) {
        zzeff zzeffVar2;
        while (!zzeffVar.zzbdo()) {
            if (zzeffVar instanceof zzeis) {
                zzeis zzeisVar = (zzeis) zzeffVar;
                zzeffVar2 = zzeisVar.zzijc;
                zzal(zzeffVar2);
                zzeffVar = zzeisVar.zzijd;
            } else {
                String valueOf = String.valueOf(zzeffVar.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int zzhn = zzhn(zzeffVar.size());
        int zzhm = zzeis.zzhm(zzhn + 1);
        if (this.zziji.isEmpty() || this.zziji.peek().size() >= zzhm) {
            this.zziji.push(zzeffVar);
            return;
        }
        int zzhm2 = zzeis.zzhm(zzhn);
        zzeff pop = this.zziji.pop();
        while (!this.zziji.isEmpty() && this.zziji.peek().size() < zzhm2) {
            pop = new zzeis(this.zziji.pop(), pop, null);
        }
        zzeis zzeisVar2 = new zzeis(pop, zzeffVar, null);
        while (!this.zziji.isEmpty()) {
            if (this.zziji.peek().size() >= zzeis.zzhm(zzhn(zzeisVar2.size()) + 1)) {
                break;
            }
            zzeisVar2 = new zzeis(this.zziji.pop(), zzeisVar2, null);
        }
        this.zziji.push(zzeisVar2);
    }

    private static int zzhn(int i) {
        int binarySearch = Arrays.binarySearch(zzeis.zzija, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzeiu(zzeir zzeirVar) {
        this();
    }

    public static /* synthetic */ zzeff zza(zzeiu zzeiuVar, zzeff zzeffVar, zzeff zzeffVar2) {
        return zzeiuVar.zzc(zzeffVar, zzeffVar2);
    }
}
