package ChainOfResponsibilityPattern.src.stocks;

import ChainOfResponsibilityPattern.src.chain.MedicineChain;
import ChainOfResponsibilityPattern.src.medicine.Medicine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PharmacyInHouseStock implements MedicineChain {
    private MedicineChain medicineChain;

    List<Medicine> medicines = new ArrayList<>(Arrays.asList(
            new Medicine("cream2", 4),
            new Medicine("cream3", 3),
            new Medicine("Syrup4", 7),
            new Medicine("panadol", 8)
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
                System.out.println("Medicine is served from PharmacyInHouseStock");
            }
        } else {
            this.medicineChain.dispense(medicine);
        }
    }

}
