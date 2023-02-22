package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzask extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzask> CREATOR = new zzasm();
    private ParcelFileDescriptor zzdsy;
    private Parcelable zzdsz = null;
    private boolean zzdta = true;

    public zzask(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzdsy = parcelFileDescriptor;
    }

    public final <T extends SafeParcelable> T zza(Parcelable.Creator<T> creator) {
        if (this.zzdta) {
            if (this.zzdsy == null) {
                zzaxy.zzfc("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zzdsy));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    IOUtils.closeQuietly(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.zzdsz = creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.zzdta = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    zzaxy.zzc("Could not read from parcel file descriptor", e);
                    IOUtils.closeQuietly(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                IOUtils.closeQuietly(dataInputStream);
                throw th2;
            }
        }
        return (T) this.zzdsz;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzvc();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdsy, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private final ParcelFileDescriptor zzvc() {
        if (this.zzdsy == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzdsz.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.zzdsy = zzh(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.zzdsy;
    }

    private static <T> ParcelFileDescriptor zzh(final byte[] bArr) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            try {
                zzbbi.zzedu.execute(new Runnable(autoCloseOutputStream, bArr) { // from class: com.google.android.gms.internal.ads.zzasn
                    private final OutputStream zzdtb;
                    private final byte[] zzdtc;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdtb = autoCloseOutputStream;
                        this.zzdtc = bArr;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzask.zza(this.zzdtb, this.zzdtc);
                    }
                });
                return createPipe[0];
            } catch (IOException e) {
                e = e;
                zzaxy.zzc("Error transporting the ad response", e);
                com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "LargeParcelTeleporter.pipeData.2");
                IOUtils.closeQuietly(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(OutputStream outputStream, byte[] bArr) {
        DataOutputStream dataOutputStream = null;
        try {
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                try {
                    dataOutputStream2.writeInt(bArr.length);
                    dataOutputStream2.write(bArr);
                    IOUtils.closeQuietly(dataOutputStream2);
                } catch (IOException e) {
                    e = e;
                    dataOutputStream = dataOutputStream2;
                    zzaxy.zzc("Error transporting the ad response", e);
                    com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "LargeParcelTeleporter.pipeData.1");
                    if (dataOutputStream == null) {
                        IOUtils.closeQuietly(outputStream);
                    } else {
                        IOUtils.closeQuietly(dataOutputStream);
                    }
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream == null) {
                        IOUtils.closeQuietly(outputStream);
                    } else {
                        IOUtils.closeQuietly(dataOutputStream);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }
}
