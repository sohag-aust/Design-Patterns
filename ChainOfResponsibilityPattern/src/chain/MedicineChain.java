package chain;

import medicine.Medicine;

public interface MedicineChain {
    void setNextMedicineInventoryChain(MedicineChain medicineChain);
    void dispense(Medicine medicine);
}
