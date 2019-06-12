package com.nanx.osm.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;



public class Dialog {

    public static void  showDialog(Context context, String body, String title)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(body);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}
