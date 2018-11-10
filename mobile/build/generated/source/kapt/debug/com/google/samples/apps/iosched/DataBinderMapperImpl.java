package com.google.samples.apps.iosched;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.google.samples.apps.iosched.databinding.FragmentInfoBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentMapBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentScheduleAgendaBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentScheduleBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentScheduleFilterBindingImpl;
import com.google.samples.apps.iosched.databinding.FragmentSessionDetailBindingImpl;
import com.google.samples.apps.iosched.databinding.IncludeAgendaContentsBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemAgendaDarkBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemAgendaLightBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemSessionBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemSessionTagBindingImpl;
import com.google.samples.apps.iosched.databinding.ItemSpeakerDetailBindingImpl;
import com.google.samples.apps.iosched.databinding.ListItemFilterDrawerBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTINFO = 1;

  private static final int LAYOUT_FRAGMENTMAP = 2;

  private static final int LAYOUT_FRAGMENTSCHEDULE = 3;

  private static final int LAYOUT_FRAGMENTSCHEDULEAGENDA = 4;

  private static final int LAYOUT_FRAGMENTSCHEDULEFILTER = 5;

  private static final int LAYOUT_FRAGMENTSESSIONDETAIL = 6;

  private static final int LAYOUT_INCLUDEAGENDACONTENTS = 7;

  private static final int LAYOUT_ITEMAGENDADARK = 8;

  private static final int LAYOUT_ITEMAGENDALIGHT = 9;

  private static final int LAYOUT_ITEMSESSION = 10;

  private static final int LAYOUT_ITEMSESSIONTAG = 11;

  private static final int LAYOUT_ITEMSPEAKERDETAIL = 12;

  private static final int LAYOUT_LISTITEMFILTERDRAWER = 13;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(13);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_info, LAYOUT_FRAGMENTINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_map, LAYOUT_FRAGMENTMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_schedule, LAYOUT_FRAGMENTSCHEDULE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_schedule_agenda, LAYOUT_FRAGMENTSCHEDULEAGENDA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_schedule_filter, LAYOUT_FRAGMENTSCHEDULEFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.fragment_session_detail, LAYOUT_FRAGMENTSESSIONDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.include_agenda_contents, LAYOUT_INCLUDEAGENDACONTENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_agenda_dark, LAYOUT_ITEMAGENDADARK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_agenda_light, LAYOUT_ITEMAGENDALIGHT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_session, LAYOUT_ITEMSESSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_session_tag, LAYOUT_ITEMSESSIONTAG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.item_speaker_detail, LAYOUT_ITEMSPEAKERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.samples.apps.iosched.R.layout.list_item_filter_drawer, LAYOUT_LISTITEMFILTERDRAWER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTINFO: {
          if ("layout/fragment_info_0".equals(tag)) {
            return new FragmentInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_info is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAP: {
          if ("layout/fragment_map_0".equals(tag)) {
            return new FragmentMapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_map is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSCHEDULE: {
          if ("layout/fragment_schedule_0".equals(tag)) {
            return new FragmentScheduleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_schedule is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSCHEDULEAGENDA: {
          if ("layout/fragment_schedule_agenda_0".equals(tag)) {
            return new FragmentScheduleAgendaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_schedule_agenda is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSCHEDULEFILTER: {
          if ("layout/fragment_schedule_filter_0".equals(tag)) {
            return new FragmentScheduleFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_schedule_filter is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSESSIONDETAIL: {
          if ("layout/fragment_session_detail_0".equals(tag)) {
            return new FragmentSessionDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_session_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDEAGENDACONTENTS: {
          if ("layout/include_agenda_contents_0".equals(tag)) {
            return new IncludeAgendaContentsBindingImpl(component, new View[]{view});
          }
          throw new IllegalArgumentException("The tag for include_agenda_contents is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMAGENDADARK: {
          if ("layout/item_agenda_dark_0".equals(tag)) {
            return new ItemAgendaDarkBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_agenda_dark is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMAGENDALIGHT: {
          if ("layout/item_agenda_light_0".equals(tag)) {
            return new ItemAgendaLightBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_agenda_light is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSESSION: {
          if ("layout/item_session_0".equals(tag)) {
            return new ItemSessionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_session is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSESSIONTAG: {
          if ("layout/item_session_tag_0".equals(tag)) {
            return new ItemSessionTagBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_session_tag is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSPEAKERDETAIL: {
          if ("layout/item_speaker_detail_0".equals(tag)) {
            return new ItemSpeakerDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_speaker_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMFILTERDRAWER: {
          if ("layout/list_item_filter_drawer_0".equals(tag)) {
            return new ListItemFilterDrawerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_filter_drawer is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case LAYOUT_INCLUDEAGENDACONTENTS: {
          if("layout/include_agenda_contents_0".equals(tag)) {
            return new IncludeAgendaContentsBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for include_agenda_contents is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.google.samples.apps.iosched.shared.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(9);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "tagFilter");
      sKeys.put(2, "session");
      sKeys.put(3, "speaker");
      sKeys.put(4, "eventListener");
      sKeys.put(5, "viewModel");
      sKeys.put(6, "tag");
      sKeys.put(7, "agenda");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(13);

    static {
      sKeys.put("layout/fragment_info_0", com.google.samples.apps.iosched.R.layout.fragment_info);
      sKeys.put("layout/fragment_map_0", com.google.samples.apps.iosched.R.layout.fragment_map);
      sKeys.put("layout/fragment_schedule_0", com.google.samples.apps.iosched.R.layout.fragment_schedule);
      sKeys.put("layout/fragment_schedule_agenda_0", com.google.samples.apps.iosched.R.layout.fragment_schedule_agenda);
      sKeys.put("layout/fragment_schedule_filter_0", com.google.samples.apps.iosched.R.layout.fragment_schedule_filter);
      sKeys.put("layout/fragment_session_detail_0", com.google.samples.apps.iosched.R.layout.fragment_session_detail);
      sKeys.put("layout/include_agenda_contents_0", com.google.samples.apps.iosched.R.layout.include_agenda_contents);
      sKeys.put("layout/item_agenda_dark_0", com.google.samples.apps.iosched.R.layout.item_agenda_dark);
      sKeys.put("layout/item_agenda_light_0", com.google.samples.apps.iosched.R.layout.item_agenda_light);
      sKeys.put("layout/item_session_0", com.google.samples.apps.iosched.R.layout.item_session);
      sKeys.put("layout/item_session_tag_0", com.google.samples.apps.iosched.R.layout.item_session_tag);
      sKeys.put("layout/item_speaker_detail_0", com.google.samples.apps.iosched.R.layout.item_speaker_detail);
      sKeys.put("layout/list_item_filter_drawer_0", com.google.samples.apps.iosched.R.layout.list_item_filter_drawer);
    }
  }
}
