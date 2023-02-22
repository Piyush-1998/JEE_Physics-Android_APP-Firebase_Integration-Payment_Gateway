package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzbke {
    private zza zzfki;

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static abstract class zza {
        public abstract zzbfd zzaed();

        public abstract zzbco zzaee();

        public abstract zztt zzaef();

        public abstract zzavw zzaeg();

        public abstract zzaqs zzaeh();

        public abstract zzamh zzaei();

        public abstract zzaby zzaej();
    }

    public zzbke(zza zzaVar) {
        this.zzfki = zzaVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzavx, com.google.android.gms.internal.ads.zzavr] */
    public final com.google.android.gms.ads.internal.zzb zzagn() {
        zza zzaVar = this.zzfki;
        return new com.google.android.gms.ads.internal.zzb(zzaVar.zzaed(), zzaVar.zzaee(), new zzavr(zzaVar.zzaeg()), zzaVar.zzaef(), zzaVar.zzaeh(), zzaVar.zzaej());
    }

    public final zzavw zzaeg() {
        return this.zzfki.zzaeg();
    }

    public final zzaqs zzaeh() {
        return this.zzfki.zzaeh();
    }

    public final zzamh zzaei() {
        return this.zzfki.zzaei();
    }

    public final zzaby zzaej() {
        return this.zzfki.zzaej();
    }
}
