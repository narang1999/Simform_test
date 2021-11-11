package com.example.simform_test.view.main;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.example.simform_test.models.Example;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class UserDetailArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private UserDetailArgs() {
  }

  @SuppressWarnings("unchecked")
  private UserDetailArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static UserDetailArgs fromBundle(@NonNull Bundle bundle) {
    UserDetailArgs __result = new UserDetailArgs();
    bundle.setClassLoader(UserDetailArgs.class.getClassLoader());
    if (bundle.containsKey("userData")) {
      Example userData;
      if (Parcelable.class.isAssignableFrom(Example.class) || Serializable.class.isAssignableFrom(Example.class)) {
        userData = (Example) bundle.get("userData");
      } else {
        throw new UnsupportedOperationException(Example.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (userData == null) {
        throw new IllegalArgumentException("Argument \"userData\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("userData", userData);
    } else {
      throw new IllegalArgumentException("Required argument \"userData\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Example getUserData() {
    return (Example) arguments.get("userData");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("userData")) {
      Example userData = (Example) arguments.get("userData");
      if (Parcelable.class.isAssignableFrom(Example.class) || userData == null) {
        __result.putParcelable("userData", Parcelable.class.cast(userData));
      } else if (Serializable.class.isAssignableFrom(Example.class)) {
        __result.putSerializable("userData", Serializable.class.cast(userData));
      } else {
        throw new UnsupportedOperationException(Example.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    UserDetailArgs that = (UserDetailArgs) object;
    if (arguments.containsKey("userData") != that.arguments.containsKey("userData")) {
      return false;
    }
    if (getUserData() != null ? !getUserData().equals(that.getUserData()) : that.getUserData() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getUserData() != null ? getUserData().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "UserDetailArgs{"
        + "userData=" + getUserData()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(UserDetailArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Example userData) {
      if (userData == null) {
        throw new IllegalArgumentException("Argument \"userData\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("userData", userData);
    }

    @NonNull
    public UserDetailArgs build() {
      UserDetailArgs result = new UserDetailArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setUserData(@NonNull Example userData) {
      if (userData == null) {
        throw new IllegalArgumentException("Argument \"userData\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("userData", userData);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Example getUserData() {
      return (Example) arguments.get("userData");
    }
  }
}
