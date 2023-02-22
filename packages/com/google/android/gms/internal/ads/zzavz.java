package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
final class zzavz {
    private static final Map<String, String> zzdwq;
    private final List<String> zzdwr;
    private final zzavl zzdws;
    private final Context zzvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavz(Context context, List<String> list, zzavl zzavlVar) {
        this.zzvr = context;
        this.zzdwr = list;
        this.zzdws = zzavlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> zzb(String[] strArr) {
        boolean z;
        boolean z2;
        String valueOf;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Iterator<String> it = this.zzdwr.iterator();
            do {
                z = true;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                String next = it.next();
                if (next.equals(str)) {
                    break;
                }
                valueOf = String.valueOf(next);
            } while (!(valueOf.length() != 0 ? "android.webkit.resource.".concat(valueOf) : new String("android.webkit.resource.")).equals(str));
            z2 = true;
            if (z2) {
                if (zzdwq.containsKey(str)) {
                    com.google.android.gms.ads.internal.zzp.zzkp();
                    if (!zzayh.zzr(this.zzvr, zzdwq.get(str))) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(str);
                } else {
                    this.zzdws.zzec(str);
                }
            } else {
                this.zzdws.zzeb(str);
            }
        }
        return arrayList;
    }

    static {
        HashMap hashMap = new HashMap();
        if (PlatformVersion.isAtLeastLollipop()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        zzdwq = hashMap;
    }
}
