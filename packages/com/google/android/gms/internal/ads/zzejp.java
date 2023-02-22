package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzejp extends zzejn<zzejq, zzejq> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final boolean zza(zzeip zzeipVar) {
        return false;
    }

    private static void zza(Object obj, zzejq zzejqVar) {
        ((zzegp) obj).zzifo = zzejqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final void zzaj(Object obj) {
        ((zzegp) obj).zzifo.zzbdg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final /* synthetic */ int zzat(zzejq zzejqVar) {
        return zzejqVar.zzbfl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final /* synthetic */ int zzaz(zzejq zzejqVar) {
        return zzejqVar.zzbib();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final /* synthetic */ zzejq zzk(zzejq zzejqVar, zzejq zzejqVar2) {
        zzejq zzejqVar3 = zzejqVar;
        zzejq zzejqVar4 = zzejqVar2;
        return zzejqVar4.equals(zzejq.zzbhz()) ? zzejqVar3 : zzejq.zza(zzejqVar3, zzejqVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final /* synthetic */ void zzc(zzejq zzejqVar, zzekk zzekkVar) throws IOException {
        zzejqVar.zza(zzekkVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final /* synthetic */ void zza(zzejq zzejqVar, zzekk zzekkVar) throws IOException {
        zzejqVar.zzb(zzekkVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final /* synthetic */ void zzj(Object obj, zzejq zzejqVar) {
        zza(obj, zzejqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final /* synthetic */ zzejq zzay(Object obj) {
        zzejq zzejqVar = ((zzegp) obj).zzifo;
        if (zzejqVar == zzejq.zzbhz()) {
            zzejq zzbia = zzejq.zzbia();
            zza(obj, zzbia);
            return zzbia;
        }
        return zzejqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final /* synthetic */ zzejq zzax(Object obj) {
        return ((zzegp) obj).zzifo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final /* synthetic */ void zzi(Object obj, zzejq zzejqVar) {
        zza(obj, zzejqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzejn
    final /* synthetic */ zzejq zzar(zzejq zzejqVar) {
        zzejq zzejqVar2 = zzejqVar;
        zzejqVar2.zzbdg();
        return zzejqVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final /* synthetic */ zzejq zzbhy() {
        return zzejq.zzbia();
    }

    @Override // com.google.android.gms.internal.ads.zzejn
    final /* synthetic */ void zza(zzejq zzejqVar, int i, zzejq zzejqVar2) {
        zzejqVar.zzd((i << 3) | 3, zzejqVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final /* synthetic */ void zza(zzejq zzejqVar, int i, zzeff zzeffVar) {
        zzejqVar.zzd((i << 3) | 2, zzeffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzejn
    final /* synthetic */ void zzb(zzejq zzejqVar, int i, long j) {
        zzejqVar.zzd((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzejn
    final /* synthetic */ void zzc(zzejq zzejqVar, int i, int i2) {
        zzejqVar.zzd((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejn
    public final /* synthetic */ void zza(zzejq zzejqVar, int i, long j) {
        zzejqVar.zzd(i << 3, Long.valueOf(j));
    }
}
