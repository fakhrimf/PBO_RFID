/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author iel
 */
public class FirebaseConnection {
 
    public static  DatabaseReference getReference(String field) throws IOException{

        FileInputStream serviceAccount = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/db/kumascanner-firebase-adminsdk-m3epa-a081569a33.json");
        System.out.println(System.getProperty("user.dir")+"/src/main/resources/db/kumascanner-firebase-adminsdk-m3epa-a081569a33.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
          .setCredentials(GoogleCredentials.fromStream(serviceAccount))
          .setDatabaseUrl("https://kumascanner.firebaseio.com")
          .build();

        FirebaseApp.initializeApp(options);

        DatabaseReference ref = FirebaseDatabase.getInstance().getReference(field);

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
          @Override
          public void onDataChange(DataSnapshot dataSnapshot) {
            Object document = dataSnapshot.getValue();
            System.out.println(document);
          }

          @Override
          public void onCancelled(DatabaseError error) {
          }
        });
 
        return ref;
    }
   
}
