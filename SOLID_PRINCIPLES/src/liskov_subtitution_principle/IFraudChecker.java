package liskov_subtitution_principle;


interface IFraudChecker {
    void runChecks() throws FraudDetectionException;
}