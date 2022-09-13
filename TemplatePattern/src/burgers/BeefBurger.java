package burgers;

import burgerMakingTemplate.Burger;

public class BeefBurger extends Burger {
    @Override
    protected void selectBun(String bun) {
        System.out.println("Selecting " + "\"" + bun + "\" for Beef Burger");
    }

    @Override
    protected void addPatty(String patty) {
        System.out.println("Adding " + "\"" + patty + "\" Patty");
    }
}
