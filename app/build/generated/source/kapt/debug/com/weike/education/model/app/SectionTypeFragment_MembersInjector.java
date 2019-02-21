// Generated by Dagger (https://google.github.io/dagger).
package com.weike.education.model.app;

import com.weike.education.base.BaseInjectFragment_MembersInjector;
import com.weike.education.mvp.presenter.app.SelectionTypePresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class SectionTypeFragment_MembersInjector
    implements MembersInjector<SectionTypeFragment> {
  private final Provider<SelectionTypePresenter> mPresenterProvider;

  public SectionTypeFragment_MembersInjector(Provider<SelectionTypePresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<SectionTypeFragment> create(
      Provider<SelectionTypePresenter> mPresenterProvider) {
    return new SectionTypeFragment_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(SectionTypeFragment instance) {
    BaseInjectFragment_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
  }
}