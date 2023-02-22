package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdnj implements zzdnk {
    private final Object[] zzhfk;

    public zzdnj(zzvc zzvcVar, String str, int i, String str2, zzvm zzvmVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzvcVar.zzcgv));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zzr(zzvcVar.extras));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzvcVar.extras.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzvcVar.zzcgw));
        }
        if (hashSet.contains("keywords")) {
            if (zzvcVar.zzcgx != null) {
                arrayList.add(zzvcVar.zzcgx.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzvcVar.zzcgy));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzvcVar.zzadj));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzvcVar.zzbnu));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzvcVar.zzcgz);
        }
        if (hashSet.contains("location")) {
            if (zzvcVar.zznb != null) {
                arrayList.add(zzvcVar.zznb.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzvcVar.zzchb);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zzr(zzvcVar.zzchc));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zzr(zzvcVar.zzchd));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzvcVar.zzche != null) {
                arrayList.add(zzvcVar.zzche.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzvcVar.zzchf);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzvcVar.zzchg);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzvcVar.zzchh));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzvcVar.zzadk));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzvcVar.zzadl);
        }
        if (hashSet.contains("orientation")) {
            if (zzvmVar != null) {
                arrayList.add(Integer.valueOf(zzvmVar.orientation));
            } else {
                arrayList.add(null);
            }
        }
        this.zzhfk = arrayList.toArray();
    }

    @Override // com.google.android.gms.internal.ads.zzdnk
    public final boolean equals(Object obj) {
        if (obj instanceof zzdnj) {
            return Arrays.equals(this.zzhfk, ((zzdnj) obj).zzhfk);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdnk
    public final int hashCode() {
        return Arrays.hashCode(this.zzhfk);
    }

    public final String toString() {
        int hashCode = hashCode();
        String arrays = Arrays.toString(this.zzhfk);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }

    private static String zzr(Bundle bundle) {
        String obj;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj2 = bundle.get((String) it.next());
            if (obj2 == null) {
                obj = "null";
            } else if (obj2 instanceof Bundle) {
                obj = zzr((Bundle) obj2);
            } else {
                obj = obj2.toString();
            }
            sb.append(obj);
        }
        return sb.toString();
    }
}
