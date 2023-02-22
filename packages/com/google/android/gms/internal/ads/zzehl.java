package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzehl extends zzehj {
    private static final Class<?> zzihn = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzehl() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzehj
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzehj
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzejt.zzp(obj, j);
        if (list instanceof zzehk) {
            unmodifiableList = ((zzehk) list).zzbgo();
        } else if (zzihn.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzeil) && (list instanceof zzeha)) {
                zzeha zzehaVar = (zzeha) list;
                if (zzehaVar.zzbdf()) {
                    zzehaVar.zzbdg();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzejt.zza(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzehh zzehhVar;
        List<L> arrayList;
        List<L> zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            if (zzc instanceof zzehk) {
                arrayList = new zzehh(i);
            } else if ((zzc instanceof zzeil) && (zzc instanceof zzeha)) {
                arrayList = ((zzeha) zzc).zzft(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zzejt.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zzihn.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzc.size() + i);
            arrayList2.addAll(zzc);
            zzejt.zza(obj, j, arrayList2);
            zzehhVar = arrayList2;
        } else if (zzc instanceof zzejs) {
            zzehh zzehhVar2 = new zzehh(zzc.size() + i);
            zzehhVar2.addAll((zzejs) zzc);
            zzejt.zza(obj, j, zzehhVar2);
            zzehhVar = zzehhVar2;
        } else if ((zzc instanceof zzeil) && (zzc instanceof zzeha)) {
            zzeha zzehaVar = (zzeha) zzc;
            if (zzehaVar.zzbdf()) {
                return zzc;
            }
            zzeha zzft = zzehaVar.zzft(zzc.size() + i);
            zzejt.zza(obj, j, zzft);
            return zzft;
        } else {
            return zzc;
        }
        return zzehhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzehj
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza = zza(obj, j, zzc.size());
        int size = zza.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza;
        }
        zzejt.zza(obj, j, zzc);
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzejt.zzp(obj, j);
    }
}
