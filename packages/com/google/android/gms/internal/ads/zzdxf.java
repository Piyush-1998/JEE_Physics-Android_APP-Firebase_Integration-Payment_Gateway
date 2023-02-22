package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecb;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdxf<P> {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Class<P> zzhqs;
    private ConcurrentMap<String, List<zzdxi<P>>> zzhqz = new ConcurrentHashMap();
    private zzdxi<P> zzhra;

    public final zzdxi<P> zzaxy() {
        return this.zzhra;
    }

    private zzdxf(Class<P> cls) {
        this.zzhqs = cls;
    }

    public static <P> zzdxf<P> zza(Class<P> cls) {
        return new zzdxf<>(cls);
    }

    public final void zza(zzdxi<P> zzdxiVar) {
        if (zzdxiVar == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        }
        if (zzdxiVar.zzaya() != zzebu.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        List<zzdxi<P>> list = this.zzhqz.get(new String(zzdxiVar.zzayc(), UTF_8));
        if (list == null) {
            list = Collections.emptyList();
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.zzhra = zzdxiVar;
    }

    public final zzdxi<P> zza(P p, zzecb.zzb zzbVar) throws GeneralSecurityException {
        byte[] array;
        if (zzbVar.zzaya() != zzebu.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int i = zzdwr.zzhqp[zzbVar.zzayb().ordinal()];
        if (i == 1 || i == 2) {
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzbVar.zzbbr()).array();
        } else if (i == 3) {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzbVar.zzbbr()).array();
        } else if (i == 4) {
            array = zzdws.zzhqq;
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        zzdxi<P> zzdxiVar = new zzdxi<>(p, array, zzbVar.zzaya(), zzbVar.zzayb(), zzbVar.zzbbr());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzdxiVar);
        String str = new String(zzdxiVar.zzayc(), UTF_8);
        List<zzdxi<P>> put = this.zzhqz.put(str, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(zzdxiVar);
            this.zzhqz.put(str, Collections.unmodifiableList(arrayList2));
        }
        return zzdxiVar;
    }

    public final Class<P> zzaxp() {
        return this.zzhqs;
    }
}
