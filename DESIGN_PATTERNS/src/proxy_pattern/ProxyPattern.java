package proxy_pattern;

import proxy_pattern.toxiproxy.ResourceServer;
import proxy_pattern.toxiproxy.ToxiProxyServer;

/*

    Proxy is a structural design pattern that lets you provide a
    substitute or placeholder for another object. A proxy controls
    access to the original object, allowing you to perform
    something either before or after the request gets through to
    the original object.

    Proxy design pattern give you a controlled access to an object without
    modifying the underlying functionalities of the object. It acts as a
    substitute or placeholder for another object controlling access to the object
    or enhancing the functionalities of the object if required.
    The proxy and the real object share the same interface, enabling transparent
    substitution.

    Proxy Pattern can be applied in various situations, such as managing expensive resources,
    enforcing access control, providing a remote interface or implementing lazy loading

    A real-world example is ATM proxying a bank. Before now to withdraw from the bank one
    needs to go to the bank, file a withdrawal slip,submits it for verification before
    the cashier give him or her the money. But the ATM simplified this by standing in for the
    banks.

    Usage
    Proxy Pattern can be used as logging proxy, caching proxy, validation proxy etc
 */
public class ProxyPattern {

    public static void main(String[] args) {
        ResourceServer resourceServer = new ToxiProxyServer();

        resourceServer.getResource(12345L);
    }

}
