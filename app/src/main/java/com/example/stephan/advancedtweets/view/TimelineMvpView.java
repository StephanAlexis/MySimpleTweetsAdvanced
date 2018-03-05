package com.example.stephan.advancedtweets.view;

import com.example.stephan.advancedtweets.model.Tweet;

import java.util.List;

/**
 * Created by stephan  .
 */

public interface TimelineMvpView extends MvpView {

    void showTimeline(int curSize, int listSize, List<Tweet> timelineList);

    void showMessage(String message);

    void handleSwipeRefresh();
}