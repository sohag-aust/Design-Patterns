package stocks;

import chain.MedicineChain;
import medicine.Medicine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CentralInventoryPharmaceuticals implements MedicineChain {
    private MedicineChain medicineChain;

    List<Medicine> medicines = new ArrayList<>(Arrays.asList(
            new Medicine("panadol", 4),
            new Medicine("cream6", 4),
            new Medicine("syrup10", 4),
            new Medicine("cream10", 4),
            new Medicine("Cream1", 4)
    ));

    @Override
    public void setNextMedicineInventoryChain(MedicineChain medicineChain) {
        this.medicineChain = medicineChain;
    }

    @Override
    public void dispense(Medicine medicine) {
        Optional<Medicine> desiredMedicine = medicines.stream().filter(medicine1 -> medicine1.getMedicineName().equals(medicine.getMedicineName())).findAny();
        if(!desiredMedicine.isEmpty()) {
            if(desiredMedicine.get().getQuantity() < medicine.getQuantity()) {
                this.medicineChain.dispense(medicine);
            } else {
                System.out.println("Medicine is served from CentralInventoryPharmaceuticals");
            }
        } else {
            this.medicineChain.dispense(medicine);
        }
    }
}