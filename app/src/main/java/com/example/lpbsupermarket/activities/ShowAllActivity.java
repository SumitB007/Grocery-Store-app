package com.example.lpbsupermarket.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.lpbsupermarket.R;
import com.example.lpbsupermarket.adapters.ShowAllAdapter;
import com.example.lpbsupermarket.models.ShowAllModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class ShowAllActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ShowAllAdapter showAllAdapter;
    List<ShowAllModel> showAllModelList;

    Toolbar toolbar;

    FirebaseFirestore firestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);

        String type = getIntent().getStringExtra("type");

        toolbar = findViewById(R.id.show_all_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        firestore = FirebaseFirestore.getInstance();

        recyclerView = findViewById(R.id.show_all_rec);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        showAllModelList = new ArrayList<>();
        showAllAdapter = new ShowAllAdapter(this,showAllModelList);
        recyclerView.setAdapter(showAllAdapter);



        if(type == null || type.isEmpty()){

            firestore.collection("ShowAll")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

        }

        if(type != null && type.equalsIgnoreCase("home care")){

            firestore.collection("ShowAll").whereEqualTo("type","home care")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        if(type != null && type.equalsIgnoreCase("snacks")){

            firestore.collection("ShowAll").whereEqualTo("type","snacks")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        if(type != null && type.equalsIgnoreCase("personal & baby care")){

            firestore.collection("ShowAll").whereEqualTo("type","personal & baby care")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        if(type != null && type.equalsIgnoreCase("grocery")){

            firestore.collection("ShowAll").whereEqualTo("type","grocery")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        if(type != null && type.equalsIgnoreCase("packaging food")){

            firestore.collection("ShowAll").whereEqualTo("type","packaging food")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        if(type != null && type.equalsIgnoreCase("dairy product")){

            firestore.collection("ShowAll").whereEqualTo("type","dairy product")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        if(type != null && type.equalsIgnoreCase("dry fruits")){

            firestore.collection("ShowAll").whereEqualTo("type","dry fruits")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        if(type != null && type.equalsIgnoreCase("masala and oil")){

            firestore.collection("ShowAll").whereEqualTo("type","masala and oil")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        if(type != null && type.equalsIgnoreCase("washing powder & bar")){

            firestore.collection("ShowAll").whereEqualTo("type","washing powder & bar")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }


        if(type != null && type.equalsIgnoreCase("stationery")){

            firestore.collection("ShowAll").whereEqualTo("type","stationery")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        if(type != null && type.equalsIgnoreCase("disposal item")){

            firestore.collection("ShowAll").whereEqualTo("type","disposal item")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        if(type != null && type.equalsIgnoreCase("pooja sahitya")){

            firestore.collection("ShowAll").whereEqualTo("type","pooja sahitya")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }


        if(type != null && type.equalsIgnoreCase("cake material")){

            firestore.collection("ShowAll").whereEqualTo("type","cake material")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        if(type != null && type.equalsIgnoreCase("upvas item")){

            firestore.collection("ShowAll").whereEqualTo("type","upvas item")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {

                            if(task.isSuccessful()){
                                for(DocumentSnapshot doc :task.getResult().getDocuments()){

                                    ShowAllModel showAllModel = doc.toObject(ShowAllModel.class);
                                    showAllModelList.add(showAllModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }else{
                                Toast.makeText(ShowAllActivity.this, "Error: "+task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }





    }
}