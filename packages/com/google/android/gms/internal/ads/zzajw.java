package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzajw<ReferenceT> implements zzajt {
    private final Map<String, CopyOnWriteArrayList<zzahf<? super ReferenceT>>> zzdfz = new HashMap();
    private ReferenceT zzdga;

    public final void zzg(ReferenceT referencet) {
        this.zzdga = referencet;
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    public final boolean zzdg(String str) {
        return str != null && zzg(Uri.parse(str));
    }

    public final boolean zzg(Uri uri) {
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzh(uri);
            return true;
        }
        return false;
    }

    public final void zzh(Uri uri) {
        String path = uri.getPath();
        com.google.android.gms.ads.internal.zzp.zzkp();
        zzb(path, zzayh.zzj(uri));
    }

    private final synchronized void zzb(final String str, final Map<String, String> map) {
        if (zzaxy.isLoggable(2)) {
            String valueOf = String.valueOf(str);
            zzaxy.zzei(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                zzaxy.zzei(sb.toString());
            }
        }
        CopyOnWriteArrayList<zzahf<? super ReferenceT>> copyOnWriteArrayList = this.zzdfz.get(str);
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<zzahf<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                final zzahf<? super ReferenceT> next = it.next();
                zzbbi.zzedy.execute(new Runnable(this, next, map) { // from class: com.google.android.gms.internal.ads.zzajv
                    private final zzajw zzdfw;
                    private final zzahf zzdfx;
                    private final Map zzdfy;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdfw = this;
                        this.zzdfx = next;
                        this.zzdfy = map;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzdfw.zza(this.zzdfx, this.zzdfy);
                    }
                });
            }
            return;
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcwx)).booleanValue() && com.google.android.gms.ads.internal.zzp.zzkt().zzwd() != null) {
            zzbbi.zzedu.execute(new Runnable(str) { // from class: com.google.android.gms.internal.ads.zzajy
                private final String zzdgb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdgb = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzp.zzkt().zzwd().zzcv(this.zzdgb.substring(1));
                }
            });
        }
    }

    public final synchronized void zza(String str, zzahf<? super ReferenceT> zzahfVar) {
        CopyOnWriteArrayList<zzahf<? super ReferenceT>> copyOnWriteArrayList = this.zzdfz.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.zzdfz.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(zzahfVar);
    }

    public final synchronized void zzb(String str, zzahf<? super ReferenceT> zzahfVar) {
        CopyOnWriteArrayList<zzahf<? super ReferenceT>> copyOnWriteArrayList = this.zzdfz.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(zzahfVar);
    }

    public final synchronized void zza(String str, Predicate<zzahf<? super ReferenceT>> predicate) {
        CopyOnWriteArrayList<zzahf<? super ReferenceT>> copyOnWriteArrayList = this.zzdfz.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zzahf<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzahf<? super ReferenceT> next = it.next();
            if (predicate.apply(next)) {
                arrayList.add(next);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
    }

    public final synchronized void reset() {
        this.zzdfz.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzahf zzahfVar, Map map) {
        zzahfVar.zza(this.zzdga, map);
    }
}
