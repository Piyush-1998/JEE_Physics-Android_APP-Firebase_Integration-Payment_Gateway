package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzeky implements zzbs, Closeable, Iterator<zzbp> {
    protected zzela zziqf;
    protected zzbo zziqj;
    private static final zzbp zziqi = new zzekx("eof ");
    private static zzelg zzdc = zzelg.zzn(zzeky.class);
    private zzbp zziqk = null;
    long zziql = 0;
    long zzbgh = 0;
    long zzawf = 0;
    private List<zzbp> zziqm = new ArrayList();

    public final List<zzbp> zzbjk() {
        if (this.zziqf != null && this.zziqk != zziqi) {
            return new zzele(this.zziqm, this);
        }
        return this.zziqm;
    }

    public void zza(zzela zzelaVar, long j, zzbo zzboVar) throws IOException {
        this.zziqf = zzelaVar;
        long position = zzelaVar.position();
        this.zzbgh = position;
        this.zziql = position;
        zzelaVar.zzfc(zzelaVar.position() + j);
        this.zzawf = zzelaVar.position();
        this.zziqj = zzboVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        zzbp zzbpVar = this.zziqk;
        if (zzbpVar == zziqi) {
            return false;
        }
        if (zzbpVar != null) {
            return true;
        }
        try {
            this.zziqk = (zzbp) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zziqk = zziqi;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* renamed from: zzbjl */
    public final zzbp next() {
        zzbp zza;
        zzbp zzbpVar = this.zziqk;
        if (zzbpVar != null && zzbpVar != zziqi) {
            this.zziqk = null;
            return zzbpVar;
        }
        zzela zzelaVar = this.zziqf;
        if (zzelaVar == null || this.zziql >= this.zzawf) {
            this.zziqk = zziqi;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzelaVar) {
                this.zziqf.zzfc(this.zziql);
                zza = this.zziqj.zza(this.zziqf, this);
                this.zziql = this.zziqf.position();
            }
            return zza;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zziqm.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.zziqm.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public void close() throws IOException {
        this.zziqf.close();
    }
}
