package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzrp {
    private final int zzbtw;
    private final zzrq zzbty = new zzrt();
    private final int zzbtv = 6;
    private final int zzbtx = 0;

    public zzrp(int i) {
        this.zzbtw = i;
    }

    public final String zza(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            String str = arrayList2.get(i);
            i++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append('\n');
        }
        return zzbt(sb.toString());
    }

    private final String zzbt(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        zzrr zzrrVar = new zzrr();
        PriorityQueue priorityQueue = new PriorityQueue(this.zzbtw, new zzrs(this));
        for (String str2 : split) {
            String[] zze = zzru.zze(str2, false);
            if (zze.length != 0) {
                zzrv.zza(zze, this.zzbtw, this.zzbtv, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzrrVar.write(this.zzbty.zzbu(((zzry) it.next()).zzbuf));
            } catch (IOException e) {
                zzaxy.zzc("Error while writing hash to byteStream", e);
            }
        }
        return zzrrVar.toString();
    }
}
