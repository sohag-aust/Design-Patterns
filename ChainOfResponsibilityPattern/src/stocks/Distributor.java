package stocks;

import chain.MedicineChain;
import medicine.Medicine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Distributor implements MedicineChain {
    private MedicineChain medicineChain;

    List<Medicine> medicines = new ArrayList<>(Arrays.asList(
            new Medicine("syrup7", 9),
            new Medicine("cream1", 4),
            new Medicine("panadol", 4),
            new Medicine("paracetamol", 4)
    ));

    @Override
    public void setNextMedicineInventoryChain(MedicineChain medicineChain) {
        this.medicineChain = medicineChain;
    }

    public MedicineChain getNextMedicineChain() {
        return this.medicineChain;
    }

    @Override
    public void dispense(Medicine medicine) {
        Optional<Medicine> desiredMedicine = medicines.stream().filter(medicine1 -> medicine1.getMedicineName().equals(medicine.getMedicineName())).findAny();
        if(!desiredMedicine.isEmpty()) {
            if(desiredMedicine.get().getQuantity() < medicine.getQuantity()) {
                getNextMedicineChain().dispense(medicine);
            } else {
                System.out.println("Medicine is served from Distributor");
            }
        } else {
            getNextMedicineChain().dispense(medicine);
        }
    }
}