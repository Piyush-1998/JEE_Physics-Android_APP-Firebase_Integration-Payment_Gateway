package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeix {
    private static final Class<?> zzijo = zzbho();
    private static final zzejn<?, ?> zzijp = zzbv(false);
    private static final zzejn<?, ?> zzijq = zzbv(true);
    private static final zzejn<?, ?> zzijr = new zzejp();

    public static void zzi(Class<?> cls) {
        Class<?> cls2;
        if (!zzegp.class.isAssignableFrom(cls) && (cls2 = zzijo) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Double> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzg(i, list, z);
    }

    public static void zzb(int i, List<Float> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzf(i, list, z);
    }

    public static void zzc(int i, List<Long> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Long> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzn(i, list, z);
    }

    public static void zzf(int i, List<Long> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zze(i, list, z);
    }

    public static void zzg(int i, List<Long> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzl(i, list, z);
    }

    public static void zzh(int i, List<Integer> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zza(i, list, z);
    }

    public static void zzi(int i, List<Integer> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzj(i, list, z);
    }

    public static void zzj(int i, List<Integer> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzm(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzb(i, list, z);
    }

    public static void zzl(int i, List<Integer> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzk(i, list, z);
    }

    public static void zzm(int i, List<Integer> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzh(i, list, z);
    }

    public static void zzn(int i, List<Boolean> list, zzekk zzekkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzi(i, list, z);
    }

    public static void zza(int i, List<String> list, zzekk zzekkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zza(i, list);
    }

    public static void zzb(int i, List<zzeff> list, zzekk zzekkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzb(i, list);
    }

    public static void zza(int i, List<?> list, zzekk zzekkVar, zzeiv zzeivVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zza(i, list, zzeivVar);
    }

    public static void zzb(int i, List<?> list, zzekk zzekkVar, zzeiv zzeivVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzekkVar.zzb(i, list, zzeivVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaa(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzehn) {
            zzehn zzehnVar = (zzehn) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzfl(zzehnVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzefz.zzfl(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzaa(list) + (list.size() * zzefz.zzgq(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzab(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzehn) {
            zzehn zzehnVar = (zzehn) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzfm(zzehnVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzefz.zzfm(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzab(list) + (size * zzefz.zzgq(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzac(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzehn) {
            zzehn zzehnVar = (zzehn) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzfn(zzehnVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzefz.zzfn(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzac(list) + (size * zzefz.zzgq(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzad(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzegs) {
            zzegs zzegsVar = (zzegs) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzgw(zzegsVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzefz.zzgw(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzad(list) + (size * zzefz.zzgq(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzae(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzegs) {
            zzegs zzegsVar = (zzegs) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzgr(zzegsVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzefz.zzgr(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzae(list) + (size * zzefz.zzgq(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaf(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzegs) {
            zzegs zzegsVar = (zzegs) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzgs(zzegsVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzefz.zzgs(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaf(list) + (size * zzefz.zzgq(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzag(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzegs) {
            zzegs zzegsVar = (zzegs) list;
            i = 0;
            while (i2 < size) {
                i += zzefz.zzgt(zzegsVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzefz.zzgt(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzag(list) + (size * zzefz.zzgq(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzah(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzefz.zzai(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzai(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzefz.zzn(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaj(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzefz.zzi(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<?> list) {
        int zzhw;
        int zzhw2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzgq = zzefz.zzgq(i) * size;
        if (list instanceof zzehk) {
            zzehk zzehkVar = (zzehk) list;
            while (i2 < size) {
                Object zzhe = zzehkVar.zzhe(i2);
                if (zzhe instanceof zzeff) {
                    zzhw2 = zzefz.zzai((zzeff) zzhe);
                } else {
                    zzhw2 = zzefz.zzhw((String) zzhe);
                }
                zzgq += zzhw2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzeff) {
                    zzhw = zzefz.zzai((zzeff) obj);
                } else {
                    zzhw = zzefz.zzhw((String) obj);
                }
                zzgq += zzhw;
                i2++;
            }
        }
        return zzgq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, Object obj, zzeiv zzeivVar) {
        if (obj instanceof zzehi) {
            return zzefz.zza(i, (zzehi) obj);
        }
        return zzefz.zzb(i, (zzehz) obj, zzeivVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<?> list, zzeiv zzeivVar) {
        int zza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzgq = zzefz.zzgq(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzehi) {
                zza = zzefz.zza((zzehi) obj);
            } else {
                zza = zzefz.zza((zzehz) obj, zzeivVar);
            }
            zzgq += zza;
        }
        return zzgq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<zzeff> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzgq = size * zzefz.zzgq(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgq += zzefz.zzai(list.get(i2));
        }
        return zzgq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<zzehz> list, zzeiv zzeivVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzefz.zzc(i, list.get(i3), zzeivVar);
        }
        return i2;
    }

    public static zzejn<?, ?> zzbhl() {
        return zzijp;
    }

    public static zzejn<?, ?> zzbhm() {
        return zzijq;
    }

    public static zzejn<?, ?> zzbhn() {
        return zzijr;
    }

    private static zzejn<?, ?> zzbv(boolean z) {
        try {
            Class<?> zzbhp = zzbhp();
            if (zzbhp == null) {
                return null;
            }
            return (zzejn) zzbhp.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzbho() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzbhp() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzh(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zza(zzehw zzehwVar, T t, T t2, long j) {
        zzejt.zza(t, j, zzehwVar.zzf(zzejt.zzp(t, j), zzejt.zzp(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzegk<FT>> void zza(zzege<FT> zzegeVar, T t, T t2) {
        zzegi<FT> zzah = zzegeVar.zzah(t2);
        if (zzah.zzict.isEmpty()) {
            return;
        }
        zzegeVar.zzai(t).zza(zzah);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzejn<UT, UB> zzejnVar, T t, T t2) {
        zzejnVar.zzi(t, zzejnVar.zzk(zzejnVar.zzax(t), zzejnVar.zzax(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, List<Integer> list, zzegw zzegwVar, UB ub, zzejn<UT, UB> zzejnVar) {
        if (zzegwVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzegwVar.zzi(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(i, intValue, ub, zzejnVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzegwVar.zzi(intValue2)) {
                    ub = (UB) zza(i, intValue2, ub, zzejnVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, int i2, UB ub, zzejn<UT, UB> zzejnVar) {
        if (ub == null) {
            ub = zzejnVar.zzbhy();
        }
        zzejnVar.zza((zzejn<UT, UB>) ub, i, i2);
        return ub;
    }
}
