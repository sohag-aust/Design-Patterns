package burgerMakingTemplate;

public abstract class Burger {

    //template method, final so subclasses can't override
    public final void makeBurger(String bun, String patty, boolean isForDeliver) {
        selectBun(bun);
        toastBun();
        addPatty(patty);
        cookBurger();
        addSauce();
        isOrderedForDelivery(isForDeliver);
    }

    protected abstract void selectBun(String bun);

    public void toastBun() {
        System.out.println("Toasting Bun");
    }

    protected abstract void addPatty(String patty);

    public void cookBurger() {
        System.out.println("Cooking Burger");
    }

    public void addSauce() {
        System.out.println("Adding Special Sauce");
    }

    boolean isOrderedForDelivery(boolean decision) {
        return decision;
    }
}
