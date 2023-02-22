package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzrd {
    private int zzbrz;
    private final Object lock = new Object();
    private List<zzre> zzbsa = new LinkedList();

    public final zzre zzo(boolean z) {
        synchronized (this.lock) {
            zzre zzreVar = null;
            if (this.zzbsa.size() == 0) {
                zzaxy.zzef("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzbsa.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (zzre zzreVar2 : this.zzbsa) {
                    int score = zzreVar2.getScore();
                    if (score > i2) {
                        i = i3;
                        zzreVar = zzreVar2;
                        i2 = score;
                    }
                    i3++;
                }
                this.zzbsa.remove(i);
                return zzreVar;
            }
            zzre zzreVar3 = this.zzbsa.get(0);
            if (z) {
                this.zzbsa.remove(0);
            } else {
                zzreVar3.zzma();
            }
            return zzreVar3;
        }
    }

    public final boolean zza(zzre zzreVar) {
        synchronized (this.lock) {
            return this.zzbsa.contains(zzreVar);
        }
    }

    public final boolean zzb(zzre zzreVar) {
        synchronized (this.lock) {
            Iterator<zzre> it = this.zzbsa.iterator();
            while (it.hasNext()) {
                zzre next = it.next();
                if (!com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzwy()) {
                    if (zzreVar != next && next.zzlx().equals(zzreVar.zzlx())) {
                        it.remove();
                        return true;
                    }
                } else if (!com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzxa() && zzreVar != next && next.zzlz().equals(zzreVar.zzlz())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzc(zzre zzreVar) {
        synchronized (this.lock) {
            if (this.zzbsa.size() >= 10) {
                int size = this.zzbsa.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                zzaxy.zzef(sb.toString());
                this.zzbsa.remove(0);
            }
            int i = this.zzbrz;
            this.zzbrz = i + 1;
            zzreVar.zzbw(i);
            zzreVar.zzmd();
            this.zzbsa.add(zzreVar);
        }
    }
}
