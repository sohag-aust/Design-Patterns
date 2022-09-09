package ChainOfResponsibilityPattern.src.chain;

import ChainOfResponsibilityPattern.src.medicine.Medicine;

public interface MedicineChain {
    void setNextMedicineInventoryChain(MedicineChain medicineChain);
    void dispense(Medicine medicine);
}
