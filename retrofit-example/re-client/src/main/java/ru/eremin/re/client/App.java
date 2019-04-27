package ru.eremin.re.client;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.SimpleXmlConverterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        getJSON();
        getXML();
        postUser();
    }

    private static void postUser() throws IOException {
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final UserController userController = retrofit.create(UserController.class);
        final Call<User> call = userController.userPost(new User("Post User"));
        final Response<User> response = call.execute();
        System.out.println(response.body().getName());
    }

    private static void getXML() throws IOException {
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        final UserController userController = retrofit.create(UserController.class);
        final Call<User> call = userController.getUserXML();
        final Response<User> response = call.execute();
        System.out.println(response.body().getName());
    }

    private static void getJSON() throws IOException {
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final UserController userController = retrofit.create(UserController.class);
        final Call<User> call = userController.getUserJSON();
        final Response<User> response = call.execute();
        System.out.println(response.body().getName());
    }
}
