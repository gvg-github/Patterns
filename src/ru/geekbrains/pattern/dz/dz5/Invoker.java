package ru.geekbrains.pattern.dz.dz5;

import ru.geekbrains.pattern.dz.dz5.commands.Command;

public class Invoker {

    private Command createDebitCommand;
    private Command createCreditCommand;

    public Invoker(Command createDebitCommand, Command createCreditCommand) {
        this.createDebitCommand = createDebitCommand;
        this.createCreditCommand = createCreditCommand;
    }

    public void createDebit() {
        createDebitCommand.execute();
    }

    public void createCredit() {
        createCreditCommand.execute();
    }
}
