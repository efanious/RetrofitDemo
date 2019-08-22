package efana.example.myapplication.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import efana.example.myapplication.R;
import efana.example.myapplication.adapter.CustomAdapter;
import efana.example.myapplication.adapter.UserAdapter;
import efana.example.myapplication.model.RetroPhoto;
import efana.example.myapplication.model.User;
import efana.example.myapplication.network.GetDataService;
import efana.example.myapplication.network.RetrofitClientInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UsersListActivity extends AppCompatActivity {

    private UserAdapter adapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        progressDialog = new ProgressDialog(UsersListActivity.this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getRetrofit().create(GetDataService.class);
        Call<List<User>> call = service.getAllUsers();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                progressDialog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(UsersListActivity.this, "Something went wrong... Please try again later!", Toast.LENGTH_SHORT).show();

            }
        });
    }

    /*Method to generate List of data using RecyclerView with custom adapter*/
    private void generateDataList(List<User> userList) {
        recyclerView = findViewById(R.id.user_list_rv);
        adapter = new UserAdapter(this, userList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(UsersListActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
