package proxy_pattern.toxiproxy;

public class ResourceServerImpl implements ResourceServer {
    @Override
    public String getResource(Long id) {
        return "Resource with ID : " + id;
    }
}
