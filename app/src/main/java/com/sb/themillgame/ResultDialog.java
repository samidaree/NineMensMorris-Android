package com.sb.themillgame;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class ResultDialog extends Dialog {
    private final String message;
    private final MainActivity mainActivity;
    public ResultDialog(@NonNull Context context, String message, MainActivity mainActivity) {
        super(context);
        this.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        this.getWindow().getAttributes().windowAnimations = R.style.dialog_animation;
        this.message = message;
        this.mainActivity = mainActivity;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_dialog);
        TextView messageText = findViewById(R.id.messageText);
        Button startAgainButton = findViewById(R.id.startAgainButton);
        messageText.setText(message);
        startAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mainActivity.restartMatch();
                dismiss();
            }
        });
    }
}