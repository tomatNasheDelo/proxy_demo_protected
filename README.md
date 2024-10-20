https://www.book2s.com/tutorials/java-proxy-pattern.html
structual pattern proxy

Protection Proxy

A protection proxy is a type of proxy used in the Proxy Pattern to control access to sensitive resources or operations by enforcing access control rules or security checks before allowing clients to invoke methods on the real object. The protection proxy acts as an intermediary between the client and the real object, intercepting method calls and verifying whether the client has the necessary permissions or privileges to perform the requested operation. Protection proxies are commonly used in scenarios where security is a concern, such as controlling access to confidential data or protecting critical system functionalities.

Here's how a protection proxy controls access to sensitive resources or operations in Java:

    Proxy Creation: Initially, the client interacts with a protection proxy object instead of the real object. The protection proxy implements the same interface as the real object, allowing clients to use it interchangeably.

    Access Control: When the client invokes a method on the protection proxy, the proxy intercepts the method call and performs access control checks to verify whether the client has the necessary permissions or privileges to perform the requested operation.

    Security Checks: The protection proxy enforces access control rules or security policies to determine whether the client is authorized to access the sensitive resource or perform the requested operation. This may involve validating the client's credentials, checking its role or permissions, or verifying its identity against an access control list (ACL).

    Authorized Access: If the client is authorized to access the resource or perform the operation, the protection proxy delegates the method call to the real object, allowing the requested operation to be executed.

    Unauthorized Access: If the client is not authorized to access the resource or perform the operation, the protection proxy may either deny the request by throwing an exception or perform alternative actions, such as logging the unauthorized access attempt or returning a default or error response to the client.

