import ClothStore.ClothStore;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Store-1: Dhaka
        ClothStore store = new ClothStore();
        store.setStoreName("Dhaka");
        store.fetchDataFromDatabase();
        System.out.println("==** " + store.getStoreName() + " store history **==");
        System.out.println(store.getClothes());

        // Store-2: Chittagong (cloned all clothes from Dhaka Store)
        ClothStore clonedStore = store.getCloned();
        clonedStore.setStoreName("Chittagong");
        System.out.println("\n==** " + clonedStore.getStoreName() + " store history **==");
        System.out.println(clonedStore.getClothes());

        System.out.println("\n==** After removing " + store.getClothes().get(2) + " from " + store.getStoreName() + ", the remaining items remains **==");

        // deleting one cloth item from dhaka store, and it won't affect the chittagong store (because we have used deep copy | shallow copy would create the problem, because shallow copy holds the same reference for different objects)
        store.getClothes().remove(2);

        System.out.println("\n==** " + store.getStoreName() + " store history **==");
        System.out.println(store.getClothes());

        System.out.println("\n==** " + clonedStore.getStoreName() + " store history **==");
        System.out.println(clonedStore.getClothes());
    }
}