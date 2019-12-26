package org.stackwizards.sw_dialog;

import android.app.Activity;
import android.view.View;

//import com.stackwizards.custom.fragmentlibrary.fragment.entity.Question;

/*
    Use as callback, to display result in the onlineFragment questionnaire challenge
 */
public interface FilterInterface {

     Activity getActivity();

     View getView();

     void filterPositionAndCity(IDataAdapter gda);


//     int getPointScore();

//     ArrayList<Question> getQuestion_array();
}
