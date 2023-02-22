package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzoy;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzov<T extends zzoy> extends Handler implements Runnable {
    private volatile boolean zzage;
    private final T zzbjf;
    private final zzow<T> zzbjg;
    public final int zzbjh;
    private final long zzbji;
    private IOException zzbjj;
    private int zzbjk;
    private volatile Thread zzbjl;
    private final /* synthetic */ zzot zzbjm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzov(zzot zzotVar, Looper looper, T t, zzow<T> zzowVar, int i, long j) {
        super(looper);
        this.zzbjm = zzotVar;
        this.zzbjf = t;
        this.zzbjg = zzowVar;
        this.zzbjh = i;
        this.zzbji = j;
    }

    public final void zzbj(int i) throws IOException {
        IOException iOException = this.zzbjj;
        if (iOException != null && this.zzbjk > i) {
            throw iOException;
        }
    }

    public final void zzek(long j) {
        zzov zzovVar;
        zzovVar = this.zzbjm.zzbjb;
        zzoz.checkState(zzovVar == null);
        this.zzbjm.zzbjb = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            execute();
        }
    }

    public final void zzl(boolean z) {
        this.zzage = z;
        this.zzbjj = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.zzbjf.cancelLoad();
            if (this.zzbjl != null) {
                this.zzbjl.interrupt();
            }
        }
        if (z) {
            finish();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzbjg.zza((zzow<T>) this.zzbjf, elapsedRealtime, elapsedRealtime - this.zzbji, true);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzbjl = Thread.currentThread();
            if (!this.zzbjf.zzhv()) {
                String valueOf = String.valueOf(this.zzbjf.getClass().getSimpleName());
                zzpn.beginSection(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                try {
                    this.zzbjf.zzhw();
                    zzpn.endSection();
                } catch (Throwable th) {
                    zzpn.endSection();
                    throw th;
                }
            }
            if (this.zzage) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.zzage) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (this.zzage) {
                return;
            }
            obtainMessage(3, new zzox(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (this.zzage) {
                return;
            }
            obtainMessage(3, new zzox(e3)).sendToTarget();
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.zzage) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (InterruptedException unused) {
            zzoz.checkState(this.zzbjf.zzhv());
            if (this.zzage) {
                return;
            }
            sendEmptyMessage(2);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzage) {
            return;
        }
        if (message.what == 0) {
            execute();
        } else if (message.what == 4) {
            throw ((Error) message.obj);
        } else {
            finish();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.zzbji;
            if (this.zzbjf.zzhv()) {
                this.zzbjg.zza((zzow<T>) this.zzbjf, elapsedRealtime, j, false);
                return;
            }
            int i = message.what;
            if (i == 1) {
                this.zzbjg.zza((zzow<T>) this.zzbjf, elapsedRealtime, j, false);
            } else if (i == 2) {
                this.zzbjg.zza(this.zzbjf, elapsedRealtime, j);
            } else if (i != 3) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zzbjj = iOException;
                int zza = this.zzbjg.zza((zzow<T>) this.zzbjf, elapsedRealtime, j, iOException);
                if (zza == 3) {
                    this.zzbjm.zzbjc = this.zzbjj;
                } else if (zza != 2) {
                    int i2 = zza == 1 ? 1 : this.zzbjk + 1;
                    this.zzbjk = i2;
                    zzek(Math.min((i2 - 1) * 1000, 5000));
                }
            }
        }
    }

    private final void execute() {
        ExecutorService executorService;
        zzov zzovVar;
        this.zzbjj = null;
        executorService = this.zzbjm.zzbja;
        zzovVar = this.zzbjm.zzbjb;
        executorService.execute(zzovVar);
    }

    private final void finish() {
        this.zzbjm.zzbjb = null;
    }
}
