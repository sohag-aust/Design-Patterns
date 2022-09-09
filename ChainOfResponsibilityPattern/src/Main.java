package ChainOfResponsibilityPattern.src;

import ChainOfResponsibilityPattern.src.medicine.Medicine;
import ChainOfResponsibilityPattern.src.pharmacy.Pharmacy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pharmacy pharmacy = new Pharmacy();

        System.out.println("Please enter medicine name: ");
        String medicineName = sc.nextLine();

        System.out.println("Please enter quantity of the medicine: ");
        int qty = sc.nextInt();

        pharmacy.getDefaultMedicineChain().dispense(new Medicine(medicineName, qty));

    }
}
