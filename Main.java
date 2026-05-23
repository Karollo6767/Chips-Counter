package org.example;


class Chips implements PeripheralFile {

    private int chips = 80;
    private int addedCount = 0;
    private int subtractedCount = 0;

    @Override
    public void add() {

        chips++;
        addedCount++;

    }

    @Override
    public void subtract() {

        chips--;
        subtractedCount++;

    }

    @Override
    public void showStartNumberOfChips() {

        System.out.println("The pack of chips has " + chips + " chips");

    }

    @Override
    public void showAddedCount() {

        System.out.println("You've added " + addedCount + " chips");
        System.out.println("You've " + chips + " chips\n------------------------------");

    }

    @Override
    public void showSubtractedCount() {

        System.out.println("You've subtracted " + subtractedCount + " chips");
        System.out.println("You've " + chips + " chips\n------------------------------");

    }

    // SETTER
    @Override
    public void setChips(int newChips) {

        chips = newChips;

    }

    // GETTER
    @Override
    public int getChips() {

        return chips;

    }
}

public class Main {

    public static void main(String[] args) {
        /* Jest new Chips() a nie new PeripheralFile() ponieważ w PeripheralFile metoda openBag() jest pusta,
        a w Main jest nadpisywana i wpisane są już do niej parametry */

        PeripheralFile chips = new Chips();

        chips.showStartNumberOfChips();
        System.out.println("==============================");

        chips.add();
        chips.showAddedCount();

        chips.subtract();
        chips.showSubtractedCount();

    }
}