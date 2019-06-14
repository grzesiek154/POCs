package services;

import com.google.api.client.googleapis.services.AbstractGoogleClient;

public interface BaseServiceInterface {

    boolean login(AbstractGoogleClient client);
    boolean logout(String data);
}
