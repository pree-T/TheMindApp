package com.example.newapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class LoginTabFragment extends Fragment {
    EditText email,pssword;float v=0;
    TextView forgotPass;
    Button login;
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {

        ViewGroup root=(ViewGroup)inflater.inflate(R.layout.login_tab_fragment,container,false);
        email=root.findViewById(R.id.email1);
        pssword=root.findViewById(R.id.password);
        login=root.findViewById(R.id.login);
        forgotPass=root.findViewById(R.id.forgot);


        email.setTranslationX(800);
        pssword.setTranslationX(800);
        forgotPass.setTranslationX(800);
        login.setTranslationX(800);

        email.setAlpha(v);
        pssword.setAlpha(v);
        forgotPass.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pssword.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        forgotPass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        return root;




}
}

