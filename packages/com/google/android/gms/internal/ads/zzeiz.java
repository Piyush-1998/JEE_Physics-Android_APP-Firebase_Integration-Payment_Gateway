package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeiz extends zzeja<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeiz(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeja
    public final void zzbdg() {
        if (!isImmutable()) {
            for (int i = 0; i < zzbhq(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzhp = zzhp(i);
                if (((zzegk) zzhp.getKey()).zzbfg()) {
                    zzhp.setValue(Collections.unmodifiableList((List) zzhp.getValue()));
                }
            }
            Iterator it = zzbhr().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((zzegk) entry.getKey()).zzbfg()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzbdg();
    }
}
