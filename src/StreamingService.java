public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: premium field
    private boolean isPremium;

    // TODO: constructor
    public StreamingService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
        this.isPremium = false;
    }

    @Override
    public void performService() {

        // TODO:
        // check if service is active
        if (!isActive()) {
            System.out.println("Streaming service is not active.");
            return;
        }

        // print different message for premium and normal
        if (isPremium) {
            System.out.println("Streaming movies in 4k (Premium)");
        } else {
            System.out.println("Streaming movies in 720p");
        }
    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // set premium = true
        isPremium = true;

        // print message
        System.out.println("Streaming service upgraded to Premium.");
    }
}
