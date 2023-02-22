package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* loaded from: classes.dex */
final class zak implements PendingResultUtil.ResultConverter<R, T> {
    private final /* synthetic */ Response zaoz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zak(Response response) {
        this.zaoz = response;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Object convert(Result result) {
        this.zaoz.setResult(result);
        return this.zaoz;
    }
}
