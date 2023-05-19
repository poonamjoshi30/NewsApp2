// Generated by Dagger (https://dagger.dev).
package com.example.newsapp.di;

import com.example.newsapp.network.api.ApiHelper;
import com.example.newsapp.network.api.ApiHelperImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideApiHelperFactory implements Factory<ApiHelper> {
  private final Provider<ApiHelperImpl> apiHelperProvider;

  public NetworkModule_ProvideApiHelperFactory(Provider<ApiHelperImpl> apiHelperProvider) {
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public ApiHelper get() {
    return provideApiHelper(apiHelperProvider.get());
  }

  public static NetworkModule_ProvideApiHelperFactory create(
      Provider<ApiHelperImpl> apiHelperProvider) {
    return new NetworkModule_ProvideApiHelperFactory(apiHelperProvider);
  }

  public static ApiHelper provideApiHelper(ApiHelperImpl apiHelper) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideApiHelper(apiHelper));
  }
}