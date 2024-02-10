package behavioural_design_patterns.chain_of_responsibility;


/*

    According to the Gang of Four Definitions, the Chain of Responsibility Design Pattern states
    that Avoid coupling the sender of a request to its receiver by giving more than one receiver
    object a chance to handle the request. Chain the receiving objects and pass the request along
    the chain until an object handle it.

    Usage
    (1) Use the Chain of Responsibility pattern when your program
        is expected to process different kinds of requests in various
        ways, but the exact types of requests and their sequences are
        unknown beforehand
    (2) Use the pattern when it’s essential to execute several handlers
        in a particular order.
    (3) Use the CoR pattern when the set of handlers and their order
        are supposed to change at runtime
 */
public class ChainOfResponsibilty {
    public static void main(String[] args) {
        Complaint c = chain();
        c.makeComplaint(Complaint.EMPLOYEE, "This complaint is directed to the employee.");
        c.makeComplaint(Complaint.ASSISTANT_MANAGER, "This complaint is directed to the assistant manager.");
        c.makeComplaint(Complaint.MANAGER, "This complaint is directed to the manager.");
    }

    private static Complaint chain() {
        Complaint employee = new Employee(Complaint.EMPLOYEE);
        employee.setNextLevelComplaint(new AManager(Complaint.ASSISTANT_MANAGER));
        employee.nextLevelComplaint.setNextLevelComplaint(new Manager(Complaint.MANAGER));
        return employee;
    }
}
