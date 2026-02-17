public class Customer extends User {

    // TODO: constructor
    Customer(String name, int id) {
        super(name, id);
    }


    @Override
    public void manageService(Service s) {
        System.out.println("customer cannot manage services");

        // TODO:
        // print that customer cannot manage services

    }

    @Override
    public void useService(Service s) {
        System.out.println("customer using message");

        // TODO:
        // print customer using message
        // call performService

    }
}
