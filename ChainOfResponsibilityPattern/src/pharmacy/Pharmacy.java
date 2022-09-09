package ChainOfResponsibilityPattern.src.pharmacy;

import ChainOfResponsibilityPattern.src.chain.MedicineChain;
import ChainOfResponsibilityPattern.src.stocks.CentralInventoryPharmaceuticals;
import ChainOfResponsibilityPattern.src.stocks.Distributor;
import ChainOfResponsibilityPattern.src.stocks.PharmacyFrontDesk;
import ChainOfResponsibilityPattern.src.stocks.PharmacyInHouseStock;

public class Pharmacy {
    private MedicineChain medicineChain1;
    private MedicineChain medicineChain2;
    private MedicineChain medicineChain3;
    private MedicineChain medicineChain4;

    public Pharmacy() {
        medicineChain1 = new PharmacyFrontDesk();
        medicineChain2 = new PharmacyInHouseStock();
        medicineChain3 = new Distributor();
        medicineChain4 = new CentralInventoryPharmaceuticals();

        medicineChain1.setNextMedicineInventoryChain(medicineChain2);
        medicineChain2.setNextMedicineInventoryChain(medicineChain3);
        medicineChain3.setNextMedicineInventoryChain(medicineChain4);
    }

    public MedicineChain getDefaultMedicineChain() {
        return medicineChain1;
    }
}
