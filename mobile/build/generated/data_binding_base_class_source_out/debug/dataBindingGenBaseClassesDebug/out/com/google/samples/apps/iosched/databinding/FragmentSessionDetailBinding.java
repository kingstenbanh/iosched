package com.google.samples.apps.iosched.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel;

public abstract class FragmentSessionDetailBinding extends ViewDataBinding {
  @NonNull
  public final ImageView detailImage;

  @NonNull
  public final Guideline guidelineEnd;

  @NonNull
  public final Guideline guidelineStart;

  @NonNull
  public final ConstraintLayout recordedIconImageView;

  @NonNull
  public final AppBarLayout sessionDetailAppBar;

  @NonNull
  public final TextView sessionDetailDescription;

  @NonNull
  public final FloatingActionButton sessionDetailFab;

  @NonNull
  public final Button sessionDetailRateButton;

  @NonNull
  public final ImageView sessionDetailRecorded;

  @NonNull
  public final TextView sessionDetailRoom;

  @NonNull
  public final NestedScrollView sessionDetailScrollView;

  @NonNull
  public final LinearLayout sessionDetailSpeakerList;

  @NonNull
  public final LinearLayout sessionDetailTagsContainer;

  @NonNull
  public final TextView sessionDetailTime;

  @NonNull
  public final TextView sessionDetailTitle;

  @NonNull
  public final Toolbar sessionDetailToolbar;

  @NonNull
  public final CollapsingToolbarLayout sessionDetailToolbarLayout;

  @Bindable
  protected SessionDetailViewModel mViewModel;

  protected FragmentSessionDetailBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView detailImage, Guideline guidelineEnd, Guideline guidelineStart,
      ConstraintLayout recordedIconImageView, AppBarLayout sessionDetailAppBar,
      TextView sessionDetailDescription, FloatingActionButton sessionDetailFab,
      Button sessionDetailRateButton, ImageView sessionDetailRecorded, TextView sessionDetailRoom,
      NestedScrollView sessionDetailScrollView, LinearLayout sessionDetailSpeakerList,
      LinearLayout sessionDetailTagsContainer, TextView sessionDetailTime,
      TextView sessionDetailTitle, Toolbar sessionDetailToolbar,
      CollapsingToolbarLayout sessionDetailToolbarLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.detailImage = detailImage;
    this.guidelineEnd = guidelineEnd;
    this.guidelineStart = guidelineStart;
    this.recordedIconImageView = recordedIconImageView;
    this.sessionDetailAppBar = sessionDetailAppBar;
    this.sessionDetailDescription = sessionDetailDescription;
    this.sessionDetailFab = sessionDetailFab;
    this.sessionDetailRateButton = sessionDetailRateButton;
    this.sessionDetailRecorded = sessionDetailRecorded;
    this.sessionDetailRoom = sessionDetailRoom;
    this.sessionDetailScrollView = sessionDetailScrollView;
    this.sessionDetailSpeakerList = sessionDetailSpeakerList;
    this.sessionDetailTagsContainer = sessionDetailTagsContainer;
    this.sessionDetailTime = sessionDetailTime;
    this.sessionDetailTitle = sessionDetailTitle;
    this.sessionDetailToolbar = sessionDetailToolbar;
    this.sessionDetailToolbarLayout = sessionDetailToolbarLayout;
  }

  public abstract void setViewModel(@Nullable SessionDetailViewModel viewModel);

  @Nullable
  public SessionDetailViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSessionDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSessionDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSessionDetailBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.fragment_session_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSessionDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSessionDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSessionDetailBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.fragment_session_detail, null, false, component);
  }

  public static FragmentSessionDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentSessionDetailBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentSessionDetailBinding)bind(component, view, com.google.samples.apps.iosched.R.layout.fragment_session_detail);
  }
}
