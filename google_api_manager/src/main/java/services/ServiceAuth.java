package services;

import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.services.drive.Drive;

public class ServiceAuth implements BaseServiceInterface {


    @Override
    public boolean login(AbstractGoogleClient client) {

        client = new Drive.Builder()

        return false;
    }

    @Override
    public boolean logout(String data) {
        return false;
    }
}
