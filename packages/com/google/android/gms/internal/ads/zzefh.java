package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzefh implements Comparator<zzeff> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzeff zzeffVar, zzeff zzeffVar2) {
        int zzb;
        int zzb2;
        zzeff zzeffVar3 = zzeffVar;
        zzeff zzeffVar4 = zzeffVar2;
        zzefk zzefkVar = (zzefk) zzeffVar3.iterator();
        zzefk zzefkVar2 = (zzefk) zzeffVar4.iterator();
        while (zzefkVar.hasNext() && zzefkVar2.hasNext()) {
            zzb = zzeff.zzb(zzefkVar.nextByte());
            zzb2 = zzeff.zzb(zzefkVar2.nextByte());
            int compare = Integer.compare(zzb, zzb2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzeffVar3.size(), zzeffVar4.size());
    }
}
