package ClothStore;

import Cloth.Cloth;
import ClothTypes.ClothTypes;

import java.util.ArrayList;
import java.util.List;

public class ClothStore implements Cloneable {
    private String storeName;
    private List<Cloth> clothes = new ArrayList<>();

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Cloth> getClothes() {
        return clothes;
    }

    public void setClothes(List<Cloth> cloth) {
        this.clothes = cloth;
    }

    public void fetchDataFromDatabase() {
        int sku = 0;
        for (ClothTypes clothTypes : ClothTypes.values()) {
            Cloth cloth = new Cloth();
            cloth.setClothSKU(++sku);
            cloth.setClothType(clothTypes);
            getClothes().add(cloth);
        }
    }

    @Override
    public String toString() {
        return "ClothStore{" +
                "storeName='" + storeName + '\'' +
                ", clothes=" + clothes +
                '}';
    }

    /*
     * @Override //shallow copy protected Object clone() throws
     * CloneNotSupportedException { return super.clone(); }
     */
    @Override // Deep copy
    protected ClothStore clone() throws CloneNotSupportedException {
        ClothStore clothStore = new ClothStore();

        // fetching data from database is more time-consuming rather than getting data from old object
        for (Cloth cloth : this.getClothes()) {
            clothStore.getClothes().add(cloth);
        }
        return clothStore;
    }

    public ClothStore getCloned() throws CloneNotSupportedException {
        return clone();
    }
}
