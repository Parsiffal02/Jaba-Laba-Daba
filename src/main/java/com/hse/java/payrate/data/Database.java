package com.hse.java.payrate.data;

import com.google.firebase.database.*;
import com.hse.java.payrate.data.model.User;
import com.hse.java.payrate.utils.StringExt;

public class Database {
    private static FirebaseDatabase dbReference = FirebaseDatabase.getInstance();
    private static DatabaseReference userReference = dbReference.getReference().child("Users");

    public static void signUp(User user) {
        DatabaseReference ref = userReference.child(StringExt.removeMailSymbol(user.getEmail()));
        ref.setValueAsync(user);
    }

    public static void signIn(String email, String password, SignInCallBack callBack) {
        DatabaseReference ref = userReference.child(StringExt.removeMailSymbol(email));
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    String userPassword = dataSnapshot.child("password").getValue().toString();
                    if (password.equals(userPassword)) {
                        callBack.onSignInResult("");
                    } else {
                        callBack.onSignInResult("Неверный пароль");
                    }
                } else {
                    callBack.onSignInResult("Данного аккаунта не существует");
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                callBack.onSignInResult("Ошибка при загрузке данных");
            }
        });
    }
}
