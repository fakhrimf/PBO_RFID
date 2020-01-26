/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
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
 
    public void sdk_admin() throws IOException{

        // Fetch the service account key JSON file contents
        FileInputStream serviceAccount =
          new FileInputStream("src\\main\\db\\kumascanner-firebase-adminsdk-m3epa-2ab5b27c8f.json");

        // Initialize the app with a service account, granting admin privileges
        FirebaseOptions options = new FirebaseOptions.Builder()
          .setCredentials(GoogleCredentials.fromStream(serviceAccount))
          .setDatabaseUrl("https://kumascanner.firebaseio.com")
          .build();

        FirebaseApp.initializeApp(options);
        
        // As an admin, the app has access to read and write all data, regardless of Security Rules
        DatabaseReference ref = FirebaseDatabase.getInstance()
            .getReference("restricted_access/secret_document");
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
        
    }
   
}
