package liskov_subtitution_principle;



class ThirdPartyFraudChecker implements IFraudChecker {
    // members omitted

    @Override
    public void runChecks() throws FraudDetectionException {
        // external system call omitted
    }
}