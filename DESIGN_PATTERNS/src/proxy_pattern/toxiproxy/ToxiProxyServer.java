package proxy_pattern.toxiproxy;

public class ToxiProxyServer implements ResourceServer {

    private ResourceServer resourceServer;

    @Override
    public String getResource(Long id) {
        addToxics("latency");

        resourceServer = new ResourceServerImpl();

        return resourceServer.getResource(id);

    }

    private void addToxics(String name) {

        if (name.equals("latency")) {
            try {

                Thread.sleep(12000);

                System.out.println("Added latency to the request");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else if (name.equals("timeout")) {
            System.out.println("Caused timeout of request");
            throw new RuntimeException("Request timeout");
        }
    }
}
