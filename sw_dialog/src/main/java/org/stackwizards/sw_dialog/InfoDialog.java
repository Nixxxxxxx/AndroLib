package org.stackwizards.sw_dialog;

import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class InfoDialog {

    //  Todo: clean the callback interface
    public static void showCustomDialog(final FilterInterface dialogContext, int rawTextId) {
        //Activity activity, int points,int msgIndex, View view;
        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        ViewGroup viewGroup = dialogContext.getView().findViewById(android.R.id.content);

        //then we will inflate the custom alert dialog xml that we created
        View dialogView = LayoutInflater.from(dialogContext.getActivity().getApplicationContext()).inflate(R.layout.info_dialog, viewGroup, false);

        //Now we need an AlertDialog.Builder object
        AlertDialog.Builder builder = new AlertDialog.Builder(dialogContext.getActivity());

        //setting the view of the builder to our custom view that we already inflated
        builder.setView(dialogView);

        //finally creating the alert dialog and displaying it
        final AlertDialog alertDialog = builder.create();

        final TextView infoView = ((TextView) dialogView.findViewById(R.id.info_view));

        String infoText = RawTextReader.read(dialogContext.getActivity(), rawTextId);
        infoView.setText(Html.fromHtml(infoText));


        dialogView.findViewById(R.id.btn_dismiss).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });

        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        alertDialog.show();
    }


}
