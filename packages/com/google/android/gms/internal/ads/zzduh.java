package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzduh<V, X extends Throwable, F, T> extends zzdvf<V> implements Runnable {
    @NullableDecl
    private zzdvt<? extends V> zzhof;
    @NullableDecl
    private Class<X> zzhog;
    @NullableDecl
    private F zzhoh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <X extends Throwable, V> zzdvt<V> zza(zzdvt<? extends V> zzdvtVar, Class<X> cls, zzduv<? super X, ? extends V> zzduvVar, Executor executor) {
        zzdug zzdugVar = new zzdug(zzdvtVar, cls, zzduvVar);
        zzdvtVar.addListener(zzdugVar, zzdvv.zza(executor, zzdugVar));
        return zzdugVar;
    }

    abstract void setResult(@NullableDecl T t);

    @NullableDecl
    abstract T zza(F f, X x) throws Exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduh(zzdvt<? extends V> zzdvtVar, Class<X> cls, F f) {
        this.zzhof = (zzdvt) zzdsv.checkNotNull(zzdvtVar);
        this.zzhog = (Class) zzdsv.checkNotNull(cls);
        this.zzhoh = (F) zzdsv.checkNotNull(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Class<X extends java.lang.Throwable>, F] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzdvt<? extends V> r0 = r9.zzhof
            java.lang.Class<X extends java.lang.Throwable> r1 = r9.zzhog
            F r2 = r9.zzhoh
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != 0) goto L11
            r6 = 1
            goto L12
        L11:
            r6 = 0
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto Lb6
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L22
            goto Lb6
        L22:
            r3 = 0
            r9.zzhof = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzdwo     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            if (r4 == 0) goto L31
            r4 = r0
            com.google.android.gms.internal.ads.zzdwo r4 = (com.google.android.gms.internal.ads.zzdwo) r4     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            java.lang.Throwable r4 = com.google.android.gms.internal.ads.zzdwn.zza(r4)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L3a
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzdvl.zza(r0)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            goto L8b
        L39:
            r4 = move-exception
        L3a:
            r5 = r3
            goto L8b
        L3c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L89
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            int r7 = r7 + 35
            java.lang.String r8 = java.lang.String.valueOf(r4)
            int r8 = r8.length()
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Future type "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = " threw "
            r8.append(r6)
            r8.append(r4)
            java.lang.String r4 = " without a cause"
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r5.<init>(r4)
        L89:
            r4 = r5
            goto L3a
        L8b:
            if (r4 != 0) goto L91
            r9.set(r5)
            return
        L91:
            boolean r1 = r1.isInstance(r4)
            if (r1 != 0) goto L9b
            r9.setFuture(r0)
            return
        L9b:
            java.lang.Object r0 = r9.zza(r2, r4)     // Catch: java.lang.Throwable -> La7
            r9.zzhog = r3
            r9.zzhoh = r3
            r9.setResult(r0)
            return
        La7:
            r0 = move-exception
            r9.setException(r0)     // Catch: java.lang.Throwable -> Lb0
            r9.zzhog = r3
            r9.zzhoh = r3
            return
        Lb0:
            r0 = move-exception
            r9.zzhog = r3
            r9.zzhoh = r3
            throw r0
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzduh.run():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdui
    public final String pendingToString() {
        String str;
        zzdvt<? extends V> zzdvtVar = this.zzhof;
        Class<X> cls = this.zzhog;
        F f = this.zzhoh;
        String pendingToString = super.pendingToString();
        if (zzdvtVar != null) {
            String valueOf = String.valueOf(zzdvtVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (cls == null || f == null) {
            if (pendingToString != null) {
                String valueOf2 = String.valueOf(str);
                String valueOf3 = String.valueOf(pendingToString);
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            return null;
        }
        String valueOf4 = String.valueOf(cls);
        String valueOf5 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb2.append(str);
        sb2.append("exceptionType=[");
        sb2.append(valueOf4);
        sb2.append("], fallback=[");
        sb2.append(valueOf5);
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdui
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzhof);
        this.zzhof = null;
        this.zzhog = null;
        this.zzhoh = null;
    }
}
