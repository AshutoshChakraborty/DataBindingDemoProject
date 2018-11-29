package com.example.admin.databindingdemoproject.omlsdk;

import android.content.Context;

import com.example.admin.databindingdemoproject.R;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OmlSdk {
    private final Retrofit retrofit;
    private Service service;

    private OmlSdk(Retrofit retrofit) {
        this.retrofit = retrofit;
        createService();
    }

    /**
     * Builder for {@link OmlSdk}
     */
    public static class Builder {
        public Builder() {
        }

        /**
         * Create the {@link OmlSdk} to be used.
         *
         * @return {@link OmlSdk}
         */
        public OmlSdk build(Context context) {
            Retrofit retrofit = null;
            String baseUrl = null;
            baseUrl = context.getResources().getString(R.string.base_url);
            if (InterceptorHTTPClientCreator.getOkHttpClient() != null) {
                retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(InterceptorHTTPClientCreator.getOkHttpClient())
                        .baseUrl(baseUrl)
                        .build();

                return new OmlSdk(retrofit);
            } else {
                retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(baseUrl)
                        .build();
            }
            return new OmlSdk(retrofit);
        }
    }

    private void createService() {
        service = retrofit.create(Service.class);
    }

    public Service getService(){
        return service;
    }
}
