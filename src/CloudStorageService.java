public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    private boolean isPremium;

    // TODO: constructor
    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.isPremium = false;
    }

    @Override
    public void performService() {

        // TODO:
        // check if active
        if (!isActive()) {
            System.out.println("Cloud storage is not active.");
            return;
        }

        // print cloud access message
        if (isPremium) {
            System.out.println("Accessing premium cloud storage...");
        } else {
            System.out.println("Accessing basic cloud storage...");
        }
    }

    @Override
    public void upgradeToPremium() {
        // TODO:
        // enable premium
        // print message
        isPremium = true;
        System.out.println("Premium cloud storage");
    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        if (isPremium) {
            System.out.println(" $10 for Premium Cloud Storage.");
        } else {
            System.out.println(" Free for Basic Cloud Storage.");
        }
    }
}
