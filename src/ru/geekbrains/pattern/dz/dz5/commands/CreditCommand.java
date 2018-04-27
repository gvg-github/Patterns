package ru.geekbrains.pattern.dz.dz5.commands;

import ru.geekbrains.pattern.dz.dz5.documents.CheckDocument;

public class CreditCommand implements Command {

    private CheckDocument checkDocument;

    public CreditCommand(CheckDocument checkDocument){
        this.checkDocument = checkDocument;
    }

    @Override
    public void execute() {
        checkDocument.createCredit();
    }
}
