package com.example.newapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class SignUpTabFragment extends Fragment {
    EditText uname,umob,uemail,upass;
    Button signup;
    float v=0;
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        ViewGroup root=(ViewGroup)inflater.inflate(R.layout.signup_tab_fragment,container,false);
        uname=root.findViewById(R.id.uname);
        umob=root.findViewById(R.id.mob_n);
        uemail=root.findViewById(R.id.email);
        upass=root.findViewById(R.id.password1);
        signup=root.findViewById(R.id.signup);
        uemail.setTranslationX(800);
        upass.setTranslationX(800);
        umob.setTranslationX(800);
        signup.setTranslationX(800);
        uname.setTranslationX(800);
        uemail.setAlpha(v);
        upass.setAlpha(v);
        uname.setAlpha(v);
        umob.setAlpha(v);
        signup.setAlpha(v);
        uemail.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        upass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        umob.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        uname.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        signup.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();

        return root;

}}
