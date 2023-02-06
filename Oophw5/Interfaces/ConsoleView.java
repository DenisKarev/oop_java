package Oophw5.Interfaces;

public class ConsoleView extends View {
    Menus m = new Menus();

    @Override
    public void menu0() {
        System.out.println(m.menuMain);
    }

    @Override
    public void menuSearch() {
        System.out.println(m.menuSearch);
    }

    @Override
    public void mDeletePerson() {
        System.out.println(m.menuSearch);
    }

    @Override
    public void mAddPerson() {
        System.out.println(m.menuAdd);
    }

    @Override
    public void mAddPhoneToPerson() {
        System.out.println(m.menuSearch);
    }

    @Override
    public void textOut(String string) {
        System.out.println(string);
    }

}
