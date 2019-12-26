package org.stackwizards.sw_dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class InfoDialog {

    public static void showCustomDialog(final Activity activity, int rawTextId) {
        ViewGroup viewGroup = activity.findViewById(android.R.id.content);

        View dialogView = LayoutInflater.from(activity.getApplicationContext()).inflate(R.layout.info_dialog, viewGroup, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(dialogView);

        final AlertDialog alertDialog = builder.create();
        final TextView infoView = ((TextView) dialogView.findViewById(R.id.info_view));
        String infoText = RawTextReader.read(activity, rawTextId);
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
