package com.google.samples.apps.iosched.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.samples.apps.iosched.shared.model.Speaker;

public abstract class ItemSpeakerDetailBinding extends ViewDataBinding {
  @NonNull
  public final TextView speakerItemBio;

  @NonNull
  public final TextView speakerItemCompany;

  @NonNull
  public final ImageView speakerItemHeadshot;

  @NonNull
  public final TextView speakerItemName;

  @Bindable
  protected Speaker mSpeaker;

  protected ItemSpeakerDetailBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView speakerItemBio, TextView speakerItemCompany,
      ImageView speakerItemHeadshot, TextView speakerItemName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.speakerItemBio = speakerItemBio;
    this.speakerItemCompany = speakerItemCompany;
    this.speakerItemHeadshot = speakerItemHeadshot;
    this.speakerItemName = speakerItemName;
  }

  public abstract void setSpeaker(@Nullable Speaker speaker);

  @Nullable
  public Speaker getSpeaker() {
    return mSpeaker;
  }

  @NonNull
  public static ItemSpeakerDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemSpeakerDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemSpeakerDetailBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.item_speaker_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSpeakerDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemSpeakerDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemSpeakerDetailBinding>inflate(inflater, com.google.samples.apps.iosched.R.layout.item_speaker_detail, null, false, component);
  }

  public static ItemSpeakerDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemSpeakerDetailBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemSpeakerDetailBinding)bind(component, view, com.google.samples.apps.iosched.R.layout.item_speaker_detail);
  }
}
