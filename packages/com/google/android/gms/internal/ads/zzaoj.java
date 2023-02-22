package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaoj {
    public static int zza(AdRequest.ErrorCode errorCode) {
        int i = zzaom.zzdlk[errorCode.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return i != 4 ? 0 : 3;
            }
            return 2;
        }
        return 1;
    }

    public static MediationAdRequest zza(zzvc zzvcVar, boolean z) {
        AdRequest.Gender gender;
        HashSet hashSet = zzvcVar.zzcgx != null ? new HashSet(zzvcVar.zzcgx) : null;
        Date date = new Date(zzvcVar.zzcgv);
        int i = zzvcVar.zzcgw;
        if (i == 1) {
            gender = AdRequest.Gender.MALE;
        } else if (i == 2) {
            gender = AdRequest.Gender.FEMALE;
        } else {
            gender = AdRequest.Gender.UNKNOWN;
        }
        return new MediationAdRequest(date, gender, hashSet, z, zzvcVar.zznb);
    }
}
