package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbw;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdpy {
    private static volatile zzbw.zza.zzc zzhiv = zzbw.zza.zzc.UNKNOWN;
    private final Executor executor;
    private final Task<zztt> zzhiu;
    private final Context zzvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(zzbw.zza.zzc zzcVar) {
        zzhiv = zzcVar;
    }

    public static zzdpy zza(final Context context, Executor executor) {
        return new zzdpy(context, executor, Tasks.call(executor, new Callable(context) { // from class: com.google.android.gms.internal.ads.zzdqa
            private final Context zzcxz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcxz = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdpy.zzci(this.zzcxz);
            }
        }));
    }

    private zzdpy(Context context, Executor executor, Task<zztt> task) {
        this.zzvr = context;
        this.executor = executor;
        this.zzhiu = task;
    }

    public final Task<Boolean> zzg(int i, long j) {
        return zza(i, j, null, null, null, null);
    }

    public final Task<Boolean> zza(int i, long j, Exception exc) {
        return zza(i, j, exc, null, null, null);
    }

    public final Task<Boolean> zza(int i, long j, String str, Map<String, String> map) {
        return zza(i, j, null, str, null, null);
    }

    public final Task<Boolean> zzg(int i, String str) {
        return zza(4007, 0L, null, null, null, str);
    }

    private final Task<Boolean> zza(final int i, long j, Exception exc, String str, Map<String, String> map, String str2) {
        final zzbw.zza.C0005zza zzc = zzbw.zza.zzs().zzk(this.zzvr.getPackageName()).zzc(j);
        zzc.zza(zzhiv);
        if (exc != null) {
            zzc.zzl(zzdsy.zza(exc)).zzm(exc.getClass().getName());
        }
        if (str2 != null) {
            zzc.zzn(str2);
        }
        if (str != null) {
            zzc.zzo(str);
        }
        return this.zzhiu.continueWith(this.executor, new Continuation(zzc, i) { // from class: com.google.android.gms.internal.ads.zzdpz
            private final int zzeax;
            private final zzbw.zza.C0005zza zzhiw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhiw = zzc;
                this.zzeax = i;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzdpy.zza(this.zzhiw, this.zzeax, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Boolean zza(zzbw.zza.C0005zza c0005zza, int i, Task task) throws Exception {
        if (task.isSuccessful()) {
            zztx zzf = ((zztt) task.getResult()).zzf(((zzbw.zza) ((zzegp) c0005zza.zzbfx())).toByteArray());
            zzf.zzby(i);
            zzf.zzdv();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ zztt zzci(Context context) throws Exception {
        return new zztt(context, "GLAS", null);
    }
}
