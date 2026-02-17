public class ConsultationService extends Service
        implements Billable {

    // constructor
    public ConsultationService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {

        // check if active
        if (!isActive()) {
            System.out.println("Service is not active");
            return;
        }

        // print consultation message
        System.out.println("Starting consultation");
    }

    @Override
    public void generateBill() {

        // print billing message
        System.out.println("$100 for Consultation Service");
    }
}
