package efana.example.myapplication.network;

import java.util.List;

import efana.example.myapplication.model.RetroPhoto;
import efana.example.myapplication.model.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();

    @GET("/users")
    Call<List<User>> getAllUsers();


}
