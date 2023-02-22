package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzeit implements Iterator<zzefm> {
    private final ArrayDeque<zzeis> zzijg;
    private zzefm zzijh;

    private zzeit(zzeff zzeffVar) {
        zzeff zzeffVar2;
        if (zzeffVar instanceof zzeis) {
            zzeis zzeisVar = (zzeis) zzeffVar;
            ArrayDeque<zzeis> arrayDeque = new ArrayDeque<>(zzeisVar.zzbdn());
            this.zzijg = arrayDeque;
            arrayDeque.push(zzeisVar);
            zzeffVar2 = zzeisVar.zzijc;
            this.zzijh = zzak(zzeffVar2);
            return;
        }
        this.zzijg = null;
        this.zzijh = (zzefm) zzeffVar;
    }

    private final zzefm zzak(zzeff zzeffVar) {
        while (zzeffVar instanceof zzeis) {
            zzeis zzeisVar = (zzeis) zzeffVar;
            this.zzijg.push(zzeisVar);
            zzeffVar = zzeisVar.zzijc;
        }
        return (zzefm) zzeffVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzijh != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzefm next() {
        zzefm zzefmVar;
        zzeff zzeffVar;
        zzefm zzefmVar2 = this.zzijh;
        if (zzefmVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque<zzeis> arrayDeque = this.zzijg;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                zzefmVar = null;
                break;
            }
            zzeffVar = this.zzijg.pop().zzijd;
            zzefmVar = zzak(zzeffVar);
        } while (zzefmVar.isEmpty());
        this.zzijh = zzefmVar;
        return zzefmVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeit(zzeff zzeffVar, zzeir zzeirVar) {
        this(zzeffVar);
    }
}
