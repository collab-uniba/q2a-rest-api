package it.uniba.di.q2amigration.integration.q2a;

public class AbstractEndpoint {
	
	private final static String endpoint = "http://localhost/Tesi/api/v1/";

    private String path;
    
    public AbstractEndpoint(String basePath) {
        this.path = endpoint + basePath;
    }

    public String getPath() {
		return path;
	}

}
