// Generated by Dagger (https://dagger.dev).
package com.example.newsapp.di;

import com.example.newsapp.network.repository.INewsRepository;
import com.example.newsapp.network.repository.NewsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideINewsRepositoryFactory implements Factory<INewsRepository> {
  private final Provider<NewsRepository> repositoryProvider;

  public RepositoryModule_ProvideINewsRepositoryFactory(
      Provider<NewsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public INewsRepository get() {
    return provideINewsRepository(repositoryProvider.get());
  }

  public static RepositoryModule_ProvideINewsRepositoryFactory create(
      Provider<NewsRepository> repositoryProvider) {
    return new RepositoryModule_ProvideINewsRepositoryFactory(repositoryProvider);
  }

  public static INewsRepository provideINewsRepository(NewsRepository repository) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideINewsRepository(repository));
  }
}