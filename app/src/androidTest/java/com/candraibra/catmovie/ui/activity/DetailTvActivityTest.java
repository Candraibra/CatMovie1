package com.candraibra.catmovie.ui.activity;

import android.content.Context;
import android.content.Intent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import com.candraibra.catmovie.R;
import com.candraibra.catmovie.data.Tv;
import com.candraibra.catmovie.utils.DummyData;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class DetailTvActivityTest {
    private Tv dummy = DummyData.generateDummyTvs().get(0);

    @Rule
    public ActivityTestRule<DetailTvActivity> activityRule = new ActivityTestRule<DetailTvActivity>(DetailTvActivity.class) {
        @Override
        protected Intent getActivityIntent() {
            Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
            Intent result = new Intent(targetContext, DetailTvActivity.class);
            result.putExtra(DetailTvActivity.EXTRA_TV, dummy.getTvId());
            return result;
        }
    };

    @Test
    public void loadTv() {
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_title)).check(matches(withText(dummy.getTitle())));
        onView(withId(R.id.tv_desc)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_desc)).check(matches(withText(dummy.getDesc())));
        onView(withId(R.id.iv_poster)).check(doesNotExist());
    }


}