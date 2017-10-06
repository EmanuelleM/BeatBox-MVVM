package com.example.emanuellemenali.beatbox;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.emanuellemenali.beatbox.view.activity.BeatBoxActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;

/**
 * Created by emanuellemenali on 06/10/17.
 */

@RunWith(AndroidJUnit4.class)
public class BeatBoxActivityTest {

    @Rule
    public ActivityTestRule<BeatBoxActivity> mActivityRule =
            new ActivityTestRule<BeatBoxActivity>(BeatBoxActivity.class);

    @Test
    public void showFirstNameAtButton(){
        onView(withText("65_cjipie")).check(matches(anything()));

        onView(withText("65_cjipie"))
                .perform(click());
    }


}
