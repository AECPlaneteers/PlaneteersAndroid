package com.citrrus.aec.planeteers;

import android.accounts.AccountManager;
import android.content.Context;

import com.citrrus.aec.planeteers.authenticator.BootstrapAuthenticatorActivity;
import com.citrrus.aec.planeteers.authenticator.LogoutService;
import com.citrrus.aec.planeteers.core.CheckIn;
import com.citrrus.aec.planeteers.core.TimerService;
import com.citrrus.aec.planeteers.ui.BootstrapTimerActivity;
import com.citrrus.aec.planeteers.ui.CarouselActivity;
import com.citrrus.aec.planeteers.ui.CheckInsListFragment;
import com.citrrus.aec.planeteers.ui.ItemListFragment;
import com.citrrus.aec.planeteers.ui.NewsActivity;
import com.citrrus.aec.planeteers.ui.NewsListFragment;
import com.citrrus.aec.planeteers.ui.UserActivity;
import com.citrrus.aec.planeteers.ui.UserListFragment;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module for setting up provides statements.
 * Register all of your entry points below.
 */
@Module
(
        complete = false,

        injects = {
                BootstrapApplication.class,
                BootstrapAuthenticatorActivity.class,
                CarouselActivity.class,
                BootstrapTimerActivity.class,
                CheckInsListFragment.class,
                NewsActivity.class,
                NewsListFragment.class,
                UserActivity.class,
                UserListFragment.class,
                TimerService.class
        }

)
public class BootstrapModule  {

    @Singleton
    @Provides
    Bus provideOttoBus() {
        return new Bus();
    }

    @Provides
    @Singleton
    LogoutService provideLogoutService(final Context context, final AccountManager accountManager) {
        return new LogoutService(context, accountManager);
    }

}
