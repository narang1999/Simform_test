package com.example.simform_test.view.main;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.simform_test.R;
import com.example.simform_test.models.Example;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class UsersDirections {
  private UsersDirections() {
  }

  @NonNull
  public static ActionUsersToUserDetail actionUsersToUserDetail(@NonNull Example userData) {
    return new ActionUsersToUserDetail(userData);
  }

  public static class ActionUsersToUserDetail implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionUsersToUserDetail(@NonNull Example userData) {
      if (userData == null) {
        throw new IllegalArgumentException("Argument \"userData\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("userData", userData);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionUsersToUserDetail setUserData(@NonNull Example userData) {
      if (userData == null) {
        throw new IllegalArgumentException("Argument \"userData\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("userData", userData);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_users_to_userDetail;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Example getUserData() {
      return (Example) arguments.get("userData");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionUsersToUserDetail that = (ActionUsersToUserDetail) object;
      if (arguments.containsKey("userData") != that.arguments.containsKey("userData")) {
        return false;
      }
      if (getUserData() != null ? !getUserData().equals(that.getUserData()) : that.getUserData() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getUserData() != null ? getUserData().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionUsersToUserDetail(actionId=" + getActionId() + "){"
          + "userData=" + getUserData()
          + "}";
    }
  }
}
