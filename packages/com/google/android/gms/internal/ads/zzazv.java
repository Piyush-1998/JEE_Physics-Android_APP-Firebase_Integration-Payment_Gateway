package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzazv implements zzai {
    private final /* synthetic */ String zzeca;
    private final /* synthetic */ zzazw zzecb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazv(zzazt zzaztVar, String str, zzazw zzazwVar) {
        this.zzeca = str;
        this.zzecb = zzazwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzai
    public final void zzc(zzao zzaoVar) {
        String str = this.zzeca;
        String zzaoVar2 = zzaoVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzaoVar2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzaoVar2);
        zzaxy.zzfe(sb.toString());
        this.zzecb.zzb(null);
    }
}
