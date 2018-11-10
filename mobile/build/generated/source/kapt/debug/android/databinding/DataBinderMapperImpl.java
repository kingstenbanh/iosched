package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.google.samples.apps.iosched.DataBinderMapperImpl());
  }
}
