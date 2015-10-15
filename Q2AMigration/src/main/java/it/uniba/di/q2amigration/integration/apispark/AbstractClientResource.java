package it.uniba.di.q2amigration.integration.apispark;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.MediaType;
import org.restlet.resource.ClientResource;

public class AbstractClientResource {

    private static String username = "758fc797-c33a-4e37-a269-6f5ba8cd7f1b";

    private static String password = "1324b6f4-647e-4af1-bb58-63b606a97b93";

    private final static String endpoint = "https://docusign.apispark.net/v1";

    private String path;

    public AbstractClientResource(String basePath) {
        this.path = endpoint + basePath;
    }

    public ClientResource getClientResource() {
        ClientResource cr = new ClientResource(path);
        cr.accept(MediaType.APPLICATION_JSON);
        cr.setChallengeResponse(new ChallengeResponse(ChallengeScheme.HTTP_BASIC, username, password));
        return cr;
    }
}
