package com.candraibra.catmovie.ui.fragment;

import androidx.test.rule.ActivityTestRule;

import com.candraibra.catmovie.R;
import com.candraibra.catmovie.testing.SingleFragmentActivity;
import com.candraibra.catmovie.utils.RecyclerViewItemCountAssertion;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class TvFragmentTest {
    @Rule
    public ActivityTestRule<SingleFragmentActivity> activityRule = new ActivityTestRule<>(SingleFragmentActivity.class);
    private TvFragment tvFragment = new TvFragment();

    @Before
    public void setUp() {
        activityRule.getActivity().setFragment(tvFragment);
    }

    @Test
    public void loadCourses() {
        onView(withId(R.id.rv_tv)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_tv)).check(new RecyclerViewItemCountAssertion(10));
    }
}