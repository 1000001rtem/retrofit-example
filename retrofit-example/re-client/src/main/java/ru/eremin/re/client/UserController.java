package ru.eremin.re.client;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * @autor Eremin Artem on 26.04.2019.
 */

public interface UserController {

    @GET("/userJSON")
    Call<User> getUserJSON();

    @GET("/userXML")
    Call<User> getUserXML();

    @POST("/userPost")
    Call<User> userPost(@Body final User user);

}
